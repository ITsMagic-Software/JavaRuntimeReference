package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Color.ColorINT;
import com.itsmagic.engine.Engines.Engine.Material.MaterialManager;
import com.itsmagic.engine.Engines.Engine.Vector.Vector2;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Material"})
public final class Material {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Material.Material material;
    @IgnoreAutoComplete
    public Material(com.itsmagic.engine.Engines.Engine.Material.Material material) {
        this.material = material;
    }
    //>REMOVE-BRIDGE<

    public Material() {
        //<REMOVE-BRIDGE>
        this.material = new com.itsmagic.engine.Engines.Engine.Material.Material();
        if(Thread.isEngineThread()){
            this.material.updateShader();
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getShader(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.material.getShaderName();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"shaderName"})
    public void setShader(String shaderName){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setShaderName(shaderName);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public <T extends MaterialShader> T getCustomShader(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(material.materialShader == null) return null;
        return (T) material.materialShader.getRuntimeComponent();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"entryName"})
    public Color getColor(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return findColor(entryName);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName"})
    public Color findColor(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        ColorINT color = this.material.findColor(entryName);
        if(color != null) {
            return color.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName","color"})
    public void setColor(String entryName, Color color){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setColor(entryName, color.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"color"})
    public void setDiffuse(Color color){
        setColor("diffuse", color);
    }

    @MethodArgs(args ={"entryName"})
    public JAVARuntime.Vector2 getVector2(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return findVector2(entryName);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName"})
    public JAVARuntime.Vector2 findVector2(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Vector2 color = this.material.findVector2(entryName);
        if(color != null) {
            return color.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName","vector2"})
    public void setVector2(String entryName, JAVARuntime.Vector2 vector2){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setVector2(entryName, vector2.instance);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"entryName"})
    public boolean getBoolean(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return findBoolean(entryName);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName"})
    public boolean findBoolean(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        boolean color = this.material.findBoolean(entryName);
        return color;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName","value"})
    public void setBoolean(String entryName, boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setBoolean(entryName, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void setReceiveLight(boolean value){
        setBoolean("receiveLight", value);
    }

    @MethodArgs(args ={"entryName"})
    public float getFloat(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return findFloat(entryName);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName"})
    public float findFloat(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        float color = this.material.findFloat(entryName);
        return color;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName","value"})
    public void setFloat(String entryName, float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setFloat(entryName, value);
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return findTexture(entryName);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName"})
    public Texture findTexture(String entryName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Texture.TextureInstance texture = this.material.findTexture(entryName);
        if(texture != null) {
            return texture.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"entryName","texture"})
    public void setTexture(String entryName, Texture texture){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setTexture(entryName, texture.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"entryName","textureFile"})
    public void setTextureFile(String entryName, TextureFile textureFile){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.setTextureFile(entryName, textureFile.getFilePath());
        //>REMOVE-BRIDGE<
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
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.material.updateShader();
        //>REMOVE-BRIDGE<
    }

    public String toJson(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.classExporter.getBuilder().toJson(material);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"file"})
    public static Material loadFile(MaterialFile materialFile){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(materialFile == null){ throw new NullPointerException("MaterialFile can't be null"); }

        com.itsmagic.engine.Engines.Engine.Material.Material find = MaterialManager.findMaterial(materialFile.getFilePath());

        if (find != null) {
            return find.toJAVARuntime();
        } else {
            find = MaterialManager.load(materialFile.getFilePath());
            if (find != null) {
                return find.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
}
