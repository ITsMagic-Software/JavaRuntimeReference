package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Animation.AnimationDatabase;
import com.itsmagic.engine.Engines.Engine.Animation.AnimationInstance;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Texture.Manager.TextureManager;

import java.util.ArrayList;
//>REMOVE-BRIDGE<

public final class AnimationFrame {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Animation.Keyframe instance;

    @IgnoreAutoComplete
    @MethodArgs(args = {"animation"})
    public AnimationFrame(com.itsmagic.engine.Engines.Engine.Animation.Keyframe instance) {
        this.instance = instance;
    }

    @IgnoreAutoComplete
    @BuildClassConstructor
    public AnimationFrame(Engine engine) {
    }
    //>REMOVE-BRIDGE<

    @UnimplementedDoc
    public AnimationFrame() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Animation.Keyframe(0);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public AnimationFrame(int frameTime) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Animation.Keyframe(frameTime);
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public int getFrameTime() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.frameTime;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args = {"value"})
    public void setFrameTime(int value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.frameTime = value;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public int getEntryCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.entryList == null) return 0;
        return instance.entryList.size();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args = {"index"})
    public AnimationEntry getEntryAt(int index) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.entryList.get(index).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args = {"entry"})
    public void addEntry(AnimationEntry entry) {
        //<REMOVE-BRIDGE>
        if(entry == null) throw new NullPointerException("Entry can't be null");
        Thread.requestEngineThread();
        instance.entryList.add(entry.instance);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args = {"entry"})
    public void removeEntry(AnimationEntry entry) {
        //<REMOVE-BRIDGE>
        if(entry == null) throw new NullPointerException("Entry can't be null");
        Thread.requestEngineThread();
        instance.entryList.remove(entry.instance);
        //>REMOVE-BRIDGE<
    }
}
