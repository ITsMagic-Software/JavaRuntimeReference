package JAVARuntime;

//<REMOVE-BRIDGE>
import android.app.Activity;
import android.content.Context;
import android.os.Looper;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Engines.Engine.Engine;

import java.util.ConcurrentModificationException;

import cn.pedant.SweetAlert.SweetAlertDialog;
import java.lang.Thread;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public class PopupDialog {
    public static final int SUCCESS = 48;
    public static final int ERROR = 49;
    public static final int ALERT = 50;
    public static final int PROGRESS = 51;

    private transient boolean calledFromEngine = false;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient SweetAlertDialog dialog;
    @IgnoreAutoComplete
    public PopupDialog(SweetAlertDialog dialog) {
        this.dialog = dialog;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"type"})
    public PopupDialog(int type) {
        //<REMOVE-BRIDGE>
        this(type, "", "");
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"tittle","message"})
    public PopupDialog(String tittle, String message) {
        //<REMOVE-BRIDGE>
        this(SUCCESS, tittle, message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"type","tittle","message"})
    public PopupDialog(int type, String tittle, String message) {
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        create(type, activity, tittle, message);
                    }
                });
            } else {
                calledFromEngine = false;
                create(type, activity, tittle, message);
            }
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private void create(int type, Context context, String tittle, String message){
        switch (type) {
            case SUCCESS:
                this.dialog = new SweetAlertDialog(Main.getActivity(), SweetAlertDialog.SUCCESS_TYPE);
                break;
            case ERROR:
                this.dialog = new SweetAlertDialog(Main.getActivity(), SweetAlertDialog.ERROR_TYPE);
                break;
            case ALERT:
                this.dialog = new SweetAlertDialog(Main.getActivity(), SweetAlertDialog.WARNING_TYPE);
                break;
            case PROGRESS:
                this.dialog = new SweetAlertDialog(Main.getActivity(), SweetAlertDialog.PROGRESS_TYPE);
                break;
        }

        this.dialog.setTitle(tittle);
        this.dialog.setContentText(message);
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"text","popupDialogListener"})
    public void setConfirmButton(String text, PopupDialogListener popupDialogListener){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setConfirmText(text);
                        dialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setConfirmText(text);
                dialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setCancelButton(String text, PopupDialogListener popupDialogListener){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setCancelText(text);
                        dialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setCancelText(text);
                dialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setMidButton(String text, PopupDialogListener popupDialogListener){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setNeutralText(text);
                        dialog.setNeutralClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setNeutralText(text);
                dialog.setNeutralClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"text","popupDialogListener"})
    public void setConfirmButton(String text, Listener popupDialogListener){
        //<REMOVE-BRIDGE>
        Console.log("PopupDialog setConfirmButton(String text, Listener Listener) is deprecated, use (String text, PopupDialogListener popupDialogListener) instead");
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setConfirmText(text);
                        dialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setConfirmText(text);
                dialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setCancelButton(String text, Listener popupDialogListener){
        //<REMOVE-BRIDGE>
        Console.log("PopupDialog setCancelButton(String text, Listener Listener) is deprecated, use (String text, PopupDialogListener popupDialogListener) instead");
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setCancelText(text);
                        dialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setCancelText(text);
                dialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setMidButton(String text, Listener popupDialogListener){
        //<REMOVE-BRIDGE>
        Console.log("PopupDialog setMidButton(String text, Listener Listener) is deprecated, use (String text, PopupDialogListener popupDialogListener) instead");
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setNeutralText(text);
                        dialog.setNeutralClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                if(!calledFromEngine) {
                                    popupDialogListener.onClicked();
                                } else {
                                    runOnEngine(new Runnable() {
                                        @Override
                                        public void run() {
                                            popupDialogListener.onClicked();
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setNeutralText(text);
                dialog.setNeutralClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        if(!calledFromEngine) {
                            popupDialogListener.onClicked();
                        } else {
                            runOnEngine(new Runnable() {
                                @Override
                                public void run() {
                                    popupDialogListener.onClicked();
                                }
                            });
                        }
                    }
                });
            }
        }


        //>REMOVE-BRIDGE<
    }

    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return dialog.getTitleText();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setName(String value){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setTitleText(value);
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setTitleText(value);
            }
        }


        //>REMOVE-BRIDGE<
    }

    public String getMessage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return dialog.getContentText();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setMessage(String value){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.setContentText(value);
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.setContentText(value);
            }
        }


        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"type"})
    public void changeType(int type){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        switch (type) {
                            case SUCCESS:
                                dialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                                break;
                            case ERROR:
                                dialog.changeAlertType(SweetAlertDialog.ERROR_TYPE);
                                break;
                            case ALERT:
                                dialog.changeAlertType(SweetAlertDialog.WARNING_TYPE);
                                break;
                            case PROGRESS:
                                dialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE);
                                break;
                        }
                    }
                });
            } else {
                calledFromEngine = false;
                switch (type) {
                    case SUCCESS:
                        dialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                        break;
                    case ERROR:
                        dialog.changeAlertType(SweetAlertDialog.ERROR_TYPE);
                        break;
                    case ALERT:
                        dialog.changeAlertType(SweetAlertDialog.WARNING_TYPE);
                        break;
                    case PROGRESS:
                        dialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE);
                        break;
                }
            }
        }
        //>REMOVE-BRIDGE<
    }

    public void show(){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.show();
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.show();
            }
        }
        //>REMOVE-BRIDGE<
    }
    public void dismiss(){
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
            if (!isUIThread) {
                calledFromEngine = true;
                activity.runOnUiThread(new java.lang.Runnable() {
                    @Override
                    public void run() {
                        dialog.dismissWithAnimation();
                    }
                });
            } else {
                calledFromEngine = false;
                dialog.dismissWithAnimation();
            }
        }


        //>REMOVE-BRIDGE<
    }

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

