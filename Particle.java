package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

public class Particle {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.Particle instance;
    @IgnoreAutoComplete
    public Particle(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.Particle instance) {
        this.instance = instance;
        instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public Particle() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.Particle();
        instance.setRuntime(this);
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
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Color.ColorINT returnValue = instance.getColor();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setColor(Color value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setColor( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLiteTime(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getLiteTime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLiteTime(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setLiteTime( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getMovement(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getMovement();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMovement(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setMovement( value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPosition(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 returnValue = instance.getPosition();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPosition(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");
        instance.setPosition(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRotation();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotation(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRotation( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getScale(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getScale();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScale(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setScale( value);
        //>REMOVE-BRIDGE<
    }
}
