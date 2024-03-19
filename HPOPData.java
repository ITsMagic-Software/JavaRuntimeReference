package JAVARuntime;

//

import java.util.ArrayList;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"HPOP"})
public class HPOPData {
    //

    public HPOPData() {
        //
    }

    @HideGetSet
    public ArrayList getHPOList(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"list"})
    public void setHPOList(ArrayList list){
        //
    }

    @MethodArgs(args ={"idx"})
    public JAVARuntime.HPO getHPO(int idx){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"hpo"})
    public void addHPO(JAVARuntime.HPO hpo){
        //
    }
    @MethodArgs(args ={"hpo"})
    public void removeHPO(JAVARuntime.HPO hpo){
        //
    }
}
