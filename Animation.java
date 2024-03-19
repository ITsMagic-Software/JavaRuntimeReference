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

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations"})
public final class Animation {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Animation.Animation instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"animation"})
    public Animation(com.itsmagic.engine.Engines.Engine.Animation.Animation instance) {
        this.instance = instance;
    }

    @IgnoreAutoComplete
    @BuildClassConstructor
    public Animation(Engine engine) {}
    //>REMOVE-BRIDGE<

    public Animation() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Animation.Animation();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.speed;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.speed = value;
        //>REMOVE-BRIDGE<
    }

    public void play(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.play();
        //>REMOVE-BRIDGE<
    }
    public void playInLoop(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.playInLoop();
        //>REMOVE-BRIDGE<
    }
    public void stop(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.stop();
        //>REMOVE-BRIDGE<
    }
    public void stopLoop(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.stopLoop();
        //>REMOVE-BRIDGE<
    }

    public boolean isPlaying(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isPlaying();
        //>REMOVE-BRIDGE<
    }
    public boolean isLoop(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isLoop();
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public int getFrameCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.frames == null) return 0;
        return instance.frames.size();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args = {"index"})
    public AnimationFrame getFrameAt(int index) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.frames.get(index).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc

    @MethodArgs(args = {"frame"})
    public void addFrame(AnimationFrame frame) {
        //<REMOVE-BRIDGE>
        if(frame == null) throw new NullPointerException("Frame can't be null");
        Thread.requestEngineThread();
        instance.frames.add(frame.instance);
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args = {"entry"})
    public void removeFrame(AnimationFrame frame) {
        //<REMOVE-BRIDGE>
        if(frame == null) throw new NullPointerException("Frame can't be null");
        Thread.requestEngineThread();
        instance.frames.remove(frame.instance);
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public void sortFrames(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.sortFrames();
        //>REMOVE-BRIDGE<
    }

    /// ABSTRACT
    @MethodArgs(args ={"file"})
    public static Animation loadFile(AnimationFile file){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        AnimationInstance animation = AnimationDatabase.load(file.getFilePath());
        if (animation != null && animation.getAnimation() != null) {
            return animation.getAnimation().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}


