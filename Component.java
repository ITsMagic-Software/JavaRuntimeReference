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
    public transient SpatialObject myObject;
    public transient Transform myTransform;

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
    public void start() {}
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
    public void disabledRepeat() {
        //
    }
    public void stoppedRepeat() { }
    public void pausedRepeat() {}
    public void onDetach() {}

    // Generic messages
    public void prePhysics(){}
    public void posPhysics(){}
    public void posWheelPhysics(){}
    public void onCollision(Collision collision){}
    public void onCollisionEnter(Collision collision){}
    public void onCollisionStop(Collision collision){}
    public void onKeyDown(Key key){}
    public void onKeyPressed(Key key){}
    public void onKeyUp(Key key){}

    /**
     * Bridge enabling and disabling JavaComponent or extended Engine Component
     */
    @HideGetSet
    public final boolean isEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs({"enabled"})
    public final void setEnabled(boolean enabled){
        //
    }

    @MethodArgs({"delaySeconds","invokeListener"})
    public final void invoke(float delaySeconds, Runnable invokeListener){
        //
    }
    @MethodArgs({"delayFrames","invokeListener"})
    public final void invokeFrames(int frames, Runnable invokeListener){
        //
    }

    @MethodArgs({"delaySeconds","invokeListener"})
    public final void invoke(float delaySeconds, InvokeListener invokeListener){
        invoke(delaySeconds, (Runnable) invokeListener);
    }
    @MethodArgs({"delayFrames","invokeListener"})
    public final void invokeFrames(int frames, InvokeListener invokeListener){
        invokeFrames(frames, (Runnable) invokeListener);
    }

    public final void cancelAllInvokes(){
        //
    }

    @MethodArgs({"message"})
    public void print(String message){
        //
    }
    @MethodArgs({"message"})
    public void print(Quaternion message){
        //
    }
    @MethodArgs({"message"})
    public void print(Vector3 message){
        //
    }
    @MethodArgs({"message"})
    public void print(Vector2 message){
        //
    }
    @MethodArgs({"message"})
    public void print(Object message){
        //
    }
    @MethodArgs({"number"})
    public void print(int t){
        //
    }
    @MethodArgs({"number"})
    public void print(float t){
        //
    }
    @MethodArgs({"number"})
    public void print(double t){
        //
    }
    @MethodArgs({"number"})
    public void print(long t){
        //
    }
    @MethodArgs({"number"})
    public void print(char t){
        //
    }
    @MethodArgs({"number"})
    public void print(short t){
        //
    }

    public final SpatialObject getObject(){
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
        //
        return "";
        //

        //
    }
    public void setInspector(ComponentInspector inspector) {
        //
    }

    public <T extends Object> T getUserData(){
        //
        return null;
        //

        //
    }
    public void setUserData(Object userData) {
        //
    }

    public final void destroy(){
        //>REMOVE-BRIDGE<

        //
    }

    public final boolean isHierarchyActive(){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns the name of the component.")
    @JRDoc_PT("Retorna o nome do componente.")
    public String getTittle(){
        //
        return "";
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

    @Override
    public String toString() {
        //
        return null;
        //

        //
    }

    @MethodArgs({"name"})
    public void callFunction(String name){
        //
    }
    @MethodArgs({"name","args"})
    public void callFunction(String name, int args){
        //
    }
    @MethodArgs({"name","args"})
    public void callFunction(String name, float args){
        //
    }
    @MethodArgs({"name","args"})
    public void callFunction(String name, String args){
        //
    }
    @MethodArgs({"name","args"})
    public void callFunction(String name, boolean args){
        //
    }
    @MethodArgs({"name","args"})
    public void callFunction(String name, Object... args){
        //
    }
}
