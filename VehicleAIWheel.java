package JAVARuntime;

//

/*
 * @Author Daniel Oschepkov (SpeakerFish)
 */

@ClassCategory(cat={"Prototyping","Components"})
public class VehicleAIWheel extends Component {
    //

    public VehicleAIWheel() {
        //
    }

    @HideGetSet
    public boolean isSteerWheel() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"steerWheel"})
    public void setSteerWheel(boolean steerWheel) {
        //
    }

    @HideGetSet
    public boolean isTorqueWheel() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"steerWheel"})
    public void setTorqueWheel(boolean steerWheel) {
        //
    }

    //
}