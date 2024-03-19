package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<


@ClassCategory(cat ={"Physics"})
public final class Rigidbody extends PhysicsEntity {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Rigidbody instance;
    @IgnoreAutoComplete
    public Rigidbody(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Rigidbody physicsController) {
        super(physicsController);
        this.instance = physicsController;
    }
    @IgnoreAutoComplete
    private void getComponent(){
        if(instance == null){
            instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Rigidbody) super.instance;
        }
    }
    //>REMOVE-BRIDGE<

    public Rigidbody() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Rigidbody());
        this.instance = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Rigidbody) super.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isGravityEnabled(){
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
        return instance.useGravity;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"enabled"})
    public void setGravityEnabled(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.useGravity = enabled;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getMass(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.mass;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMass(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.mass = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getFriction(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.friction;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setFriction(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.friction = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLinearDamping(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.linearDamping;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setLinearDamping(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.linearDamping = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getAngularDamping(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        return instance.angularDamping;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAngularDamping(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.angularDamping = value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void addForce(Vector3 vector3){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addForce(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void addForce(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addForce(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"force"})
    public void addForceBySecond(Vector3 force){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        if(force == null) {
            throw new NullPointerException("force can't be null");
        }
        instance.addForce(force.instance.getX() * Time.deltaTime(), force.instance.getY() * Time.deltaTime(), force.instance.getZ() * Time.deltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void addForceBySecond(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addForce(x * Time.deltaTime(), y * Time.deltaTime(), z * Time.deltaTime());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"force", "relativePosition"})
    public void addForce(Vector3 force, Vector3 relativePosition){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        if(force == null) {
            throw new NullPointerException("force can't be null");
        }
        if(relativePosition == null) {
            throw new NullPointerException("relativePosition can't be null");
        }
        instance.addForce(force.instance, relativePosition.instance);
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
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer != null) {
            instance.layerReference.layerGUID = layer.layer.guid;
        } else {
            instance.layerReference.layerGUID = null;
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void addVelocity(Vector3 vector3){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addVelocity(vector3.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void addVelocity(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addVelocity(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void addVelocityBySecond(Vector3 vector3){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addVelocity(vector3.instance.getX() * Time.deltaTime(), vector3.instance.getY() * Time.deltaTime(), vector3.instance.getZ() * Time.deltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void addVelocityBySecond(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.addVelocity(x * Time.deltaTime(), y * Time.deltaTime(), z * Time.deltaTime());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getGravityMultiplier() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getGravityMultiplier().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setGravityMultiplier(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector == null){
            throw new NullPointerException("The vector can't be null");
        }
        vector.instance.fixNan();
        instance.setGravityMultiplier(vector.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getVelocity() {
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
        return instance.getVelocity().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setVelocity(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        instance.setVelocity(vector.instance);
        //>REMOVE-BRIDGE<
    }
}
