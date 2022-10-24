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
    @MethodArgs(args ={"entryName","pfile"})
    public void setTextureFile(String entryName, TextureFile textureFile){
        //
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
