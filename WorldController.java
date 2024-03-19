package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.JavaComponent.JavaComponent;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Engine.TagSystem.Tag;
import com.itsmagic.engine.Engines.Engine.World.World;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
import com.itsmagic.engine.Engines.Utils.Mathematicals.RandomF;
import com.itsmagic.engine.Engines.Utils.NaNFixer;
//>REMOVE-BRIDGE<

import java.util.ArrayList;
import java.util.List;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"World"})
public final class WorldController {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private WorldController() { }

    /// Abstracts
    @MethodArgs(args ={"worldFile"})
    public static void loadWorld(WorldFile worldFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.World.WorldController.loadWorld(worldFile.getFilePath(), false, new com.itsmagic.engine.Engines.Engine.World.WorldController.LoadListener() {
            @Override
            public void onSuccess() {

            }

            @Override
            public World onFailed() {
                Console.log("Failed to load world " + worldFile.getFilePath());
                //
                return null;
            }
        });
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"worldFile"})
    public static void loadWorldAsync(WorldFile worldFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.World.WorldController.loadWorldAsync(worldFile.getFilePath(), false, new com.itsmagic.engine.Engines.Engine.World.WorldController.LoadListener() {
            @Override
            public void onSuccess() {

            }

            @Override
            public World onFailed() {
                Console.log("Failed to load world " + worldFile.getFilePath());
                //
                return null;
            }
        });
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public static SpatialObject findObject(String name){
        //<REMOVE-BRIDGE>

        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GameObject find = Core.worldController.loadedWorld.findGameObjectWithName(name);
        if(find != null) {
            return find.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public static List<SpatialObject> getObjectList() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<GameObject> childs = Core.worldController.loadedWorld.getObjects();

        List<SpatialObject> childsList = new ArrayList<>();
        for (com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject child : childs) {
            if(child != null){
                childsList.add(child.toJAVARuntime());
            }
        }
        return childsList;
        //>REMOVE-BRIDGE<
    }
    public static int getObjectsCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.worldController.loadedWorld.objects.size();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"index"})
    public static SpatialObject getObject(int index) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<GameObject> childs = Core.worldController.loadedWorld.getObjects();
        return childs.get(index).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"classReference"})
    public static JAVARuntime.Component findFirstComponent(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        try {
            List<GameObject> objects = com.itsmagic.engine.Engines.Engine.World.WorldController.loadedWorld.objects;
            for (int i = 0; i < objects.size(); i++) {
                GameObject object = objects.get(i);
                JAVARuntime.Component comp = findFirstComponentFromChild(classReference, object);
                if(comp != null){
                    return comp;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tittle"})
    public static List<JAVARuntime.Component> listAllComponents(String tittle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<JAVARuntime.Component> components = new ArrayList<>();
        try {
            List<GameObject> objects = Core.worldController.loadedWorld.objects;
            for (int i = 0; i < objects.size(); i++) {
                GameObject object = objects.get(i);
                listComponentsFromChild(tittle, object, components);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return components;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"classReference"})
    public static List<JAVARuntime.Component> listAllComponents(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<JAVARuntime.Component> components = new ArrayList<>();
        try {
            List<GameObject> objects = com.itsmagic.engine.Engines.Engine.World.WorldController.loadedWorld.objects;
            for (int i = 0; i < objects.size(); i++) {
                GameObject object = objects.get(i);
                listComponentsFromChild(classReference, object, components);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return components;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private static JAVARuntime.Component findFirstComponentFromChild(Class classReference, GameObject parent){
        {
            JAVARuntime.Component comp = parent.findComponent(classReference);
            if (comp != null) return comp;
        }
        for (int i = 0; i < parent.childrenCount(); i++) {
            GameObject object = parent.childAt(i);
            JAVARuntime.Component comp = findFirstComponentFromChild(classReference, object);
            if(comp != null){
                return comp;
            }
        }
        return null;
    }
    @IgnoreAutoComplete
    private static void listComponentsFromChild(String tittle, GameObject parent, List<JAVARuntime.Component> list){
        List<Component> componentArrayList = parent.findComponents(tittle);
        for (int i = 0; i < componentArrayList.size(); i++) {
            Component component = componentArrayList.get(i);
            if(component.getType() != Component.Type.JavaComponent) {
                list.add(component.toJAVARuntime());
            } else {
                try {
                    list.add((JAVARuntime.Component) ((JavaComponent) component).getRuntimeComponent());
                } catch (Exception e) { }
            }
        }
        for (int i = 0; i < parent.childrenCount(); i++) {
            GameObject object = parent.childAt(i);
            listComponentsFromChild(tittle, object, list);
        }
    }
    @IgnoreAutoComplete
    private static void listComponentsFromChild(Class classReference, GameObject parent, List<JAVARuntime.Component> list){
        List<JAVARuntime.Component> componentArrayList = parent.findComponents(classReference);
        for (JAVARuntime.Component component : componentArrayList) {
            list.add(component);
        }
        for (int i = 0; i < parent.childrenCount(); i++) {
            GameObject object = parent.childAt(i);
            listComponentsFromChild(classReference, object, list);
        }
    }
    //>REMOVE-BRIDGE<

    public static float getLoadPercent(){
        //<REMOVE-BRIDGE>

        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return NaNFixer.fix(getLoadProgress() * 100f);
        //>REMOVE-BRIDGE<
    }
    public static float getLoadProgress(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return NaNFixer.fix(com.itsmagic.engine.Engines.Engine.World.WorldController.getLoadProgress());
        //>REMOVE-BRIDGE<
    }
    public static int getLoadedCount(){
        //<REMOVE-BRIDGE>

        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return com.itsmagic.engine.Engines.Engine.World.WorldController.getLoadedCount();
        //>REMOVE-BRIDGE<
    }
    public static int getLoadTotal(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return com.itsmagic.engine.Engines.Engine.World.WorldController.getLoadCount();
        //>REMOVE-BRIDGE<
    }
    public static String getLoadMessage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return com.itsmagic.engine.Engines.Engine.World.WorldController.getLoadMessage();
        //>REMOVE-BRIDGE<
    }
    public static boolean isLoaded(){
        //<REMOVE-BRIDGE>

        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.worldController.isLoaded();
        //>REMOVE-BRIDGE<
    }

    public static LightSettings getLightSettings(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.worldController.loadedWorld.getLigthSettings().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static PhysicsSettings getPhysicsSettings(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.worldController.loadedWorld.getPhysicsSettings().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public static WorldPathFinder getPathFinder(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.worldController.loadedWorld.getNavMeshSettings().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"tagName"})
    public static SpatialObject findObjectWithTag(String tagName) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        Tag tag = Engine.getGameSettings().getTagSystem().getTagByName(tagName);
        if(tag == null) throw new NullPointerException("Tag not found with name:"+tagName);
        List<GameObject> children = com.itsmagic.engine.Engines.Engine.World.WorldController.loadedWorld.getObjects();
        for (int i = 0; i < children.size(); i++) {
            GameObject child = children.get(i);
            GameObject found = findObjectWithTag(tag, child);
            if(found != null){
                return found.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tagName"})
    public static List<SpatialObject> findObjectsWithTag(String tagName) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        List<SpatialObject> withTagObjects = new ArrayList<>();
        Tag tag = Engine.getGameSettings().getTagSystem().getTagByName(tagName);
        if(tag == null) throw new NullPointerException("Tag not found with name:"+tagName);
        List<GameObject> children = com.itsmagic.engine.Engines.Engine.World.WorldController.loadedWorld.getObjects();
        for (int i = 0; i < children.size(); i++) {
            GameObject child = children.get(i);
            findObjectsWithTag(tag, child, withTagObjects);
        }
        return withTagObjects;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tagName"})
    public static SpatialObject findRandomObjectWithTag(String tagName) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<SpatialObject> list = findObjectsWithTag(tagName);
        return list.get(RandomF.intRange(0, list.size()-1));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tagName"})
    public static int countObjectsWithTag(String tagName) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return findObjectsWithTag(tagName).size();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"tagName"})
    public static boolean hasObjectsWithTag(String tagName) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Tag tag = Engine.getGameSettings().getTagSystem().getTagByName(tagName);
        if(tag == null) throw new NullPointerException("Tag not found with name:"+tagName);
        List<GameObject> children = com.itsmagic.engine.Engines.Engine.World.WorldController.loadedWorld.getObjects();
        for (int i = 0; i < children.size(); i++) {
            GameObject child = children.get(i);
            GameObject found = findObjectWithTag(tag, child);
            if(found != null){
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private static GameObject findObjectWithTag(Tag tag, GameObject parent){
        if(tag == null) throw new NullPointerException("Tag can't be null");
        if(parent == null) throw new NullPointerException("Parent can't be null");
        if(parent.compareTag(tag)){
            return parent;
        }
        for (int i = 0; i < parent.childrenCount(); i++) {
            GameObject child = parent.childAt(i);
            GameObject found = findObjectWithTag(tag, child);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
    @IgnoreAutoComplete
    private static void findObjectsWithTag(Tag tag, GameObject parent, List<SpatialObject> out){
        if(tag == null) throw new NullPointerException("Tag can't be null");
        if(parent == null) throw new NullPointerException("Parent can't be null");
        if(out == null) throw new NullPointerException("Out can't be null");
        if(parent.compareTag(tag)){
            out.add(parent.toJAVARuntime());
        }
        for (int i = 0; i < parent.childrenCount(); i++) {
            GameObject child = parent.childAt(i);
            findObjectsWithTag(tag, child, out);
        }
    }
    //>REMOVE-BRIDGE<
}
