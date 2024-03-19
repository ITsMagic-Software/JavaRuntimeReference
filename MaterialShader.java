package JAVARuntime;

//<REMOVE-BRIDGE>;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Utils.StringFunctions.StringUtils;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Extensible Shader from Java classes compiled in realtime (ITsMagic)
 */
@ClassCategory(cat={"Shaders"})
public class MaterialShader {
    public static final float OGL2 = 2;
    public static final float OGL3 = 3;
    public static final float OGL31 = 3.1f;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Graphics.RuntimeShading.MaterialShader materialShader;
    @IgnoreAutoComplete
    public MaterialShader(com.itsmagic.engine.Engines.Graphics.RuntimeShading.MaterialShader materialShader, Material material) {
        this.materialShader = materialShader;
        this.setMaterial(material);
    }

    @IgnoreAutoComplete
    public void setMaterial(Material material){
        this.material = material;
    }
    //>REMOVE-BRIDGE<

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
        //<REMOVE-BRIDGE>
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return material;
        //>REMOVE-BRIDGE<
    }
    public String getShaderLocation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return materialShader.javaFileLocation;
        //>REMOVE-BRIDGE<
    }
    public String getShaderFolderLocation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(materialShader.javaFileLocation.contains("/")){
            return StringUtils.getFileFolder(materialShader.javaFileLocation);
        } else {
            return "";
        }
        //>REMOVE-BRIDGE<
    }
    public float getOGLVersion(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        switch (Core.settingsController.engine.oglVersion) {
            case GL2:
                return OGL2;
            case GL3:
                return OGL3;
            case GL31:
                return OGL31;
            default:
                throw new IllegalArgumentException("The OGL Version: " + Core.settingsController.engine.oglVersion + " was not registered here!");
        }
        //>REMOVE-BRIDGE<
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