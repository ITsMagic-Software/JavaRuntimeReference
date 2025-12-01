package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","World"})
public final class PhysicsSettings {

    //

    public PhysicsSettings() {
        //
    }

    @JRDoc_EN("Returns the gravity of the world.")
    @JRDoc_PT("Retorna a gravidade do mundo.")
    @HideGetSet
    public Vector3 getGravity() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the gravity of the world.")
    @JRDoc_PT("Define a gravidade do mundo.")
    @HideGetSet
    @MethodArgs({"gravity"})
    public void setGravity(Vector3 gravity) {
        //
    }
    @JRDoc_EN("Sets the gravity of the world with the specified x, y, and z values.")
    @JRDoc_PT("Define a gravidade do mundo com os valores x, y e z especificados.")
    @MethodArgs({"x","y","z"})
    public void setGravity(float x, float y, float z) {
        //
    }
}