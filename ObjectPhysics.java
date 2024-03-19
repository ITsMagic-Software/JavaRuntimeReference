package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.PhysicsController;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public final class ObjectPhysics {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ObjectPhysics objectPhysics;
    @IgnoreAutoComplete
    public ObjectPhysics(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ObjectPhysics objectPhysics) {
        this.objectPhysics = objectPhysics;
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public <T extends PhysicsEntity> T getPhysicsEntity(){
        //<REMOVE-BRIDGE>
        /*s
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        PhysicsController entity = objectPhysics.getPhysicsController();
        if(entity == null) return null;
        return (T) entity.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setPhysicsEntity(PhysicsEntity physicsEntity){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(physicsEntity != null) {
            objectPhysics.changePhysicsTo(physicsEntity.instance);
        } else {
            objectPhysics.changePhysicsTo(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public VehiclePhysics getVehiclePhysics(){
        //<REMOVE-BRIDGE>
        /*s
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(objectPhysics.getVehiclePhysics() != null) {
            return objectPhysics.getVehiclePhysics().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vehiclePhysics"})
    public void setVehiclePhysics(VehiclePhysics vehiclePhysics){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vehiclePhysics != null) {
            objectPhysics.changeVehicleTo(vehiclePhysics.component);
        } else {
            objectPhysics.changeVehicleTo(null);
        }
        //>REMOVE-BRIDGE<
    }
}
