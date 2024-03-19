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
public class ParticleConeShapeOptions {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleConeShapeOptions instance;
    @IgnoreAutoComplete
    public ParticleConeShapeOptions(com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleConeShapeOptions instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public ParticleConeShapeOptions(Engine engine){}
    //>REMOVE-BRIDGE<

        public ParticleConeShapeOptions() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.ParticleSystem.ParticleEmitter.ParticleConeShapeOptions());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxAngle();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMinAngle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMinAngle();
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
    @MethodArgs(args ={"value"})
    public void setMaxAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMaxAngle( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinAngle(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.setMinAngle( value);
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


}