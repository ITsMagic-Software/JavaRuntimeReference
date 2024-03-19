package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPO;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPOPFile;
//>REMOVE-BRIDGE<

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"HPOP"})
public class HPOPData {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient HPOPFile hpopFile;
    @IgnoreAutoComplete
    public HPOPData(HPOPFile hpopFile) {
        this.hpopFile = hpopFile;
    }
    //>REMOVE-BRIDGE<

    public HPOPData() {
        //<REMOVE-BRIDGE>
        this.hpopFile = new HPOPFile();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public ArrayList getHPOList(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        ArrayList list = new ArrayList();
        for (HPO hpo : hpopFile.getHpos()) {
            list.add(hpo);
        }
        return list;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"list"})
    public void setHPOList(ArrayList list){
        //<REMOVE-BRIDGE>
        ArrayList<HPO> hpos = new ArrayList<>();
        for (Object o : list) {
            hpos.add((HPO) o);
        }
        hpopFile.setHpos(hpos);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"idx"})
    public JAVARuntime.HPO getHPO(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpopFile.getHpos().get(idx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"hpo"})
    public void addHPO(JAVARuntime.HPO hpo){
        //<REMOVE-BRIDGE>
        hpopFile.hpos.add(hpo.hpo);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"hpo"})
    public void removeHPO(JAVARuntime.HPO hpo){
        //<REMOVE-BRIDGE>
        hpopFile.hpos.remove(hpo.hpo);
        //>REMOVE-BRIDGE<
    }
}
