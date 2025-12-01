package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class ToneMapper extends Component {

    //

        public ToneMapper() {
        //
        super();
        //

        //
    }

    public enum Type {
        Generic, Linear, Filmic, ACES, AGX
    }
    //

    @HideGetSet
    public float getContrast(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getOffsetB(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getOffsetG(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getOffsetR(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getPowerB(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getPowerG(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getPowerR(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSaturation(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSlopeB(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSlopeG(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSlopeR(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getTemperature(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getTint(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Type getTonnemapType(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getVibrance(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"contrast"})
    public void setContrast(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"offsetB"})
    public void setOffsetB(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"offsetG"})
    public void setOffsetG(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"offsetR"})
    public void setOffsetR(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"powerB"})
    public void setPowerB(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"powerG"})
    public void setPowerG(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"powerR"})
    public void setPowerR(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"saturation"})
    public void setSaturation(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"slopeB"})
    public void setSlopeB(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"slopeG"})
    public void setSlopeG(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"slopeR"})
    public void setSlopeR(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"temperature"})
    public void setTemperature(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"tint"})
    public void setTint(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"t"})
    public void setTonnemapType(Type value){
        //
    }

    @HideGetSet
    @MethodArgs({"vibrance"})
    public void setVibrance(float value){
        //
    }


}