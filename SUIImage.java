package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public class SUIImage extends Component{
    //

    public SUIImage() {
        //
        super();
        //

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
    @MethodArgs(args ={"color"})
    public void setColor(Color color){
        //
    }

    @HideGetSet
    public Texture getImage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setImage(Texture texture){
        //
    }

    @HideGetSet
    public boolean isIgnoreMask(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setIgnoreMask(boolean value){
        //
    }

    @HideGetSet
    public int getBorder(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBorder(int value){
        //
    }
    @HideGetSet
    public SUnitType getBorderUnitType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBorderUnitType(SUnitType value){
        //
    }
    @MethodArgs(args ={"value","unitType"})
    public void setBorder(int value, SUnitType unitType){
        //
    }

    @HideGetSet
    public SImageType getImageType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImageType(SImageType sImageType){
        //
    }

    //
}
