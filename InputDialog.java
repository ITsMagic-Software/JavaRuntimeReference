package JAVARuntime;

//<REMOVE-BRIDGE>

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.InputType;
import android.widget.EditText;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Engines.Engine.Engine;

import java.util.ConcurrentModificationException;
import java.lang.Thread;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public class InputDialog {
    public enum Type{
        String, Float, Int
    }

    private transient boolean calledFromEngine = false;

    @MethodArgs(args ={"tittle", "listener"})
    public InputDialog(String tittle, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, "type here", "cancel", "done", listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "type","listener"})
    public InputDialog(String tittle, Type type, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, "type here", "cancel", "done", type, listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "defaultText","listener"})
    public InputDialog(String tittle, String defaultText, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, defaultText, "cancel", "done", listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "defaultText","type","listener"})
    public InputDialog(String tittle, String defaultText, Type type, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, defaultText, "cancel", "done", type, listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "cancelButton","doneButton","listener"})
    public InputDialog(String tittle, String cancelButton, String doneButton, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, "type here", cancelButton, doneButton, listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "defaultText","cancelButton","doneButton","listener"})
    public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        this(tittle, defaultText, cancelButton, doneButton, Type.String, listener);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle", "defaultText","cancelButton","doneButton","type","listener"})
    public InputDialog(String tittle, String defaultText, String cancelButton, String doneButton, Type type, InputDialogListener listener) {
        //<REMOVE-BRIDGE>
        Activity activity = Main.getActivity();
        if(activity != null) {
            boolean isUIThread = false;
            try {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    isUIThread = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        show(tittle, defaultText, doneButton, cancelButton, listener, activity, type);
                    }
                });
            } else {
                calledFromEngine = false;
                show(tittle, defaultText, doneButton, cancelButton, listener, activity, type);
            }
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private void show(String tittle, String defaultText, String doneButton, String cancelButton, InputDialogListener listener, Context context, Type type){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(tittle);

        // Set up the input
        final EditText input = new EditText(context);
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        switch (type) {
            case String:
                input.setInputType(InputType.TYPE_TEXT_VARIATION_SHORT_MESSAGE);
                break;
            case Float:
                input.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_CLASS_NUMBER);
                break;
            case Int:
                input.setInputType(InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_CLASS_NUMBER);
                break;
        }
        input.setText(defaultText);
        input.setSelectAllOnFocus(true);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton(doneButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                if(!calledFromEngine) {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            listener.onFinish(input.getText().toString());
                        }
                    });
                } else {
                    runOnEngine(new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    listener.onFinish(input.getText().toString());
                                }
                            });
                        }
                    });
                }
            }
        });
        builder.setNegativeButton(cancelButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

                if(!calledFromEngine) {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            listener.onCancel();
                        }
                    });
                } else {
                    runOnEngine(new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    listener.onCancel();
                                }
                            });
                        }
                    });
                }
            }
        });

        builder.show();
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private void runOnEngine(Runnable runnable){
        runOnEngine(runnable, 0);
    }
    @IgnoreAutoComplete
    private void runOnEngine(Runnable runnable, int tries){
        try {
            Engine.runOnEngine(runnable);
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
            if(tries <= 3){
                runOnEngine(runnable, tries +1);
            }
        }
    }
    //>REMOVE-BRIDGE<
}

