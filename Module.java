package JAVARuntime;

import android.view.View;
//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public class Module {
    public static final int
            WORLD_OBJECTS =      111101,
            WORLD_SETTINGS =     111102,
            CREATE_NEW_OBJECT =  111103,
            PROJECT_FILES =      111104,
            PROFILER =           111105,
            OBJECT_PROPERTIES =  111106,
            CONSOLE =            111107,
            ANIMATION_EDITOR =   111108,
            ANIMATION_TIMELINE = 111109,
            PROJECT_SCRIPTS =    111110
    ;

    //

    public Module(String tittle) {
        //
    }

    /**
     *  LISTENER EVENTS
     */
    public void onStart(){
        //
    }
    public void onStop(){
        //
    }
    public void onStartBuilded(){
        //
    }
    public void onObjectSelected(SpatialObject object){

    }
    public void onOpenFile(PFile pFile){

    }


    /**
     * USEFUL FUNCTIONS
     */
    //<inspector>
    public SpatialObject getSelectedObject(){
        //
        return null;
        //

        //
    }

    public void setSelectedObject(SpatialObject object){
        //
    }
    public void setSelectedMaterial(Material material){
        //
    }
    public void setSelectedFile(PFile pFile){
        //
    }

    public void centerViewAtSelected(){
        //
    }
    public Camera getEditorCamera(){
        //
        return null;
        //

        //
    }
    public void setEditorCameraZoom(float value){
        //
    }
    public void setEditorCameraPitch(float value){
        //
    }
    public void setEditorCameraYaw(float value){
        //
    }
    public void setEditorCameraPosition(Vector3 value){
        //
    }
    public void setEditorCameraPosition(float x, float y, float z){
        //
    }
    //>inspector<
    public boolean isSelected(){
        //
        return false;
        //

        //
    }
    public boolean isGameRunning(){
        //
        return false;
        //

        //
    }
    public boolean isGameStopped(){
        //
        return false;
        //

        //

    }
    public void addView(View view){
        //
    }
    public void removeView(View view){
        //
    }
    public void runOnEngine(Runnable runnable){
        //
    }
    public void runOnModule(Runnable runnable){
        //
    }

    public void createFolder(PFile folder){
        //
    }
    public void createFolder(String folder){
        //
    }

    public void deleteFolder(String folder){
        //
    }

    //

    public void copyFile(PFile from, PFile dest){
        //
    }
    public void copyFile(PFile from, String dest){
        //
    }
    public void copyFile(String from, PFile dest){
        //
    }
    public void copyFile(String from, String dest){
        //
    }

    //

    /**
     * CONFIGURATIONS
     */
    public void setFocusOnSelectedObject(boolean value){
        //
    }
    public void setRequestSelectedObject(boolean value){
        //
    }
    public void setHideEditorTools(boolean value){
        //
    }
    public void setChangeToGameViewWhenPlay(boolean value){
        //
    }
    public void setRequestComponentName(String value){
        //
    }
    public void setCloseWhenDetach(boolean value){
        //
    }
    public void setModuleConfigs(ModuleConfig moduleConfigs){
        //
    }
    public void setExecution(ExecutionAllow executionAllow){
        //
    }
    public void setShowInPanelAtStart(boolean value){
        //
    }

    public void addLeftPanel(int id){
        //
    }
    public void addRightPanel(int id){
        //
    }
    public void addBottomPanel(int id){
        //
    }

    public void closeAllPanels(){
        //
    }

    public void detach(){
        // Dettach module if its running

        //
    }
    public void detachAndClose(){
        // Dettach module if its running

        //
    }
}
