package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Input"})
public class Axis {
    //

    public Axis() {
        //
    }
    @MethodArgs(args ={"name"})
    public Axis(String name){
        //
    }

    @HideGetSet
    public Vector2 getValue(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setValue(Vector2 value){
        //
    }

    @HideGetSet
    public String getName(){
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setName(String value){
        //
    }
}
