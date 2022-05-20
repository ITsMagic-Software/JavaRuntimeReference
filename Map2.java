package JAVARuntime;

//

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Lists"})
public class Map2 {
    //

    private Class keyClass = null;
    private Class valueClass = null;

    private int count;
    private ArrayList keyList;
    private ArrayList valueList;

    @MethodArgs(args={"key","value"})
    public Map2(Class keyClass, Class valueClass) {
        this.keyClass = keyClass;
        this.valueClass = valueClass;

        this.keyList = new ArrayList();
        this.valueList = new ArrayList();
    }

    @MethodArgs(args={"key","value"})
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
    @MethodArgs(args={"key"})
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
    @MethodArgs(args={"key","value"})
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
    @MethodArgs(args={"key"})
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
        //
        return null;
        //

        //
    }

    public void clear(){
        keyList.clear();
        valueList.clear();
        count = 0;
    }
    public int getSize() {
        return count;
    }

    @MethodArgs(args={"json"})
    public static Map2 fromJson(String json){
        //
        return null;
        //

        //
    }
}
