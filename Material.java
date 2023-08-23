package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Material"})
public class Material {
    //

    public Material() {
        //
    }

    @HideGetSet
    public String getShader(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"shaderName"})
    public void setShader(String shaderName){
        //
    }



    @MethodArgs(args ={"entryName"})
    public Color getColor(String entryName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"entryName"})
    public Color findColor(String entryName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"entryName","color"})
    public void setColor(String entryName, Color color){
        //
    }

    @MethodArgs(args ={"color"})
    public void setDiffuse(Color color){
        setColor("diffuse", color);
    }

    @MethodArgs(args ={"entryName"})
    public JAVARuntime.Vector2 getVector2(String entryName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"entryName"})
    public JAVARuntime.Vector2 findVector2(String entryName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"entryName","vector2"})
    public void setVector2(String entryName, JAVARuntime.Vector2 vector2){
        //
    }

    @MethodArgs(args ={"entryName"})
    public boolean getBoolean(String entryName){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"entryName"})
    public boolean findBoolean(String entryName){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"entryName","value"})
    public void setBoolean(String entryName, boolean value){
        //
    }

    @MethodArgs(args ={"value"})
    public void setReceiveLight(boolean value){
        setBoolean("receiveLight", value);
    }

    @MethodArgs(args ={"entryName"})
    public float getFloat(String entryName){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"entryName"})
    public float findFloat(String entryName){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"entryName","value"})
    public void setFloat(String entryName, float value){
        //
    }

    @MethodArgs(args ={"value"})
    public void setMinimalAlphaIntensity(float value){
        setFloat("minimalAlphaIntensity", value);
    }

    @MethodArgs(args ={"value"})
    public void setHeightIntensity(float value){
        setFloat("heightIntensity", value);
    }

    @MethodArgs(args ={"value"})
    public void setUvSize(float value){
        setFloat("uvSize", value);
    }

    @MethodArgs(args ={"value"})
    public void setAlphaCutout(float value){
        setFloat("alphaCutout", value);
    }

    @MethodArgs(args ={"value"})
    public void setSpecular(float value){
        setFloat("specular", value);
    }



    @MethodArgs(args ={"entryName"})
    public Texture getTexture(String entryName){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"entryName"})
    public Texture findTexture(String entryName){
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"entryName","texture"})
    public void setTexture(String entryName, Texture texture){
        //
    }
    @MethodArgs(args ={"entryName","textureFile"})
    public void setTextureFile(String entryName, TextureFile textureFile){
        //
    }

    @MethodArgs(args ={"texture"})
    public void setAlbedo(Texture texture){
        setTexture("albedo", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setAlbedo(TextureFile textureFile){
        setTextureFile("albedo", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setNormalMap(Texture texture){
        setTexture("normal", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setNormalMap(TextureFile textureFile){
        setTextureFile("normal", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setRoughness(Texture texture){
        setTexture("roughness", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setRoughness(TextureFile textureFile){
        setTextureFile("roughness", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setMetallic(Texture texture){
        setTexture("metallic", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setMetallic(TextureFile textureFile){
        setTextureFile("metallic", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setAoMap(Texture texture){
        setTexture("ao", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setAoMap(TextureFile textureFile){
        setTextureFile("ao", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setHeightMap(Texture texture){
        setTexture("height", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setHeightMap(TextureFile textureFile){
        setTextureFile("height", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setEmissiveMap(Texture texture){
        setTexture("emissive", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setEmissiveMap(TextureFile textureFile){
        setTextureFile("emissive", textureFile);
    }

    @MethodArgs(args ={"texture"})
    public void setAlphaMap(Texture texture){
        setTexture("alpha", texture);
    }
    @MethodArgs(args ={"textureFile"})
    public void setAlphaMap(TextureFile textureFile){
        setTextureFile("alpha", textureFile);
    }



    public void reloadEntries(){
        //
    }

    public String toJson(){
        //
        return "";
        //

        //
    }

    @MethodArgs(args ={"file"})
    public static Material loadFile(MaterialFile materialFile){
        //
        return null;
        //

        //
    }
}
