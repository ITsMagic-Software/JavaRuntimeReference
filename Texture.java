package JAVARuntime;

//<REMOVE-BRIDGE>
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
//
import com.itsmagic.engine.Activities.Editor.Panels.Inspector.Utils.RequireVIP;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.Color.ColorINT;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Texture.Data.NativeTexture;
import com.itsmagic.engine.Engines.Engine.Texture.DepthTexture;
import com.itsmagic.engine.Engines.Engine.Texture.Manager.TextureManager;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Texture.FileTexture;
import com.itsmagic.engine.Engines.Engine.Texture.ScratchTexture;
import com.itsmagic.engine.Engines.Engine.Texture.Utils.TextureConfig;
import com.itsmagic.engine.Engines.Engine.Texture.TextureInstance;
//>REMOVE-BRIDGE<

import java.io.InputStream;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Material"})
public final class Texture {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Texture.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
                if(JCompiler.correctName(thisClass.getName()).equals(JCompiler.correctName(className))){
                    return true;
                }
                return false;
            }

            @Override
            public String getSimpleName(UserPointer userPointer) {
                return thisClass.getSimpleName();
            }
            //
            @Override
            public Variable save(String fieldName, Object value, UserPointer userPointer) {
                Texture var = (Texture) value;
                if(var != null && var.instance != null) {
                    TextureInstance textureInstance = var.instance;
                    if(textureInstance instanceof FileTexture) {
                        FileTexture fileTexture = (FileTexture) textureInstance;
                        return new Variable(fieldName, fileTexture.getFile(), Variable.Type.InspectorString);
                    }
                }
                return new Variable(fieldName, "", Variable.Type.InspectorString);
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.InspectorString){
                    if(variable.str_value != null && !variable.str_value.isEmpty()) {
                        FileTexture fileTexture = TextureManager.loadTexture(variable.str_value);
                        if(fileTexture != null) {
                            return fileTexture.toJAVARuntime();
                        }
                        return null;
                    }
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Texture((Engine) null);
            }
        });
    }
    //>REMOVE-BRIDGE<

    public enum ExportMode{
        Automatic, RAMOnly, GPUOnly
    }
    public enum ExportFormat{
        PNG, JPG
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Texture.TextureInstance instance;
    @IgnoreAutoComplete
    public Texture(com.itsmagic.engine.Engines.Engine.Texture.TextureInstance instance) {
        this.instance = instance;
    }
    @BuildClassConstructor
    public Texture(Engine engine) {}
    //>REMOVE-BRIDGE<

    public Texture(int width, int height){
        //<REMOVE-BRIDGE>
        TextureConfig config = new TextureConfig();
        config.allowModifications = true;
        this.instance = new ScratchTexture(width, height, config);
        //>REMOVE-BRIDGE<
    }
    public Texture(int width, int height, boolean allowModifications){
        //<REMOVE-BRIDGE>
        TextureConfig config = new TextureConfig();
        config.allowModifications = allowModifications;
        this.instance = new ScratchTexture(width, height, config);
        //>REMOVE-BRIDGE<
    }


    //<REMOVE-BRIDGE>
    private static ExportMode ENUMCONVERT(NativeTexture.ExportMode un){
        return ExportMode.valueOf(un.toString());
    }
    private static NativeTexture.ExportMode ENUMCONVERT(ExportMode un){
        return NativeTexture.ExportMode.valueOf(un.toString());
    }
    private static ExportFormat ENUMCONVERT(NativeTexture.ExportFormat un){
        return ExportFormat.valueOf(un.toString());
    }
    private static NativeTexture.ExportFormat ENUMCONVERT(ExportFormat un){
        return NativeTexture.ExportFormat.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public void exportToFile(JAVARuntime.File file) {
        exportToFile(file, 100, ExportMode.Automatic, ExportFormat.PNG);
    }
    public void exportToFile(JAVARuntime.File file, int quality) {
        exportToFile(file, quality, ExportMode.Automatic, ExportFormat.PNG);
    }
    public void exportToFile(JAVARuntime.File file, int quality, ExportMode exportMode, ExportFormat exportFormat) {
        //<REMOVE-BRIDGE>
        this.instance.exportToFile(file, quality, ENUMCONVERT(exportMode), ENUMCONVERT(exportFormat));
        //>REMOVE-BRIDGE<
    }

    public void apply(){
        //<REMOVE-BRIDGE>
        this.instance.apply();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isWritable(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.isWritable();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getWidth();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.getHeight();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public Color getPixel(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.get(x, y).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"coord"})
    public Color getPixel(Vector2 coord){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.instance.get((int)coord.getX(), (int)coord.getY()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","color"})
    public void setPixel(int x, int y, Color color){
        //<REMOVE-BRIDGE>
        this.instance.set(x, y, color.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"coord","color"})
    public void setPixel(Vector2 coord, Color color){
        //<REMOVE-BRIDGE>
        this.instance.set((int)coord.getX(), (int)coord.getY(), color.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public Color get(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return get(x, y, new Color());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","out"})
    public Color get(int x, int y, Color out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(out == null){
            throw new NullPointerException("out can't be null");
        }
        return instance.get(x, y, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatRed(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getFloatRed(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatGreen(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getFloatGreen(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatBlue(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getFloatBlue(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public float getFloatAlpha(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getFloatAlpha(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public int getIntRed(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getIntRed(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public int getIntGreen(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getIntGreen(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public int getIntBlue(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getIntBlue(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public int getIntAlpha(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getIntAlpha(x, y);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","color"})
    public void set(int x, int y, Color color){
        //<REMOVE-BRIDGE>
        if(color == null){
            throw new NullPointerException("color can't be null");
        }
        instance.set(x, y, color.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue","colorAlpha"})
    public void set(int x, int y, float r, float g, float b, float a){
        //<REMOVE-BRIDGE>
        instance.setFloats(x, y, r, g, b, a);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue"})
    public void set(int x, int y, float r, float g, float b){
        //<REMOVE-BRIDGE>
        instance.setFloats(x, y, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setR(int x, int y, float v){
        //<REMOVE-BRIDGE>
        instance.setFloatRed(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setG(int x, int y, float v){
        //<REMOVE-BRIDGE>
        instance.setFloatGreen(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setB(int x, int y, float v){
        //<REMOVE-BRIDGE>
        instance.setFloatBlue(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setA(int x, int y, float v){
        //<REMOVE-BRIDGE>
        instance.setFloatAlpha(x, y, v);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue","colorAlpha"})
    public void set(int x, int y, int r, int g, int b, int a){
        //<REMOVE-BRIDGE>
        instance.setInts(x, y, r, g, b, a);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","colorRed", "colorGreen","colorBlue"})
    public void set(int x, int y, int r, int g, int b){
        //<REMOVE-BRIDGE>
        instance.setInts(x, y, r, g, b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setR(int x, int y, int v){
        //<REMOVE-BRIDGE>
        instance.setIntRed(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setG(int x, int y, int v){
        //<REMOVE-BRIDGE>
        instance.setIntGreen(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setB(int x, int y, int v){
        //<REMOVE-BRIDGE>
        instance.setIntBlue(x, y, v);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","value"})
    public void setA(int x, int y, int v){
        //<REMOVE-BRIDGE>
        instance.setIntAlpha(x, y, v);
        //>REMOVE-BRIDGE<
    }

    /// ABSTRACT
    @MethodArgs(args ={"file"})
    public static Texture loadFile(TextureFile file){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Texture.TextureInstance texture = TextureManager.exists(file.getFilePath());
        if(texture != null){
            return texture.toJAVARuntime();
        }
        texture = TextureManager.loadTexture(file.getFilePath());
        if(texture != null){
            return texture.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file"})
    public static Texture loadFile(JAVARuntime.File file){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(file == null) throw new NullPointerException("File can't be null");
        //
        TextureInstance textureInstance = new FileTexture(file);
        if(textureInstance != null) {
            return textureInstance.toJAVARuntime();
        } else {
            return null;
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file"})
    public static Texture loadInputStream(InputStream inputStream){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(inputStream == null) throw new NullPointerException("Input stream can't be null");
        Bitmap bmp = BitmapFactory.decodeStream(inputStream);
        //
        if(bmp == null) throw new RuntimeException("Failed to decode file");
        int w = bmp.getWidth();
        int h = bmp.getHeight();
        TextureInstance textureInstance = new ScratchTexture(w,h);

        ColorINT colorINT = new ColorINT();
        final int[] pixels = new int[w * h];
        bmp.getPixels(pixels, 0, w, 0, 0, w, h);

        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                int pixel = pixels[determineBitmapIndex(x, y, h)];
                colorINT.set(pixel);
                textureInstance.set(x, y, colorINT);
            }
        }
        return textureInstance.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    static int determineBitmapIndex(int x, int y, int imageHeight){
        int off = y * imageHeight;
        return off + x;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"width","height"})
    public static Texture newDepth(int w, int h){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Texture(new DepthTexture(w, h));
        //>REMOVE-BRIDGE<
    }

    public static Texture white(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return TextureManager.whiteTexture.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Texture empty(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return TextureManager.emptyTexture.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static Texture black(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return TextureManager.blackTexture.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public static boolean isRenderable(Texture texture){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Engines.Engine.Texture.TextureInstance.isRenderable(texture);
        //>REMOVE-BRIDGE<
    }
}