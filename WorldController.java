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
    @MethodArgs(args ={"worldFile"})
    public static void loadWorld(WorldFile worldFile){
        //
    }
    @MethodArgs(args ={"worldFile"})
    public static void loadWorldAsync(WorldFile worldFile){
        //
    }

    @MethodArgs(args ={"name"})
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
    @MethodArgs(args ={"index"})
    public static SpatialObject getObject(int index) {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"classReference"})
    public static JAVARuntime.Component findFirstComponent(Class classReference){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"tittle"})
    public static List<JAVARuntime.Component> listAllComponents(String tittle){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"classReference"})
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

    public static LightSettings getLightSettings(){
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
    public static WorldPathFinder getPathFinder(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"tagName"})
    public static SpatialObject findObjectWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"tagName"})
    public static List<SpatialObject> findObjectsWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"tagName"})
    public static SpatialObject findRandomObjectWithTag(String tagName) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"tagName"})
    public static int countObjectsWithTag(String tagName) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"tagName"})
    public static boolean hasObjectsWithTag(String tagName) {
        //
        return false;
        //

        //
    }

    //
}
