package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class StandUp extends Component {

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

    @MethodArgs({"value"})
    public void lookTo(Vector3 value){
        //
    }

    @MethodArgs({"value"})
    public void rotate(float value){
        //
    }

    @MethodArgs({"value"})
    public void rotateInSeconds(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"value"})
    public void setRotationY(float value){
        //
    }


}