package JAVARuntime;

//

//<inspector>
//>inspector<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vector"})
public class Matrix4 {

    //

    public Matrix4() {
        //
    }
    @MethodArgs(args={"array"})
    public Matrix4(float[] array){
        //
    }
    @MethodArgs(args={"m00","m01","m02","m03"
                    ,"m10","m11","m12","m13"
                    ,"m20","m21","m22","m23"
                    ,"m30","m31","m32","m33"})
    public Matrix4(float m00, float m01, float m02, float m03,
                    float m10, float m11, float m12, float m13,
                    float m20, float m21, float m22, float m23,
                    float m30, float m31, float m32, float m33) {
        //
    }

    @MethodArgs(args={"value"})
    public Matrix4 mul(Matrix4 value){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"value"})
    public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value","out"})
    public JAVARuntime.Vector3 mul(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"x","y","z"})
    public JAVARuntime.Vector3 mul(float x, float y, float z){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"x","y","z","out"})
    public JAVARuntime.Vector3 mul(float x, float y, float z, JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"value"})
    public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value","out"})
    public JAVARuntime.Vector3 mulNormal(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"value"})
    public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"value","out"})
    public JAVARuntime.Vector3 mulAcross(JAVARuntime.Vector3 vector3, JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public JAVARuntime.Vector3 getTranslation(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Vector3 getTranslation(JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setTranslation(JAVARuntime.Vector3 vector3){
        //
    }
    @MethodArgs(args={"x","y","z"})
    public void setTranslation(float x, float y, float z){
        //
    }

    @HideGetSet
    public JAVARuntime.Vector3 getScale(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Vector3 getScale(JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setScale(JAVARuntime.Vector3 vector3){
        //
    }
    @MethodArgs(args={"x","y","z"})
    public void setScale(float x, float y, float z){
        //
    }

    @HideGetSet
    public JAVARuntime.Quaternion getRotation(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Quaternion getRotation(Quaternion out){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args={"value"})
    public void setRotation(JAVARuntime.Quaternion quaternion){
        //
    }
    @MethodArgs(args={"x","y","z"})
    public void setRotation(float x, float y, float z, float w){
        //
    }

    @MethodArgs(args={"array"})
    public void set(float[] array){
        //
    }

    @MethodArgs(args={"position","rotation","scale"})
    public void setTransform(JAVARuntime.Vector3 position, Quaternion rotation, JAVARuntime.Vector3 scale){
        //
    }

    public JAVARuntime.Vector3 toTranslationVector(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Vector3 toTranslationVector(JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }
    public JAVARuntime.Quaternion toRotationQuat(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Quaternion toRotationQuat(Quaternion out){
        //
        return null;
        //

        //
    }
    public JAVARuntime.Vector3 toScaleVector(){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"out"})
    public JAVARuntime.Vector3 toScaleVector(JAVARuntime.Vector3 out){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"array"})
    public void fillFloatArray(float[] floatArray){
        //
    }
    @MethodArgs(args={"array","columnMajor"})
    public void fillFloatArray(float[] floatArray, boolean columnMajor){
        //
    }
}
