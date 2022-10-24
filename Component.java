package JAVARuntime;

//

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
    //

    //

    // USED TO ACCESS MYOBJECT FROM JAVA SCRIPTS
    public SpatialObject myObject;
    public Transform myTransform;
    public ObjectPhysics myPhysics;

    /**
     * Zero-Argument constructor required
     * Class instanced by java loader by calling this constructor
     */
    public Component() {
        //
    }

    /**
     * Bridged by JavaComponent class in engine runtime
     */
    public void start() {
        //
    }
    public void preRepeat() {

    }
    public void parallelRepeat() {
        //
    }
    public void disabledParallelRepeat() {
        //
    }
    public void repeat() {
        //
    }
    public void posRepeat() {

    }
    public void disabledRepeat() {
        //
    }
    public void stoppedRepeat() { }
    public void pausedRepeat() { }

    /**
     * Bridge enabling and disabling JavaComponent or extended Engine Component
     */
    @HideGetSet
    public boolean isEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setEnabled(boolean enabled){
        //
    }

    @MethodArgs(args ={"delaySeconds","invokeListener"})
    public void invoke(float delaySeconds, InvokeListener invokeListener){
        //
    }
    public void cancelAllInvokes(){
        //
    }

    @MethodArgs(args ={"message"})
    public void print(String message){
        //
    }
    @MethodArgs(args ={"number"})
    public void print(int t){
        //
    }
    @MethodArgs(args ={"number"})
    public void print(float t){
        //
    }

    public SpatialObject getObject(){
        //
        return null;
        //

        //
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

    public void destroy(){
        //>REMOVE-BRIDGE<

        //
    }

    public boolean isHierarchyActive(){
        //
        return false;
        //

        //
    }

    //

    public GUID getGUID(){
        //
        return null;
        //

        //
    }
}
