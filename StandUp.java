package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public class StandUp extends Component {

    //

        public StandUp() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getRotationY(){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"value"})
    public void lookTo(Vector3 value){
        //
    }

    @MethodArgs(args ={"value"})
    public void rotate(float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void rotateInSeconds(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotationY(float value){
        //
    }


}