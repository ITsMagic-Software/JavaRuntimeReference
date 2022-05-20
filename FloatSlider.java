package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Inspector"})
public class FloatSlider {
    //

    //

    public float value;
    public float min;
    public float max;
    //public float step = 0f;

    @MethodArgs(args={"value","min","max"})
    public FloatSlider(float value, float min, float max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }
    /*public FloatSlider(float value, float min, float max, float step) {
        this.value = value;
        this.min = min;
        this.max = max;
        this.step = step;
    }*/

    @HideGetSet
    public float getValue() {
        return value;
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setValue(float value) {
        this.value = value;
    }

    @HideGetSet
    public float getMin() {
        return min;
    }
    @HideGetSet
    @MethodArgs(args={"min"})
    public void setMin(float min) {
        this.min = min;
    }

    @HideGetSet
    public float getMax() {
        return max;
    }
    @HideGetSet
    @MethodArgs(args={"max"})
    public void setMax(float max) {
        this.max = max;
    }

    /**
     * Step is crashing if the step is a number like 0.04864f
     * Fix soon
     * @return
     */
    /*public float getStep() {
        return step;
    }
    @MethodArgs(args={"step"})
    public void setStep(float step) {
        this.step = step;
    }*/

    public String toString(){
        return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
    }
    public String serialize(){
        return value + ";" + min + ";" + max + ";" + 0;
    }

    /// Abstract
    @MethodArgs(args={"str"})
    public static FloatSlider deserialize(String str){
        //
        return null;
        //

        //
    }
}
