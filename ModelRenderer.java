package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Components"})
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
    public ModelRenderer(Vertex vertex) {
        //
        super();
        //

        //
    }

    @MethodArgs(args ={"file"})
    public void setModelFile(VertexFile file){
        //
    }

    @MethodArgs(args ={"file"})
    public void setMaterialFile(MaterialFile file){
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
    @MethodArgs(args ={"material"})
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
    @MethodArgs(args ={"vertex"})
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
    @MethodArgs(args ={"wireframe"})
    public void setWireframe(boolean wireframe){
        //
    }

    @MethodArgs(args ={"primitive"})
    public void attachPrimitive(int primitive){
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
    @MethodArgs(args ={"matrix"})
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
    @MethodArgs(args ={"value"})
    public void setBatchingChannel(BatchingChannel value){
        //
    }

    //
}
