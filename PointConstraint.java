package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Constraint","Components"})
public final class PointConstraint extends Component{
    //

    public PointConstraint() {
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
