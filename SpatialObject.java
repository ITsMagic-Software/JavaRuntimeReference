package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Object"})
public final class SpatialObject {

  public SpatialObject() {}

  @MethodArgs({"parent"})
  public SpatialObject(SpatialObject parent) {}

  @MethodArgs({"name"})
  public SpatialObject(String name) {}

  @MethodArgs({"name", "parent"})
  public SpatialObject(String name, SpatialObject parent) {}

  @HideGetSet
  public boolean isEnabled() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setEnabled(boolean enabled) {}

  @HideGetSet
  public boolean isDontDestroyOnLoad() {

    return false;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setDontDestroyOnLoad(boolean value) {}

  @HideGetSet
  public String getName() {

    return "";
  }

  @HideGetSet
  @MethodArgs({"name"})
  public void setName(String name) {}

  @MethodArgs({"name"})
  public void setNameOH(JAVARuntime.OHString name) {}

  @MethodArgs({"name"})
  public boolean compareName(String name) {

    return false;
  }

  public SpatialObject duplicate() {

    return null;
  }

  @HideGetSet
  public <T extends PhysicsEntity> T getPhysicsEntity() {

    return null;
  }

  @HideGetSet
  public void setPhysicsEntity(PhysicsEntity physicsEntity) {}

  @HideGetSet
  public Transform getTransform() {

    return null;
  }

  @HideGetSet
  public ObjectPhysics getPhysics() {

    return null;
  }

  public void destroy() {}

  @HideGetSet
  public GUID getGUID() {

    return null;
  }

  @HideGetSet
  public String getMetaID() {

    return "";
  }

  @HideGetSet
  @MethodArgs({"guid"})
  public void setMetaID(String guid) {}

  @MethodArgs({"name"})
  public void callFunction(String name) {}

  @MethodArgs({"name", "args"})
  public void callFunction(String name, int args) {}

  @MethodArgs({"name", "args"})
  public void callFunction(String name, float args) {}

  @MethodArgs({"name", "args"})
  public void callFunction(String name, String args) {}

  @MethodArgs({"name", "args"})
  public void callFunction(String name, boolean args) {}

  @MethodArgs({"name", "args"})
  public void callFunction(String name, Object... args) {}

  @MethodArgs({"file"})
  public SpatialObject instantiate(ObjectFile pFile) {

    return null;
  }

  @MethodArgs({"file", "position"})
  public SpatialObject instantiate(ObjectFile pFile, Vector3 position) {

    return null;
  }

  @MethodArgs({"file", "position", "rotation"})
  public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation) {

    return null;
  }

  @MethodArgs({"file", "position", "rotation", "scale"})
  public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation, Vector3 scale) {

    return null;
  }

  @Deprecated
  @DeprecatedInfo(info = "Spelling error, use instantiateAsChild")
  @MethodArgs({"file"})
  public SpatialObject instantiateHasChild(ObjectFile pFile) {

    return null;
  }

  @Deprecated
  @DeprecatedInfo(info = "Spelling error, use instantiateAsChild")
  @MethodArgs({"file", "parent"})
  public SpatialObject instantiateHasChild(ObjectFile pFile, SpatialObject parent) {

    return null;
  }

  @MethodArgs({"file"})
  public SpatialObject instantiateAsChild(ObjectFile pFile) {

    return null;
  }

  @MethodArgs({"file", "parent"})
  public SpatialObject instantiateAsChild(ObjectFile pFile, SpatialObject parent) {

    return null;
  }

  @MethodArgs({"tittle"})
  public <T extends Component> T findComponent(String tittle) {

    return null;
  }

  @MethodArgs({"tittle"})
  public List<Component> findComponents(String tittle) {

    return null;
  }

  @MethodArgs({"type"})
  public <T extends Component> T findComponent(Class classReference) {

    return null;
  }

  @MethodArgs({"type"})
  public List<Component> findComponents(Class classReference) {

    return null;
  }

  @MethodArgs({"tittle"})
  public <T extends Component> T findComponentInChildren(String tittle) {

    return null;
  }

  @MethodArgs({"type"})
  public <T extends Component> T findComponentInChildren(Class classReference) {

    return null;
  }

  @MethodArgs({"component"})
  public void removeComponent(Component component) {}

  @MethodArgs({"component"})
  public void addComponent(Component component) {}

  @MethodArgs({"component", "type"})
  public void addComponent(Component component, Class type) {}

  @HideGetSet
  public SpatialObject getParent() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"parent"})
  public void setParent(SpatialObject parent) {}

  @HideGetSet
  public SpatialObject getMainParent() {

    return null;
  }

  public void removeParent() {}

  @MethodArgs({"name"})
  public SpatialObject findChildObject(String name) {

    return null;
  }

  @MethodArgs({"name"})
  public SpatialObject findChildObject(JAVARuntime.OHString name) {

    return null;
  }

  @MethodArgs({"idx"})
  public SpatialObject getChildAt(int idx) {

    return null;
  }

  @HideGetSet
  public int getChildCount() {

    return 0;
  }

  @MethodArgs({"child"})
  public int getChildIndex(SpatialObject child) {

    return 0;
  }

  @HideGetSet
  public ArrayList getChildList() {

    return null;
  }

  @MethodArgs({"ObjectA", "ObjectB"})
  public void swapChildrenPosition(SpatialObject a, SpatialObject b) {}

  @HideGetSet
  public ArrayList getComponentsList() {

    return null;
  }

  @UnimplementedDoc
  public int componentCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public Component getComponentAt(int idx) {

    return null;
  }

  @Deprecated
  @DeprecatedInfo(info = {"Incorrect name, please use getComponentAt()"})
  @MethodArgs({"idx"})
  public Component getComponentsAt(int idx) {

    return null;
  }

  @UnimplementedDoc
  @MethodArgs({"idx"})
  public Component componentAt(int idx) {

    return null;
  }

  /// TRANSFORM METHODS
  @MethodArgs({"other"})
  public float distance(SpatialObject other) {

    return 0;
  }

  @MethodArgs({"other"})
  public float distance(Transform other) {

    return 0;
  }

  @MethodArgs({"other"})
  public float distance(Vector3 other) {

    return 0;
  }

  @MethodArgs({"other"})
  public float sqrtDistance(SpatialObject other) {

    return 0;
  }

  @MethodArgs({"other"})
  public float sqrtDistance(Transform other) {

    return 0;
  }

  @MethodArgs({"other"})
  public float sqrtDistance(Vector3 other) {

    return 0;
  }

  @HideGetSet
  public Vector3 getPosition() {
    return getTransform().getPosition();
  }

  @HideGetSet
  @MethodArgs({"vector"})
  public void setPosition(Vector3 vector) {
    getTransform().setPosition(vector);
  }

  @MethodArgs({"x", "y", "z"})
  public void setPosition(float x, float y, float z) {
    getTransform().setPosition(x, y, z);
  }

  @MethodArgs({"v"})
  public void setPositionX(float v) {
    getTransform().setPositionX(v);
  }

  @MethodArgs({"v"})
  public void setPositionY(float v) {
    getTransform().setPositionY(v);
  }

  @MethodArgs({"v"})
  public void setPositionZ(float v) {
    getTransform().setPositionZ(v);
  }

  @HideGetSet
  public Quaternion getRotation() {
    return getTransform().getRotation();
  }

  @HideGetSet
  @MethodArgs({"quaternion"})
  public void setRotation(Quaternion quaternion) {
    getTransform().setRotation(quaternion);
  }

  // Set rotation from angles in degrees
  @MethodArgs({"x", "y", "z"})
  @UnimplementedDoc
  public void setRotation(float x, float y, float z) {
    getTransform().getRotation().setFromEuler(x, y, z);
  }

  @MethodArgs({"w", "x", "y", "z"})
  public void setRotation(float w, float x, float y, float z) {
    getTransform().setRotation(w, x, y, z);
  }

  @HideGetSet
  public Vector3 getScale() {
    return getTransform().getScale();
  }

  @HideGetSet
  @MethodArgs({"vector"})
  public void setScale(Vector3 vector) {
    getTransform().setScale(vector);
  }

  @MethodArgs({"x", "y", "z"})
  public void setScale(float x, float y, float z) {
    getTransform().setScale(x, y, z);
  }

  @MethodArgs({"all"})
  public void setScale(float a) {
    getTransform().setScale(a);
  }

  @HideGetSet
  public Vector3 getGlobalPosition() {
    return getTransform().getGlobalPosition();
  }

  public Vector3 getGlobalPosition(Vector3 out) {
    return getTransform().getGlobalPosition(out);
  }

  @MethodArgs({"position"})
  @HideGetSet
  public void setGlobalPosition(Vector3 pos) {}

  @HideGetSet
  public Quaternion getGlobalRotation() {
    return getTransform().getGlobalRotation();
  }

  public Quaternion getGlobalRotation(Quaternion out) {
    return getTransform().getGlobalRotation(out);
  }

  @MethodArgs({"rotation"})
  @HideGetSet
  public void setGlobalRotation(Quaternion rotation) {}

  @HideGetSet
  public Vector3 getGlobalScale() {
    return getTransform().getGlobalScale();
  }

  public Vector3 getGlobalScale(Vector3 out) {
    return getTransform().getGlobalScale(out);
  }

  @MethodArgs({"scale"})
  @HideGetSet
  public void setGlobalScale(Vector3 scale) {}

  @MethodArgs({"x", "y", "z"})
  public void translate(float x, float y, float z) {
    getTransform().translate(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void move(float x, float y, float z) {
    getTransform().move(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void rotate(float x, float y, float z) {
    getTransform().rotate(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void translateInSeconds(float x, float y, float z) {
    getTransform().translateInSeconds(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void moveInSeconds(float x, float y, float z) {
    getTransform().moveInSeconds(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void moveInSeconds(int x, int y, int z) {
    getTransform().moveInSeconds(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void rotateInSeconds(float x, float y, float z) {
    getTransform().rotateInSeconds(x, y, z);
  }

  @MethodArgs({"x", "y", "z"})
  public void rotateInSeconds(int x, int y, int z) {
    getTransform().rotateInSeconds(x, y, z);
  }

  @MethodArgs({"object"})
  public void lookTo(SpatialObject object) {
    getTransform().lookTo(object);
  }

  @MethodArgs({"position"})
  public void lookTo(Vector3 position) {
    getTransform().lookTo(position);
  }

  @MethodArgs({"x", "y", "z"})
  public void lookTo(float x, float y, float z) {
    getTransform().lookTo(x, y, z);
  }

  @MethodArgs({"object"})
  public void lookToIgnoreY(SpatialObject object) {
    getTransform().lookToIgnoreY(object);
  }

  @MethodArgs({"position"})
  public void lookToIgnoreY(Vector3 position) {
    getTransform().lookToIgnoreY(position);
  }

  @MethodArgs({"object"})
  public void teleportTo(SpatialObject object) {
    getTransform().teleportTo(object);
  }

  @MethodArgs({"position"})
  public void teleportTo(Vector3 position) {
    getTransform().teleportTo(position);
  }

  @UnimplementedDoc
  @MethodArgs({"other", "lerpSpeed"})
  public void smoothLookTo(SpatialObject other, float lerpSpeed) {
    getTransform().lerpLookTo(other, lerpSpeed);
  }

  @UnimplementedDoc
  @MethodArgs({"position", "lerpSpeed"})
  public void smoothLookTo(Vector3 other, float lerpSpeed) {
    getTransform().lerpLookTo(other, lerpSpeed);
  }

  @UnimplementedDoc
  @MethodArgs({"other", "lerpSpeed"})
  public void lerpLookTo(SpatialObject other, float lerpSpeed) {
    getTransform().lerpLookTo(other, lerpSpeed);
  }

  @UnimplementedDoc
  @MethodArgs({"position", "lerpSpeed"})
  public void lerpLookTo(Vector3 other, float lerpSpeed) {
    getTransform().lerpLookTo(other, lerpSpeed);
  }

  @UnimplementedDoc
  @MethodArgs({"other", "lerpSpeed"})
  public void lerpLookToIgnoreY(SpatialObject other, float lerpSpeed) {
    getTransform().lerpLookToIgnoreY(other, lerpSpeed);
  }

  @UnimplementedDoc
  @MethodArgs({"position", "lerpSpeed"})
  public void lerpLookToIgnoreY(Vector3 other, float lerpSpeed) {
    getTransform().lerpLookToIgnoreY(other, lerpSpeed);
  }

  @MethodArgs({"vector3"})
  public Vector3 transformPoint(Vector3 vector3) {
    return getTransform().transformPoint(vector3);
  }

  @MethodArgs({"vector3", "out"})
  public void transformPoint(Vector3 vector3, Vector3 out) {
    getTransform().transformPoint(vector3, out);
  }

  @MethodArgs({"vector3"})
  public Vector3 inverseTransformPoint(Vector3 vector3) {
    return getTransform().inverseTransformPoint(vector3);
  }

  @MethodArgs({"vector3", "out"})
  public void inverseTransformPoint(Vector3 vector3, Vector3 out) {
    getTransform().inverseTransformPoint(vector3, out);
  }

  @MethodArgs({"vector3"})
  public Vector3 transformDirection(Vector3 vector3) {
    return getTransform().transformDirection(vector3);
  }

  @MethodArgs({"vector3", "out"})
  public void transformDirection(Vector3 vector3, Vector3 out) {
    getTransform().transformDirection(vector3, out);
  }

  @MethodArgs({"vector3"})
  public Vector3 inverseTransformDirection(Vector3 vector3) {
    return getTransform().inverseTransformDirection(vector3);
  }

  @MethodArgs({"vector3", "out"})
  public void inverseTransformDirection(Vector3 vector3, Vector3 out) {
    getTransform().inverseTransformDirection(vector3, out);
  }

  public Vector3 forward() {
    return getTransform().forward();
  }

  public Vector3 back() {
    return getTransform().back();
  }

  public Vector3 right() {
    return getTransform().right();
  }

  public Vector3 left() {
    return getTransform().left();
  }

  public Vector3 up() {
    return getTransform().up();
  }

  public Vector3 down() {
    return getTransform().down();
  }

  @MethodArgs({"out"})
  public Vector3 forward(Vector3 out) {
    return getTransform().forward(out);
  }

  @MethodArgs({"out"})
  public Vector3 back(Vector3 out) {
    return getTransform().back(out);
  }

  @MethodArgs({"out"})
  public Vector3 right(Vector3 out) {
    return getTransform().right(out);
  }

  @MethodArgs({"out"})
  public Vector3 left(Vector3 out) {
    return getTransform().left(out);
  }

  @MethodArgs({"out"})
  public Vector3 up(Vector3 out) {
    return getTransform().up(out);
  }

  @MethodArgs({"out"})
  public Vector3 down(Vector3 out) {
    return getTransform().down(out);
  }

  @HideGetSet
  public boolean isStatic() {
    return getTransform().isStatic();
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setStatic(boolean value) {
    getTransform().setStatic(value);
  }

  public int getState() {
    return getTransform().getState();
  }

  @MethodArgs({"state"})
  public void setState(int state) {
    getTransform().setState(state);
  }

  @HideGetSet
  public float[] getGlobalMatrix() {
    return getTransform().getGlobalMatrix();
  }

  @MethodArgs({"out"})
  public float[] getGlobalMatrix(float[] out) {
    return getTransform().getGlobalMatrix(out);
  }

  @HideGetSet
  public float[] getLocalMatrix() {
    return getTransform().getLocalMatrix();
  }

  @MethodArgs({"out"})
  public float[] getLocalMatrix(float[] out) {
    return getTransform().getLocalMatrix(out);
  }

  @MethodArgs({"vector"})
  public Vector3 mulGlobalVector3(Vector3 vector3) {
    return getTransform().mulGlobalVector3(vector3);
  }

  @MethodArgs({"vector"})
  public Vector3 mulLocalVector3(Vector3 vector3) {
    return getTransform().mulLocalVector3(vector3);
  }

  public void recalculateMatrices() {
    getTransform().recalculateMatrices();
  }
  /// END TRANSFORM METHODS

  /// PHYSICS METHODS
  @UnimplementedDoc
  @MethodArgs({"objectName"})
  public boolean colliderWithName(String objectName) {

    return false;
  }

  @UnimplementedDoc
  public boolean isColliding() {

    return false;
  }

  @UnimplementedDoc
  public List<Collision> getCollisionList() {

    return null;
  }

  @UnimplementedDoc
  public int getCollisionsCount() {

    return 0;
  }

  @UnimplementedDoc
  @MethodArgs({"idx"})
  public Collision getCollisionAt(int idx) {

    return null;
  }
  /// END PPHYSICS METHODS

  public String toJson() {

    return "";
  }

  public boolean exists() {

    return false;
  }

  @HideGetSet
  public String getTag() {

    return "";
  }

  @HideGetSet
  @MethodArgs({"name"})
  public void setTag(String name) {}

  @MethodArgs({"name"})
  public boolean compareTag(String name) {

    return false;
  }

  /// Abstract
  @MethodArgs({"file"})
  public static SpatialObject loadFile(ObjectFile pFile) {

    return null;
  }
}
