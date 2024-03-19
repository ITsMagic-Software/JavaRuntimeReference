package JAVARuntime;

//<REMOVE-BRIDGE>
import android.opengl.Matrix;
import android.os.Build;

import com.itsmagic.engine.Engines.Engine.Vector.Matrix4;
import com.itsmagic.engine.Engines.Utils.Mathematicals.MatrixUtils;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoTransform extends GizmoElement{

    private transient Vector3 position = new Vector3();
    private transient Quaternion rotation = new Quaternion();
    private transient Vector3 scale = new Vector3(1);
    private transient float[] matrix;

    //<REMOVE-BRIDGE>
    public transient final float[] rotMatrix = new float[16];
    private transient Vector3 lastCalculatedPos = new Vector3();
    private transient Quaternion lastCalculatedRot = new Quaternion();
    private transient Vector3 lastCalculatedSca = new Vector3();
    //>REMOVE-BRIDGE<

    public GizmoTransform() { }
    @MethodArgs(args ={"vertex"})
    public GizmoTransform(Vector3 position) {
        this.position = position;
    }
    @MethodArgs(args ={"vertex","rotation"})
    public GizmoTransform(Vector3 position, Quaternion rotation) {
        this.position = position;
        this.rotation = rotation;
    }
    @MethodArgs(args ={"vertex","rotation","scale"})
    public GizmoTransform(Vector3 position, Quaternion rotation, Vector3 scale) {
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    @HideGetSet
    public Vector3 getPosition() {
        return position;
    }
    @HideGetSet
    @MethodArgs(args ={"position"})
    public void setPosition(Vector3 position) {
        //<REMOVE-BRIDGE>
        if(position == null){
            throw new NullPointerException("position can't be null");
        }
        //>REMOVE-BRIDGE<
        this.position = position;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z) {
        this.position.set(x, y, z);
    }
    @MethodArgs(args ={"a"})
    public void setPosition(float a){
        this.position.set(a);
    }

    @HideGetSet
    public Quaternion getRotation() {
        return rotation;
    }
    @HideGetSet
    @MethodArgs(args ={"rotation"})
    public void setRotation(Quaternion rotation) {
        //<REMOVE-BRIDGE>
        if(rotation == null){
            throw new NullPointerException("rotation can't be null");
        }
        //>REMOVE-BRIDGE<
        this.rotation = rotation;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z){
        //<REMOVE-BRIDGE>
        this.rotation.instance.fromEuler(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public void setRotation(float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        this.rotation.instance.set(x, y, z, w);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getScale() {
        return scale;
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(Vector3 scale) {
        //<REMOVE-BRIDGE>
        if(scale == null){
            throw new NullPointerException("scale can't be null");
        }
        //>REMOVE-BRIDGE<
        this.scale = scale;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z) {
        this.scale.set(x, y, z);
    }
    @MethodArgs(args ={"a"})
    public void setScale(float a){
        this.scale.set(a);
    }


    @Override
    @HideGetSet
    public float[] getMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        boolean calculate = true;

        if(lastCalculatedPos.equals(position)){
            if(lastCalculatedSca.equals(scale)){
                if(lastCalculatedRot.equals(rotation)){
                    calculate = false;
                }
            }
        }

        lastCalculatedPos.set(position);
        lastCalculatedRot.set(rotation);
        lastCalculatedSca.set(scale);

        if(matrix == null){ matrix = new float[16]; calculate = true; }

        if(calculate) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                Matrix.setIdentityM(rotMatrix, 0); // initialize to identity matrix
            }
            Matrix.setIdentityM(matrix, 0); // initialize to identity matrix

            Matrix.translateM(matrix, 0, position.getX(), position.getY(), position.getZ());
            MatrixUtils.rotate(matrix, rotMatrix, rotation.instance);
            MatrixUtils.scale(matrix, scale.instance);
        }

        return matrix;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    public float[] getMatrixForCamera(com.itsmagic.engine.Engines.Engine.Vector.Vector3 scale){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            Matrix.setIdentityM(rotMatrix, 0); // initialize to identity matrix
        }
        Matrix.setIdentityM(matrix, 0); // initialize to identity matrix

        Matrix.translateM(matrix, 0, position.getX(), position.getY(), position.getZ());
        MatrixUtils.rotate(matrix, rotMatrix, rotation.instance);
        MatrixUtils.scale(matrix, scale);
        return matrix;
    }
    //>REMOVE-BRIDGE<

    private static final ThreadLocal<Matrix4> ltMat4TL = new ThreadLocal<Matrix4>(){
        protected Matrix4 initialValue() { return new Matrix4(); }
    };

    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setMatrix(float[] matrix) {
        //<REMOVE-BRIDGE>
        Matrix4 matrix4 = ltMat4TL.get();
        matrix4.setCollumMajorQuick(matrix);
        matrix4.toTranslationVector(position.instance);
        matrix4.toRotationQuat(rotation.instance);
        matrix4.toScaleVector(scale.instance);
        //>REMOVE-BRIDGE<
    }
}
