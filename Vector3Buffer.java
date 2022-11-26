package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector","Buffers"})
public class Vector3Buffer {
    //

    public Vector3Buffer(int vectorCount) {
        //
    }
    public Vector3Buffer(NativeFloatBuffer nativeFloatBuffer) {
        //
    }

    @MethodArgs(args ={"idx"})
    public Vector3 get(int idx){
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
    public void put(Vector3 vector3){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void put(float x, float y, float z){
        //
    }

    @MethodArgs(args ={"idx","value"})
    public void set(int idx, Vector3 vector3){
        //
    }
    @MethodArgs(args ={"idx","x","y","z"})
    public void set(int idx, float x, float y, float z){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }

    public Vector3[] array(){
        //
        return null;
        //

        //
    }

    public int getPosition(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public int position(int idx){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public void setPosition(int idx){
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

    public Vector3Buffer copy(){
        //
        return null;
        //

        //
    }

    public JAVARuntime.NativeFloatBuffer getFloatBuffer(){
        //
        return null;
        //

        //
    }
}

