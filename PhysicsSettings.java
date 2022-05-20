package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Physics","World"})
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
    @MethodArgs(args={"gravity"})
    public void setGravity(Vector3 gravity) {
        //
    }
    @MethodArgs(args={"x","y","z"})
    public void setGravity(float x, float y, float z) {
        //
    }

    @HideGetSet
    public int getFixedRate() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setFixedRate(int v) {
        //
    }

    @HideGetSet
    public int getMaxSubSteps() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMaxSubSteps(int v) {
        //
    }

    @HideGetSet
    public boolean isEnabledFixedRate() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setEnableFixedRate(boolean v) {
        //
    }
}