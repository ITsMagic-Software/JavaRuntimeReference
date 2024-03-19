package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.ObjectUtils;
import com.itsmagic.engine.Engines.Engine.Time;
import com.itsmagic.engine.Engines.Utils.Mathematicals.MatrixUtils;
import com.itsmagic.engine.Engines.Utils.NaNFixer;
import org.jme3.math.Matrix4f;
import org.jme3.math.Vector3f;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Object"})
public final class Transform{
    public static final int STATE_DYNAMIC = 0;
    public static final int STATE_STATIC = 1;

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform transform;
    @IgnoreAutoComplete
    public Transform(com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform transform) {
        this.transform = transform;
    }
    //>REMOVE-BRIDGE<

    public Transform() {
        //<REMOVE-BRIDGE>
        this.transform = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return transform.getPositionObserver().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setPosition(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector == null){
            throw new NullPointerException("The vector can't be null");
        }
        vector.instance.fixNan();
        transform.setPosition(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setPosition(NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"v"})
    public void setPositionX(float v){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setPositionX(NaNFixer.fix(v));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"v"})
    public void setPositionY(float v){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setPositionY(NaNFixer.fix(v));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"v"})
    public void setPositionZ(float v){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setPositionZ(NaNFixer.fix(v));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Quaternion getRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return transform.getRotationObserver().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"quaternion"})
    public void setRotation(Quaternion quaternion){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(quaternion == null){
            throw new NullPointerException("The quaternion can't be null");
        }
        quaternion.instance.fixQuaternion();
        transform.setRotation(quaternion.instance);
        //>REMOVE-BRIDGE<
    }

    // Set rotation from angles in degrees
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.getRotation().fromEuler(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"w","x","y","z"})
    public void setRotation(float w, float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Quaternion quaternion = new Quaternion();
        quaternion.instance.set(NaNFixer.fix(w), NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        quaternion.instance.fixQuaternion();
        transform.setRotation(quaternion.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return transform.getScaleObserver().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setScale(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector == null){
            throw new NullPointerException("The vector can't be null");
        }
        vector.instance.fixNan();
        transform.setScale(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setScale(NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"all"})
    public void setScale(float a){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.setScale(NaNFixer.fix(a));
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getGlobalPosition() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.getGlobalPosition().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 getGlobalPosition(Vector3 out) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("Out can't be null");
        }
        return transform.getGlobalPosition(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Quaternion getGlobalRotation() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.getGlobalRotation().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Quaternion getGlobalRotation(Quaternion out) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("Out can't be null");
        }
        return transform.getGlobalRotation(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Vector3 getGlobalScale() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.getGlobalScale().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 getGlobalScale(Vector3 out) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("Out can't be null");
        }
        return transform.getGlobalScale(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }


    @MethodArgs(args ={"x","y","z"})
    public void translate(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void move(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotate(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x), NaNFixer.fix(y), NaNFixer.fix(z));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, int y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(float x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void translateInSeconds(int x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, int y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(float x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void moveInSeconds(int x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.translate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, int y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, int y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(float x, float y, int z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void rotateInSeconds(int x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.rotate(NaNFixer.fix(x * Time.getScaledDeltaTime()), NaNFixer.fix(y * Time.getScaledDeltaTime()), NaNFixer.fix(z * Time.getScaledDeltaTime()));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public void lookTo(SpatialObject object){
        //<REMOVE-BRIDGE>
        lookTo(object.getTransform().getGlobalPosition());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position"})
    public void lookTo(Vector3 position){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(position == null){
            throw new NullPointerException("The vector can't be null");
        }
        position.instance.fixNan();
        transform.lookTo(position.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void lookTo(float x, float y, float z){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.lookTo(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"object"})
    public void lookToIgnoreY(SpatialObject object){
        //<REMOVE-BRIDGE>
        lookToIgnoreY(object.getTransform().getGlobalPosition());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position"})
    public void lookToIgnoreY(Vector3 position){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(position == null){
            throw new NullPointerException("The vector can't be null");
        }
        position.instance.fixNan();
        transform.lookToIgnoreY(position.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"object"})
    public void teleportTo(SpatialObject object){
        //<REMOVE-BRIDGE>
        teleportTo(object.getTransform().getGlobalPosition());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position"})
    public void teleportTo(Vector3 position){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(position == null){
            throw new NullPointerException("The vector can't be null");
        }
        position.instance.fixNan();
        transform.setPosition(position.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookTo(SpatialObject other, float lerpSpeed){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null) throw new NullPointerException("Other object can't be null");
        lerpLookTo(other.instance.get().getTransform().getGlobalPosition().toJAVARuntime(), lerpSpeed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookTo(Vector3 other, float lerpSpeed){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null) throw new NullPointerException("Other object can't be null");
        if(ObjectUtils.notGarbage(transform.getGameObject())) {
            transform.lerpLookTo(other.instance, lerpSpeed);
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"other","lerpSpeed"})
    public void lerpLookToIgnoreY(SpatialObject other, float lerpSpeed){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null) throw new NullPointerException("Other object can't be null");
        lerpLookToIgnoreY(other.instance.get().getTransform().getGlobalPosition().toJAVARuntime(), lerpSpeed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"position","lerpSpeed"})
    public void lerpLookToIgnoreY(Vector3 other, float lerpSpeed){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null) throw new NullPointerException("Other object can't be null");
        if(ObjectUtils.notGarbage(transform.getGameObject())) {
            Vector3 myPos = transform.getGameObject().getTransform().getGlobalPosition().toJAVARuntime();
            myPos.setY(0);

            Vector3 otherPos = other;
            otherPos.setY(0);

            com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion myRot = transform.getRotation();
            com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion rot = new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion();
            rot.lookToLocal(myPos.instance, otherPos.instance);
            myRot.blendLocal(rot, lerpSpeed);
            transform.setRotation(myRot);
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformPoint(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        return transform.transformPoint(vector3.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformPoint(Vector3 vector3, Vector3 out){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        transform.transformPoint(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformPoint(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        return transform.inverseTransformPoint(vector3.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformPoint(Vector3 vector3, Vector3 out){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        transform.inverseTransformPoint(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 transformDirection(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        return transform.transformDirection(vector3.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector3","out"})
    public void transformDirection(Vector3 vector3, Vector3 out){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        transform.transformDirection(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector3"})
    public Vector3 inverseTransformDirection(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        return transform.inverseTransformDirection(vector3.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector3","out"})
    public void inverseTransformDirection(Vector3 vector3, Vector3 out){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(vector3 == null){
            throw new NullPointerException("vector can't be null");
        }
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        transform.inverseTransformDirection(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    public Vector3 forward(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.forward().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 back(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.back().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 right(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.right().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 left(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.left().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 up(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.up().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public Vector3 down(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.down().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"out"})
    public Vector3 forward(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.forward(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public Vector3 back(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.back(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public Vector3 right(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.right(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public Vector3 left(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.left(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public Vector3 up(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.up(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public Vector3 down(Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(out == null){
            throw new NullPointerException("out vector can't be null");
        }
        return transform.down(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"other"})
    public float globalDistance(SpatialObject other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalDistance(other.instance.get());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float globalDistance(Transform other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalDistance(other.transform);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float globalDistance(Vector3 other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalDistance(other.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(SpatialObject other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalSqrtDistance(other.instance.get());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(Transform other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalSqrtDistance(other.transform);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"other"})
    public float globalSqrtDistance(Vector3 other) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(other == null){
            throw new NullPointerException("other can't be null");
        }
        return transform.globalSqrtDistance(other.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isStatic(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return transform.isStaticOrForced();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setStatic(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value) {
            transform.setState(com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform.State.STATIC);
        } else {
            transform.setState(com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform.State.DYNAMIC);
        }
        //>REMOVE-BRIDGE<
    }

    public int getState(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (transform.getState()) {
            case DYNAMIC:
                return STATE_DYNAMIC;
            case STATIC:
                return STATE_STATIC;
            default:
                throw new InvalidStateException("invalid state " + transform.getState());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"state"})
    public void setState(int state){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        switch (state) {
            case STATE_DYNAMIC:
                transform.setState(com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform.State.DYNAMIC);
                break;
            case STATE_STATIC:
                transform.setState(com.itsmagic.engine.Engines.Engine.ObjectOriented.Transform.Transform.State.STATIC);
                break;
            default:
                throw new InvalidStateException(state + " is not a valid state");
        }
        //>REMOVE-BRIDGE<
    }

    public float[] getGlobalMatrix() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return MatrixUtils.cloneMatrix(transform.getGlobalMatrix(new float[16]));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public float[] getGlobalMatrix(float[] out) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return MatrixUtils.cloneMatrix(transform.getGlobalMatrix(out));
        //>REMOVE-BRIDGE<
    }
    public float[] getLocalMatrix() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return MatrixUtils.cloneMatrix(transform.getLocalMatrix(new float[16]));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public float[] getLocalMatrix(float[] out) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return MatrixUtils.cloneMatrix(transform.getLocalMatrix(out));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"vector"})
    public Vector3 mulGlobalVector3(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Matrix4f matrix4f = new Matrix4f(getGlobalMatrix());
        Vector3f vector3f = matrix4f.mult(vector3.instance.toVector3fJME());
        return new Vector3(vector3f.x, vector3f.y, vector3f.z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"vector"})
    public Vector3 mulLocalVector3(Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Matrix4f matrix4f = new Matrix4f(getLocalMatrix());
        Vector3f vector3f = matrix4f.mult(vector3.instance.toVector3fJME());
        return new Vector3(vector3f.x, vector3f.y, vector3f.z);
        //>REMOVE-BRIDGE<
    }

    public void recalculateMatrices(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        transform.recalculateGlobalMatrixImmediate();
        //>REMOVE-BRIDGE<
    }
}
