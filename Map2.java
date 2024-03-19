package JAVARuntime;

//<REMOVE-BRIDGE>
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
//
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.GhostList;
import com.itsmagic.engine.Core.Components.JCompiler.JCompiler;
import com.itsmagic.engine.Engines.Utils.Variable;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInspectorEntry;
import com.itsmagic.engine.Engines.Engine.ClassInspector.ClassInterface;
import com.itsmagic.engine.Engines.Engine.ClassInspector.GetSetterListener;
import com.itsmagic.engine.Engines.Engine.ClassInspector.UserPointer;
import com.itsmagic.engine.R;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
//>REMOVE-BRIDGE<

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Lists"})
public class Map2 {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public static ClassInspectorEntry inspectorController(){
        Class thisClass = Map2.class;
        return new ClassInspectorEntry(new ClassInterface() {
            @Override
            public boolean match(String className, UserPointer userPointer) {
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
                Map2 map2 = (Map2) value;
                if(map2 != null) {
                    return new Variable(fieldName, map2.toJson());
                } else {
                    return new Variable(fieldName, "");
                }
            }

            @Override
            public boolean isRestorable() {
                return true;
            }

            @Override
            public Object restore(Variable variable, UserPointer userPointer) {
                if(variable.type == Variable.Type.String){
                    return Map2.fromJson(variable.str_value);
                }
                return null;
            }

            @Override
            public Object newInstance(UserPointer userPointer) {
                return null;
            }
        });
    }
    //>REMOVE-BRIDGE<

    private transient Class keyClass = null;
    private transient Class valueClass = null;

    private transient int count;
    private transient ArrayList keyList;
    private transient ArrayList valueList;

    @MethodArgs(args ={"key","value"})
    public Map2(Class keyClass, Class valueClass) {
        this.keyClass = keyClass;
        this.valueClass = valueClass;

        this.keyList = new ArrayList();
        this.valueList = new ArrayList();
    }

    @MethodArgs(args ={"key","value"})
    public void put(Object key, Object value){
        if(key.getClass() != keyClass){
            Console.log("Map2 invalid put: key class type is different from defined at constructor");
            return;
        }
        if(value.getClass() != valueClass){
            Console.log("Map2 invalid put: value class type is different from defined at constructor");
            return;
        }
        keyList.add(key);
        valueList.add(value);

        count++;
    }
    @MethodArgs(args ={"key"})
    public Object get(Object key){
        if(key.getClass() != keyClass){
            Console.log("Map2 invalid put: key class type is different from defined at constructor");
            return null;
        }
        if(keyClass == String.class){
            for (int i = 0; i < keyList.size(); i++) {
                String str = (String) keyList.get(i);
                if(str.equals((String)key)){
                    return valueList.get(i);
                }
            }
        }
        if(keyClass == int.class || keyClass == Integer.class){
            for (int i = 0; i < keyList.size(); i++) {
                int str = ((Integer) keyList.get(i)).intValue();
                if(str == ((Integer)key).intValue()){
                    return valueList.get(i);
                }
            }
        }
        if(keyClass == float.class || keyClass == Float.class){
            for (int i = 0; i < keyList.size(); i++) {
                float str = ((Float) keyList.get(i)).floatValue();
                if(str == ((Float)key).floatValue()){
                    return valueList.get(i);
                }
            }
        }
        else {
            for (int i = 0; i < keyList.size(); i++) {
                if(keyList.get(i) == key){
                    return valueList.get(i);
                }
            }
        }

        return null;
    }
    @MethodArgs(args ={"key","value"})
    public void replace(Object key, Object newValue){
        if(key.getClass() != keyClass){
            Console.log("Map2 invalid put: key class type is different from defined at constructor");
            return;
        }
        if(newValue.getClass() != valueClass){
            Console.log("Map2 invalid put: value class type is different from defined at constructor");
            return;
        }
        if(keyClass == String.class){
            for (int i = 0; i < keyList.size(); i++) {
                String str = (String) keyList.get(i);
                if(str.equals((String)key)){
                    valueList.set(i, newValue);
                }
            }
        }
        if(keyClass == int.class || keyClass == Integer.class){
            for (int i = 0; i < keyList.size(); i++) {
                int str = ((Integer) keyList.get(i)).intValue();
                if(str == ((Integer)key).intValue()){
                    valueList.set(i, newValue);
                }
            }
        }
        if(keyClass == float.class || keyClass == Float.class){
            for (int i = 0; i < keyList.size(); i++) {
                float str = ((Float) keyList.get(i)).floatValue();
                if(str == ((Float)key).floatValue()){
                    valueList.set(i, newValue);
                }
            }
        }
        else {
            for (int i = 0; i < keyList.size(); i++) {
                if(keyList.get(i) == key){
                    valueList.set(i, newValue);
                }
            }
        }
    }
    @MethodArgs(args ={"key"})
    public void remove(Object key){
        if(key.getClass() != keyClass){
            Console.log("Map2 invalid put: key class type is different from defined at constructor");
        }
        if(keyClass == String.class){
            for (int i = 0; i < keyList.size(); i++) {
                String str = (String) keyList.get(i);
                if(str.equals((String)key)){
                    keyList.remove(i);
                    valueList.remove(i);
                    count--;
                    return;
                }
            }
        }
        if(keyClass == int.class || keyClass == Integer.class){
            for (int i = 0; i < keyList.size(); i++) {
                int str = ((Integer) keyList.get(i)).intValue();
                if(str == ((Integer)key).intValue()){
                    keyList.remove(i);
                    valueList.remove(i);
                    count--;
                    return;
                }
            }
        }
        if(keyClass == float.class || keyClass == Float.class){
            for (int i = 0; i < keyList.size(); i++) {
                float str = ((Float) keyList.get(i)).floatValue();
                if(str == ((Float)key).floatValue()){
                    keyList.remove(i);
                    valueList.remove(i);
                    count--;
                    return;
                }
            }
        }
        else {
            for (int i = 0; i < keyList.size(); i++) {
                if(keyList.get(i) == key){
                    keyList.remove(i);
                    valueList.remove(i);
                    count--;
                    return;
                }
            }
        }
    }

    public Class getKeyClass() {
        return keyClass;
    }
    public Class getValueClass() {
        return valueClass;
    }

    public ArrayList getKeyList() {
        ArrayList clone = new ArrayList();
        clone.addAll(keyList);
        return clone;
    }
    public ArrayList getDirectKeyList() {
        return keyList;
    }
    public ArrayList getValueList() {
        ArrayList clone = new ArrayList();
        clone.addAll(valueList);
        return clone;
    }
    public ArrayList getDirectValueList() {
        return valueList;
    }

    public String toJson(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Gson gson = new Gson();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("keyClass", keyClass.getName());
        jsonObject.addProperty("valueClass", valueClass.getName());
        jsonObject.addProperty("count", count);

        JsonElement keyListElement = gson.toJsonTree(keyList, new TypeToken<ArrayList>() {}.getType());
        JsonArray keyListArray = keyListElement.getAsJsonArray();
        jsonObject.add("keyList", keyListArray);

        JsonElement valueListElement = gson.toJsonTree(valueList, new TypeToken<ArrayList>() {}.getType());
        JsonArray valueListArray = valueListElement.getAsJsonArray();
        jsonObject.add("valueList", valueListArray);

        return jsonObject.toString();
        //>REMOVE-BRIDGE<
    }

    public void clear(){
        keyList.clear();
        valueList.clear();
        count = 0;
    }
    public int getSize() {
        return count;
    }

    @MethodArgs(args ={"json"})
    public static Map2 fromJson(String json){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(json == null || json.isEmpty()){
            return null;
        }

        Map2 map2 = new Map2(null, null);
        try {
            JSONObject jsonObject = new JSONObject(json);

            map2.keyClass = Class.forName(jsonObject.getString("keyClass"));
            map2.valueClass = Class.forName(jsonObject.getString("valueClass"));
            map2.count = jsonObject.getInt("count");

            JSONArray keyListArray = jsonObject.getJSONArray("keyList");
            for (int i = 0; i < keyListArray.length(); i++) {
                map2.keyList.add(keyListArray.get(i));
            }

            JSONArray valueListArray = jsonObject.getJSONArray("valueList");
            for (int i = 0; i < valueListArray.length(); i++) {
                map2.valueList.add(valueListArray.get(i));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return map2;
        //>REMOVE-BRIDGE<
    }
}
