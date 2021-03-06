package JAVARuntime;

//


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Object"})
public class SpatialObject {
    //

    //

    public SpatialObject() {
        //
    }
    @MethodArgs(args={"parent"})
    public SpatialObject(SpatialObject parent) {
        //
    }
    @MethodArgs(args={"name"})
    public SpatialObject(String name) {
        //
    }
    @MethodArgs(args={"name","parent"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"value"})
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
    @MethodArgs(args={"name"})
    public void setName(String name){
        //
    }
    @HideGetSet
    public JAVARuntime.OHString getNameOH(){
        //
        return "";
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"name"})
    public void setNameOH(JAVARuntime.OHString name){
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
    @MethodArgs(args={"name"})
    public void callFunction(String name){
        //
    }
    @MethodArgs(args={"name","value"})
    public void callFunction(String name, Object value){
        //
    }
    @MethodArgs(args={"name","value"})
    public void callFunction(String name, int value){
        //
    }
    @MethodArgs(args={"name","value"})
    public void callFunction(String name, float value){
        //
    }
    @MethodArgs(args={"name","value"})
    public void callFunction(String name, String value){
        //
    }
    @MethodArgs(args={"name","value"})
    public void callFunction(String name, boolean value){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name"})
    public void callScriptsFunction(String name){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, float value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, int value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, boolean value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, Vector3 value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, Vector2 value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, Quaternion value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, String value){
        //
    }
    @Deprecated
    @DeprecatedInfo(info={"Interpreted scripts(NodeScript v1 and MagicScript) are obsolete, this method will be removed"})
    @MethodArgs(args={"name","value"})
    public void callScriptsFunction(String name, PFile value){
        //
    }

    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiate(ObjectFile) instead"})
    @MethodArgs(args={"file"})
    public SpatialObject instantiate(PFile pFile){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiate(ObjectFile, Vector3 position) instead"})
    @MethodArgs(args={"file","position"})
    public SpatialObject instantiate(PFile pFile, Vector3 position){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiate(ObjectFile, Vector3 position, Quaternion rotation) instead"})
    @MethodArgs(args={"file","position","rotation"})
    public SpatialObject instantiate(PFile pFile, Vector3 position, Quaternion rotation){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiate(ObjectFile, Vector3 position, Quaternion rotation, Vector3 scale) instead"})
    @MethodArgs(args={"file","position","rotation","scale"})
    public SpatialObject instantiate(PFile pFile, Vector3 position, Quaternion rotation, Vector3 scale){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiateHasChild(ObjectFile) instead"})
    @MethodArgs(args={"file"})
    public SpatialObject instantiateHasChild(PFile pFile){
        //
        return null;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"PFile is now obsolete, use SpatialObject.instantiateHasChild(ObjectFile, SpatialObject parent) instead"})
    @MethodArgs(args={"file","parent"})
    public SpatialObject instantiateHasChild(PFile pFile, SpatialObject parent){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"file"})
    public SpatialObject instantiate(ObjectFile pFile){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"file","position"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"file","position","rotation"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"file","position","rotation","scale"})
    public SpatialObject instantiate(ObjectFile pFile, Vector3 position, Quaternion rotation, Vector3 scale){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"file"})
    public SpatialObject instantiateHasChild(ObjectFile pFile){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"file","parent"})
    public SpatialObject instantiateHasChild(ObjectFile pFile, SpatialObject parent){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"tittle"})
    public <T extends Component> T findComponent(String tittle){
        //
        return null;
    }
    @MethodArgs(args={"tittle"})
    public ArrayList findComponents(String tittle){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"type"})
    public <T extends Component> T findComponent(Class classReference){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"type"})
    public ArrayList findComponents(Class classReference){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"tittle"})
    public <T extends Component> T findComponentInChildren(String tittle){
        //
        return null;
    }
    @MethodArgs(args={"type"})
    public <T extends Component> T findComponentInChildren(Class classReference){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"component"})
    public void removeComponent(Component component){
        //
    }
    @MethodArgs(args={"component"})
    public void addComponent(Component component){
        //
    }
    @MethodArgs(args={"component","type"})
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
    @MethodArgs(args={"parent"})
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

    @MethodArgs(args={"name"})
    public SpatialObject findChildObject(String name) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"idx"})
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
    @MethodArgs(args={"child"})
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
    @MethodArgs(args={"idx"})
    public Component getComponentsAt(int idx) {
        //
        return null;
        //

        //
    }

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

    //

    /// Abstract
    @MethodArgs(args={"file"})
    public static SpatialObject loadFile(PFile pFile){
        //
        return null;
        //

        //
    }
}
