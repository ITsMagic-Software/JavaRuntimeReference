package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Particles"})
public class ParticleSphereShapeOptions {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleSphereShapeOptions instance;
    @IgnoreAutoComplete
    public ParticleSphereShapeOptions(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleSphereShapeOptions instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public ParticleSphereShapeOptions(Engine engine){}
    //>REMOVE-BRIDGE<

    public ParticleSphereShapeOptions() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleSphereShapeOptions());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRadius(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRadius();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRandomizeRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRandomizeRotation();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSpherizeRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getSpherizeRotation();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getVolume(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getVolume();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRadius(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRadius( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRandomizeRotation(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setRandomizeRotation( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpherizeRotation(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setSpherizeRotation( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVolume(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setVolume( value);
        //>REMOVE-BRIDGE<
    }


}