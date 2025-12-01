package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Constraint","Components"})
public final class HingeConstraint extends Component{
    //

    public HingeConstraint() {
        //
        super();
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
    @MethodArgs({"object"})
    public void setTarget(SpatialObject object){
        //
    }

    @HideGetSet
    public SpatialObject getPivot(){
        //
        return null;
        //

        //
    }

    //
}
