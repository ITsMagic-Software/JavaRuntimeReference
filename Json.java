package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Serializer"})
public class Json {

    private Json() { }

    @MethodArgs(args ={"object"})
    public static String toJson(Object object){
        return toJson(object, false);
    }
    @MethodArgs(args ={"object","prettyPrinting"})
    public static String toJson(Object object, boolean prettyPrinting){
        return toJson(object, prettyPrinting, false);
    }
    @MethodArgs(args ={"object","prettyPrinting","lenient"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient) {
        return toJson(object, prettyPrinting, lenient, false);
    }
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields) {
        return toJson(object, prettyPrinting, lenient, ignorePrivateFields, false);
    }
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields","ignoreProtectedFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields, boolean ignoreProtectedFields) {
        return toJson(object, prettyPrinting, lenient, ignorePrivateFields, ignoreProtectedFields, false);
    }
    @MethodArgs(args ={"object","prettyPrinting","lenient","ignorePrivateFields","ignoreProtectedFields","ignorePublicFields"})
    public static String toJson(Object object, boolean prettyPrinting, boolean lenient, boolean ignorePrivateFields, boolean ignoreProtectedFields, boolean ignorePublicFields) {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"json","classType"})
    public static Object fromJson(String json, Class classType){
        return fromJson(json, classType, false);
    }
    @MethodArgs(args ={"json","classType","lenient"})
    public static Object fromJson(String json, Class classType, boolean lenient){
        //
        return null;
        //

        //
    }

    //
}
