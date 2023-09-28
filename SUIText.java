package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SupremeUI","Components"})
public class SUIText extends Component{
    //

    public SUIText() {
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
    public String getText(){
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(String text){
        //
    }
    @HideGetSet
    @MethodArgs(args ={"textLines"})
    public void setText(String... text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(float text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(int text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(double text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(boolean text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(short text){
        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(byte text){
        //
    }

    @HideGetSet
    public int getResolution(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolution(int value){
        //
    }
    @HideGetSet
    public SUnitType getResolutionUnitType(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setResolutionUnitType(SUnitType value){
        //
    }
    @MethodArgs(args ={"value","unitType"})
    public void setResolution(int value, SUnitType unitType){
        //
    }

    public float measureWidth(String text){
        //
        return 0;
        //

        //
    }
    public float measureWidth(String[] lines){
        //
        return 0;
        //

        //
    }
    public float measureHeight(String text){
        //
        return 0;
        //

        //
    }
    public float measureHeight(String[] lines){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getScale(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScale(float value){
        //
    }

    @HideGetSet
    public STextAlignment getAlignment(){
        //
        return null;
        //

        //
    }
    @HideGetSet

    @MethodArgs(args ={"value"})
    public void setAlignment(STextAlignment value){
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
    public Font getFont(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFont(Font value){
        //
    }

    //
}
