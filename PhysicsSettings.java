package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","World"})
public class PhysicsSettings {

    //

    public PhysicsSettings() {
        //
    }

    @HideGetSet
    public Vector3 getGravity() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"gravity"})
    public void setGravity(Vector3 gravity) {
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void setGravity(float x, float y, float z) {
        //
    }
}