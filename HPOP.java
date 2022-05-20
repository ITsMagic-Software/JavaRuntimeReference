package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"HPOP","Components"})
public class HPOP extends Component{
    //

    public HPOP() {
        //
        super();
        //

        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use HPOP.getVertex() instead"})
    @HideGetSet
    public PFile getModelFile(){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use HPOP.setVertex(Vertex) instead"})
    @HideGetSet
    @MethodArgs(args={"pFile"})
    public void setModelFile(PFile pFile){
        //
    }

    @HideGetSet
    public PFile getMaterialFile(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"pFile"})
    public void setMaterialFile(PFile pFile){
        //
    }

    @HideGetSet
    public Material getMaterial(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"material"})
    public void setMaterial(Material material){
        //
    }

    @HideGetSet
    public Vertex getVertex(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @HideGetSet
    public boolean isFovCulling(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setFovCulling(boolean value){
        //
    }

    @HideGetSet
    public boolean isMaxRenderDistanceEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMaxRenderDistanceEnabled(boolean value){
        //
    }

    @HideGetSet
    public float getMaxRenderDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMaxRenderDistance(float value){
        //
    }

    @HideGetSet
    public float getFovcBias(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setFovcBias(float value){
        //
    }

    @HideGetSet
    public float getMinimalDistance(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setMinimalDistance(float value){
        //
    }

    @HideGetSet
    public float getFovObjectSize(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setObjectSize(float value){
        //
    }

    @HideGetSet
    public HPOPData getHPOPData(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"hpopData"})
    public void setHPOPData(HPOPData hpopData){
        //
    }

    public boolean isLoaded(){
        //
        return false;
        //

        //
    }

    //
}
