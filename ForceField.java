package JAVARuntime;

//

import java.util.ArrayList;

@ClassCategory(cat={"Physics"})
public class ForceField extends PhysicsEntity{

    //

    public ForceField() {
        //
        super();
        //

        //
    }

    public boolean triggerWithName(String objectName){
        //
        return false;
        //

        //
    }
    public boolean isTriggering(){
        //
        return false;
        //

        //
    }
    public ArrayList getTriggerList(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"idx"})
    public JAVARuntime.Collision getTrigger(int idx){
        //
        return null;
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
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }
}
