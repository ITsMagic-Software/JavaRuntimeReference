package JAVARuntime;

//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Prototyping","Components"})
public final class LaserCasting extends Component {

    //

    public LaserCasting() {
        //
        super();
        //

        //
    }

    @HideGetSet
    public float getDistance(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Vector3 getHitFaceNormal(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public SpatialObject getHitObject(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Vector3 getHitPoint(){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public Vector2 getHitUVCoord(){
        //
        return null;
        //

        //
    }

    public boolean isInfinity(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setInfinity(boolean value){
        //
    }


}