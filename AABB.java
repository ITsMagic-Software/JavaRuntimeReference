package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Vector"})
public final class AABB {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.AABB instance;
    @IgnoreAutoComplete
    public AABB(com.itsmagic.engine.Engines.Engine.Vector.AABB instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public AABB() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.Vector.AABB());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z", "xn", "yn","zn"})
    public AABB(float x, float y, float z, float xn, float yn, float zn) {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.Vector.AABB(x, y, z, xn, yn, zn, 0, 0, 0));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z", "xn", "yn","zn","cx","cy","cz"})
    public AABB(float x, float y, float z, float xn, float yn, float zn, float cx, float cy, float cz) {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.Vector.AABB(x, y, z, xn, yn, zn, cx, cy, cz));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"min", "max"})
    public AABB(Vector3 min, Vector3 max) {
        this(max.getX(), max.getY(), max.getZ(), min.getX(), min.getY(), min.getZ());
    }
    @MethodArgs(args ={"min", "max"})
    public AABB(Vector3 min, Vector3 center, Vector3 max) {
        this(max.getX(), max.getY(), max.getZ(), min.getX(), min.getY(), min.getZ(), center.getX(), center.getY(), center.getZ());
    }

    @HideGetSet
    public Vector3 getMin(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getMin().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMin(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.xn = value.getX();
        instance.yn = value.getY();
        instance.zn = value.getZ();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getMax(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getMax().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setMax(Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.x = value.getX();
        instance.y = value.getY();
        instance.z = value.getZ();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.x;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.x = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.y;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.y = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.z;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.z = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getXN(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.xn;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setXN(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.xn = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getYN(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.yn;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setYN(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.yn = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getZN(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.zn;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZN(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.zn = value;
        //>REMOVE-BRIDGE<
    }

    public float lengthMax(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.lengthMax();
        //>REMOVE-BRIDGE<
    }
    public float lengthMin(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.lengthMin();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getLengthMax(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.lengthMax();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getLengthMin(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.lengthMin();
        //>REMOVE-BRIDGE<
    }

    public float maxDistanceFromCenter(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getRadius();
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"point"})
    public boolean isInside(Vector3 point) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(point == null) throw new NullPointerException("Point can't be null");
        return instance.isInside(point.instance);
        //>REMOVE-BRIDGE<
    }

    public Vector3 getCenter(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
       return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.getCenter().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public AABB copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new AABB(instance.clone());
        //>REMOVE-BRIDGE<
    }
}
