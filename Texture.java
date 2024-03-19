package JAVARuntime;

//

//

import java.io.InputStream;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Material"})
public final class Texture {
    //

    public enum ExportMode{
        Automatic, RAMOnly, GPUOnly
    }
    public enum ExportFormat{
        PNG, JPG
    }

    //

    public Texture(int width, int height){
        //
    }
    public Texture(int width, int height, boolean allowModifications){
        //
    }


    //

    public void exportToFile(JAVARuntime.File file) {
        exportToFile(file, 100, ExportMode.Automatic, ExportFormat.PNG);
    }
    public void exportToFile(JAVARuntime.File file, int quality) {
        exportToFile(file, quality, ExportMode.Automatic, ExportFormat.PNG);
    }
    public void exportToFile(JAVARuntime.File file, int quality, ExportMode exportMode, ExportFormat exportFormat) {
        //
    }

    public void apply(){
        //
    }

    @HideGetSet
    public boolean isWritable(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public int getWidth(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getHeight(){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"x","y"})
    public Color getPixel(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"coord"})
    public Color getPixel(Vector2 coord){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"x","y","color"})
    public void setPixel(int x, int y, Color color){
        //
    }
    @MethodArgs(args ={"coord","color"})
    public void setPixel(Vector2 coord, Color color){
        //
    }

    @MethodArgs(args ={"x","y"})
    public Color get(int x, int y){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y","out"})
    public Color get(int x, int y, Color out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatRed(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatGreen(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatBlue(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatAlpha(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public int getIntRed(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public int getIntGreen(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public int getIntBlue(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"x","y"})
    public int getIntAlpha(int x, int y){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"x","y","color"})
    public void set(int x, int y, Color color){
        //
    }

    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue","colorAlpha"})
    public void set(int x, int y, float r, float g, float b, float a){
        //
    }
    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue"})
    public void set(int x, int y, float r, float g, float b){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setR(int x, int y, float v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setG(int x, int y, float v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setB(int x, int y, float v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setA(int x, int y, float v){
        //
    }

    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue","colorAlpha"})
    public void set(int x, int y, int r, int g, int b, int a){
        //
    }
    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue"})
    public void set(int x, int y, int r, int g, int b){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setR(int x, int y, int v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setG(int x, int y, int v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setB(int x, int y, int v){
        //
    }
    @MethodArgs(args ={"x","y","value"})
    public void setA(int x, int y, int v){
        //
    }

    /// ABSTRACT
    @MethodArgs(args ={"file"})
    public static Texture loadFile(TextureFile file){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file"})
    public static Texture loadFile(JAVARuntime.File file){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file"})
    public static Texture loadInputStream(InputStream inputStream){
        //
        return null;
        //

        //
    }

    //

    @MethodArgs(args ={"width","height"})
    public static Texture newDepth(int w, int h){
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