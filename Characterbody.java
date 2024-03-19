package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Physics"})
public final class Characterbody extends PhysicsEntity{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Characterbody component;
    @IgnoreAutoComplete
    @MethodArgs(args ={"physicsController"})
    public Characterbody(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Characterbody physicsController) {
        super(physicsController);
        this.component = physicsController;
    }
    @IgnoreAutoComplete
    private void getComponent(){
        if(component == null){
            component = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Characterbody) super.instance;
        }
    }
    //>REMOVE-BRIDGE<

    public Characterbody() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        super(new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Characterbody());
        this.component = (com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Characterbody) super.instance;
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
        return component.useGravity;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"enabled"})
    @HideGetSet
    public void setGravityEnabled(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.useGravity = enabled;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isGlobalDirections(){
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
        return component.isGlobalDirections();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"enabled"})
    @HideGetSet
    public void setGlobalDirections(boolean enabled){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setGlobalDirections(enabled);
        //>REMOVE-BRIDGE<
    }

    public boolean isGrounded(){
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
        return component.isGrounded();
        //>REMOVE-BRIDGE<
    }
    public boolean onGround(){
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
        return component.isGrounded();
        //>REMOVE-BRIDGE<
    }
    public boolean canJump(){
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
        return component.canJump();
        //>REMOVE-BRIDGE<
    }
    public void jump(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.jump();
        //>REMOVE-BRIDGE<
    }
    
    @MethodArgs(args ={"x","z"})
    public void setSpeed(float x, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setSideSpeed(x);
        component.setForwardSpeed(z);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getForwardSpeed(){
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
        return component.getForwardSpeed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setForwardSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setForwardSpeed(value);
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getSideSpeed(){
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
        return component.getSideSpeed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setSideSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setSideSpeed(value);
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
        if(component.layerReference.getLayer() != null){
            return component.layerReference.getLayer().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer != null) {
            component.layerReference.layerGUID = layer.layer.guid;
        } else {
            component.layerReference.layerGUID = null;
        }
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
        return component.getGravityMultiplier().toJAVARuntime();
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
        component.setGravityMultiplier(vector.instance);
        //>REMOVE-BRIDGE<
    }

    public void zeroSpeed(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setForwardSpeed(0);
        component.setSideSpeed(0);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getHeight(){
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
        return component.getHeight();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setHeight(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setHeight(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWidth(){
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
        return component.getWidth();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setWidth(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setWidth(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getJumpSpeed(){
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
        return component.getJumpSpeed();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setJumpSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setJumpSpeed(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStepHeight(){
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
        return component.getStepHeight();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    @HideGetSet
    public void setStepHeight(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        getComponent();
        component.setStepHeight(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPhysicsVelocity(){
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
        return component.getOnPhysicsVelocity().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector2 getHorizontalPhysicsVelocity(){
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
        return new Vector2(component.getOnPhysicsVelocity().getX(), component.getOnPhysicsVelocity().getZ());
        //>REMOVE-BRIDGE<
    }
}
