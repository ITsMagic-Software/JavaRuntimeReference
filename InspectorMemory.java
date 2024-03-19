package JAVARuntime;

import java.io.Serializable;
//<REMOVE-BRIDGE>
import com.google.gson.annotations.Expose;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Utils.GUIDHashObject;

import java.util.HashMap;
import java.util.Map;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Platform"})
public class InspectorMemory extends GUIDHashObject implements Serializable {

    //<REMOVE-BRIDGE>
    @Expose
    @IgnoreAutoComplete
    public transient Map<String, String> dataBase = new HashMap<>();

    public void store(String key, String json){
        if(dataBase == null){ dataBase = new HashMap<>(); }

        if(!dataBase.containsKey(key)) {
            dataBase.put(key, json);
        } else {
            dataBase.replace(key, json);
        }
    }

    public String load(String key){
        if(dataBase == null){ dataBase = new HashMap<>(); }
        return dataBase.get(key);
    }

    public void clear(){
        if(dataBase == null){ dataBase = new HashMap<>(); }
        dataBase.clear();
    }
    //>REMOVE-BRIDGE<
}
