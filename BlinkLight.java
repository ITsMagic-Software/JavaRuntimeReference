package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping","Components"})
public final class BlinkLight extends Component {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.BlinkLight instance;
    @IgnoreAutoComplete
    public BlinkLight(com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.BlinkLight instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public BlinkLight(Engine engine) {}
    //>REMOVE-BRIDGE<

    public BlinkLight() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.Prototyping.BlinkLight());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getPattern() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getPatternString();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"pattern"})
    public void setPattern(String pattern) {
        //<REMOVE-BRIDGE>
        if(pattern == null || pattern.isEmpty()){
            throw new NullPointerException("Pattern can't be null or empty");
        }
        instance.setPattern(pattern);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"pattern"})
    public void setPattern(OHString pattern) {
        //<REMOVE-BRIDGE>
        if(pattern == null || pattern.isEmpty()){
            throw new NullPointerException("Pattern can't be null or empty");
        }
        instance.setPattern(pattern.ohString);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFrequency() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getFrequency();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"frequency"})
    public void setFrequency(float frequency) {
        //<REMOVE-BRIDGE>
        instance.setFrequency(frequency);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getOffIntensity() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getOffIntensity();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setOffIntensity(float value) {
        //<REMOVE-BRIDGE>
        instance.setOffIntensity(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getOnIntensity() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getOnIntensity();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setOnIntensity(float value) {
        //<REMOVE-BRIDGE>
        instance.setOnIntensity(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLerpSpeed() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getLerpSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setLerpSpeed(float value) {
        //<REMOVE-BRIDGE>
        instance.setLerpSpeed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isReverse() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.isReverse();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setReverse(boolean value) {
        //<REMOVE-BRIDGE>
        instance.setReverse(value);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, BlinkLight.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return instance;
    }
    //>REMOVE-BRIDGE<
}
