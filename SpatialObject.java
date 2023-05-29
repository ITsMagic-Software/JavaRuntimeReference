package JAVARuntime;

//


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Object"})
public class SpatialObject {
    //

    //

    public SpatialObject() {
        //
    }
    @MethodArgs(args ={"parent"})
    public SpatialObject(SpatialObject parent) {
        //
    }
    @MethodArgs(args ={"name"})
    public SpatialObject(String name) {
        //
    }
    @MethodArgs(args ={"name","parent"})
    public SpatialObject(String name, SpatialObject parent) {
        //
    }

    @HideGetSet
    public boolean isEnabled(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setEnabled(boolean enabled){
        //
    }

    @HideGetSet
    public boolean isDontDestroyOnLoad(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDontDestroyOnLoad(boolean value){
        //
    }

    @HideGetSet
    public String getName(){
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setName(String name){
        //
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setNameOH(JAVARuntime.OHString name){
        //
    }
    @MethodArgs(args ={"name"})
    public boolean compareName(String name){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public Transform getTransform() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    public ObjectPhysics getPhysics() {
        //
        return null;
        //

        //
    }
    public void destroy(){
        //
    }
    @HideGetSet
    public GUID getGUID(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"name"})
    public void callFunction(String name){
        //
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, Object value){
        //
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, int value){
        //
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, float value){
        //
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, String value){
        //
    }
    @MethodArgs(args ={"name","value"})
    public void callFunction(String name, boolean value){
        //
    }

    @MethodArgs(args ={"file"})
    public SpatialObject instantiate(ObjectFile pFile){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file","position"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file","position","rotation"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file","position","rotation","scale"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation, Vector3 scale){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file"})
    public SpatialObject instantiateHasChild(ObjectFile pFile){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"file","parent"})
    public SpatialObject instantiateHasChild(ObjectFile pFile, SpatialObject parent){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"tittle"})
    public <T extends Component> T findComponent(String tittle){
        //
        return null;
    }
    @MethodArgs(args ={"tittle"})
    public List<Component> findComponents(String tittle){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"type"})
    public <T extends Component> T findComponent(Class classReference){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"type"})
    public List<Component> findComponents(Class classReference){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"tittle"})
    public <T extends Component> T findComponentInChildren(String tittle){
        //
        return null;
    }
    @MethodArgs(args ={"type"})
    public <T extends Component> T findComponentInChildren(Class classReference){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"component"})
    public void removeComponent(Component component){
        //
    }
    @MethodArgs(args ={"component"})
    public void addComponent(Component component){
        //
    }
    @MethodArgs(args ={"component","type"})
    public void addComponent(Component component, Class type){
        //
    }

    //

    @HideGetSet
    public SpatialObject getParent() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"parent"})
    public void setParent(SpatialObject parent) {
        //
    }

    @HideGetSet
    public SpatialObject getMainParent() {
        //
        return null;
        //

        //
    }
    public void removeParent() {
        //
    }

    @MethodArgs(args ={"name"})
    public SpatialObject findChildObject(String name) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"name"})
    public SpatialObject findChildObject(JAVARuntime.OHString name) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public SpatialObject getChildAt(int idx) {
        //
        return null;
        //

        //
    }
    @HideGetSet
    public int getChildCount() {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"child"})
    public int getChildIndex(SpatialObject child) {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public ArrayList getChildList() {
        //
        return null;
        //

        //
    }

    @HideGetSet
    public ArrayList getComponentsList() {
        //
        return null;
        //

        //
    }

    @UnimplementedDoc
    public int componentCount() {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public Component getComponentsAt(int idx) {
        //
        return null;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"idx"})
    public Component componentAt(int idx) {
        //
        return null;
        //

        //
    }

    /// TRANSFORM METHODS
    @MethodArgs(args ={"other"})
    public float distance(SpatialObject other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float distance(Transform other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float distance(Vector3 other) {
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"other"})
    public float sqrtDistance(SpatialObject other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float sqrtDistance(Transform other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float sqrtDistance(Vector3 other) {
        //
        return 0;
        //

        //
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

    public float[] getGlobalMatrix() {
        return getTransform().getGlobalMatrix();
    }
    @MethodArgs(args ={"out"})
    public float[] getGlobalMatrix(float[] out) {
        return getTransform().getGlobalMatrix(out);
    }
    public float[] getLocalMatrix() {
        return getTransform().getLocalMatrix();
    }
    @MethodArgs(args ={"out"})
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
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    public boolean isColliding(){
        //
        return false;
        //

        //
    }
    @UnimplementedDoc
    public List<Collision> getCollisionList(){
        //
        return null;
        //

        //
    }

    @UnimplementedDoc
    public int getCollisionsCount(){
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"idx"})
    public Collision getCollisionAt(int idx){
        //
        return null;
        //

        //
    }
    /// END PPHYSICS METHODS

    public String toJson(){
        //
        return "";
        //

        //
    }

    public boolean exists(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public String getTag(){
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"name"})
    public void setTag(String name){
        //
    }
    @MethodArgs(args ={"name"})
    public boolean compareTag(String name){
        //
        return false;
        //

        //
    }

    //

    /// Abstract
    @MethodArgs(args ={"file"})
    public static SpatialObject loadFile(ObjectFile pFile){
        //
        return null;
        //

        //
    }
}
