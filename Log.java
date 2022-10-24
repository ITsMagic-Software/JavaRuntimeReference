package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class Log {
    //

    public Log() {
        //
    }
    @MethodArgs(args ={"message"})
    public Log(String message) {
        //
    }
    @MethodArgs(args ={"tittle","message"})
    public Log(String tittle, String message) {
        //
    }
    @MethodArgs(args ={"tag","tittle","message"})
    public Log(String tag, String tittle, String message) {
        //
    }
    @MethodArgs(args ={"tag","tittle","message","color"})
    public Log(String tag, String tittle, String message, Color color) {
        //
    }

    @HideGetSet
    public String getTittle(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTittle(String value){
        //
    }
    @HideGetSet
    public String getMessage(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMessage(String value){
        //
    }
    @HideGetSet
    public String getTag(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTag(String value){
        //
    }
    @HideGetSet
    public String getLink(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLink(String value){
        //
    }
    @HideGetSet
    public int getQuantity(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setQuantity(int value){
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
}
