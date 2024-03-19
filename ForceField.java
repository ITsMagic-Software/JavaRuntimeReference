package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

import java.util.ArrayList;
import java.util.List;

@ClassCategory(cat ={"Physics"})
public final class ForceField extends PhysicsEntity{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ForceField instance;
    @IgnoreAutoComplete
    public ForceField(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ForceField physicsController) {
        super(physicsController);
        this.instance = physicsController;
    }

    private void getComponent(){
        if(instance == null){
            instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ForceField) super.instance;
        }
    }
    //>REMOVE-BRIDGE<

    public ForceField() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ForceField());
        this.instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.ForceField) super.instance;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"objectName"})
    public boolean triggerWithName(String objectName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.colliderWith(objectName);
        //>REMOVE-BRIDGE<
    }
    public boolean isTriggering(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.isColliding();
        //>REMOVE-BRIDGE<
    }
    public List<Collision> getTriggerList(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        List<Collision> collisions = new ArrayList<>();
        for (int i = 0; i < this.instance.collisionCount(); i++) {
            com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision collision = this.instance.collisionAt(i);
            collisions.add(collision.toJAVARuntime());
        }
        return collisions;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"id"})
    public JAVARuntime.Collision getTrigger(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        try {
            if(this.instance.collisionCount() <= idx) throw new IndexOutOfBoundsException("Index can't be >= getCollisionsCount()");
            return this.instance.collisionAt(idx).toJAVARuntime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(instance.layerReference.getLayer() != null){
            return instance.layerReference.getLayer().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public void setPhysicsLayer(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer != null) {
            instance.layerReference.layerGUID = layer.layer.guid;
        } else {
            instance.layerReference.layerGUID = null;
        }
        //>REMOVE-BRIDGE<
    }
}
