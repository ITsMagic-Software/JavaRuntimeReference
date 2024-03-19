package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class LaserCasting extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.LaserCasting instance;
    @IgnoreAutoComplete
    public LaserCasting(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.LaserCasting instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public LaserCasting(Engine engine){}
    //>REMOVE-BRIDGE<

    public LaserCasting() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.LaserCasting());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getDistance();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getHitFaceNormal(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getHitFaceNormal();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getHitObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject returnValue = instance.getHitObject();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getHitPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getHitPoint();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector2 getHitUVCoord(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector2 returnValue = instance.getHitUVCoord();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    public boolean isInfinity(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isInfinity();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setInfinity(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setInfinity( value);
        //>REMOVE-BRIDGE<
    }


}