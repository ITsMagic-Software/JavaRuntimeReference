package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Material"})
public class Texture {
    //

    //

    public Texture() {
        //
    }

    public void prepareImage(){
        //
    }
    public boolean isPrepared(){
        //
        return false;
        //

        //
    }
    public void apply(){
        //
    }
    public void release(){
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
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use Texture.loadFile(TextureFile) instead"})
    @MethodArgs(args={"file"})
    public static Texture loadFile(PFile pFile){
        //
        return null;
        //

        //
    }
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
}