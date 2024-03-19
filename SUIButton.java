package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public final class SUIButton extends Component{
    //

    public SUIButton() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public boolean isPressed(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public boolean isDown(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    public boolean isUp(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public Color getNormalColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setNormalColor(Color color){
        //
    }

    @HideGetSet
    public Texture getNormalImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setNormalImage(Texture texture){
        //
    }

    @HideGetSet
    public boolean isNormalIgnoreMask(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalIgnoreMask(boolean value){
        //
    }

    @HideGetSet
    public int getNormalBorder(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalBorder(int value){
        //
    }
    @HideGetSet
    public SUnitType getNormalBorderUnitType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalBorderUnitType(SUnitType value){
        //
    }
    @MethodArgs(args ={"value","unitType"})
    public void setNormalBorder(int value, SUnitType unitType){
        //
    }

    @HideGetSet
    public SImageType getNormalImageType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setNormalImageType(SImageType sImageType){
        //
    }

    @HideGetSet
    public Color getPressedColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setPressedColor(Color color){
        //
    }

    @HideGetSet
    public Texture getPressedImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setPressedImage(Texture texture){
        //
    }

    @HideGetSet
    public boolean isPressedIgnoreMask(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedIgnoreMask(boolean value){
        //
    }

    @HideGetSet
    public int getPressedBorder(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedBorder(int value){
        //
    }
    @HideGetSet
    public SUnitType getPressedBorderUnitType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedBorderUnitType(SUnitType value){
        //
    }
    @MethodArgs(args ={"value","unitType"})
    public void setPressedBorder(int value, SUnitType unitType){
        //
    }

    @HideGetSet
    public SImageType getPressedImageType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPressedImageType(SImageType sImageType){
        //
    }

    @HideGetSet
    public boolean isClickable(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setClickable(boolean value){
        //
    }

    @HideGetSet
    public STargetRect getTargetRectType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTargetRectType(STargetRect value){
        //
    }

    @HideGetSet
    public SpatialObject getTargetRectObject(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTargetRectObject(SpatialObject object){
        //
    }

    //
}
