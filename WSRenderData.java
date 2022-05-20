package JAVARuntime;

//

@ClassCategory(cat={"Shaders"})
public class WSRenderData {

    //

    private WSRenderData() { }

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

    public int cameraCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public Camera bakeAt(int idx) {
        //
        return null;
        //

        //
    }
}
