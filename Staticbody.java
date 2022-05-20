package JAVARuntime;

//

import java.util.ArrayList;

@ClassCategory(cat={"Physics"})
public class Staticbody extends PhysicsEntity{

    //

    public Staticbody() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }

    @MethodArgs(args={"objectName"})
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
    public ArrayList getCollisionList(){
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
    @MethodArgs(args={"idx"})
    public JAVARuntime.Collision getCollisionAt(int idx){
        //
        return null;
        //

        //
    }
}
