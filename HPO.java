package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"HPOP"})
public class HPO {
    //

    public HPO() {
        //
    }
    public HPO(Vector3 position, Quaternion rotation, Vector3 scale) {
        //
    }

    @HideGetSet
    public Vector3 getPosition() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"vector3"})
    public void setPosition(Vector3 vector3){
        //
    }

    @HideGetSet
    public Quaternion getRotation() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"quaternion"})
    public void setPosition(Quaternion quaternion){
        //
    }

    @HideGetSet
    public Vector3 getScale() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"vector3"})
    public void setScale(Vector3 vector3){
        //
    }

    @HideGetSet
    public boolean isStatic(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setStatic(boolean value){
        //
    }

    public float[] getMatrix() {
        //
        return null;
        //

        //
    }
}
