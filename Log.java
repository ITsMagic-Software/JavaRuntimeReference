package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Activities.Editor.Panels.Console.ILog;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class Log {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient ILog log;
    @IgnoreAutoComplete
    public Log(ILog log) {
        this.log = log;
    }
    //>REMOVE-BRIDGE<

    public Log() {
        //<REMOVE-BRIDGE>
        this.log = new ILog();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public Log(String message) {
        //<REMOVE-BRIDGE>
        this.log = new ILog("", null, message, "");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle","message"})
    public Log(String tittle, String message) {
        //<REMOVE-BRIDGE>
        this.log = new ILog("", tittle, message, "");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tag","tittle","message"})
    public Log(String tag, String tittle, String message) {
        //<REMOVE-BRIDGE>
        this.log = new ILog(tag, tittle, message, "");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tag","tittle","message","color"})
    public Log(String tag, String tittle, String message, Color color) {
        //<REMOVE-BRIDGE>
        this.log = new ILog(tag, tittle, message, "", color.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.tittle;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTittle(String value){
        //<REMOVE-BRIDGE>
        if(log.tittle == null){
            log.tittle = "";
        }
        log.tittle = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public String getMessage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.message;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMessage(String value){
        //<REMOVE-BRIDGE>
        if(log.message == null){
            log.message = "";
        }
        log.message = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public String getTag(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.tag;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTag(String value){
        //<REMOVE-BRIDGE>
        if(log.tag == null){
            log.tag = "";
        }
        log.tag = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public String getLink(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.link;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLink(String value){
        //<REMOVE-BRIDGE>
        log.link = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getQuantity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.quantity;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setQuantity(int value){
        //<REMOVE-BRIDGE>
        log.quantity = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Color getColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return log.color.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColor(Color value){
        //<REMOVE-BRIDGE>
        log.color = value.instance;
        //>REMOVE-BRIDGE<
    }
}
