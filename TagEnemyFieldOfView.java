package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping"})
public final class TagEnemyFieldOfView {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.TagEnemyFieldOfView instance;
    @IgnoreAutoComplete
    public TagEnemyFieldOfView(com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.TagEnemyFieldOfView instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public TagEnemyFieldOfView(Engine engine){}
    //>REMOVE-BRIDGE<

    public TagEnemyFieldOfView() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.TagEnemyFieldOfView());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFov(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getFov();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFov(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setFov( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMaxDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMaxDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setMaxDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMinDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getMinDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setMinDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTargetTag(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.TagSystem.Tag returnValue = instance.getTargetTag();
        if(returnValue != null) return returnValue.getName().toString();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTargetsTag(String value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null || value.isEmpty()) throw new NullPointerException("value can't be empty or null");

        instance.setTargetsTag( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isActive(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isActive();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setActive(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setActive( value);
        //>REMOVE-BRIDGE<
    }

}