package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

import java.util.LinkedList;
import java.util.List;
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"AI","Components"})
public final class PathFinder extends Component{
    public enum LookTo{
        Disabled, Path, Target
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder component;
    @IgnoreAutoComplete
    public PathFinder(com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public PathFinder() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder(true));
        //>REMOVE-BRIDGE<
    }

    public Vector3 findNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public Vector3 getNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public int findNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }
    public int getNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getFindNearestPoint(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Vector.Vector3 near = component.findNearestPoint();
        if(near != null) {
            return near.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getFindNearestPointIndex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.findNearestIndex();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getTarget(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(component.target != null) {
            return component.target.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"object"})
    public void setTarget(SpatialObject object){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(object != null) {
            component.setTarget(object.instance.get());
        } else {
            component.setTarget(null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public LookTo getLookTo(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (component.look) {
            case Disabled:
                return LookTo.Disabled;
            case Path:
                return LookTo.Path;
            case Target:
                return LookTo.Target;
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"lookTo"})
    public void setLookTo(LookTo lookToo){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (lookToo) {
            case Disabled:
                component.look = com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder.Look.Disabled;
                break;
            case Path:
                component.look = com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder.Look.Path;
                break;
            case Target:
                component.look = com.itsmagic.engine.Engines.Engine.ComponentsV2.PathFinder.PathFinder.Look.Target;
                break;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getSearchDelay(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.searchDelay;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSearchDelay(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.searchDelay = value;
        //>REMOVE-BRIDGE<
    }

    public float getTargetDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getTargetDistance();
        //>REMOVE-BRIDGE<
    }
    public float getTargetDistanceInPath(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getTargetPathDistance();
        //>REMOVE-BRIDGE<
    }

    public void forceSearch(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(!hasTarget()){
            throw new NullPointerException("PathFinder doesn't have a target object, check using PathFinder.hasTarget()");
        }
        component.forceSearch();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public List<Vector3> getPath(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        List<Vector3> path = new LinkedList<>();
        if(component.currentPath != null){
            for (int i = 0; i < component.currentPath.pointCount(); i++) {
                path.add(component.currentPath.pointAt(i).toJAVARuntime());
            }
        } else {
            throw new NullPointerException("PathFinder doesn't have a active path! check using PathFinder.hasPath()");
        }
        return path;
        //>REMOVE-BRIDGE<
    }
    public boolean hasPath(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.hasPath();
        //>REMOVE-BRIDGE<
    }
    public boolean hasTarget(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.hasTarget();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, PathFinder.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
