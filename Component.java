package JAVARuntime;

//<REMOVE-BRIDGE>
import android.content.Context;
import com.google.gson.JsonSyntaxException;
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.ObjectUtils;
import com.itsmagic.engine.Engines.Engine.World.WorldController;
import com.itsmagic.engine.Engines.Utils.ObjectReferencing.AdvComponentReference;
import com.itsmagic.engine.Engines.Utils.ObjectReferencing.AdvObjectReference;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Invoke;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.JavaComponent.JavaComponent;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject;
import com.itsmagic.engine.Engines.Engine.World.WorldUtils;
import com.itsmagic.engine.Engines.Native.OHString.OHString;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Extensible Component from Java classes compiled in realtime (ITsMagic)
 */
@ClassCategory(cat ={"Components"})
public class Component extends InspectorMemory{
     /*
      * DEVELOPER NOTE
      * component = USED TO CREATE A BRIDGE BETWEEN THIS COMPONENT AND A ENGINE COMPONENT
      * javaComponent = USED TO CREATE A BRIDGE BETWEEN THIS JAVA SCRIPT AND THE ENGINE JAVA COMPONENT
      * THIS CLASS CAN ONLY BE ONCE AT TIME
      * OR THIS CLASS EXTENDS A ENGINE COMPONENT OR EXTENDS A JAVA SCRIPT
      * EXTENDING BOTH WILL CREATE A CIRCULAR LOOP ON COMPONENT FUNCTIONS
      * THIS IS FATAL
      */
    //<REMOVE-BRIDGE>
     @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Component.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
                try {
                    String corretedName = JCompiler.correctName(className);
                    Class cla = Class.forName("JAVARuntime." + corretedName);
                    if(Component.class.isAssignableFrom(cla)){
                        userPointer.dataClass = cla;
                        return true;
                    }
                } catch (ClassNotFoundException e) {
                    Class classField = Core.jCompiler.trySearchClass(className);
                    if (classField != null && Component.class.isAssignableFrom(classField)) {
                        userPointer.dataClass = classField;
                        return true;
                    }
                }
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
                    Component var = (Component) value;
                    if (var != null) {
                        if (userPointer.gameObject.getName().equalsIgnoreCase("Pause Interface")) {
                            java.lang.System.out.println("adsads");
                        }
                        AdvComponentReference advObjectReference = new AdvComponentReference(var.getEngineComponent());
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
                        com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component object = WorldUtils.findComponentWithUniqueGUID(new OHString(variable.str_value), WorldController.loadedWorld);
                        if (object != null) {
                            return object.toJAVARuntime();
                        }
                    }
                }
                if(variable.type == Variable.Type.ObjectReferenceJson){
                    String json = variable.str_value;
                    if(json != null && !json.isEmpty()) {
                        try {
                            AdvComponentReference advComponentReference = ClassExporter.getBuilder().fromJson(json, AdvComponentReference.class);
                            if(advComponentReference != null) {
                                if (userPointer != null) {
                                    advComponentReference.setAttachedTo(userPointer.gameObject);
                                }
                                if (advComponentReference != null) {
                                    com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component object = advComponentReference.findComponent();
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

            @Override
            public Object newInstance(UserPointer userPointer) {
                return new Component();
            }
        });
    }
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
        @IgnoreAutoComplete
        public enum Type{JavaComponent, EngineComponent}

        @IgnoreAutoComplete
        public transient Type type;

        // CALL THIS WHEN THIS CLASS EXTENDS A ENGINE COMPONENT
        @IgnoreAutoComplete
        public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component;
        @IgnoreAutoComplete
        public Component(com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component component ) {
            this.component = component;
            this.type = Type.EngineComponent;
            try {
                this.component.setInternalCompRuntime(this);
                setComponentObject(component.gameObject.toJAVARuntime());
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }

        // CALL THIS WHEN THIS CLASS EXTENDS A JAVA SCRIPT
        @IgnoreAutoComplete
        public transient JavaComponent javaComponent;
        @IgnoreAutoComplete
        public Component(JavaComponent javaComponent, SpatialObject myObject) {
            this.javaComponent = javaComponent;
            this.javaComponent.setInternalCompRuntime(this);
            this.type = Type.JavaComponent;
            this.setComponentObject(myObject);
        }

        @IgnoreAutoComplete
        public void setComponentObject(SpatialObject spatialObject){
            this.myObject = spatialObject;
            if(spatialObject != null && spatialObject.instance != null) {
                GameObject gameObject = spatialObject.instance.get();
                if(gameObject != null) {
                    this.myTransform = gameObject.transform.toJAVARuntime();
                    this.myPhysics = gameObject.getObjectPhysics().toJAVARuntime();
                }
            }
        }
    //>REMOVE-BRIDGE<

    // USED TO ACCESS MYOBJECT FROM JAVA SCRIPTS
    public transient SpatialObject myObject;
    public transient Transform myTransform;
    public transient ObjectPhysics myPhysics;

    /**
     * Zero-Argument constructor required
     * Class instanced by java loader by calling this constructor
     */
    public Component() {
        //<REMOVE-BRIDGE>
        this.type = Type.JavaComponent;
        //>REMOVE-BRIDGE<
    }

    /**
     * Bridged by JavaComponent class in engine runtime
     */
    public void start() {
        //<REMOVE-BRIDGE>
        if(component != null && javaComponent == null){
            component.start(component.gameObject, false);
        }
        //>REMOVE-BRIDGE<
    }
    public void preRepeat() {

    }
    public void parallelRepeat() {
        //<REMOVE-BRIDGE>
        if(component != null && javaComponent == null){
            component.parallelUpdate(component.gameObject, false);
        }
        //>REMOVE-BRIDGE<
    }
    public void disabledParallelRepeat() {
        //<REMOVE-BRIDGE>
        if(component != null && javaComponent == null){
            component.parallelDisabledUpdate(component.gameObject, false);
        }
        //>REMOVE-BRIDGE<
    }
    public void repeat() {
        //<REMOVE-BRIDGE>
        if(component != null && javaComponent == null){
            component.update(component.gameObject, false);
        }
        //>REMOVE-BRIDGE<
    }
    public void disabledRepeat() {
        //<REMOVE-BRIDGE>
        if(component != null && javaComponent == null){
            component.disabledUpdate(component.gameObject, false);
        }
        //>REMOVE-BRIDGE<
    }
    public void stoppedRepeat() { }
    public void pausedRepeat() {}

    // Generic messages
    @UnimplementedDoc
    public void prePhysics(){}
    @UnimplementedDoc
    public void posPhysics(){}
    @UnimplementedDoc
    public void posWheelPhysics(){}
    @UnimplementedDoc
    public void onCollision(Collision collision){}
    @UnimplementedDoc
    public void onCollisionStop(Collision collision){}
    @UnimplementedDoc
    public void onKeyDown(Key key){}
    @UnimplementedDoc
    public void onKeyPressed(Key key){}
    @UnimplementedDoc
    public void onKeyUp(Key key){}

    /**
     * Bridge enabling and disabling JavaComponent or extended Engine Component
     */
    @HideGetSet
    public final boolean isEnabled(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(component != null) {
            return component.enabled;
        } else {
            return javaComponent.enabled;
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public final void setEnabled(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component != null) {
            component.setEnabled(enabled);
        } else {
            this.javaComponent.setEnabled(enabled);
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"delaySeconds","invokeListener"})
    public final void invoke(float delaySeconds, InvokeListener invokeListener){
        //<REMOVE-BRIDGE>
        if(component != null) {
            component.invoke(new Invoke(delaySeconds, new com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.InvokeListener() {
                @Override
                public void run() {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            invokeListener.run();
                        }
                    });
                }
            }));
        } else {
            javaComponent.invoke(new Invoke(delaySeconds, new com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.InvokeListener() {
                @Override
                public void run() {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            invokeListener.run();
                        }
                    });
                }
            }));
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"delayFrames","invokeListener"})
    public final void invokeFrames(int frames, InvokeListener invokeListener){
        //<REMOVE-BRIDGE>
        if(component != null) {
            component.invoke(new Invoke(frames, new com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.InvokeListener() {
                @Override
                public void run() {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            invokeListener.run();
                        }
                    });
                }
            }));
        } else {
            javaComponent.invoke(new Invoke(frames, new com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.InvokeListener() {
                @Override
                public void run() {
                    JavaJar.execute(new Interface() {
                        @Override
                        public void run() {
                            invokeListener.run();
                        }
                    });
                }
            }));
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }
    public final void cancelAllInvokes(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component != null) {
            component.cancelAllInvokes();
        } else {
            javaComponent.cancelAllInvokes();
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"message"})
    public void print(String message){
        //<REMOVE-BRIDGE>
        if(component != null) {
            Console.log(component.gameObject.getName() + ": " + message);
        } else {
            Console.log(javaComponent.gameObject.getName() + ": " + message);
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"number"})
    public void print(int t){
        //<REMOVE-BRIDGE>
        print("" + t);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"number"})
    public void print(float t){
        //<REMOVE-BRIDGE>
        print("" + t);
        //>REMOVE-BRIDGE<
    }

    public final SpatialObject getObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(component != null) {
            if(component.gameObject != null) {
                return component.gameObject.toJAVARuntime();
            }
        } else {
            if(javaComponent.gameObject != null) {
                return javaComponent.gameObject.toJAVARuntime();
            }
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    public String getComponentMenu(){
        return "";
    }
    public Color getComponentColor(){
        return new Color(231, 76, 60);
    }
    public String getComponentTittle(){
        return null;
    }

    public <T extends Object> T getUserData(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(component != null) {
            if(component.gameObject != null) {
                return component.getUserData();
            }
        } else {
            if(javaComponent.gameObject != null) {
                return javaComponent.getUserData();
            }
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public void setUserData(Object userData) {
        //<REMOVE-BRIDGE>
        if (component != null) {
            component.setUserData(userData);
        } else {
            javaComponent.setUserData(userData);
        }
        //>REMOVE-BRIDGE<
    }

    public final void destroy(){
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component != null) {
            if(ObjectUtils.isGarbage(component.gameObject)){
                throw new RuntimeException("This component is not attached to a any object!");
            }
            component.gameObject.removeComponent(component);
        } else {
            if(ObjectUtils.isGarbage(javaComponent.gameObject)){
                throw new RuntimeException("This component is not attached to a any object!");
            }
            javaComponent.gameObject.removeComponent(javaComponent);
            /*
             * IF JAVA COMPONENT IS NULL, A EXCEPTION WILL EMIT, LET THIS HAPPEN
             * IF YOU BLOCK THIS EXCEPTION, YOU WON'T FIND BUGS
             * HAS THE NOTE ON TOP OF THIS SCRIPT SAYS, IT CAN'T BE BOTH AT THE SAME TIME
             * BUT CANNOT BE NOTHING TOO
             */
        }
        //>REMOVE-BRIDGE<
    }

    public final boolean isHierarchyActive(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(javaComponent != null){
            return javaComponent.isHierarchyActive();
        } else if (component != null){
            return component.isHierarchyActive();
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public boolean componentClassMatch(Component a, Component b, Class t){
        if (a != null && b != null) {
            try {
                Object al = t.cast(a);
                Object bl = t.cast(b);

                if (al != null && bl != null) {
                    return true;
                }
            } catch (ClassCastException e){
            } catch (Exception | Error e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    @IgnoreAutoComplete
    public boolean componentClassMatch(Component a, Component b){
        if (a != null && b != null) {
            if(a.javaComponent != null && b.javaComponent != null){
                if(a.javaComponent.className != null && b.javaComponent.className != null) {
                    if (a.javaComponent.className.equals(b.javaComponent.className)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @IgnoreAutoComplete
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent(){
        if(javaComponent != null){
            return javaComponent;
        }
        return component;
    }
    //>REMOVE-BRIDGE<

    public GUID getGUID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(javaComponent != null){
            return javaComponent.getGuid().toJAVARuntime();
        }
        if(component != null) {
            return component.getGuid().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
