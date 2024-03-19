package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.PhysicsController;

//>REMOVE-BRIDGE<
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public class PhysicsEntity {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient PhysicsController instance;
    @IgnoreAutoComplete
    public PhysicsEntity(PhysicsController instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public PhysicsEntity() {
        //<REMOVE-BRIDGE>
        this.instance = new PhysicsController();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"objectName"})
    public boolean colliderWithName(String objectName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.colliderWith(objectName);
        //>REMOVE-BRIDGE<
    }
    public boolean isColliding(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isColliding();
        //>REMOVE-BRIDGE<
    }
    public List<Collision> getCollisionList(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<Collision> collisions = new ArrayList<>();
        for (int i = 0; i < instance.collisionCount(); i++) {
            com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision collision = instance.collisionAt(i);
            collisions.add(collision.toJAVARuntime());
        }
        return collisions;
        //>REMOVE-BRIDGE<
    }

    public int getCollisionsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        try {
            return instance.collisionCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Collision getCollisionAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        try {
            if(instance.collisionCount() <= idx) throw new IndexOutOfBoundsException("Index can't be >= getCollisionsCount()");
            return instance.collisionAt(idx).toJAVARuntime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    public SpatialObject getObject(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.gameObject.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public String getTittle(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getTittle();
        //>REMOVE-BRIDGE<
    }
}
