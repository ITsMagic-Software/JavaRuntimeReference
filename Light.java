package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class Light extends Component{
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
    @MethodArgs(args ={"type"})
    public Light(int type) {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getMinAngle(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMinAngle(float value){
        //
    }


    @HideGetSet
    public float getMaxAngle(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMaxAngle(float value){
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
    public void setShadowEnabled(boolean value){
        //
    }

    @HideGetSet
    public int getShadowResolution(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowResolution(int value){
        //
    }

    @HideGetSet
    public float getShadowBlurSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowBlurSize(float value){
        //
    }

    @HideGetSet
    public float getShadowBlur(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowBlur(float value){
        //
    }

    @HideGetSet
    public float getShadowStrength(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowStrength(float value){
        //
    }

    @HideGetSet
    public float getShadowVisibleDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShadowVisibleDistance(float value){
        //
    }

    @MethodArgs(args ={"idx"})
    public void forcePriority(int idx){
        //
    }

    public CustomLightShadowViewCalculator getCustomLightShadowViewCalculator(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"listener"})
    public void setCustomLightShadowViewCalculator(CustomLightShadowViewCalculator customLightShadowViewCalculator){
        //
    }

    //
}
