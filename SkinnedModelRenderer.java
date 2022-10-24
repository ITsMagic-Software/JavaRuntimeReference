package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Components"})
public class SkinnedModelRenderer extends Component{
    public static final int CUBE = 456;
    public static final int SPHERE = 457;
    public static final int CONE = 458;
    public static final int CYLINDER = 459;
    public static final int CIRCLE = 460;
    public static final int TORUS = 461;
    public static final int SQUARE = 462;
    public static final int SQUARE90 = 463;


    //

    public SkinnedModelRenderer() {
        //
        super();
        //

        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SkinnedModelRenderer.setVertex(Vertex) instead"})
    @MethodArgs(args ={"file"})
    public void setModelFile(VertexFile pFile){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SkinnedModelRenderer.setMaterial(Material) instead"})
    @MethodArgs(args ={"file"})
    public void setMaterialFile(MaterialFile pFile){
        //
    }

    public Material getMaterial(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"material"})
    public void setMaterial(Material material){
        //
    }

    public Vertex getVertex(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @MethodArgs(args ={"primitive"})
    public void attachPrimitive(int primitive){
        //
    }

    //
}
