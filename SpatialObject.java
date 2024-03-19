package JAVARuntime;

//<REMOVE-BRIDGE>
import android.content.Context;
import android.util.Log;

import com.google.gson.JsonSyntaxException;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Components.JCompiler.JCompillerUtils;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.TagSystem.Tag;
import com.itsmagic.engine.Engines.Engine.World.WorldController;
import com.itsmagic.engine.Engines.Engine.World.WorldInstantiate;
import com.itsmagic.engine.Engines.Utils.ObjectReferencing.AdvObjectReference;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.JavaComponent.JavaComponent;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.ObjectUtils;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.SpatialInspectorSave;
import com.itsmagic.engine.Engines.Engine.World.WorldUtils;
import com.itsmagic.engine.Engines.Native.OHString.OHString;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
//>REMOVE-BRIDGE<


import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Object"})
public final class SpatialObject {
    //<REMOVE-BRIDGE>
    private static final boolean ALLOW_LOG = false;
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = SpatialObject.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
                if(JCompiler.correctName(thisClass.getName()).equals(JCompiler.correctName(className))){
                    return true;
                }
                return false;
            }

            @Override
            public String getSimpleName(UserPointer userPointer) {
                return thisClass.getSimpleName();
            }
            //
            @Override
            public Variable save(String fieldName, Object value, UserPointer userPointer) {
                try {
                    SpatialObject var = (SpatialObject) value;
                    if (var != null && var.instance.get() != null) {
                        AdvObjectReference advObjectReference = new AdvObjectReference(var.instance.get());
                        if(userPointer != null){
                            advObjectReference.setAttachedTo(userPointer.gameObject);
                        }
                        advObjectReference.storeSettings();
                        Variable outVar = new Variable(fieldName, advObjectReference.toJson());
                        outVar.type = Variable.Type.ObjectReferenceJson;
                        return outVar;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return new Variable(fieldName, "", Variable.Type.ObjectReferenceJson);
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.String){
                    String json = variable.str_value;
                    if(json != null && !json.isEmpty()) {
                        SpatialInspectorSave inspectorSave = SpatialInspectorSave.fromJson(json);
                        if (inspectorSave == null) {
                            log("inspectorSave == null, using the unique guid technique");
                            GameObject object = WorldUtils.findObjectWithUniqueGUID(new OHString(json), WorldController.loadedWorld);
                            if (object != null) {
                                return object.toJAVARuntime();
                            }
                        } else {
                            if (userPointer.gameObject != null) {
                                GameObject actualObject = userPointer.gameObject;
                                GameObject actualMasterParent = userPointer.gameObject.masterParent;
                                if (actualMasterParent == null) actualMasterParent = actualObject;

                                if (actualMasterParent.getGuid().getDUPLICABLE_GUID().equals(inspectorSave.masterParentDuplicableID)) {
                                    log("Master parent duplicable match");

                                    if (inspectorSave.objectsDuplicableIDs.size() > 1) {
                                        // ignore first, its the masterParent
                                        GameObject searchParent = actualMasterParent;
                                        for (int i = 1; i < inspectorSave.objectsDuplicableIDs.size(); i++) {
                                            OHString uid = inspectorSave.objectsDuplicableIDs.get(i);
                                            GameObject object = ObjectUtils.findDuplicableGUIDInChilds(searchParent, uid);
                                            if (object != null) {
                                                log("Child found " + uid);
                                                searchParent = object;
                                            }
                                        }
                                        log("Using last found has the object");
                                        return searchParent.toJAVARuntime();
                                    } else {
                                        log("inspectorSave.objectsInstanciableIDs.size() <= 1, using the actualMasterParent has the object");
                                        return actualMasterParent.toJAVARuntime();
                                    }
                                } else {
                                    log("Master parent differs, searching for unique GUID");
                                    GameObject object = WorldUtils.findObjectWithUniqueGUID(inspectorSave.objectUniqueID, Core.worldController.loadedWorld);
                                    if (object != null) {
                                        return object.toJAVARuntime();
                                    }
                                }
                            } else {
                                log("userPointer.gameObject == null, searching object using the inspectorSave.objectUniqueID");
                                GameObject object = WorldUtils.findObjectWithUniqueGUID(inspectorSave.objectUniqueID, Core.worldController.loadedWorld);
                                if (object != null) {
                                    return object.toJAVARuntime();
                                }
                            }
                        }
                    }
                }
                if(variable.type == Variable.Type.ObjectReferenceJson){
                    String json = variable.str_value;
                    if(json != null && !json.isEmpty()) {
                        try {
                            AdvObjectReference advObjectReference = ClassExporter.getBuilder().fromJson(json, AdvObjectReference.class);
                            if(advObjectReference != null) {
                                if (userPointer != null) {
                                    advObjectReference.setAttachedTo(userPointer.gameObject);
                                }
                                if (advObjectReference != null) {
                                    GameObject object = advObjectReference.findObject();
                                    if (object != null) {
                                        return object.toJAVARuntime();
                                    }
                                }
                            }
                        } catch (JsonSyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return null;
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            private void addParent(List<OHString> list, GameObject object){
                if(object.parent != null){
                    list.add(object.parent.getGuid().getDUPLICABLE_GUID());
                    addParent(list, object.parent);
                }
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new GameObject().toJAVARuntime();
            }

            public void log(String str){
                if(ALLOW_LOG) {
                    Log.d("SpatialObject", str);
                }
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient WeakReference<com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject> instance;
    @IgnoreAutoComplete
    public SpatialObject(com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject instance) {
        this.instance = new WeakReference<>(instance);
        instance.setRuntime(this);
    }

    @BuildClassConstructor
    public SpatialObject(Engine engine) { }
    //>REMOVE-BRIDGE<

    public SpatialObject() {
        //<REMOVE-BRIDGE>
        this("Unnamed object");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"parent"})
    public SpatialObject(SpatialObject parent) {
        //<REMOVE-BRIDGE>
        this("Unnamed object", parent);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public SpatialObject(String name) {
        //<REMOVE-BRIDGE>
        this(name, null);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","parent"})
    public SpatialObject(String name, SpatialObject parent) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(name == null || name.isEmpty()){ name = "Unnamed object"; }
        GameObject obj = new GameObject(new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform());
        obj.setName(name);
        this.instance = new WeakReference<>(obj);
        obj.transform.setGameObject(obj);
        obj.setRuntime(this);
        if(parent != null) {
            WorldInstantiate.instantiate(obj, parent.instance.get());
        } else {
            WorldInstantiate.instantiate(obj);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isEnabled(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().isEnabled();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEnabled(boolean enabled){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().setEnabled(enabled);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDontDestroyOnLoad(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.get().dontDestroyOnLoad;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDontDestroyOnLoad(boolean value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().dontDestroyOnLoad = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getName(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().getName().toString();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setName(String name){
        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("Name can't be null or empty");
        }
        instance.get().setName(name);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setNameOH(JAVARuntime.OHString name){
        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("Name can't be null or empty");
        }
        instance.get().setName(name.toString());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public boolean compareName(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("name can't be empty or null");
        }
        return instance.get().compareName(name);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Transform getTransform() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validateNTC();
        return instance.get().transform.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public ObjectPhysics getPhysics() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().getObjectPhysics().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public void destroy(){
        //<REMOVE-BRIDGE>
        validate();
        ObjectUtils.destroy(instance.get());
        this.instance = null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public GUID getGUID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().getGuid().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public void callFunction(String name){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, Object value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, int value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, float value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, String value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name, value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, boolean value){
        //<REMOVE-BRIDGE>
        validate();
        instance.get().callFunction(name, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"file"})
    public SpatialObject instantiate(ObjectFile pFile){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o = pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = null;

            o.transform.setPosition(instance.get().transform.getGlobalPosition().clone());
            o.transform.setRotation(com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.lookTo(instance.get().transform.forward()));

            instance.get().Instantiate(o);
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file","position"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(position == null) throw new NullPointerException("Position can't be null");
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o = pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = null;

            o.transform.setPosition(position.instance);
            o.transform.setRotation(com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion.lookTo(instance.get().transform.forward()));

            instance.get().Instantiate(o);
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file","position","rotation"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(position == null) throw new NullPointerException("Position can't be null");
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o = pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = null;

            o.transform.setPosition(position.instance.clone());
            o.transform.setRotation(rotation.instance.clone());

            instance.get().Instantiate(o);
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file","position","rotation","scale"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation, Vector3 scale){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(position == null) throw new NullPointerException("Position can't be null");
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o = pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = null;

            o.transform.setPosition(position.instance.clone());
            o.transform.setRotation(rotation.instance.clone());
            o.transform.setScale(scale.instance.clone());

            instance.get().Instantiate(o);
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file"})
    public SpatialObject instantiateHasChild(ObjectFile pFile){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o =pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = instance.get();

            o.transform.setPosition(instance.get().transform.getPosition());
            o.transform.setRotation(instance.get().transform.getRotation());

            instance.get().Instantiate(o, instance.get());
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file","parent"})
    public SpatialObject instantiateHasChild(ObjectFile pFile, SpatialObject parent){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject o = pFile.instantiate();

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }

            o.parent = parent.instance.get();

            o.transform.setPosition(parent.instance.get().transform.getPosition());
            o.transform.setRotation(parent.instance.get().transform.getRotation());

            instance.get().Instantiate(o, parent.instance.get());
            return o.toJAVARuntime();
        } else {
            throw new RuntimeException("Failed to load the file " + pFile.getFilePath());
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"tittle"})
    public <T extends Component> T findComponent(String tittle){
        //<REMOVE-BRIDGE>
        validate();
        if(tittle == null || tittle.isEmpty()){
            throw new NullPointerException("name can't be empty or null");
        }
        com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component = instance.get().findComponent(tittle);
        if(component != null && component.getTittle().equalsIgnoreCase(tittle)){
            if(component.getType() != com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component.Type.JavaComponent) {
                return (T) component.toJAVARuntime();
            } else {
                try {
                    return (T) ((JavaComponent) component).getRuntimeComponent();
                } catch (Exception e) { }
            }
        }
        //>REMOVE-BRIDGE<
        return null;
    }
    @MethodArgs(args ={"tittle"})
    public List<Component> findComponents(String tittle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        validate();
        if(tittle == null || tittle.isEmpty()){
            throw new NullPointerException("name can't be empty or null");
        }
        List<com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component> componentArrayList = instance.get().findComponents(tittle);
        List<Component> components = new ArrayList<>();

        for (int i = 0; i < componentArrayList.size(); i++) {
            components.add(componentArrayList.get(i).toJAVARuntime());
        }
        return components;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"type"})
    public <T extends Component> T findComponent(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        validate();
        return (T) instance.get().findComponent(classReference);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"type"})
    public List<Component> findComponents(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        validate();
        List<Component> componentArrayList = instance.get().findComponents(classReference);
        List<Component> components = new ArrayList<>();

        for (Component component : componentArrayList) {
            components.add(component);
        }
        return components;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"tittle"})
    public <T extends Component> T findComponentInChildren(String tittle){
        //<REMOVE-BRIDGE>
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component = instance.get().findComponent(tittle);
        if(component != null && component.getTittle().equalsIgnoreCase(tittle)){
            if(component.getType() != com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component.Type.JavaComponent) {
                return (T) component.toJAVARuntime();
            } else {
                try {
                    return (T) ((JavaComponent) component).getRuntimeComponent();
                } catch (Exception e) { }
            }
        }
        for (GameObject child : instance.get().getChildrenCritical()) {
            if(child != null){
                Component component1 = child.toJAVARuntime().findComponentInChildren(tittle);
                if(component1 != null){
                    return (T) component1;
                }
            }
        }
        //>REMOVE-BRIDGE<
        return null;
    }
    @MethodArgs(args ={"type"})
    public <T extends Component> T findComponentInChildren(Class classReference){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        //<REMOVE-BRIDGE>
        validate();
        Component component = instance.get().findComponent(classReference);
        if(component != null){
            return (T) component;
        }
        for (GameObject child : instance.get().getChildrenCritical()) {
            if(child != null){
                Component component1 = child.toJAVARuntime().findComponentInChildren(classReference);
                if(component1 != null){
                    return (T) component1;
                }
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"component"})
    public void removeComponent(Component component){
        //<REMOVE-BRIDGE>
        validateNTC();
        if(component.type == Component.Type.JavaComponent) {
            if(component.javaComponent != null) {
                instance.get().removeComponent(component.javaComponent);
            }
        } else{
            instance.get().removeComponent(component.component);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"component"})
    public void addComponent(Component component){
        //<REMOVE-BRIDGE>
        validateNTC();
        if(component.type == Component.Type.JavaComponent) {
            if(component.javaComponent != null) {
                if(component.javaComponent.gameObject != null){
                    throw new IllegalArgumentException("Component already attached to a object");
                }
                component.setComponentObject(instance.get().toJAVARuntime());
                instance.get().addComponent(component.javaComponent);
            } else {
                if(component.myObject != null){
                    throw new IllegalArgumentException("Component already attached to a object");
                }
                Class type = component.getClass();
                if(type == null){
                    throw new IllegalArgumentException("To add a new Java Component to a object, use the function addComponent(component, class type)");
                }
                component.javaComponent = new JavaComponent(component, type, JCompillerUtils.searchJavaMetaInfo(type.getName()));

                component.setComponentObject(instance.get().toJAVARuntime());
                instance.get().addComponent(component.javaComponent);
            }
        } else{
            instance.get().addComponent(component.component);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"component","type"})
    public void addComponent(Component component, Class type){
        //<REMOVE-BRIDGE>
        validateNTC();
        if(component.type == Component.Type.JavaComponent) {
            if(component.javaComponent != null) {
                if(component.javaComponent.gameObject != null){
                    throw new IllegalArgumentException("Component already attached to a object");
                }
                component.setComponentObject(instance.get().toJAVARuntime());
                instance.get().addComponent(component.javaComponent);
            } else {
                if(component.myObject != null){
                    throw new IllegalArgumentException("Component already attached to a object");
                }
                component.javaComponent = new JavaComponent(component, type, JCompillerUtils.searchJavaMetaInfo(type.getName()));

                component.setComponentObject(instance.get().toJAVARuntime());
                instance.get().addComponent(component.javaComponent);
            }
        } else{
            instance.get().addComponent(component.component);
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public void addComponent(com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component){
        validate();
        instance.get().addComponent(component);
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public SpatialObject getParent() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(instance.get().parent != null){
            return instance.get().parent.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"parent"})
    public void setParent(SpatialObject parent) {
        //<REMOVE-BRIDGE>
        validate();
        if(parent == null || !parent.validate()){
            instance.get().setParent(null);
        } else {
            instance.get().setParent(parent.instance.get());
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getMainParent() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(instance.get().masterParent != null){
            return instance.get().masterParent.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public void removeParent() {
        //<REMOVE-BRIDGE>
        validate();
        instance.get().setParent(null);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public SpatialObject findChildObject(String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("name can't be empty or null");
        }
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject find = instance.get().findChildObject(name);
        if(find != null) {
            return find.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public SpatialObject findChildObject(JAVARuntime.OHString name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("name can't be empty or null");
        }
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject find = instance.get().findChildObject(name.ohString);
        if(find != null) {
            return find.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public SpatialObject getChildAt(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject find = instance.get().childAt(idx);
        if(find != null) {
            return find.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getChildCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.get().childrenCount();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"child"})
    public int getChildIndex(SpatialObject child) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        List<com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject> childs = instance.get().getChildrenCritical();

        if(childs.contains(child.instance)) {
            return childs.indexOf(child.instance);
        }
        return -1;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public ArrayList getChildList() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        List<com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject> childs = instance.get().getChildrenCritical();

        ArrayList childsList = new ArrayList<>();
        for (com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject child : childs) {
            if(child != null){
                childsList.add(child.toJAVARuntime());
            }
        }
        return childsList;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"ObjectA","ObjectB"})
    public void swapChildrenPosition(SpatialObject a, SpatialObject b){
        //<REMOVE-BRIDGE>
        validate();
        if(a == null) throw new NullPointerException("ObjectA can't be null");
        if(b == null) throw new NullPointerException("ObjectB can't be null");
        instance.get().swapChildrenPosition(a.instance.get(), b.instance.get());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ArrayList getComponentsList() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        ArrayList<Component> components = new ArrayList<>();
        for (int i = 0; i < instance.get().componentCount(); i++) {
            com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component = instance.get().componentAt(i);
            if (component.getType() != com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component.Type.JavaComponent) {
                components.add(component.toJAVARuntime());
            } else {
                try {
                    Component comp = (Component) ((JavaComponent) component).getRuntimeComponent();
                    if(comp != null) {
                        components.add(comp);
                    }
                } catch (Exception e) { }
            }
        }
        return components;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public int componentCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().componentCount();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Component getComponentsAt(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(instance.get().componentCount() <= idx){
            throw new IndexOutOfBoundsException();
        }
        return instance.get().componentAt(idx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"idx"})
    public Component componentAt(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        if(instance.get().componentCount() <= idx){
            throw new IndexOutOfBoundsException();
        }
        return instance.get().componentAt(idx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    /// TRANSFORM METHODS
    @MethodArgs(args ={"other"})
    public float distance(SpatialObject other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalDistance(other);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float distance(Transform other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalDistance(other);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float distance(Vector3 other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalDistance(other);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"other"})
    public float sqrtDistance(SpatialObject other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalSqrtDistance(other);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float sqrtDistance(Transform other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalSqrtDistance(other);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float sqrtDistance(Vector3 other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return getTransform().globalSqrtDistance(other);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPosition() {
        return getTransform().getPosition();
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setPosition(Vector3 vector){
        getTransform().setPosition(vector);
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z){
        getTransform().setPosition(x, y, z);
    }
    @MethodArgs(args ={"v"})
    public void setPositionX(float v){
        getTransform().setPositionX(v);
    }
    @MethodArgs(args ={"v"})
    public void setPositionY(float v){
        getTransform().setPositionY(v);
    }
    @MethodArgs(args ={"v"})
    public void setPositionZ(float v){
        getTransform().setPositionZ(v);
    }

    @HideGetSet
    public Quaternion getRotation() {
       return getTransform().getRotation();
    }
    @HideGetSet
    @MethodArgs(args ={"quaternion"})
    public void setRotation(Quaternion quaternion){
        getTransform().setRotation(quaternion);
    }

    // Set rotation from angles in degrees
    @MethodArgs(args ={"x","y","z"})
    @UnimplementedDoc
    public void setRotation(float x, float y, float z){
        getTransform().getRotation().setFromEuler(x, y, z);
    }
    @MethodArgs(args ={"w","x","y","z"})
    public void setRotation(float w, float x, float y, float z){
        getTransform().setRotation(w, x, y, z);
    }

    @HideGetSet
    public Vector3 getScale() {
        return getTransform().getScale();
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setScale(Vector3 vector){
        getTransform().setScale(vector);
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z){
        getTransform().setScale(x,y,z);
    }
    @MethodArgs(args ={"all"})
    public void setScale(float a){
        getTransform().setScale(a);
    }

    @HideGetSet
    public Vector3 getGlobalPosition() {
        return getTransform().getGlobalPosition();
    }
    public Vector3 getGlobalPosition(Vector3 out) {
        return getTransform().getGlobalPosition(out);
    }
    @HideGetSet
    public Quaternion getGlobalRotation() {
        return getTransform().getGlobalRotation();
    }
    public Quaternion getGlobalRotation(Quaternion out) {
        return getTransform().getGlobalRotation(out);
    }
    @HideGetSet
    public Vector3 getGlobalScale() {
        return getTransform().getGlobalScale();
    }
    public Vector3 getGlobalScale(Vector3 out) {
       return getTransform().getGlobalScale(out);
    }

    @MethodArgs(args ={"x","y","z"})
    public void translate(float x, float y, float z){
        getTransform().translate(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void move(float x, float y, float z){
        getTransform().move(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotate(float x, float y, float z){
        getTransform().rotate(x, y, z);
    }

    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, float z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, int z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, float z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, int z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, int y, int z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, int z){
        getTransform().translateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, float z){
        getTransform().translateInSeconds(x, y, z);
    }

    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, float z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, int z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, float z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, int z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, int y, int z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, int z){
        getTransform().moveInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, float z){
        getTransform().moveInSeconds(x, y, z);
    }

    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, float z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, int z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, float z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, int z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, int y, int z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, int z){
        getTransform().rotateInSeconds(x, y, z);
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, float z){
        getTransform().rotateInSeconds(x, y, z);
    }

    @MethodArgs(args ={"object"})
    public void lookTo(SpatialObject object){
        getTransform().lookTo(object);
    }
    @MethodArgs(args ={"position"})
    public void lookTo(Vector3 position){
        getTransform().lookTo(position);
    }
    @MethodArgs(args ={"x","y","z"})
    public void lookTo(float x, float y, float z){
        getTransform().lookTo(x, y, z);
    }
    @MethodArgs(args ={"object"})
    public void lookToIgnoreY(SpatialObject object){
        getTransform().lookToIgnoreY(object);
    }
    @MethodArgs(args ={"position"})
    public void lookToIgnoreY(Vector3 position){
        getTransform().lookToIgnoreY(position);
    }
    @MethodArgs(args ={"object"})
    public void teleportTo(SpatialObject object){
        getTransform().teleportTo(object);
    }
    @MethodArgs(args ={"position"})
    public void teleportTo(Vector3 position){
        getTransform().teleportTo(position);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookTo(SpatialObject other, float lerpSpeed){
        getTransform().lerpLookTo(other, lerpSpeed);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookTo(Vector3 other, float lerpSpeed){
        getTransform().lerpLookTo(other, lerpSpeed);
    }

    @UnimplementedDoc
    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookToIgnoreY(SpatialObject other, float lerpSpeed){
        getTransform().lerpLookToIgnoreY(other, lerpSpeed);
    }
    @UnimplementedDoc
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookToIgnoreY(Vector3 other, float lerpSpeed){
        getTransform().lerpLookToIgnoreY(other, lerpSpeed);
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformPoint(Vector3 vector3){
       return getTransform().transformPoint(vector3);
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformPoint(Vector3 vector3, Vector3 out){
        getTransform().transformPoint(vector3, out);
    }
    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformPoint(Vector3 vector3){
      return getTransform().inverseTransformPoint(vector3);
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformPoint(Vector3 vector3, Vector3 out){
        getTransform().inverseTransformPoint(vector3, out);
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformDirection(Vector3 vector3){
        return getTransform().transformDirection(vector3);
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformDirection(Vector3 vector3, Vector3 out){
        getTransform().transformDirection(vector3,out);
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformDirection(Vector3 vector3){
        return getTransform().inverseTransformDirection(vector3);
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformDirection(Vector3 vector3, Vector3 out){
        getTransform().inverseTransformDirection(vector3, out);
    }

    public Vector3 forward(){
        return getTransform().forward();
    }
    public Vector3 back(){
        return getTransform().back();
    }
    public Vector3 right(){
        return getTransform().right();
    }
    public Vector3 left(){
       return getTransform().left();
    }
    public Vector3 up(){
       return getTransform().up();
    }
    public Vector3 down(){
        return getTransform().down();
    }

    @MethodArgs(args ={"out"})
    public Vector3 forward(Vector3 out){
       return getTransform().forward(out);
    }
    @MethodArgs(args ={"out"})
    public Vector3 back(Vector3 out){
        return getTransform().back(out);
    }
    @MethodArgs(args ={"out"})
    public Vector3 right(Vector3 out){
        return getTransform().right(out);
    }
    @MethodArgs(args ={"out"})
    public Vector3 left(Vector3 out){
        return getTransform().left(out);
    }
    @MethodArgs(args ={"out"})
    public Vector3 up(Vector3 out){
        return getTransform().up(out);
    }
    @MethodArgs(args ={"out"})
    public Vector3 down(Vector3 out){
        return getTransform().down(out);
    }

    @HideGetSet
    public boolean isStatic(){
        return getTransform().isStatic();
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStatic(boolean value){
        getTransform().setStatic(value);
    }

    public int getState(){
        return getTransform().getState();
    }
    @MethodArgs(args ={"state"})
    public void setState(int state){
        getTransform().setState(state);
    }

    @HideGetSet
    public float[] getGlobalMatrix() {
        return getTransform().getGlobalMatrix();
    }
    @MethodArgs(args ={"out"})
    @HideGetSet
    public float[] getGlobalMatrix(float[] out) {
        return getTransform().getGlobalMatrix(out);
    }
    @HideGetSet
    public float[] getLocalMatrix() {
        return getTransform().getLocalMatrix();
    }
    @MethodArgs(args ={"out"})
    @HideGetSet
    public float[] getLocalMatrix(float[] out) {
        return getTransform().getLocalMatrix(out);
    }

    @MethodArgs(args ={"vector"})
    public Vector3 mulGlobalVector3(Vector3 vector3){
        return getTransform().mulGlobalVector3(vector3);
    }
    @MethodArgs(args ={"vector"})
    public Vector3 mulLocalVector3(Vector3 vector3){
        return getTransform().mulLocalVector3(vector3);
    }

    public void recalculateMatrices(){
        getTransform().recalculateMatrices();
    }
    /// END TRANSFORM METHODS

    /// PHYSICS METHODS
    @UnimplementedDoc
    @MethodArgs(args ={"objectName"})
    public boolean colliderWithName(String objectName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(getPhysics() != null && getPhysics().getPhysicsEntity() != null){
            return getPhysics().getPhysicsEntity().colliderWithName(objectName);
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public boolean isColliding(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(getPhysics() != null && getPhysics().getPhysicsEntity() != null){
            return getPhysics().getPhysicsEntity().isColliding();
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    public List<Collision> getCollisionList(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(getPhysics() != null && getPhysics().getPhysicsEntity() != null){
            return getPhysics().getPhysicsEntity().getCollisionList();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public int getCollisionsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(getPhysics() != null && getPhysics().getPhysicsEntity() != null){
            return getPhysics().getPhysicsEntity().getCollisionsCount();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"idx"})
    public Collision getCollisionAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(getPhysics() != null && getPhysics().getPhysicsEntity() != null){
            return getPhysics().getPhysicsEntity().getCollisionAt(idx);
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    /// END PPHYSICS METHODS

    public String toJson(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().serialize().toString();
        //>REMOVE-BRIDGE<
    }

    public boolean exists(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance != null && instance.get() != null && !instance.get().isGarbage()){
            return true;
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getTag(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        Tag tag = instance.get().getTag();
        if(tag != null) {
            return tag.getName().toString();
        }
        return "";
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setTag(String name){
        //<REMOVE-BRIDGE>
        validate();
        if(name == null || name.isEmpty()){
            throw new NullPointerException("Name can't be null or empty");
        }

        instance.get().setTagName(name);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"name"})
    public boolean compareTag(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        validate();
        return instance.get().compareTag(name);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    public boolean validate(){
        Thread.requestEngineThread();
        if(instance == null){
            throw new RuntimeException("Object was destroyed, you can validate if a object stills present calling spatialObject.exists() before using it.");
        }
        if(instance.get() != null){
            return true;
        }
        throw new RuntimeException("Object was destroyed, you can validate if a object stills present calling spatialObject.exists() before using it.");
    }
    public boolean validateNTC(){
        if(instance == null){
            throw new RuntimeException("Object was destroyed, you can validate if a object stills present calling spatialObject.exists() before using it.");
        }
        if(instance.get() != null){
            return true;
        }
        throw new RuntimeException("Object was destroyed, you can validate if a object stills present calling spatialObject.exists() before using it.");
    }
    //>REMOVE-BRIDGE<

    /// Abstract
    @MethodArgs(args ={"file"})
    public static SpatialObject loadFile(ObjectFile pFile){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        GameObject o = GameObject.deserialize(Core.classExporter.loadJson(pFile.getFilePath()),  false, true);

        if (o != null) {
            if (o.transform == null) { o.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform(); }
            o.parent = null;
            WorldInstantiate.instantiate(o);
            return o.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
