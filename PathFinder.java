package JAVARuntime;

//

import java.util.LinkedList;
import java.util.List;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Components"})
public class PathFinder extends Component{
    public enum LookTo{
        Disabled, Path, Target
    }

    //

    public PathFinder() {
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
    public SpatialObject getTarget(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTarget(SpatialObject object){
        //
    }

    @HideGetSet
    public LookTo getLookTo(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"lookTo"})
    public void setLookTo(LookTo lookToo){
        //
    }

    @HideGetSet
    public float getSearchDelay(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSearchDelay(float value){
        //
    }

    public float getTargetDistance(){
        //
        return 0;
        //

        //
    }
    public float getTargetDistanceInPath(){
        //
        return 0;
        //

        //
    }

    public void forceSearch(){
        //
    }

    @HideGetSet
    public List<Vector3> getPath(){
        //
        return null;
        //

        //
    }
    public boolean hasPath(){
        //
        return false;
        //

        //
    }
    public boolean hasTarget(){
        //
        return false;
        //

        //
    }

    //
}
