package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public final class GUID {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GUID guid;
    @IgnoreAutoComplete
    public GUID(com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GUID guid) {
        this.guid = guid;
    }
    //>REMOVE-BRIDGE<

    public GUID() {
        //<REMOVE-BRIDGE>
        this.guid = new com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GUID();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"guid"})
    public void setDuplicableGUID(String guid){
        //<REMOVE-BRIDGE>
        this.guid.setDUPLICABLE_GUID(guid);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public String getDuplicableGUID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return guid.getDUPLICABLE_GUID().toString();
        //>REMOVE-BRIDGE<
    }
    public String getUniqueGUID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return guid.getUniqueGUID().toString();
        //>REMOVE-BRIDGE<
    }
}
