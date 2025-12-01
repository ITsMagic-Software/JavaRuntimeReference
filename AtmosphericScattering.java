package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"TODO"})
public class AtmosphericScattering extends Component {

    //

        public AtmosphericScattering() {
        //
        super();
        //

        //
    }

    public enum CloudType {
        Disabled, Simple, Advanced
    }
    //

    @HideGetSet
    public int getAmbientLightResolutionID(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getAtmosphereDensity(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getAtmosphereDensityFalloff(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getAtmosphereExtent(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public CloudType getCirrusClouds(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public CloudType getCumulusClouds(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Color getGroundColor(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getLux(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getMaxResolutionID(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Color getRayLeigh(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getSkyboxSimulationSpeed(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getWetness(){
        //
        return 0;
        //

        //
    }

    public boolean isAmbientLight(){
        //
        return false;
        //

        //
    }

    public boolean isEnableMoonball(){
        //
        return false;
        //

        //
    }

    public boolean isEnableSunball(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs({"ambientLight"})
    public void setAmbientLight(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"ambientLightReso"})
    public void setAmbientLightResolutionID(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"atmosphereDensity"})
    public void setAtmosphereDensity(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"atmosphereDensityFalloff"})
    public void setAtmosphereDensityFalloff(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"atmosphereExtent"})
    public void setAtmosphereExtent(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"cirrusClouds"})
    public void setCirrusClouds(CloudType value){
        //
    }

    @HideGetSet
    @MethodArgs({"cumulusClouds"})
    public void setCumulusClouds(CloudType value){
        //
    }

    @HideGetSet
    @MethodArgs({"enableMoonball"})
    public void setEnableMoonball(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"enableSunball"})
    public void setEnableSunball(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs({"groundColor"})
    public void setGroundColor(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"lux"})
    public void setLux(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"maxReso"})
    public void setMaxResolutionID(int value){
        //
    }

    @HideGetSet
    @MethodArgs({"rayLeigh"})
    public void setRayLeigh(Color value){
        //
    }

    @HideGetSet
    @MethodArgs({"skyboxSimulationSpeed"})
    public void setSkyboxSimulationSpeed(float value){
        //
    }

    @HideGetSet
    @MethodArgs({"wetness"})
    public void setWetness(float value){
        //
    }


}