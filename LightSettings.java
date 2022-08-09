package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"World"})
public class LightSettings {
    public static final int FOG_FAST = 0;
    public static final int FOG_SQRT = 1;
    public static final int SKYBOX_CUBIC = 0;
    public static final int SKYBOX_PANORAMA = 1;

    //

    public LightSettings() {
        //
    }

    @HideGetSet
    public Color getSpaceColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"color"})
    public void setSpaceColor(Color color) {
        //
    }

    @HideGetSet
    public Color getAmbientColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"color"})
    public void setAmbientColor(Color color) {
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use LightSettings.setSkybox(Texture) instead"})
    @HideGetSet
    @MethodArgs(args={"file"})
    public void setSkyboxFile(TextureFile pFile){
        //
    }
    @HideGetSet
    public Texture getSkybox(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"texture"})
    public void setSkybox(Texture texture){
        //
    }

    @HideGetSet
    public Color getSkyboxColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"color"})
    public void setSkyboxColor(Color color) {
        //
    }

    @HideGetSet
    public boolean isEnableFog(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"enabled"})
    public void setEnableFog(boolean enabled){
        //
    }

    @HideGetSet
    public Color getFogColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"color"})
    public void setFogColor(Color color) {
        //
    }

    @HideGetSet
    public float getFogStart() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setFogStart(float value) {
        //
    }
    @HideGetSet
    public float getFogEnd() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setFogEnd(float value) {
        //
    }
    @HideGetSet
    public int getFogType() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"type"})
    public void setFogType(int type) {
        //
    }

    @HideGetSet
    public float getSkyboxRotY() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSkyboxRotY(float value) {
        //
    }
    @HideGetSet
    public float getSkyboxRotX() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSkyboxRotX(float value) {
        //
    }
    @HideGetSet
    public float getSkyboxRotZ() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setSkyboxRotZ(float value) {
        //
    }

    @HideGetSet
    public int getSkyboxType() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"type"})
    public void setSkyboxType(int type) {
        //
    }
}