package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"SupremeUI"})
public class SUIRect extends Component{
    //

    public SUIRect() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public Quaternion getRotation(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setRotation(Quaternion value){
        //
    }

    @HideGetSet
    public int getScreenX(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getScreenY(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getScreenW(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getScreenH(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getLayer(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setLayer(int value){
        //
    }

    @MethodArgs(args={"entry"})
    public int getInt(String entry){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setInt(String entry, int value){
        //
    }

    @MethodArgs(args={"entry"})
    public float getFloat(String entry){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setFloat(String entry, float value){
        //
    }

    @MethodArgs(args={"entry"})
    public SUnitType getUnit(String entry){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setUnit(String entry, SUnitType value){
        //
    }

    @MethodArgs(args={"entry"})
    public SpatialObject getAnchorObject(String entry){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setAnchorObject(String entry, SpatialObject value){
        //
    }

    @MethodArgs(args={"entry"})
    public SVerticalConstraintTarget getVerticalAnchorType(String entry){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setVerticalAnchorType(String entry, SVerticalConstraintTarget value){
        //
    }

    @MethodArgs(args={"entry"})
    public SHorizontalConstraintTarget getHorizontalAnchorType(String entry){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"entry","value"})
    public void setHorizontalAnchorType(String entry, SHorizontalConstraintTarget value){
        //
    }

    //
}
