package JAVARuntime;

//

/*
* @Author Daniel Oschepkov (SpeakerFish)
*/

@ClassCategory(cat={"Prototyping"})
public class VehicleAI extends Component {
    //

    public VehicleAI() {
        //
    }

    @HideGetSet
    public float getMaxSteerAngle() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"maxSteerAngle"})
    public void setMaxSteerAngle(float maxSteerAngle) {
        //
    }

    @HideGetSet
    public float getMaxTorque() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"maxTorque"})
    public void setMaxTorque(float maxTorque) {
        //
    }

    //
}
