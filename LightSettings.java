package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Texture.FileTexture;
import com.itsmagic.engine.Engines.Engine.Texture.Manager.TextureManager;
import com.itsmagic.engine.Engines.Engine.World.Settings.LigthSettings;

import java.util.Locale;
//>REMOVE-BRIDGE<

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

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient LigthSettings ligthSettings;
    @IgnoreAutoComplete
    public LightSettings(LigthSettings ligthSettings) {
        this.ligthSettings = ligthSettings;
    }
    //>REMOVE-BRIDGE<

    public LightSettings() {
        //<REMOVE-BRIDGE>
        this.ligthSettings = new LigthSettings();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getSpaceColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getClearColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setSpaceColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.clearColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getAmbientColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getAmbientColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setAmbientColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.ambientColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    @UnimplementedDoc
    public Color getIndirectLightColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getIndirectLight().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs(args ={"color"})
    public void setIndirectLightColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.indirectLight = color.instance;
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use LightSettings.setSkybox(Texture) instead"})
    @HideGetSet
    @MethodArgs(args ={"file"})
    public void setSkyboxFile(TextureFile pFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxTexture = pFile.getFilePath();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Texture getSkybox(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(ligthSettings.skyboxTexture != null && !ligthSettings.skyboxTexture.isEmpty()){
            FileTexture texture = TextureManager.exists(ligthSettings.skyboxTexture);
            if(texture != null) {
                texture.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setSkybox(Texture texture){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(texture.instance instanceof FileTexture) {
            FileTexture fileTexture = (FileTexture) texture.instance;
            ligthSettings.skyboxTexture = fileTexture.getFile();
        } else {
            ligthSettings.setSkyboxTextureInstance(texture.instance);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getSkyboxColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getSkyboxColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setSkyboxColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isEnableFog(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.enableFog;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnableFog(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.enableFog = enabled;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getFogColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.fogColor.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setFogColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.fogColor = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFogStart() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getFogStart();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFogStart(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.setFogStart(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getFogEnd() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.getFogEnd();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFogEnd(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.setFogEnd(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getFogType() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (ligthSettings.getFogType()) {
            case LinearSqrt:
                return FOG_SQRT;
            case LinearSimple:
                return FOG_FAST;
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setFogType(int type) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (type) {
            case FOG_FAST:
                ligthSettings.setFogType(LigthSettings.FogType.LinearSimple);
                break;
            case FOG_SQRT:
                ligthSettings.setFogType(LigthSettings.FogType.LinearSqrt);
                break;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSkyboxRotY() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.skyboxRotationY;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSkyboxRotY(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxRotationY = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getSkyboxRotX() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.skyboxRotationX;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSkyboxRotX(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxRotationX = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getSkyboxRotZ() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.skyboxRotationZ;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSkyboxRotZ(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxRotationZ = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getSkyboxType() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (ligthSettings.skyboxType) {
            case Cubic:
                return SKYBOX_CUBIC;
            case Panorama:
                return SKYBOX_PANORAMA;
            case Atmospheric:
                return SKYBOX_ATMOSPHERIC;
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setSkyboxType(int type) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (type) {
            case SKYBOX_CUBIC:
                ligthSettings.skyboxType = LigthSettings.SkyboxType.Cubic;
                break;
            case SKYBOX_PANORAMA:
                ligthSettings.skyboxType = LigthSettings.SkyboxType.Panorama;
                break;
            case SKYBOX_ATMOSPHERIC:
                ligthSettings.skyboxType = LigthSettings.SkyboxType.Atmospheric;
                break;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isEnableCirrusClouds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.enableCirrusClouds;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnableCirrusClouds(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.enableCirrusClouds = enabled;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isEnableCumulusClouds(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.enableCumulusClouds;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnableCumulusClouds(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.enableCumulusClouds = enabled;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getRayColor() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.rayLeigh.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setRayColor(Color color) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.rayLeigh = color.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWetness() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.wetness;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWetness(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.wetness = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getAtmosphereDensity() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.atmosphereDensity;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereDensity(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.atmosphereDensity = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getAtmosphereDensityFalloff() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.atmosphereDensityFalloff;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereDensityFalloff(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.atmosphereDensityFalloff = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getAtmosphereExtent() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.atmosphereExtent;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAtmosphereExtent(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.atmosphereExtent = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSkyboxSimulationSpeed() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.skyboxSimulationSpeed;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSkyboxSimulationSpeed(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.skyboxSimulationSpeed = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getGamma() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.gamma;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setGamma(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.gamma = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getExposure() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.exposure;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setExposure(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.exposure = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSlope() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.slope;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSlope(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.slope = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getToe() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.toe;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setToe(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.toe = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getShoulder() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.shoulder;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShoulder(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.shoulder = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getBlackClip() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.blackClip;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setBlackClip(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.blackClip = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWhiteClip() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ligthSettings.whiteClip;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWhiteClip(float value) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ligthSettings.whiteClip = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getTonemapMode() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (ligthSettings.tonemapV2) {
            case Disabled:
                return TONEMAP_DISABLED;
            case Uncharted2:
                return TONEMAP_UNCHARTED2;
            case ACES:
                return TONEMAP_ACES;
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setTonemapMode(int type) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (type) {
            case TONEMAP_DISABLED:
                ligthSettings.tonemapV2 = LigthSettings.Tonemap.Disabled;
                break;
            case TONEMAP_UNCHARTED2:
                ligthSettings.tonemapV2 = LigthSettings.Tonemap.Uncharted2;
                break;
            case TONEMAP_ACES:
                ligthSettings.tonemapV2 = LigthSettings.Tonemap.ACES;
                break;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getSpecularType() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (ligthSettings.specularModeV3) {
            case Disabled:
                return SPECULAR_SHADER_DISABLED;
            case Simple:
                return SPECULAR_SHADER_SIMPLE;
            case BRDF:
                return SPECULAR_SHADER_BRDF;
            case GGX:
                return SPECULAR_SHADER_GGX;
            case BRDF_GGX:
                return SPECULAR_SHADER_BRDF_GGX;
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"type"})
    public void setSpecularType(int type) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (type) {
            case SPECULAR_SHADER_DISABLED:
                ligthSettings.specularModeV3 = LigthSettings.SpecularShader.Disabled;
                break;
            case SPECULAR_SHADER_SIMPLE:
                ligthSettings.specularModeV3 = LigthSettings.SpecularShader.Simple;
                break;
            case SPECULAR_SHADER_BRDF:
                ligthSettings.specularModeV3 = LigthSettings.SpecularShader.BRDF;
                break;
            case SPECULAR_SHADER_GGX:
                ligthSettings.specularModeV3 = LigthSettings.SpecularShader.GGX;
                break;
            case SPECULAR_SHADER_BRDF_GGX:
                ligthSettings.specularModeV3 = LigthSettings.SpecularShader.BRDF_GGX;
                break;
        }
        //>REMOVE-BRIDGE<
    }

    /*public enum Skybox{
        CUBIC, PANORAMA, ATMOSPHERIC
    }
    //<REMOVE-BRIDGE>
    private static Skybox ENUMCONVERT(LigthSettings.SkyboxType un){
        Skybox[] values = Skybox.values();
        for (int i = 0; i < values.length; i++) {
            Skybox value = values[i];
            if(value.toString().equalsIgnoreCase(un.toString())){
                return value;
            }
        }
        throw new RuntimeException("Invalid skybox type " + un.toString());
    }
    private static LigthSettings.SkyboxType ENUMCONVERT(Skybox un){
        LigthSettings.SkyboxType[] values = LigthSettings.SkyboxType.values();
        for (int i = 0; i < values.length; i++) {
            LigthSettings.SkyboxType value = values[i];
            if(value.toString().equalsIgnoreCase(un.toString())){
                return value;
            }
        }
        throw new RuntimeException("Invalid skybox type " + un.toString());
    }
    //>REMOVE-BRIDGE<
    */
}