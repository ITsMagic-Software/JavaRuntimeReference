package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Components"})
public class Light extends Component{
    public static final int TYPE_SUN = 0;
    public static final int TYPE_POINT = 1;
    public static final int TYPE_SPOT = 2;

    //

    public Light() {
        //
        super();
        //

        //
    }
    @MethodArgs(args={"type"})
    public Light(int type) {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getIntensity(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setIntensity(float value){
        //
    }

    @HideGetSet
    public float getDiameter(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setDiameter(float value){
        //
    }

    @HideGetSet
    public float getDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setDistance(float value){
        //
    }

    @HideGetSet
    public Color getColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setColor(Color value){
        //
    }

    @HideGetSet
    public boolean isShadowEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setShadowEnabled(boolean value){
        //
    }

    @MethodArgs(args={"idx"})
    public void forcePriority(int idx){
        //
    }

    public CustomLightShadowViewCalculator getCustomLightShadowViewCalculator(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"listener"})
    public void setCustomLightShadowViewCalculator(CustomLightShadowViewCalculator customLightShadowViewCalculator){
        //
    }

    //
}
