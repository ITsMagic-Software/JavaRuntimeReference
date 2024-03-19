package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.SupremeUI.ComponentExtras.SUIEventEntry;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIJoystick extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIJoystick component;
    @IgnoreAutoComplete
    public SUIJoystick(com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIJoystick component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public SUIJoystick() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.SupremeUI.Components.SUIJoystick());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLerp(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getLerpSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLerp(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setLerpSpeed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getValue(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getAxis().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(Vector2 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null){
            throw new NullPointerException("Value can't be null");
        }
        this.component.setAxis(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getAxisName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getAxisName().toString();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAxisName(String name){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setAxisName(name);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Axis getAxis(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Input.VOS.Axis axis = component.getInputAxis();
        if(axis != null){
            return axis.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAxis(Axis axis){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(axis != null) {
            this.component.setInputAxis(axis.axis);
        } else {
            this.component.setInputAxis(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isSpherical(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isSpherical();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpherical(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.component.setSpherical(value);
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
        return super.componentClassMatch(a, b, SUIJoystick.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
