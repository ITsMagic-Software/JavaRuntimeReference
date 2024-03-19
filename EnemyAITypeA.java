package JAVARuntime;

//<REMOVE-BRIDGE>
import com.android.tools.r8.internal.Id;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"AI","Components"})
public final class EnemyAITypeA extends Component {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA instance;
    @IgnoreAutoComplete
    public EnemyAITypeA(com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA instance) {
        super(instance);
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public EnemyAITypeA(Engine engine){}
    //>REMOVE-BRIDGE<

    public EnemyAITypeA() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA());
        //>REMOVE-BRIDGE<
    }

    public enum MovementMode {
        Transform, RigidBody, CharacterBody
    }
    //<REMOVE-BRIDGE>
    private static MovementMode ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.MovementMode un){
        return MovementMode.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.MovementMode ENUMCONVERT(MovementMode un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.MovementMode.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    public enum State {
        Idle, Walking, Attacking
    }
    //<REMOVE-BRIDGE>
    private static State ENUMCONVERT(com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.State un){
        return State.valueOf(un.toString());
    }
    private static com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.State ENUMCONVERT(State un){
        return com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.EnemyAITypeA.State.valueOf(un.toString());
    }
    //>REMOVE-BRIDGE<

    @HideGetSet
    public TagEnemyFieldOfView getFieldOfView(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ComponentsV2.AIs.TagEnemyFieldOfView returnValue = instance.getFieldOfView();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public MovementMode getMovementMode(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getMovementMode());
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMovementMode(MovementMode value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setMovementMode( ENUMCONVERT(value));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getPoints(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.GameObject returnValue = instance.getPoints();
        if(returnValue != null) return returnValue.toJAVARuntime();
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setPoints(SpatialObject value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null) throw new NullPointerException("value can't be null");

        instance.setPoints( value.instance.get());
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRayDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRayDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRayDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRayDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRayOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRayOffset();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRayOffset(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRayOffset( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getRunSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRunSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRunSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setRunSpeed( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStickBottomOffset(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getStickBottomOffset();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStickBottomOffset(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setStickBottomOffset( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSwapTargetDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getSwapTargetDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSwapTargetDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setSwapTargetDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getWalkSpeed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getWalkSpeed();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setWalkSpeed(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setWalkSpeed( value);
        //>REMOVE-BRIDGE<
    }

    public boolean isStickBottom(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isStickBottom();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStickBottom(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();

        instance.setStickBottom( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getStartAttackDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getStartAttackDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStartAttackDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setStartAttackDistance( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getAttackDelay(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getAttackDelay();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setAttackDelay(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setAttackDelay( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSwapTargetDelay(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getSwapTargetDelay();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSwapTargetDelay(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.setSwapTargetDelay( value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public State getState(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return ENUMCONVERT(instance.getState());
        //>REMOVE-BRIDGE<
    }
}