package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"AI","Components"})
public class RouteFollower extends Component{
    //

    public RouteFollower() {
        //
        super();
        //

        //
    }

    public Vector3 findNearestPoint(){
        //
        return null;
        //

        //
    }
    public Vector3 getNearestPoint(){
        //
        return null;
        //

        //
    }
    public int findNearestPointIndex(){
        //
        return 0;
        //

        //
    }
    public int getNearestPointIndex(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Vector3 getFindNearestPoint(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    public int getFindNearestPointIndex(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public Route getRoute(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"route"})
    public void setRoute(Route object){
        //
    }

    public boolean hasPath(){
        //
        return false;
        //

        //
    }
    public boolean isPathFinished(){
        //
        return false;
        //

        //
    }

    //
}
