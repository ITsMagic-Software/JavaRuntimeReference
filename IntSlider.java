package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Inspector"})
public class IntSlider {
    //

    //

    public int value;
    public int min;
    public int max;

    @MethodArgs(args ={"value","min","max"})
    public IntSlider(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    @HideGetSet
    public int getValue() {
        return value;
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(int value) {
        this.value = value;
    }

    @HideGetSet
    public int getMin() {
        return min;
    }
    @HideGetSet
    @MethodArgs(args ={"min"})
    public void setMin(int min) {
        this.min = min;
    }

    @HideGetSet
    public int getMax() {
        return max;
    }
    @HideGetSet
    @MethodArgs(args ={"max"})
    public void setMax(int max) {
        this.max = max;
    }

    /*public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }*/

    public String toString(){
        return "(" + value + ")x( " + min + "-" + max + "~" + 0 + ")";
    }
    public String serialize(){
        return value + ";" + min + ";" + max + ";" + 0;
    }

    /// Abstract
    public static IntSlider deserialize(String str){
        //
        return null;
        //

        //
    }
}
