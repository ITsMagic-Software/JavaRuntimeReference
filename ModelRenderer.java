package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Rendering","Components"})
public final class ModelRenderer extends Component{
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

    @MethodArgs({"file"})
    public void setModelFile(VertexFile file){
        //
    }

    @MethodArgs({"file"})
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
    @MethodArgs({"material"})
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
    @MethodArgs({"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @HideGetSet
    public boolean isCastShadowEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"wireframe"})
    public void setCastShadowEnabled(boolean wireframe){
        //
    }

    @HideGetSet
    public boolean isEnableOutline(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setEnableOutline(boolean value){
        //
    }

    @HideGetSet
    public Color getOutlineColor(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"color"})
    public void setOutlineColor(Color color){
        //
    }

    @MethodArgs({"primitive"})
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
    @MethodArgs({"matrix"})
    public void setRenderMatrix(float[] renderMatrix){
        //
    }

    public float getOutlineScale(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"value"})
    public void setOutlineScale(float value){
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
    @MethodArgs({"value"})
    public void setBatchingChannel(BatchingChannel value){
        //
    }

    //
}
