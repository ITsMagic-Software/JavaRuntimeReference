package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Serializer"})
public class Json {

    private transient boolean prettyPrinting = false;
    private transient boolean lenient = false;
    private transient boolean ignorePrivateFields = false;
    private transient boolean ignoreProtectedFields = false;
    private transient boolean ignorePublicFields = false;

    //

    public Json() { }

    private void buildGson(){
        //
    }

    @HideGetSet
    public boolean isPrettyPrinting() {
        return prettyPrinting;
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setPrettyPrinting(boolean prettyPrinting) {
        boolean invalidate = this.prettyPrinting != prettyPrinting;
        this.prettyPrinting = prettyPrinting;
        //
    }

    @HideGetSet
    public boolean isLenient() {
        return lenient;
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setLenient(boolean lenient) {
        boolean invalidate = this.lenient != lenient;
        this.lenient = lenient;
        //
    }

    @HideGetSet
    public boolean isIgnorePrivateFields() {
        return ignorePrivateFields;
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setIgnorePrivateFields(boolean ignorePrivateFields) {
        boolean invalidate = this.ignorePrivateFields != ignorePrivateFields;
        this.ignorePrivateFields = ignorePrivateFields;
        //
    }

    @HideGetSet
    public boolean isIgnoreProtectedFields() {
        return ignoreProtectedFields;
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setIgnoreProtectedFields(boolean ignoreProtectedFields) {
        boolean invalidate = this.ignoreProtectedFields != ignoreProtectedFields;
        this.ignoreProtectedFields = ignoreProtectedFields;
        //
    }

    @HideGetSet
    public boolean isIgnorePublicFields() {
        return ignorePublicFields;
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setIgnorePublicFields(boolean ignorePublicFields) {
        boolean invalidate = this.ignorePublicFields != ignorePublicFields;
        this.ignorePublicFields = ignorePublicFields;
        //
    }

    @MethodArgs(args ={"object"})
    public String toJsonString(Object object) {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"json","classType"})
    public Object fromJsonString(String json, Class classType){
        //
        return null;
        //

        //
    }

    @Deprecated
    @MethodArgs(args ={"object"})
    public static String toJson(Object object){
        return toJson(object, false);
    }
    @Deprecated
    @MethodArgs(args ={"object","prettyPrinting"})
    public static String toJson(Object object, boolean prettyPrinting){
        return toJson(object, prettyPrinting, false);
    }
    @Deprecated
    @MethodArgs(args ={"object","prettyPrinting","lenient"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient) {
        return toJson(object, prettyPrinting, lenient, false);
    }
    @Deprecated
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields) {
        return toJson(object, prettyPrinting, lenient, ignorePrivateFields, false);
    }
    @Deprecated
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields","ignoreProtectedFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields, boolean ignoreProtectedFields) {
        return toJson(object, prettyPrinting, lenient, ignorePrivateFields, ignoreProtectedFields, false);
    }
    @Deprecated
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields","ignoreProtectedFields","ignorePublicFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields, boolean ignoreProtectedFields, boolean ignorePublicFields) {
        //
        return null;
        //

        //
    }

    @Deprecated
    @MethodArgs(args ={"json","classType"})
    public static Object fromJson(String json, Class classType){
        return fromJson(json, classType, false);
    }
    @Deprecated
    @MethodArgs(args ={"json","classType","lenient"})
    public static Object fromJson(String json, Class classType, boolean lenient){
        //
        return null;
        //

        //
    }

    //
}
