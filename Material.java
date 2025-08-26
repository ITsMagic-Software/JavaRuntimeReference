package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Material"})
public final class Material {

  public Material() {}

  @HideGetSet
  public String getShader() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"shaderName"})
  public void setShader(String shaderName) {}

  @HideGetSet
  public <T extends CustomShader> T getCustomShader() {

    return null;
  }

  @MethodArgs({"entryName"})
  public Color getColor(String entryName) {

    return null;
  }

  @MethodArgs({"entryName"})
  public Color findColor(String entryName) {

    return null;
  }

  @MethodArgs({"entryName", "color"})
  public void setColor(String entryName, Color color) {}

  @MethodArgs({"color"})
  public void setDiffuse(Color color) {
    setColor("diffuse", color);
  }

  @MethodArgs({"entryName"})
  public JAVARuntime.Vector2 getVector2(String entryName) {

    return null;
  }

  @MethodArgs({"entryName"})
  public JAVARuntime.Vector2 findVector2(String entryName) {

    return null;
  }

  @MethodArgs({"entryName", "vector2"})
  public void setVector2(String entryName, JAVARuntime.Vector2 vector2) {}

  @MethodArgs({"entryName"})
  public boolean getBoolean(String entryName) {

    return false;
  }

  @MethodArgs({"entryName"})
  public boolean findBoolean(String entryName) {

    return false;
  }

  @MethodArgs({"entryName", "value"})
  public void setBoolean(String entryName, boolean value) {}

  @MethodArgs({"value"})
  public void setReceiveLight(boolean value) {
    setBoolean("receiveLight", value);
  }

  @MethodArgs({"entryName"})
  public float getFloat(String entryName) {

    return 0;
  }

  @MethodArgs({"entryName"})
  public float findFloat(String entryName) {

    return 0;
  }

  @MethodArgs({"entryName", "value"})
  public void setFloat(String entryName, float value) {}

  @MethodArgs({"value"})
  public void setMinimalAlphaIntensity(float value) {
    setFloat("minimalAlphaIntensity", value);
  }

  @MethodArgs({"value"})
  public void setHeightIntensity(float value) {
    setFloat("heightIntensity", value);
  }

  @MethodArgs({"value"})
  public void setUvSize(float value) {
    setFloat("uvSize", value);
  }

  @MethodArgs({"value"})
  public void setAlphaCutout(float value) {
    setFloat("alphaCutout", value);
  }

  @MethodArgs({"value"})
  public void setSpecular(float value) {
    setFloat("specular", value);
  }

  @MethodArgs({"entryName"})
  public Texture getTexture(String entryName) {

    return null;
  }

  @MethodArgs({"entryName"})
  public Texture findTexture(String entryName) {

    return null;
  }

  @MethodArgs({"entryName", "texture"})
  public void setTexture(String entryName, Texture texture) {}

  @MethodArgs({"entryName", "textureFile"})
  public void setTextureFile(String entryName, TextureFile textureFile) {}

  @MethodArgs({"texture"})
  public void setAlbedo(Texture texture) {
    setTexture("albedo", texture);
  }

  @MethodArgs({"textureFile"})
  public void setAlbedo(TextureFile textureFile) {
    setTextureFile("albedo", textureFile);
  }

  @MethodArgs({"texture"})
  public void setNormalMap(Texture texture) {
    setTexture("normal", texture);
  }

  @MethodArgs({"textureFile"})
  public void setNormalMap(TextureFile textureFile) {
    setTextureFile("normal", textureFile);
  }

  @MethodArgs({"texture"})
  public void setRoughness(Texture texture) {
    setTexture("roughness", texture);
  }

  @MethodArgs({"textureFile"})
  public void setRoughness(TextureFile textureFile) {
    setTextureFile("roughness", textureFile);
  }

  @MethodArgs({"texture"})
  public void setMetallic(Texture texture) {
    setTexture("metallic", texture);
  }

  @MethodArgs({"textureFile"})
  public void setMetallic(TextureFile textureFile) {
    setTextureFile("metallic", textureFile);
  }

  @MethodArgs({"texture"})
  public void setAoMap(Texture texture) {
    setTexture("ao", texture);
  }

  @MethodArgs({"textureFile"})
  public void setAoMap(TextureFile textureFile) {
    setTextureFile("ao", textureFile);
  }

  @MethodArgs({"texture"})
  public void setHeightMap(Texture texture) {
    setTexture("height", texture);
  }

  @MethodArgs({"textureFile"})
  public void setHeightMap(TextureFile textureFile) {
    setTextureFile("height", textureFile);
  }

  @MethodArgs({"texture"})
  public void setEmissiveMap(Texture texture) {
    setTexture("emissive", texture);
  }

  @MethodArgs({"textureFile"})
  public void setEmissiveMap(TextureFile textureFile) {
    setTextureFile("emissive", textureFile);
  }

  @MethodArgs({"texture"})
  public void setAlphaMap(Texture texture) {
    setTexture("alpha", texture);
  }

  @MethodArgs({"textureFile"})
  public void setAlphaMap(TextureFile textureFile) {
    setTextureFile("alpha", textureFile);
  }

  @MethodArgs({"matcap"})
  public void setMatcap(Matcap matcap) {}

  public void reloadEntries() {}

  public String toJson() {

    return "";
  }

  @MethodArgs({"file"})
  public static Material loadFile(MaterialFile materialFile) {

    return null;
  }
}
