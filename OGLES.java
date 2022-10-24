package JAVARuntime;

//
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat ={"OGL"})
public class OGLES {
    //

    public OGLES(){
        throw new RuntimeException("Don't manully spawn ogl instances");
    }

    @MethodArgs(args ={"value"})
    public void setIgnoreAttributeException(boolean value){
        //
    }

    @MethodArgs(args ={"shader"})
    public void withShader(Shader shader){
        //
    }
    public void releaseShader(){
        //
    }

    @MethodArgs(args ={"uniform","matrix"})
    public boolean uniformMatrix3(String uniform, float[] matrix){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","matrix"})
    public boolean uniformMatrix4(String uniform, float[] matrix){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector3 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector3(String uniform, Vector3 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x","y","z"})
    public boolean uniformVector(String uniform, float x, float y, float z){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x","y","z"})
    public boolean uniformVector3(String uniform, float x, float y, float z){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector2 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector2(String uniform, Vector2 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x","y"})
    public boolean uniformVector(String uniform, float x, float y){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x","y"})
    public boolean uniformVector2(String uniform, float x, float y){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"uniform","x","y","z","w"})
    public boolean uniformVector(String uniform, float x, float y, float z, float w){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x","y","z","w"})
    public boolean uniformVector4(String uniform, float x, float y, float z, float w){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector4 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector4(String uniform, Vector4 vector){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Point3 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Point2 vector){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","color"})
    public boolean uniformColor(String uniform, Color color){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","r","g","b","a"})
    public boolean uniformColor(String uniform, float r, float g, float b, float a){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","x"})
    public void uniformFloat(String uniform, float x){
        //
    }
    @MethodArgs(args ={"uniform","x"})
    public void uniformInt(String uniform, int x){
        //
    }
    @MethodArgs(args ={"uniform","texture"})
    public boolean uniformTexture(String uniform, Texture texture){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"uniform","texture"})
    public boolean uniformTextureSafe(String uniform, Texture texture){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix4(String attribute, FloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix3(String attribute, FloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector4(String attribute, FloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector3(String attribute, FloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector2(String attribute, FloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector4(String attribute, NativeFloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeVector3(String attribute, NativeFloatBuffer buffer){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeVector2(String attribute, NativeFloatBuffer buffer){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix3(String attribute, NativeFloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix4(String attribute, NativeFloatBuffer buffer){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeFloat(String attribute, NativeFloatBuffer buffer){
        //
        return false;
        //

        //
    }

    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(int[] indices){
        //
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(IntBuffer indices){
        //
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(NativeIntBuffer buffer){
        //
    }

    @MethodArgs(args ={"attribute","indices"})
    public void drawLines(int[] indices){
        //
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawLines(IntBuffer indices){
        //
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void drawLines(NativeIntBuffer buffer){
        //
    }

    @MethodArgs(args ={"var"})
    public void enable(int var){
        //
    }
    @MethodArgs(args ={"var"})
    public void disable(int var){
        //
    }

    @MethodArgs(args ={"r","g","b","a"})
    public void clearColor(float r, float g, float b, float a){
        //
    }
    @MethodArgs(args ={"color"})
    public void clearColor(Color color){
        //
    }
    public void clearColorBuffer(){
        //
    }
    public void clearDepthBuffer(){
        //
    }
    public void clearColorDepthBuffer(){
        //
    }

    public boolean isShaderActive(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args ={"attribute"})
    public boolean hasAttribute(String attribute){
        //
        return false;
        //

        //
    }

    public void releaseAttributes(){
        //
    }
    public void releaseTextures(){
        //
    }

    //
}
