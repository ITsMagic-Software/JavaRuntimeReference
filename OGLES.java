package JAVARuntime;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.List;

@ClassCategory(cat = {"OGL"})
public class OGLES {
  public static final int GL_ZERO = 0;
  public static final int GL_ONE = 1;
  public static final int GL_SRC_COLOR = 0x0300;
  public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
  public static final int GL_SRC_ALPHA = 0x0302;
  public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
  public static final int GL_DST_ALPHA = 0x0304;
  public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
  public static final int GL_DST_COLOR = 0x0306;
  public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
  public static final int GL_SRC_ALPHA_SATURATE = 0x0308;

  public OGLES() {
    throw new RuntimeException("Don't manually spawn ogl instances");
  }

  @MethodArgs({"value"})
  public void setIgnoreAttributeException(boolean value) {}

  @MethodArgs({"shader"})
  public void withShader(Shader shader) {}

  public void releaseShader() {}

  public void disableBlend() {}

  public void enableBlend() {}

  public void setBlend(int a, int b) {}

  public void setNormalBlend() {}

  public void setAdditiveBlend() {}

  public void setSubtractiveBlend() {}

  public void setAdditiveTransparentBlend() {}

  public void setTransparentBlend() {}

  @MethodArgs({"uniform", "matrix"})
  public boolean uniformMatrix3(String uniform, float[] matrix) {

    return false;
  }

  @MethodArgs({"uniform", "matrix"})
  public boolean uniformMatrix4(String uniform, float[] matrix) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector(String uniform, Vector3 vector) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector3(String uniform, Vector3 vector) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y", "z"})
  public boolean uniformVector(String uniform, float x, float y, float z) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y", "z"})
  public boolean uniformVector3(String uniform, float x, float y, float z) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector(String uniform, Vector2 vector) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector2(String uniform, Vector2 vector) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y"})
  public boolean uniformVector(String uniform, float x, float y) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y"})
  public boolean uniformVector2(String uniform, float x, float y) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y", "z", "w"})
  public boolean uniformVector(String uniform, float x, float y, float z, float w) {

    return false;
  }

  @MethodArgs({"uniform", "x", "y", "z", "w"})
  public boolean uniformVector4(String uniform, float x, float y, float z, float w) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector(String uniform, Vector4 vector) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector4(String uniform, Vector4 vector) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector(String uniform, Point3 vector) {

    return false;
  }

  @MethodArgs({"uniform", "vector"})
  public boolean uniformVector(String uniform, Point2 vector) {

    return false;
  }

  @MethodArgs({"uniform", "color"})
  public boolean uniformColor(String uniform, Color color) {

    return false;
  }

  @MethodArgs({"uniform", "r", "g", "b", "a"})
  public boolean uniformColor(String uniform, float r, float g, float b, float a) {

    return false;
  }

  @MethodArgs({"uniform", "color"})
  public boolean uniformColor3(String uniform, Color color) {

    return false;
  }

  @MethodArgs({"uniform", "r", "g", "b", "a"})
  public boolean uniformColor3(String uniform, float r, float g, float b) {

    return false;
  }

  @MethodArgs({"uniform", "x"})
  public void uniformFloat(String uniform, float x) {}

  @MethodArgs({"uniform", "x"})
  public void uniformInt(String uniform, int x) {}

  @MethodArgs({"uniform", "texture"})
  public boolean uniformTexture(String uniform, Texture texture) {

    return false;
  }

  @MethodArgs({"uniform", "texture"})
  public boolean uniformTextureSafe(String uniform, Texture texture) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix4(String attribute, FloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix3(String attribute, FloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeVector4(String attribute, FloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeVector3(String attribute, FloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeVector2(String attribute, FloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeVector4(String attribute, NativeFloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeVector3(String attribute, NativeFloatBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeVector2(String attribute, NativeFloatBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix3(String attribute, NativeFloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix4(String attribute, NativeFloatBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeFloat(String attribute, NativeFloatBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public void attributeVector4(String attribute, NativeShortBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeVector3(String attribute, NativeShortBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeVector2(String attribute, NativeShortBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix3(String attribute, NativeShortBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public void attributeMatrix4(String attribute, NativeShortBuffer buffer) {}

  @MethodArgs({"attribute", "buffer"})
  public boolean attributeFloat(String attribute, NativeShortBuffer buffer) {

    return false;
  }

  @MethodArgs({"attribute"})
  public boolean disableAttributeVector2(String attribute) {

    return false;
  }

  @MethodArgs({"attribute"})
  public boolean disableAttributeVector3(String attribute) {

    return false;
  }

  @MethodArgs({"attribute"})
  public boolean disableAttributeVector4(String attribute) {

    return false;
  }

  @MethodArgs({"attribute", "indices"})
  public void drawTriangles(int[] indices) {}

  @MethodArgs({"attribute", "indices"})
  public void drawTriangles(IntBuffer indices) {}

  @MethodArgs({"attribute", "indices"})
  public void drawTriangles(NativeIntBuffer buffer) {}

  @MethodArgs({"attribute", "indices"})
  public void drawTriangles(NativeShortBuffer buffer) {}

  @MethodArgs({"attribute", "indices"})
  public void drawLines(int[] indices) {}

  @MethodArgs({"attribute", "indices"})
  public void drawLines(IntBuffer indices) {}

  @MethodArgs({"attribute", "buffer"})
  public void drawLines(NativeIntBuffer buffer) {}

  @MethodArgs({"var"})
  public void enable(int var) {}

  @MethodArgs({"var"})
  public void disable(int var) {}

  @MethodArgs({"r", "g", "b", "a"})
  public void clearColor(float r, float g, float b, float a) {}

  @MethodArgs({"color"})
  public void clearColor(Color color) {}

  public void clearColorBuffer() {}

  public void clearDepthBuffer() {}

  public void clearColorDepthBuffer() {}

  public boolean isShaderActive() {

    return false;
  }

  @MethodArgs({"attribute"})
  public boolean hasAttribute(String attribute) {

    return false;
  }

  public void releaseAttributes() {}

  public void releaseTextures() {}
}
