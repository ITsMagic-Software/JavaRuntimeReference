package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Extensible Shader from Java classes compiled in realtime (ITsMagic)
 */
@ClassCategory(cat={"Shaders"})
public class WorldShader {
    public static final float OGL2 = 2;
    public static final float OGL3 = 3;
    public static final float OGL31 = 3.1f;

    //

    /**
     * Zero-Argument constructor required
     * Class instanced by java loader by calling this constructor
     */
    public WorldShader() {
    }

    /**
     * Bridged by MaterialShader class in engine runtime
     */
    public void start() {
        //
    }
    @MethodArgs(args={"ogles","renderData"})
    public void preRender(OGLES ogles, WSRenderData renderData) {
        //
    }
    @MethodArgs(args={"ogles","renderData"})
    public void render(OGLES ogles, WSRenderData renderData) {
        //
    }
    @MethodArgs(args={"ogles","camera","frustum","view"})
    public void onCamera(OGLES ogles, Camera camera, float[] frustum, float[] view) {
        //
    }
    @MethodArgs(args={"ogles","renderData"})
    public void posRender(OGLES ogles, WSRenderData renderData) {
        //
    }
    @MethodArgs(args={"ogles"})
    public void onGUI(OGLES ogles){

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

    public float getMinimalSupportedOGL(){
        return WorldShader.OGL2;
    }
    public boolean hideMinimalSupportedOGLError(){
        return false;
    }
}