package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Engine.Vector.Vector3;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Matrix4 {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Matrix4 matrix4;
    @IgnoreAutoComplete
    public Matrix4(com.itsmagic.engine.Engines.Engine.Vector.Matrix4 matrix4) {
        this.matrix4 = matrix4;
    }
    //>REMOVE-BRIDGE<

    public Matrix4() {
        //<REMOVE-BRIDGE>
        this.matrix4 = new com.itsmagic.engine.Engines.Engine.Vector.Matrix4();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"array"})
    public Matrix4(float[] array){
        //<REMOVE-BRIDGE>
        this.matrix4 = new com.itsmagic.engine.Engines.Engine.Vector.Matrix4(array);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"m00","m01","m02","m03"
                    ,"m10","m11","m12","m13"
                    ,"m20","m21","m22","m23"
                    ,"m30","m31","m32","m33"})
    public Matrix4(float m00, float m01, float m02, float m03,
                    float m10, float m11, float m12, float m13,
                    float m20, float m21, float m22, float m23,
                    float m30, float m31, float m32, float m33) {
        //<REMOVE-BRIDGE>
        this.matrix4 = new com.itsmagic.engine.Engines.Engine.Vector.Matrix4(m00, m01, m02, m03,
        m10, m11, m12, m13,
        m20, m21, m22, m23,
        m30, m31, m32, m33);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public Matrix4 mul(Matrix4 value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Matrix4(matrix4.mult(value.matrix4));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","out"})
    public void mul(Matrix4 value, Matrix4 out){
        //<REMOVE-BRIDGE>
        matrix4.mult(value.matrix4, out.matrix4);
        //>REMOVE-BRIDGE<
    }

    public Matrix4 inverse(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return new Matrix4(matrix4.invert());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public void inverse(Matrix4 out){
        //<REMOVE-BRIDGE>
        out.matrix4.set(matrix4);
        out.matrix4.invertLocal();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.mult(vector3.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","out"})
    public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.mult(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public JAVARuntime.Vector3 mul(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.mult(x, y, z).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","out"})
    public JAVARuntime.Vector3 mul(float x, float y, float z, JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.mult(x, y, z, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.multNormal(vector3.instance, new Vector3()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","out"})
    public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.multNormal(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.multAcross(vector3.instance, new Vector3()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","out"})
    public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.multAcross(vector3.instance, out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public JAVARuntime.Vector3 getTranslation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toTranslationVector(new Vector3()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Vector3 getTranslation(JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toTranslationVector(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setTranslation(JAVARuntime.Vector3 vector3){
        //<REMOVE-BRIDGE>
        matrix4.setTranslation(vector3.instance.getX(), vector3.instance.getY(), vector3.instance.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setTranslation(float x, float y, float z){
        //<REMOVE-BRIDGE>
        matrix4.setTranslation(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public JAVARuntime.Vector3 getScale(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector(new Vector3()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Vector3 getScale(JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setScale(JAVARuntime.Vector3 vector3){
        //<REMOVE-BRIDGE>
        matrix4.setScale(vector3.instance.getX(), vector3.instance.getY(), vector3.instance.getZ());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z){
        //<REMOVE-BRIDGE>
        matrix4.setScale(x, y, z);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public JAVARuntime.Quaternion getRotation(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toRotationQuat(new com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion()).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Quaternion getRotation(Quaternion out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toRotationQuat(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRotation(JAVARuntime.Quaternion quaternion){
        //<REMOVE-BRIDGE>
        matrix4.setRotationQuaternion(quaternion.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        matrix4.setRotationQuaternion(x, y, z, w);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"array"})
    public void set(float[] array){
        //<REMOVE-BRIDGE>
        matrix4.set(array, false);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"position","rotation","scale"})
    public void setTransform(JAVARuntime.Vector3 position, Quaternion rotation, JAVARuntime.Vector3 scale){
        //<REMOVE-BRIDGE>
        matrix4.setTransform(position.instance,
                scale.instance,
                rotation.instance);
        //>REMOVE-BRIDGE<
    }

    public JAVARuntime.Vector3 toTranslationVector(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Vector3 toTranslationVector(JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public JAVARuntime.Quaternion toRotationQuat(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toRotationQuat().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Quaternion toRotationQuat(Quaternion out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toRotationQuat(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public JAVARuntime.Vector3 toScaleVector(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"out"})
    public JAVARuntime.Vector3 toScaleVector(JAVARuntime.Vector3 out){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix4.toScaleVector(out.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"array"})
    public void fillFloatArray(float[] floatArray){
        //<REMOVE-BRIDGE>
        matrix4.fillFloatArray(floatArray, false);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"array","columnMajor"})
    public void fillFloatArray(float[] floatArray, boolean columnMajor){
        //<REMOVE-BRIDGE>
        matrix4.fillFloatArray(floatArray, columnMajor);
        //>REMOVE-BRIDGE<
    }
}
