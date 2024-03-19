package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Extensible Shader from Java classes compiled in realtime (ITsMagic)
 */
@ClassCategory(cat={"Shaders"})
public class MaterialShader {
    public static final float OGL2 = 2;
    public static final float OGL3 = 3;
    public static final float OGL31 = 3.1f;

    //

    // USED TO ACCESS MYOBJECT FROM JAVA SCRIPTS
    public transient Material material;

    /**
     * Zero-Argument constructor required
     * Class instanced by java loader by calling this constructor
     */
    public MaterialShader() {
    }


    /**
     * Bridged by MaterialShader class in engine runtime
     */
    public void start() {
        //
    }
    @MethodArgs(args={"ogles","renderData"})
    public void preRender(OGLES ogles) {
    }
    @MethodArgs(args={"ogles","camera","renderData"})
    public void render(OGLES ogles, Camera camera, MSRenderData renderData) {
    }
    @MethodArgs(args={"ogles","renderData"})
    public void posRender(OGLES ogles) {
    }

    public Material getMaterial(){
        //
        return null;
        //

        //
    }
    public String getShaderLocation(){
        //
        return null;
        //

        //
    }
    public String getShaderFolderLocation(){
        //
        return null;
        //

        //
    }
    public float getOGLVersion(){
        //
        return 0;
        //

        //
    }

    public String getShaderName(){
        return "CustomShader/MyShader";
    }
    public float getMinimalSupportedOGL(){
        return MaterialShader.OGL2;
    }

    public boolean hideMinimalSupportedOGLError() {
        return false;
    }
    public boolean drawInTransparentRenderer(){
        return false;
    }
}