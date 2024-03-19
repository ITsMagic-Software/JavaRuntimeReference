package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Interface.Objects.PercentageRect;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.TextRender.Font;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public final class GUIText extends GUIElement {
    public enum Alignment{
        TopLeft, TopCenter, TopRight,
        MiddleLeft, MiddleCenter, MiddleRight,
        BottomLeft, BottomCenter, BottomRight
    }

    private transient Color color;
    private transient String text;
    private transient Font font;
    private transient float scale = 1f;
    private transient Alignment alignment = Alignment.TopLeft;

    public GUIText() {
        this.color = new Color();
    }
    @MethodArgs(args ={"text","x","y","width","height"})
    public GUIText(String text, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = new Color();
        this.text = text;
    }
    @MethodArgs(args ={"text","font","x","y","width","height"})
    public GUIText(String text, Font font, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = new Color();
        this.text = text;
        this.font = font;
    }
    @MethodArgs(args ={"text","font","x","y","width","height","alignment"})
    public GUIText(String text, Font font, int x, int y, int width, int height, Alignment alignment) {
        super(0, x, y, width, height);
        this.color = new Color();
        this.text = text;
        this.font = font;
        this.alignment = alignment;
    }
    @MethodArgs(args ={"text","font","x","y","width","height","alignment","scale"})
    public GUIText(String text, Font font, int x, int y, int width, int height, Alignment alignment, float scale) {
        super(0, x, y, width, height);
        this.color = new Color();
        this.text = text;
        this.font = font;
        this.alignment = alignment;
        this.scale = scale;
    }
    @MethodArgs(args ={"color","text","font","x","y","width","height","alignment","scale"})
    public GUIText(Color color, String text, Font font, int x, int y, int width, int height, Alignment alignment, float scale) {
        super(0, x, y, width, height);
        this.color = color;
        this.text = text;
        this.font = font;
        this.alignment = alignment;
        this.scale = scale;
    }
    @MethodArgs(args ={"color","text","x","y","width","height"})
    public GUIText(Color color, String text, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = color;
        this.text = text;
    }
    @MethodArgs(args ={"color","text","guiRect"})
    public GUIText(Color color, String text, GUIRect guiRect) {
        super(0, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
        this.color = color;
        this.text = text;
    }
    @MethodArgs(args ={"color","text","x","y","width","height","layer"})
    public GUIText(Color color, String text, int x, int y, int width, int height, int layer) {
        super(layer, x, y, width, height);
        this.color = color;
        this.text = text;
    }
    @MethodArgs(args ={"color","text","guiRect","layer"})
    public GUIText(Color color, String text, GUIRect guiRect, int layer) {
        super(layer, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
        this.color = color;
        this.text = text;
    }

    @HideGetSet
    public Color getColor() {
        return color;
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    @HideGetSet
    public float getScale() {
        return scale;
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(float scale) {
        this.scale = scale;
    }

    @HideGetSet
    public Alignment getAlignment() {
        return alignment;
    }
    @HideGetSet
    @MethodArgs(args ={"alignment"})
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    @HideGetSet
    public String getText() {
        return text;
    }
    @HideGetSet
    @MethodArgs(args ={"text"})
    public void setText(String text) {
        this.text = text;
    }

    @HideGetSet
    public Font getFont() {
        return font;
    }
    @HideGetSet
    @MethodArgs(args ={"font"})
    public void setFont(Font font) {
        this.font = font;
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    @MethodArgs(args ={"graphicsEngine","rect"})
    public void drawRender(PercentageRect rect){
        throw new RuntimeException("GUIText can't be drawed by image!");
    }
    //>REMOVE-BRIDGE<
}
