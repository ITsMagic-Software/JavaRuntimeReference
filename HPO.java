package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"HPOP"})
public class HPO {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPO hpo;
    @IgnoreAutoComplete
    public HPO(com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPO hpo) {
        this.hpo = hpo;
    }
    //>REMOVE-BRIDGE<

    public HPO() {
        //<REMOVE-BRIDGE>
        this.hpo = new com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPO();
        //>REMOVE-BRIDGE<
    }
    public HPO(Vector3 position, Quaternion rotation, Vector3 scale) {
        //<REMOVE-BRIDGE>
        this.hpo = new com.itsmagic.engine.Engines.Engine.ComponentsV2.HPOP.Utils.HPO(position.instance, rotation.instance, scale.instance, true);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpo.getPosition().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setPosition(Vector3 vector3){
        //<REMOVE-BRIDGE>
        hpo.setPosition(vector3.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Quaternion getRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpo.getRotation().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"quaternion"})
    public void setPosition(Quaternion quaternion){
        //<REMOVE-BRIDGE>
        hpo.setRotation(quaternion.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpo.getScale().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector3"})
    public void setScale(Vector3 vector3){
        //<REMOVE-BRIDGE>
        hpo.setScale(vector3.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isStatic(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpo.isStatic();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStatic(boolean value){
        //<REMOVE-BRIDGE>
        hpo.setStatic(value);
        //>REMOVE-BRIDGE<
    }

    public float[] getMatrix() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return hpo.getMatrix();
        //>REMOVE-BRIDGE<
    }
}
