package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Input"})
public class PopupDialog {
    public static final int SUCCESS = 48;
    public static final int ERROR = 49;
    public static final int ALERT = 50;
    public static final int PROGRESS = 51;

    private boolean calledFromEngine = false;

    //

    @MethodArgs(args ={"type"})
    public PopupDialog(int type) {
        //
    }
    @MethodArgs(args ={"type","tittle","message"})
    public PopupDialog(int type, String tittle, String message) {
        //
    }

    //

    @MethodArgs(args ={"text","popupDialogListener"})
    public void setConfirmButton(String text, PopupDialogListener popupDialogListener){
        //
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setCancelButton(String text, PopupDialogListener popupDialogListener){
        //
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setMidButton(String text, PopupDialogListener popupDialogListener){
        //
    }

    @MethodArgs(args ={"text","popupDialogListener"})
    public void setConfirmButton(String text, Listener popupDialogListener){
        //
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setCancelButton(String text, Listener popupDialogListener){
        //
    }
    @MethodArgs(args ={"text","popupDialogListener"})
    public void setMidButton(String text, Listener popupDialogListener){
        //
    }

    public String getTittle(){
        //
        return "";
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setName(String value){
        //
    }

    public String getMessage(){
        //
        return "";
        //

        //
    }
    @MethodArgs(args ={"value"})
    public void setMessage(String value){
        //
    }

    @MethodArgs(args ={"type"})
    public void changeType(int type){
        //
    }

    public void show(){
        //
    }
    public void dismiss(){
        //
    }

    //
}

