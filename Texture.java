package JAVARuntime;

//

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Material"})
public class Texture {
    //

    //

    public Texture(int width, int height){
        //
    }
    public Texture(int width, int height, boolean allowModifications){
        //
    }

    public void apply(){
        //
    }

    public int getWidth(){
        //
        return 0;
        //

        //
    }
    public int getHeight(){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"x","y"})
    public Color getPixel(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"coord"})
    public Color getPixel(Vector2 coord){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"x","y","color"})
    public void setPixel(int x, int y, Color color){
        //
    }
    @MethodArgs(args={"coord","color"})
    public void setPixel(Vector2 coord, Color color){
        //
    }

    /// ABSTRACT
    @MethodArgs(args={"file"})
    public static Texture loadFile(TextureFile pFile){
        //
        return null;
        //

        //
    }

    public static Texture white(){
        //
        return null;
        //

        //
    }
    public static Texture empty(){
        //
        return null;
        //

        //
    }
    public static Texture black(){
        //
        return null;
        //

        //
    }

    public static boolean isRenderable(Texture texture){
        //
        return false;
        //

        //
    }
}