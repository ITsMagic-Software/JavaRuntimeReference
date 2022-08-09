package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"World"})
public class WorldController {
    //

    private WorldController() { }

    /// Abstracts
    public static void loadWorld(WorldFile worldFile){
        //
    }

    public static SpatialObject findObject(String name){
        //
        return null;
        //

        //
    }
    public static ArrayList getObjectList() {
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
    public static SpatialObject getObject(int index) {
        //
        return null;
        //

        //
    }

    public static List<JAVARuntime.Component> listAllComponents(String tittle){
        //
        return null;
        //

        //
    }
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

}
