package JAVARuntime;

//


@ClassCategory(cat ={"Physics"})
public final class Staticbody extends PhysicsEntity{

    //

    public Staticbody() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }
}
