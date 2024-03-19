package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.SupremeUI.ComponentExtras.SUIEventEntry;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIKeyEventListener extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIKeyEventListener component;
    @IgnoreAutoComplete
    public SUIKeyEventListener(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIKeyEventListener component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIKeyEventListener() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIKeyEventListener());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Key getKey(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Input.VOS.Key key = component.getKey();
        if(key != null){
            return key.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"key"})
    public void setKey(Key key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(key != null) {
            this.component.setKey(key.key);
        } else {
            this.component.setKey(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getKeyName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getKeyName().toString();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setKeyName(String name){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(name == null){
            name = "";
        }
        this.component.setKeyName(name);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isPressed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isPressed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDown(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isDown();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isUp(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isUp();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isClickable(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getEventEntry().isClickable();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setClickable(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getEventEntry().setClickable(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public STargetRect getTargetRectType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return SUIEventEntry.convertToJavaRuntime(component.getEventEntry().getRectObject());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTargetRectType(STargetRect value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.getEventEntry().setRectObject(SUIEventEntry.convertFromJavaRuntime(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getTargetRectObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.getEventEntry().getObjectReference().getObject() != null) {
            return component.getEventEntry().getObjectReference().getObject().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTargetRectObject(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null){
            component.getEventEntry().getObjectReference().set(object.instance.get());
        } else {
            component.getEventEntry().getObjectReference().set(null);
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SUIKeyEventListener.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
