package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"World"})
public final class WorldController {
    //

    private WorldController() { }

    /// Abstracts
    @MethodArgs({"worldFile"})
    public static void loadWorld(WorldFile worldFile){
        //
    }
    @MethodArgs({"worldFile"})
    public static void loadWorldAsync(WorldFile worldFile){
        //
    }

    @MethodArgs({"name"})
    public static SpatialObject findObject(String name){
        //
        return null;
        //

        //
    }
    public static List<SpatialObject> getObjectList() {
        //
        return null;
        //

        //
    }
    public static int getObjectsCount() {
        //
        return 0;
        //

        //
    }
    @MethodArgs({"index"})
    public static SpatialObject getObject(int index) {
        //
        return null;
        //

        //
    }

    @MethodArgs({"classReference"})
    public static <T extends JAVARuntime.Component> T findFirstComponent(Class classReference){
        //
        return null;
        //

        //
    }
    @MethodArgs({"classReference"})
    public static <T extends JAVARuntime.Component> T findFirstActiveComponent(Class classReference){
        //
        return null;
        //

        //
    }
    @MethodArgs({"tittle"})
    public static List<JAVARuntime.Component> listAllComponents(String tittle){
        //
        return null;
        //

        //
    }
    @MethodArgs({"classReference"})
    public static List<JAVARuntime.Component> listAllComponents(Class classReference){
        //
        return null;
        //

        //
    }

    //

    public static float getLoadPercent(){
        //
        return 0;
        //

        //
    }
    public static float getLoadProgress(){
        //
        return 0;
        //

        //
    }
    public static int getLoadedCount(){
        //
        return 0;
        //

        //
    }
    public static int getLoadTotal(){
        //
        return 0;
        //

        //
    }
    public static String getLoadMessage(){
        //
        return null;
        //

        //
    }
    public static boolean isLoaded(){
        //
        return false;
        //

        //
    }
    public static boolean isLoading(){
        //
        return false;
        //

        //
    }

    public static GraphicsSettings getGraphicsSettings(){
        //
        return null;
        //

        //
    }
    public static PhysicsSettings getPhysicsSettings(){
        //
        return null;
        //

        //
    }

    @MethodArgs({"tagName"})
    public static SpatialObject findObjectWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs({"tagName"})
    public static List<SpatialObject> findObjectsWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs({"tagName"})
    public static SpatialObject findRandomObjectWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs({"tagName"})
    public static int countObjectsWithTag(String tagName) {
        //
        return 0;
        //

        //
    }
    @MethodArgs({"tagName"})
    public static boolean hasObjectsWithTag(String tagName) {
        //
        return false;
        //

        //
    }

    //
}
