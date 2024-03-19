package JAVARuntime;

//
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public class PhysicsEntity {

    //

    public PhysicsEntity() {
        //
    }

    @MethodArgs(args ={"objectName"})
    public boolean colliderWithName(String objectName){
        //
        return false;
        //

        //
    }
    public boolean isColliding(){
        //
        return false;
        //

        //
    }
    public List<Collision> getCollisionList(){
        //
        return null;
        //

        //
    }

    public int getCollisionsCount(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public Collision getCollisionAt(int idx){
        //
        return null;
        //

        //
    }

    public SpatialObject getObject(){
        //
        return null;
        //

        //
    }
    public String getTittle(){
        //
        return "";
        //

        //
    }
}
