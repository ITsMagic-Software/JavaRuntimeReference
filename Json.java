package JAVARuntime;

//<REMOVE-BRIDGE>
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Classes.OfficialClass;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Native.OHString.OHString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
//>REMOVE-BRIDGE<

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

    //<REMOVE-BRIDGE>
    private transient Gson gson;
    //>REMOVE-BRIDGE<

    public Json() { }

    private void buildGson(){
        //<REMOVE-BRIDGE>
        if(gson == null){
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.serializeSpecialFloatingPointValues();

            Json.addSerializators(gsonBuilder);
            Json.addExclusion(gsonBuilder);

            if (prettyPrinting) gsonBuilder.setPrettyPrinting();
            if(lenient) gsonBuilder.setLenient();

            {
                if (ignorePrivateFields && ignoreProtectedFields && ignorePublicFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.PROTECTED | Modifier.PUBLIC | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignorePublicFields && ignoreProtectedFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignorePublicFields && ignorePrivateFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.PRIVATE | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignorePrivateFields && ignoreProtectedFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignorePrivateFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignoreProtectedFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
                } else if (ignorePublicFields) {
                    gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.TRANSIENT | Modifier.STATIC);
                }
            }

            gson = gsonBuilder.create();
        }
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if (invalidate) {
            gson = null;
            buildGson();
        }
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if(invalidate) {
            gson = null;
            buildGson();
        }
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if(invalidate) {
            gson = null;
            buildGson();
        }
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if(invalidate) {
            gson = null;
            buildGson();
        }
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        if (invalidate) {
            gson = null;
            buildGson();
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public String toJsonString(Object object) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        //

        buildGson();
        return gson.toJson(object);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"json","classType"})
    public Object fromJsonString(String json, Class classType){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        buildGson();
        return gson.fromJson(json, classType);
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        //

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();

        addSerializators(gsonBuilder);
        addExclusion(gsonBuilder);

        if (prettyPrinting) gsonBuilder.setPrettyPrinting();
        if(lenient) gsonBuilder.setLenient();

        {
            if (ignorePrivateFields && ignoreProtectedFields && ignorePublicFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.PROTECTED | Modifier.PUBLIC | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignorePublicFields && ignoreProtectedFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignorePublicFields && ignorePrivateFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.PRIVATE | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignorePrivateFields && ignoreProtectedFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignorePrivateFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignoreProtectedFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PROTECTED | Modifier.TRANSIENT | Modifier.STATIC);
            } else if (ignorePublicFields) {
                gsonBuilder.excludeFieldsWithModifiers(Modifier.PUBLIC | Modifier.TRANSIENT | Modifier.STATIC);
            }
        }

        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
        //>REMOVE-BRIDGE<
    }

    @Deprecated
    @MethodArgs(args ={"json","classType"})
    public static Object fromJson(String json, Class classType){
        return fromJson(json, classType, false);
    }
    @Deprecated
    @MethodArgs(args ={"json","classType","lenient"})
    public static Object fromJson(String json, Class classType, boolean lenient){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();

        addSerializators(gsonBuilder);
        addExclusion(gsonBuilder);

        if(lenient){
            gsonBuilder.setLenient();
        }

        Gson gson = gsonBuilder.create();
        return gson.fromJson(json, classType);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    private static void addSerializators(GsonBuilder gsonBuilder) {
        for (int i = 0; i < JCompiler.officialClassesCount(); i++) {
            OfficialClass reservedClass = JCompiler.officialClassAt(i);
            if(reservedClass.isRuntimeSerializable()){
                gsonBuilder.registerTypeAdapter(reservedClass.getCls(), new com.google.gson.JsonSerializer(){
                    @Override
                    public JsonElement serialize(Object src, Type typeOfSrc, JsonSerializationContext context) {
                        if(src == null) return new JsonPrimitive("");

                        JsonSerializer serializer = (JsonSerializer) src;
                        return new JsonPrimitive(serializer.serializeToString());
                    }
                });
            }
        }

        for (int i = 0; i < JCompiler.officialClassesCount(); i++) {
            OfficialClass reservedClass = JCompiler.officialClassAt(i);
            if(reservedClass.isRuntimeSerializable()){
                gsonBuilder.registerTypeAdapter(reservedClass.getCls(), new com.google.gson.JsonDeserializer(){
                    /** @noinspection unchecked*/
                    @Override
                    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        try {
                            Object instance = reservedClass.getCls().getConstructor(null).newInstance();
                            JsonSerializer serializer = (JsonSerializer) instance;
                            serializer.deserializeLocal(json.getAsString());
                            return instance;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                });
            }
        }
    }
    private static void addExclusion(GsonBuilder gsonBuilder) {
        gsonBuilder.addSerializationExclusionStrategy(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                try {
                    Field field = f.getDeclaringClass().getField(f.getName());
                    if(field.getType().isPrimitive()) return false;
                    if(field.getType() == String.class) return false;

                    for (int i = 0; i < JCompiler.officialClassesCount(); i++) {
                        OfficialClass reservedClass = JCompiler.officialClassAt(i);
                        if(reservedClass.getCls() == field.getType() && !reservedClass.isRuntimeSerializable()){
                            return true;
                        }
                    }
                } catch (NoSuchFieldException e) {
                    //e.printStackTrace();
                }
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                if(clazz.isPrimitive()) return false;
                if(clazz == String.class) return false;

                for (int i = 0; i < JCompiler.officialClassesCount(); i++) {
                    OfficialClass reservedClass = JCompiler.officialClassAt(i);
                    if(reservedClass.getCls() == clazz && !reservedClass.isRuntimeSerializable()){
                        return true;
                    }
                }
                return false;
            }
        });
    }
    //>REMOVE-BRIDGE<
}
