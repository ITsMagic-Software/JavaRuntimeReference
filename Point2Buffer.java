package JAVARuntime;

//
import java.nio.ByteOrder;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector","Buffers"})
public class Point2Buffer {
    //

    public Point2Buffer() {
        //
    }

    @MethodArgs(args ={"idx"})
    public Point2 get(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public int getX(int idx){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public int getY(int idx){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"point2"})
    public void put(Point2 vector3){
        //
    }
    @MethodArgs(args ={"x","y"})
    public void put(int x, int y){
        //
    }

    public int capacity(){
        //
        return 0;
        //

        //
    }

    public Point2[] array(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"idx"})
    public void position(int idx){
        //
    }

    public boolean isDirect(){
        //
        return false;
        //

        //
    }

    public ByteOrder order(){
        //
        return null;
        //

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
