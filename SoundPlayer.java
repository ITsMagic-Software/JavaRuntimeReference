package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.Effects.AudioEffect;
import com.itsmagic.engine.Engines.Utils.PFile;
//>REMOVE-BRIDGE<

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Sound","Components"})
public final class SoundPlayer extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.SoundPlayer component;
    @IgnoreAutoComplete
    public SoundPlayer(com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.SoundPlayer component) {
        super(component);
        this.component = component;
    }
    //>REMOVE-BRIDGE<

    public SoundPlayer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.SoundPlayer());
        this.component = (com.itsmagic.engine.Engines.Engine.ComponentsV2.Sound.SoundPlayer) super.component;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
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
        return component.loop;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLoop(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.loop = value;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"file"})
    public void setSoundFile(SoundFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.file = pFile.getFilePath();
        //>REMOVE-BRIDGE<
    }

    public void play(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.play();
        //>REMOVE-BRIDGE<
    }
    public void stop(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.stop();
        //>REMOVE-BRIDGE<
    }
    public void pause(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.pause();
        //>REMOVE-BRIDGE<
    }
    public void unPause(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.play();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
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
        return component.isPlaying();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isPaused(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isPaused();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isStopped(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isStopped();
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
        return component.volume;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVolume(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.volume = value;
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
        Thread.requestEngineThread();
        return component.getSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setSpeed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getPitch(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getPitch();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPitch(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setPitch(value);
        //>REMOVE-BRIDGE<
    }


    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, SoundPlayer.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
