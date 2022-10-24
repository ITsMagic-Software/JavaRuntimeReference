package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public class ObjectPhysics {

    //


    public <T extends PhysicsEntity> T getPhysicsEntity(){
        //
        return null;
        //

        //
    }
    public void setPhysicsEntity(PhysicsEntity physicsEntity){
        //
    }

    @HideGetSet
    public VehiclePhysics getVehiclePhysics(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vehiclePhysics"})
    public void setVehiclePhysics(VehiclePhysics vehiclePhysics){
        //
    }
}
