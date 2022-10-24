package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"CameraFilters"})
public class CameraFilter{

    //

    // USED TO ACCESS MYOBJECT FROM JAVA SCRIPTS
    public Camera myCamera;

    public CameraFilter() {
    }
    @MethodArgs(args ={"tittle"})
    public CameraFilter(String tittle) {
        //
    }

    public void start(){

    }

    public void preDraw(){
        //
    }
    public void posDraw(){
        //
    }
    public void onDestroy(){
        //
    }

    @HideGetSet
    public String getTittle(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"tittle"})
    public void setTittle(String tittle){
        //
    }

    public String getFilterMenu(){
        return null;
    }
}
