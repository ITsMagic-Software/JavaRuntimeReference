package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

public final class AnimationEntry {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Animation.FrameEntry instance;

    @IgnoreAutoComplete
    @MethodArgs(args = {"animation"})
    public AnimationEntry(com.itsmagic.engine.Engines.Engine.Animation.FrameEntry instance) {
        this.instance = instance;
    }

    @IgnoreAutoComplete
    @BuildClassConstructor
    public AnimationEntry(Engine engine) {
    }
    //>REMOVE-BRIDGE<

    @UnimplementedDoc
    public AnimationEntry(SpatialObject object) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Animation.FrameEntry(object.instance.get().getGuid().getDUPLICABLE_GUID());
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public Vector3 getPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.transform != null) {
            if(instance.transform.position != null) {
                return instance.transform.position.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args = {"value"})
    public void setPosition(Vector3 value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.storePosition(value.instance.clone());
        } else {
            instance.transform.position = null;
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public Quaternion getRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.transform != null) {
            if(instance.transform.rotation != null) {
                return instance.transform.rotation.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args = {"value"})
    public void setRotation(Quaternion value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.storeRotation(value.instance.clone());
        } else {
            instance.transform.rotation = null;
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public Vector3 getScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.transform != null) {
            if(instance.transform.scale != null) {
                return instance.transform.scale.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args = {"value"})
    public void setScale(Vector3 value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            instance.storeScale(value.instance.clone());
        } else {
            instance.transform.scale = null;
        }
        //>REMOVE-BRIDGE<
    }
}
