package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"AI"})
public class SimpleEnemyAI extends Component {

    //

    public enum State {
        Idle, Walking, Attacking
    }
    //
    
    public SimpleEnemyAI() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getAttackDelay(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getRayDistance(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getRayOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getRunSpeed(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getStartAttackDistance(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public State getState(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getStickBottomOffset(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSwapTargetDelay(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public float getSwapTargetDistance(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public SpatialObject getTarget(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public float getWalkSpeed(){
        //
        return 0;
        //

        //
    }

    public boolean isStickBottom(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs("value")
    public void setAttackDelay(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setRayDistance(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setRayOffset(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setRunSpeed(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setStartAttackDistance(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setStickBottom(boolean value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setStickBottomOffset(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setSwapTargetDelay(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setSwapTargetDistance(float value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setTarget(SpatialObject value){
        //
    }

    @HideGetSet
    @MethodArgs(value ={"value"})
    public void setWalkSpeed(float value){
        //
    }
}