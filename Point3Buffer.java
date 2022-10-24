package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector","Buffers"})
public class Point3Buffer {
    //


    public Point3Buffer() {
        //
    }

    @MethodArgs(args ={"idx"})
    public Point3 get(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public float getX(int idx){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public float getY(int idx){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public float getZ(int idx){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public void put(Point3 point3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void put(int x, int y, int z){
        //
    }

    @MethodArgs(args ={"idx","value"})
    public void set(int idx, Point3 point3){
        //
    }
    @MethodArgs(args ={"idx","x","y","z"})
    public void set(int idx, int x, int y, int z){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }

    public Point3[] array(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"idx"})
    public void position(int idx){
        //
    }

    @HideGetSet
    public boolean isVboEnabled() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVboEnabled(boolean value){
        //
    }

    public JAVARuntime.NativeIntBuffer getFloatBuffer(){
        //
        return null;
        //

        //
    }
}
