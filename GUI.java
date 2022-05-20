package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"GUI"})
public class GUI {
    //

    private GUI() { }

    /// Abstracts
    @MethodArgs(args={"guiElement"})
    public static void draw(GUIElement guiElement){
        //
    }

    @MethodArgs(args={"color","text","x","y","width","height","font"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font){
        //
    }
    @MethodArgs(args={"text","x","y","width","height","font"})
    public static void drawText(String text, int x, int y, int width, int height, Font font){
        //
    }
    @MethodArgs(args={"color","text","x","y","width","height","font","alignment"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment){
        //
    }
    @MethodArgs(args={"color","text","x","y","width","height","font","alignment","scale"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment, float scale){
        //
    }
    @MethodArgs(args={"text","x","y","width","height","font","alignment"})
    public static void drawText(String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment){
        //
    }
    @MethodArgs(args={"color","text","x","y","width","height"})
    public static void drawText(Color color, String text, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"text","x","y","width","height"})
    public static void drawText(String text, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"color","text","x","y","width","height","alignment"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, GUIText.Alignment alignment){
        //
    }
    @MethodArgs(args={"text","x","y","width","height","alignment"})
    public static void drawText(String text, int x, int y, int width, int height, GUIText.Alignment alignment){
        //
    }

    @MethodArgs(args={"texture","x","y","width","height"})
    public static void drawImage(Texture texture, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"texture","x","y","width","height","flipX","flipY"})
    public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY){
        //
    }
    @MethodArgs(args={"texture","x","y","width","height","flipX","flipY","overrideAlpha","alpha"})
    public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha){
        //
    }
    @MethodArgs(args={"color","texture","x","y","width","height"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"color","texture","x","y","width","height","flipX","flipY"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY){
        //
    }
    @MethodArgs(args={"color","texture","x","y","width","height","flipX","flipY","overrideAlpha","alpha"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha){
        //
    }
    @MethodArgs(args={"guiImage"})
    public static void drawImage(GUIImage guiImage){
        //
    }

    @MethodArgs(args={"texture","guiRect"})
    public static void drawImage(Texture texture, GUIRect guiRect){
        //
    }
    @MethodArgs(args={"color","texture","guiRect"})
    public static void drawImage(Color color, Texture texture, GUIRect guiRect){
        //
    }

    @MethodArgs(args={"color","texture","x","y","width","height"})
    public static void editorDrawImage(Texture texture, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"color","texture","x","y","width","height"})
    public static void editorDrawImage(Color color, Texture texture, int x, int y, int width, int height){
        //
    }
    @MethodArgs(args={"guiImage"})
    public static void editorDrawImage(GUIImage guiImage){
        //
    }
}
