package JAVARuntime;

//

@ClassCategory(cat={"Shaders"})
public class MSRenderData {

    //

    private MSRenderData() { }

    public int vertexCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public Vertex vertexAt(int idx){
        //
        return null;
        //

        //
    }

    public int modelRendersCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public ModelRenderer modelRendererAt(int idx){
        //
        return null;
        //

        //
    }

    public int skinnedModelRendersCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public SkinnedModelRenderer skinnedModelRendererAt(int idx){
        //
        return null;
        //

        //
    }

    public int lightCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public Light lightAt(int idx){
        //
        return null;
        //

        //
    }

    public int bakesCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public Vertex bakeAt(int idx){
        //
        return null;
        //

        //
    }

    public float[] bakeMatrix(){
        //
        return null;
        //

        //
    }
}
