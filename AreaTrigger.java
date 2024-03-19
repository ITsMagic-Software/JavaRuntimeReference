package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

@ClassCategory(cat ={"Physics"})
public final class AreaTrigger extends PhysicsEntity {

    //

    public AreaTrigger() {
        //
        super();
        //

        //
    }

    @MethodArgs(args ={"objectName"})
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
    public List<Collision> getTriggerList(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"id"})
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
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }
}
