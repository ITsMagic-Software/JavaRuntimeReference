package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Engine.TextRender.FontRenderer2D;
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public final class GUI {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private GUI() { }

    /// Abstracts
    @MethodArgs(args ={"guiElement"})
    public static void draw(GUIElement guiElement){
        //<REMOVE-BRIDGE>
        if(guiElement != null) {
            if(guiElement instanceof GUIText) {
                FontRenderer2D.add((GUIText) guiElement);
            } else {
                GraphicsEngine.Scene.addGUIElement(guiElement);
            }
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"color","text","x","y","width","height"})
    public static void drawText(Color color, String text, int x, int y, int width, int height){
        //<REMOVE-BRIDGE>
        FontRenderer2D.add(new GUIText(color, text, null, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","text","x","y","width","height","font"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font){
        //<REMOVE-BRIDGE>
        if(font != null) {
            FontRenderer2D.add(new GUIText(color, text, font.font, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        } else {
            FontRenderer2D.add(new GUIText(color, text, null, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","x","y","width","height","font"})
    public static void drawText(String text, int x, int y, int width, int height, Font font){
        //<REMOVE-BRIDGE>
        if(font != null) {
            FontRenderer2D.add(new GUIText(text, font.font, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        } else {
            FontRenderer2D.add(new GUIText(text, null, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","text","x","y","width","height","font","alignment"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment){
        //<REMOVE-BRIDGE>
        if(font != null) {
            FontRenderer2D.add(new GUIText(color, text, font.font, x, y, width, height, alignment, 1f));
        } else {
            FontRenderer2D.add(new GUIText(color, text, null, x, y, width, height, alignment, 1f));
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","text","x","y","width","height","font","alignment","scale"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment, float scale){
        //<REMOVE-BRIDGE>
        if(font != null) {
            FontRenderer2D.add(new GUIText(color, text, font.font, x, y, width, height, alignment, scale));
        } else {
            FontRenderer2D.add(new GUIText(color, text, null, x, y, width, height, alignment, scale));
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","x","y","width","height","font","alignment"})
    public static void drawText(String text, int x, int y, int width, int height, Font font, GUIText.Alignment alignment){
        //<REMOVE-BRIDGE>
        if(font != null) {
            FontRenderer2D.add(new GUIText(text, font.font, x, y, width, height, alignment, 1f));
        } else {

        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","x","y","width","height"})
    public static void drawText(String text, int x, int y, int width, int height){
        //<REMOVE-BRIDGE>
        FontRenderer2D.add(new GUIText(text, null, x, y, width, height, GUIText.Alignment.TopLeft, 1f));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","x","y","width","height","scale"})
    public static void drawText(String text, int x, int y, int width, int height, float scale){
        //<REMOVE-BRIDGE>
        FontRenderer2D.add(new GUIText(text, null, x, y, width, height, GUIText.Alignment.TopLeft, scale));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","text","x","y","width","height","alignment"})
    public static void drawText(Color color, String text, int x, int y, int width, int height, GUIText.Alignment alignment){
        //<REMOVE-BRIDGE>
        FontRenderer2D.add(new GUIText(color, text, null, x, y, width, height, alignment, 1f));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","x","y","width","height","alignment"})
    public static void drawText(String text, int x, int y, int width, int height, GUIText.Alignment alignment){
        //<REMOVE-BRIDGE>
        FontRenderer2D.add(new GUIText(text, null, x, y, width, height, alignment, 1f));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"texture","x","y","width","height"})
    public static void drawImage(Texture texture, int x, int y, int width, int height){
        //<REMOVE-BRIDGE>
        GraphicsEngine.Scene.addGUIElement(new GUIImage(texture, x, y, width, height));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"texture","x","y","width","height","flipX","flipY"})
    public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY){
        //<REMOVE-BRIDGE>
        GUIImage guiImage = new GUIImage(texture, x, y, width, height);
        guiImage.setFlipX(flipX);
        guiImage.setFlipY(flipY);
        GraphicsEngine.Scene.addGUIElement(guiImage);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"texture","x","y","width","height","flipX","flipY","overrideAlpha","alpha"})
    public static void drawImage(Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha){
        //<REMOVE-BRIDGE>
        GUIImage guiImage = new GUIImage(texture, x, y, width, height);
        guiImage.setFlipX(flipX);
        guiImage.setFlipY(flipY);
        guiImage.setOverrideAlpha(overrideAlpha);
        guiImage.setAlpha(alpha);
        GraphicsEngine.Scene.addGUIElement(guiImage);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","texture","x","y","width","height"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height){
        //<REMOVE-BRIDGE>
        GraphicsEngine.Scene.addGUIElement(new GUIImage(color, texture, x, y, width, height));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","texture","x","y","width","height","flipX","flipY"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY){
        //<REMOVE-BRIDGE>
        GUIImage guiImage = new GUIImage(color, texture, x, y, width, height);
        guiImage.setFlipX(flipX);
        guiImage.setFlipY(flipY);
        GraphicsEngine.Scene.addGUIElement(guiImage);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","texture","x","y","width","height","flipX","flipY","overrideAlpha","alpha"})
    public static void drawImage(Color color, Texture texture, int x, int y, int width, int height, boolean flipX, boolean flipY, boolean overrideAlpha, float alpha){
        //<REMOVE-BRIDGE>
        GUIImage guiImage = new GUIImage(color, texture, x, y, width, height);
        guiImage.setFlipX(flipX);
        guiImage.setFlipY(flipY);
        guiImage.setOverrideAlpha(overrideAlpha);
        guiImage.setAlpha(alpha);
        GraphicsEngine.Scene.addGUIElement(guiImage);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"guiImage"})
    public static void drawImage(GUIImage guiImage){
        //<REMOVE-BRIDGE>
        if(guiImage != null) {
            GraphicsEngine.Scene.addGUIElement(guiImage);
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"texture","guiRect"})
    public static void drawImage(Texture texture, GUIRect guiRect){
        //<REMOVE-BRIDGE>
        GraphicsEngine.Scene.addGUIElement(new GUIImage(texture, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight()));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"color","texture","guiRect"})
    public static void drawImage(Color color, Texture texture, GUIRect guiRect){
        //<REMOVE-BRIDGE>
        GraphicsEngine.Scene.addGUIElement(new GUIImage(color, texture, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight()));
        //>REMOVE-BRIDGE<
    }
}
