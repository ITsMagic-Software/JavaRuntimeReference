package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"World"})
public final class LightSettings {

    public static final int FOG_FAST = 0;
    public static final int FOG_SQRT = 1;

    public static final int SKYBOX_CUBIC       = 0;
    public static final int SKYBOX_PANORAMA    = 1;
    public static final int SKYBOX_ATMOSPHERIC = 2;

    public static final int TONEMAP_DISABLED   = 0;
    public static final int TONEMAP_UNCHARTED2 = 1;
    public static final int TONEMAP_ACES       = 2;

    public static final int SPECULAR_SHADER_DISABLED = 0;
    public static final int SPECULAR_SHADER_SIMPLE   = 1;
    public static final int SPECULAR_SHADER_BRDF     = 2;
    public static final int SPECULAR_SHADER_GGX      = 3;
    public static final int SPECULAR_SHADER_BRDF_GGX = 4;

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
    @MethodArgs(args ={"color"})
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
    @MethodArgs(args ={"color"})
    public void setAmbientColor(Color color) {
        //
    }

    @HideGetSet
    @UnimplementedDoc
    public Color getIndirectLightColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"color"})
    public void setIndirectLightColor(Color color) {
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use LightSettings.setSkybox(Texture) instead"})
    @HideGetSet
    @MethodArgs(args ={"file"})
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
    @MethodArgs(args ={"texture"})
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
    @MethodArgs(args ={"color"})
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
    @MethodArgs(args ={"enabled"})
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
    @MethodArgs(args ={"color"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"type"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"value"})
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
    @MethodArgs(args ={"type"})
    public void setSkyboxType(int type) {
        //
    }

    @HideGetSet
    public boolean isEnableCirrusClouds(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnableCirrusClouds(boolean enabled){
        //
    }

    @HideGetSet
    public boolean isEnableCumulusClouds(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnableCumulusClouds(boolean enabled){
        //
    }

    @HideGetSet
    public Color getRayColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setRayColor(Color color) {
        //
    }

    @HideGetSet
    public float getWetness() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWetness(float value) {
        //
    }

    @HideGetSet
    public float getAtmosphereDensity() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereDensity(float value) {
        //
    }

    @HideGetSet
    public float getAtmosphereDensityFalloff() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereDensityFalloff(float value) {
        //
    }

    @HideGetSet
    public float getAtmosphereExtent() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereExtent(float value) {
        //
    }

    @HideGetSet
    public float getSkyboxSimulationSpeed() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSkyboxSimulationSpeed(float value) {
        //
    }

    @HideGetSet
    public float getGamma() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGamma(float value) {
        //
    }

    @HideGetSet
    public float getExposure() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setExposure(float value) {
        //
    }

    @HideGetSet
    public float getSlope() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSlope(float value) {
        //
    }

    @HideGetSet
    public float getToe() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setToe(float value) {
        //
    }

    @HideGetSet
    public float getShoulder() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShoulder(float value) {
        //
    }

    @HideGetSet
    public float getBlackClip() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBlackClip(float value) {
        //
    }

    @HideGetSet
    public float getWhiteClip() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWhiteClip(float value) {
        //
    }

    @HideGetSet
    public int getTonemapMode() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setTonemapMode(int type) {
        //
    }

    @HideGetSet
    public int getSpecularType() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setSpecularType(int type) {
        //
    }

    /*public enum Skybox{
        CUBIC, PANORAMA, ATMOSPHERIC
    }
    //
    */
}