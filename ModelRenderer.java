package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Components"})
public class ModelRenderer extends Component{
    public enum BatchingChannel{
        Automatic, Dynamic, Static, Disabled
    }

    public static final int CUBE = 456;
    public static final int SPHERE = 457;
    public static final int CONE = 458;
    public static final int CYLINDER = 459;
    public static final int CIRCLE = 460;
    public static final int TORUS = 461;
    public static final int SQUARE = 462;
    public static final int SQUARE90 = 463;

    //

    public ModelRenderer() {
        //
        super();
        //

        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use ModelRenderer.getVertex() instead"})
    @HideGetSet
    public PFile getModelFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use ModelRenderer.setVertex(Vertex) instead"})
    @HideGetSet
    @MethodArgs(args={"file"})
    public void setModelFile(PFile pFile){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use ModelRenderer.getMaterial() instead"})
    @HideGetSet
    public PFile getMaterialFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use ModelRenderer.setMaterial(Material) instead"})
    @HideGetSet
    @MethodArgs(args={"file"})
    public void setMaterialFile(PFile pFile){
        //
    }

    @HideGetSet
    public Material getMaterial(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"material"})
    public void setMaterial(Material material){
        //
    }

    @HideGetSet
    public Vertex getVertex(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @HideGetSet
    public boolean isWireframe(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"wireframe"})
    public void setWireframe(boolean wireframe){
        //
    }

    @MethodArgs(args={"primitive"})
    public void attachPrimitive(int primitive){
        //
    }
    public boolean isModelLoaded(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public float[] getRenderMatrix(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"matrix"})
    public void setRenderMatrix(float[] renderMatrix){
        //
    }
    
    @HideGetSet
    public BatchingChannel getBatchingChannel(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setBatchingChannel(BatchingChannel value){
        //
    }

    //
}
