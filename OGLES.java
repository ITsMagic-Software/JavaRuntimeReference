package JAVARuntime;

//<REMOVE-BRIDGE>
import android.opengl.GLES20;

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Texture.Manager.TextureManager;
import com.itsmagic.engine.Engines.Graphics.OGL.GL;
import com.itsmagic.engine.Engines.Native.BufferUtils;
import com.itsmagic.engine.Engines.Graphics.RuntimeShading.AttributeSet;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat ={"OGL"})
public class OGLES {
    public static final int GL_ZERO                                    = 0;
    public static final int GL_ONE                                     = 1;
    public static final int GL_SRC_COLOR                               = 0x0300;
    public static final int GL_ONE_MINUS_SRC_COLOR                     = 0x0301;
    public static final int GL_SRC_ALPHA                               = 0x0302;
    public static final int GL_ONE_MINUS_SRC_ALPHA                     = 0x0303;
    public static final int GL_DST_ALPHA                               = 0x0304;
    public static final int GL_ONE_MINUS_DST_ALPHA                     = 0x0305;
    public static final int GL_DST_COLOR                               = 0x0306;
    public static final int GL_ONE_MINUS_DST_COLOR                     = 0x0307;
    public static final int GL_SRC_ALPHA_SATURATE                      = 0x0308;


    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    private transient Shader shader = null;
    @IgnoreAutoComplete
    private transient boolean ignoreAttributeException = false;
    @IgnoreAutoComplete
    private transient int shaderTextureQuantity = 0;

    private transient final List<AttributeSet> attributeSetList = new LinkedList<>();

    @BuildClassConstructor
    public OGLES(Engine engine) { }
    //>REMOVE-BRIDGE<

    public OGLES(){
        throw new RuntimeException("Don't manually spawn ogl instances");
    }

    @MethodArgs(args ={"value"})
    public void setIgnoreAttributeException(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        this.ignoreAttributeException = value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"shader"})
    public void withShader(Shader shader){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        if(this.shader != null){
            throw new ShaderAlreadyAttachedException("Theres a shader already attached, release it first with releaseShader().");
        }
        shader.shader.bind();
        this.shaderTextureQuantity = 0;
        this.shader = shader;
        //>REMOVE-BRIDGE<
    }
    public void releaseShader(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        releaseAttributes();
        GL.glUseProgram(0);
        this.shaderTextureQuantity = 0;
        this.shader = null;
        //>REMOVE-BRIDGE<
    }

    public void disableBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.disableBlend();
        //>REMOVE-BRIDGE<
    }
    public void enableBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.enableBlend();
        //>REMOVE-BRIDGE<
    }

    public void setBlend(int a, int b){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setBlend(a, b);
        //>REMOVE-BRIDGE<
    }

    public void setNormalBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setNormalBlend();
        //>REMOVE-BRIDGE<
    }
    public void setAdditiveBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setAdditiveBlend();
        //>REMOVE-BRIDGE<
    }

    public void setSubtractiveBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setSubtractiveBlend();
        //>REMOVE-BRIDGE<
    }

    public void setAdditiveTransparentBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setAdditiveTransparentBlend();
        //>REMOVE-BRIDGE<
    }
    public void setTransparentBlend(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.setTransparentBlend();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"uniform","matrix"})
    public boolean uniformMatrix3(String uniform, float[] matrix){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateMatrix(matrix, 9)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniformMatrix3fv(loc, 1, false, matrix, 0);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","matrix"})
    public boolean uniformMatrix4(String uniform, float[] matrix){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateMatrix(matrix, 16)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniformMatrix4fv(loc, 1, false, matrix, 0);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector3 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform3f(loc, vector.getX(), vector.getY(), vector.getZ());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector3(String uniform, Vector3 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform3f(loc, vector.getX(), vector.getY(), vector.getZ());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x","y","z"})
    public boolean uniformVector(String uniform, float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform3f(loc, x, y, z);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x","y","z"})
    public boolean uniformVector3(String uniform, float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform3f(loc, x, y, z);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector2 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform2f(loc, vector.getX(), vector.getY());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector2(String uniform, Vector2 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform2f(loc, vector.getX(), vector.getY());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x","y"})
    public boolean uniformVector(String uniform, float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform2f(loc, x, y);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x","y"})
    public boolean uniformVector2(String uniform, float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform2f(loc, x, y);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"uniform","x","y","z","w"})
    public boolean uniformVector(String uniform, float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, x, y, z, w);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x","y","z","w"})
    public boolean uniformVector4(String uniform, float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, x, y, z, w);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Vector4 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, vector.getX(), vector.getY(), vector.getZ(), vector.getW());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector4(String uniform, Vector4 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, vector.getX(), vector.getY(), vector.getZ(), vector.getW());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Point3 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform3f(loc, vector.getX(), vector.getY(), vector.getZ());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","vector"})
    public boolean uniformVector(String uniform, Point2 vector){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVector(vector)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform2f(loc, vector.getX(), vector.getY());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","color"})
    public boolean uniformColor(String uniform, Color color){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateColor(color)){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, color.getFloatRed(), color.getFloatGreen(), color.getFloatBlue(), color.getFloatAlpha());
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","r","g","b","a"})
    public boolean uniformColor(String uniform, float r, float g, float b, float a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform4f(loc, r,g,b,a);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x"})
    public void uniformFloat(String uniform, float x){
        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform1f(loc, x);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","x"})
    public void uniformInt(String uniform, int x){
        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                GL.glUniform1i(loc, x);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","texture"})
    public boolean uniformTexture(String uniform, Texture texture){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                validateTexture(texture);
                GL.glUniform1i(loc, shaderTextureQuantity);
                GL.glActiveTexture(OGLES2.GL_TEXTURE0 + shaderTextureQuantity);
                texture.instance.bind();
                shaderTextureQuantity++;
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"uniform","texture"})
    public boolean uniformTextureSafe(String uniform, Texture texture){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getUniform(uniform);
            if(loc >= 0) {
                try {
                    validateTexture(texture);
                    GL.glUniform1i(loc, shaderTextureQuantity);
                    GL.glActiveTexture(OGLES2.GL_TEXTURE0 + shaderTextureQuantity);
                    texture.instance.bind();
                    shaderTextureQuantity++;
                } catch (RuntimeException e) {
                    GL.glUniform1i(loc, shaderTextureQuantity);
                    GL.glActiveTexture(OGLES2.GL_TEXTURE0 + shaderTextureQuantity);
                    TextureManager.whiteTexture.bind();
                    shaderTextureQuantity++;
                }
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix4(String attribute, FloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateMatrixBuffer(buffer, 16)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                GL.glVertexAttribPointer(
                        loc, 16,
                        GLES20.GL_FLOAT, false,
                        16 * Mathf.BYTES_IN_FLOAT, buffer);
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix3(String attribute, FloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateMatrixBuffer(buffer, 9)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                GL.glVertexAttribPointer(
                        loc, 9,
                        GLES20.GL_FLOAT, false,
                        9 * Mathf.BYTES_IN_FLOAT, buffer);
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector4(String attribute, FloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 4)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                GL.glVertexAttribPointer(
                        loc, 4,
                        GLES20.GL_FLOAT, false,
                        4 * Mathf.BYTES_IN_FLOAT, buffer);
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector3(String attribute, FloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 3)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                GL.glVertexAttribPointer(
                        loc, 3,
                        GLES20.GL_FLOAT, false,
                        3 * Mathf.BYTES_IN_FLOAT, buffer);
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector2(String attribute, FloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 2)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                GL.glVertexAttribPointer(
                        loc, 2,
                        GLES20.GL_FLOAT, false,
                        2 * Mathf.BYTES_IN_FLOAT, buffer);
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeVector4(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 4)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 4,4);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return;
                }
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeVector3(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 3)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 3,3);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return false;
                }
                listAttribute(loc);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeVector2(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate() && validateVectorBuffer(buffer, 2)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 2,2);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return false;
                }
                listAttribute(loc);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix3(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateMatrixBuffer(buffer, 9)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 9,9);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return;
                }
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void attributeMatrix4(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate() && validateMatrixBuffer(buffer, 16)){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 16,16);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return;
                }
                listAttribute(loc);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public boolean attributeFloat(String attribute, NativeFloatBuffer buffer){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()){
            int loc = getAttribute(attribute);
            if(loc >= 0) {
                GL.glEnableVertexAttribArray(loc);
                boolean active = buffer.buffer.setAttribute(loc, 1,1);
                if(!active){
                    GL.glDisableVertexAttribArray(loc);
                    loc = -1;
                    return false;
                }
                listAttribute(loc);
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(int[] indices){
        //<REMOVE-BRIDGE>
        if(validate()){
            IntBuffer intBuffer = BufferUtils.createIntBuffer(indices);
            GL.glDrawElements(GLES20.GL_TRIANGLES, intBuffer.capacity(),
                    GLES20.GL_UNSIGNED_INT, intBuffer);
            Engine.tempDrawCalls++;
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(IntBuffer indices){
        //<REMOVE-BRIDGE>
        if(validate()){
            GL.glDrawElements(GLES20.GL_TRIANGLES, indices.capacity(),
                    GLES20.GL_UNSIGNED_INT, indices);
            Engine.tempDrawCalls++;
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawTriangles(NativeIntBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate()){
            buffer.buffer.drawElements(GLES20.GL_TRIANGLES);
            Engine.tempDrawCalls++;
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"attribute","indices"})
    public void drawLines(int[] indices){
        //<REMOVE-BRIDGE>
        if(validate()){
            IntBuffer intBuffer = BufferUtils.createIntBuffer(indices);
            GL.glDrawElements(GLES20.GL_TRIANGLES, intBuffer.capacity(),
                    GLES20.GL_LINE_LOOP, intBuffer);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","indices"})
    public void drawLines(IntBuffer indices){
        //<REMOVE-BRIDGE>
        if(validate()){
            GL.glDrawElements(GLES20.GL_TRIANGLES, indices.capacity(),
                    GLES20.GL_LINE_LOOP, indices);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute","buffer"})
    public void drawLines(NativeIntBuffer buffer){
        //<REMOVE-BRIDGE>
        if(validate()){
            buffer.buffer.drawElements(GLES20.GL_LINE_LOOP);
            Engine.tempDrawCalls++;
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"var"})
    public void enable(int var){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glEnable(var);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"var"})
    public void disable(int var){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glDisable(var);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"r","g","b","a"})
    public void clearColor(float r, float g, float b, float a){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glClearColor(r, g, b, a);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color"})
    public void clearColor(Color color){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        if(validateColor(color)){
            GL.glClearColor(color.getFloatRed(), color.getFloatGreen(), color.getFloatBlue(), color.getFloatAlpha());
        }
        //>REMOVE-BRIDGE<
    }
    public void clearColorBuffer(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        //>REMOVE-BRIDGE<
    }
    public void clearDepthBuffer(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glClear(GLES20.GL_DEPTH_BUFFER_BIT);
        //>REMOVE-BRIDGE<
    }
    public void clearColorDepthBuffer(){
        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        GL.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
        //>REMOVE-BRIDGE<
    }

    public boolean isShaderActive(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        if(this.shader != null){
            return true;
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"attribute"})
    public boolean hasAttribute(String attribute){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestOpenglEngineThread();
        int att = GL.glGetUniformLocation(shader.getProgram(), attribute);
        if(att >= 0) {
            return true;
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    public void releaseAttributes(){
        //<REMOVE-BRIDGE>
        if(attributeSetList != null && !attributeSetList.isEmpty()) {
            if (validate()) {
                for (int i = 0; i < attributeSetList.size(); i++) {
                    AttributeSet attributeSet = attributeSetList.get(i);
                    if (attributeSet.loc >= 0) {
                        GL.glDisableVertexAttribArray(attributeSet.loc);
                    }
                }
                attributeSetList.clear();
            }
        }
        releaseTextures();
        //>REMOVE-BRIDGE<
    }
    public void releaseTextures(){
        //<REMOVE-BRIDGE>
        //com.itsmagic.engine.Engines.Graphics.OGL.OGLES.glBindTexture(0,0);
        shaderTextureQuantity = 0;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    public int getShaderTextureQuantity() {
        return shaderTextureQuantity;
    }
    public void setShaderTextureQuantity(int shaderTextureQuantity) {
        this.shaderTextureQuantity = shaderTextureQuantity;
    }
    private void listAttribute(int loc) {
        for (int i = 0; i < attributeSetList.size(); i++) {
            AttributeSet att = attributeSetList.get(i);
            if (att.loc == loc) {
                return;
            }
        }

        attributeSetList.add(new AttributeSet(loc));
    }
    public boolean validate(){
        Thread.requestOpenglEngineThread();
        if(this.shader != null){
            return true;
        }
        throw new InvalidStateException("Cant call Opengl methods without a shader attached");
    }

    private boolean validateMatrix(float[] matrix, int size){
        if(matrix != null && matrix.length == size){
            return true;
        }
        throw new InvalidStateException("Matrix must be of size "+size+".");
    }
    private boolean validateVector(Point2 vector){
        if(vector != null){
            return true;
        }
        throw new InvalidStateException("vector cant be null");
    }
    private boolean validateVector(Point3 vector){
        if(vector != null){
            return true;
        }
        throw new InvalidStateException("vector cant be null");
    }
    private boolean validateColor(Color color){
        if(color != null){
            return true;
        }
        throw new InvalidStateException("color cant be null");
    }
    private boolean validateVector(Vector3 vector){
        if(vector != null){
            return true;
        }
        throw new InvalidStateException("vector cant be null");
    }
    private boolean validateVector(Vector4 vector){
        if(vector != null){
            return true;
        }
        throw new InvalidStateException("vector cant be null");
    }
    private boolean validateVector(Vector2 vector){
        if(vector != null){
            return true;
        }
        throw new InvalidStateException("vector cant be null");
    }
    private void validateTexture(Texture texture){
        if(texture == null){
            throw new NullPointerException("texture can't be null");
        }
        if(texture.instance == null){
            throw new NullPointerException("texture can't be null");
        }
        if(!texture.instance.isRenderable()){
            throw new NullPointerException("texture is not renderable.");
        }
    }
    private boolean validateVectorBuffer(NativeFloatBuffer buffer, int size){
        if(buffer != null){
            if(buffer.capacity() == 0){
                return true;
            }
            if((buffer.capacity() % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid buffer, the last vector"+size+" is not complete, every vector"+size+" should add "+size+" elements to buffer");
    }
    private boolean validateVectorBuffer(NativeIntBuffer buffer, int size){
        if(buffer != null){
            if(buffer.capacity() == 0){
                return true;
            }
            if((buffer.capacity() % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid buffer, the last vector"+size+" is not complete, every vector"+size+" should add "+size+" elements to buffer");
    }
    private boolean validateVectorBuffer(FloatBuffer buffer, int size){
        if(buffer != null){
            if(buffer.capacity() == 0){
                return true;
            }
            if((buffer.capacity() % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid buffer, the last vector"+size+" is not complete, every vector"+size+" should add "+size+" elements to buffer");
    }
    private boolean validateMatrixBuffer(NativeFloatBuffer buffer, int size){
        if(buffer != null){
            if(buffer.capacity() == 0){
                return true;
            }
            if((buffer.capacity() % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid buffer, the last matrix"+size+" is not complete, every matrix"+size+" should add "+size+" elements to buffer");
    }
    private boolean validateMatrixBuffer(FloatBuffer buffer, int size){
        if(buffer != null){
            if(buffer.capacity() == 0){
                return true;
            }
            if((buffer.capacity() % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid buffer, the last matrix"+size+" is not complete, every matrix"+size+" should add "+size+" elements to buffer");
    }
    private boolean validateVectorArray(float[] buffer, int size){
        if(buffer != null){
            if(buffer.length == 0){
                return true;
            }
            if((buffer.length % size) == 0){
                return true;
            }
        }
        throw new InvalidStateException("Invalid array, the last vector"+size+" is not complete, every vector"+size+" should add "+size+" elements to array");
    }
    private int getUniform(String uniform){
        int loc = GL.glGetUniformLocation(shader.getProgram(), uniform);
        if(loc < 0 && !ignoreAttributeException) {
            throw new InvalidStateException("invalid uniform " + uniform + ", make sure you have this uniform coded on the shader\nOpengl removes uniforms that were not used in the code, so is it possible that this uniform doesn't exist in the final compiled version of your shader?");
        }
        return loc;
    }
    private int getAttribute(String attribute){
        int loc = GL.glGetAttribLocation(shader.getProgram(), attribute);
        if(loc < 0 && !ignoreAttributeException) {
            throw new InvalidStateException("invalid attribute " + attribute + " return loc " + loc + " with program " + shader.getProgram());
        }
        return loc;
    }
    //>REMOVE-BRIDGE<
}
