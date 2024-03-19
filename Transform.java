package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Object"})
public final class Transform{
    public static final int STATE_DYNAMIC = 0;
    public static final int STATE_STATIC = 1;

    //

    public Transform() {
        //
    }

    @HideGetSet
    public Vector3 getPosition() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setPosition(Vector3 vector){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"v"})
    public void setPositionX(float v){
        //
    }
    @MethodArgs(args ={"v"})
    public void setPositionY(float v){
        //
    }
    @MethodArgs(args ={"v"})
    public void setPositionZ(float v){
        //
    }

    @HideGetSet
    public Quaternion getRotation() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"quaternion"})
    public void setRotation(Quaternion quaternion){
        //
    }

    // Set rotation from angles in degrees
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"w","x","y","z"})
    public void setRotation(float w, float x, float y, float z){
        //
    }

    @HideGetSet
    public Vector3 getScale() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setScale(Vector3 vector){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"all"})
    public void setScale(float a){
        //
    }

    @HideGetSet
    public Vector3 getGlobalPosition() {
        //
        return null;
        //

        //
    }
    public Vector3 getGlobalPosition(Vector3 out) {
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Quaternion getGlobalRotation() {
        //
        return null;
        //

        //
    }
    public Quaternion getGlobalRotation(Quaternion out) {
        //
        return null;
        //

        //
    }
    @HideGetSet
    public Vector3 getGlobalScale() {
        //
        return null;
        //

        //
    }
    public Vector3 getGlobalScale(Vector3 out) {
        //
        return null;
        //

        //
    }


    @MethodArgs(args ={"x","y","z"})
    public void translate(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void move(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotate(float x, float y, float z){
        //
    }

    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, float z){
        //
    }

    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, float z){
        //
    }

    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, float z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, int y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, int z){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, float z){
        //
    }

    @MethodArgs(args ={"object"})
    public void lookTo(SpatialObject object){
        //
    }
    @MethodArgs(args ={"position"})
    public void lookTo(Vector3 position){
        //
    }
    @MethodArgs(args ={"x","y","z"})
    public void lookTo(float x, float y, float z){
        //
    }
    @MethodArgs(args ={"object"})
    public void lookToIgnoreY(SpatialObject object){
        //
    }
    @MethodArgs(args ={"position"})
    public void lookToIgnoreY(Vector3 position){
        //
    }
    @MethodArgs(args ={"object"})
    public void teleportTo(SpatialObject object){
        //
    }
    @MethodArgs(args ={"position"})
    public void teleportTo(Vector3 position){
        //
    }

    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookTo(SpatialObject other, float lerpSpeed){
        //
    }
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookTo(Vector3 other, float lerpSpeed){
        //
    }

    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookToIgnoreY(SpatialObject other, float lerpSpeed){
        //
    }
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookToIgnoreY(Vector3 other, float lerpSpeed){
        //
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformPoint(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformPoint(Vector3 vector3, Vector3 out){
        //
    }
    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformPoint(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformPoint(Vector3 vector3, Vector3 out){
        //
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformDirection(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformDirection(Vector3 vector3, Vector3 out){
        //
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformDirection(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformDirection(Vector3 vector3, Vector3 out){
        //
    }

    public Vector3 forward(){
        //
        return null;
        //

        //
    }
    public Vector3 back(){
        //
        return null;
        //

        //
    }
    public Vector3 right(){
        //
        return null;
        //

        //
    }
    public Vector3 left(){
        //
        return null;
        //

        //
    }
    public Vector3 up(){
        //
        return null;
        //

        //
    }
    public Vector3 down(){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"out"})
    public Vector3 forward(Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public Vector3 back(Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public Vector3 right(Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public Vector3 left(Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public Vector3 up(Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public Vector3 down(Vector3 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"other"})
    public float globalDistance(SpatialObject other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float globalDistance(Transform other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float globalDistance(Vector3 other) {
        //
        return 0;
        //

        //
    }

    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(SpatialObject other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(Transform other) {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(Vector3 other) {
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public boolean isStatic(){
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStatic(boolean value){
        //
    }

    public int getState(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"state"})
    public void setState(int state){
        //
    }

    public float[] getGlobalMatrix() {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public float[] getGlobalMatrix(float[] out) {
        //
        return null;
        //

        //
    }
    public float[] getLocalMatrix() {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"out"})
    public float[] getLocalMatrix(float[] out) {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"vector"})
    public Vector3 mulGlobalVector3(Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"vector"})
    public Vector3 mulLocalVector3(Vector3 vector3){
        //
        return null;
        //

        //
    }

    public void recalculateMatrices(){
        //
    }
}
