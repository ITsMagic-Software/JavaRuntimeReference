package JAVARuntime;

//

@ClassCategory(cat ={"World"})
public final class GraphicsSettings {

    //

    public GraphicsSettings() {
        //
    }

    @HideGetSet
    public Texture getEnvironmentTexture() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"texture"})
    public void setEnvironmentTexture(Texture texture) {
        //
    }

    @HideGetSet
    public int getResolutionID() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"id"})
    public void setResolutionID(int id) {
        //
    }
}
