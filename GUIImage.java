package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public class GUIImage extends GUIElement {

    private Color color;
    private Texture texture;
    private boolean flipX = false;
    private boolean flipY = false;
    private boolean overrideAlpha = false;
    private float alpha = 1;
    //

    public GUIImage() {
        this.color = new Color();
    }
    @MethodArgs(args ={"texture","x","y","width","height"})
    public GUIImage(Texture texture, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = new Color();
        this.texture = texture;
    }
    @MethodArgs(args ={"color","x","y","width","height"})
    public GUIImage(Color color, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = color;
    }
    @MethodArgs(args ={"color","texture","x","y","width","height"})
    public GUIImage(Color color, Texture texture, int x, int y, int width, int height) {
        super(0, x, y, width, height);
        this.color = color;
        this.texture = texture;
    }
    @MethodArgs(args ={"color","texture","guiRect"})
    public GUIImage(Color color, Texture texture, GUIRect guiRect) {
        super(0, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
        this.color = color;
        this.texture = texture;
    }
    @MethodArgs(args ={"color","texture","x","y","width","height","layer"})
    public GUIImage(Color color, Texture texture, int x, int y, int width, int height, int layer) {
        super(layer, x, y, width, height);
        this.color = color;
        this.texture = texture;
    }
    @MethodArgs(args ={"color","texture","guiRect","layer"})
    public GUIImage(Color color, Texture texture, GUIRect guiRect, int layer) {
        super(layer, guiRect.getX(), guiRect.getY(), guiRect.getWidth(), guiRect.getHeight());
        this.color = color;
        this.texture = texture;
    }

    @HideGetSet
    public boolean isFlipX() {
        return flipX;
    }
    @HideGetSet
    @MethodArgs(args ={"flipX"})
    public void setFlipX(boolean flipX) {
        this.flipX = flipX;
    }

    @HideGetSet
    public boolean isFlipY() {
        return flipY;
    }
    @HideGetSet
    @MethodArgs(args ={"flipY"})
    public void setFlipY(boolean flipY) {
        this.flipY = flipY;
    }

    @HideGetSet
    public Color getColor() {
        return color;
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        if(color == null){
            throw new NullPointerException("color can't be null");
        }
        this.color = color;
    }

    @HideGetSet
    public Texture getTexture() {
        return texture;
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    @HideGetSet
    public boolean isOverrideAlpha() {
        return overrideAlpha;
    }
    @HideGetSet
    @MethodArgs(args ={"overrideAlpha"})
    public void setOverrideAlpha(boolean overrideAlpha) {
        this.overrideAlpha = overrideAlpha;
    }

    @HideGetSet
    public float getAlpha() {
        return alpha;
    }
    @HideGetSet
    @MethodArgs(args ={"alpha"})
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    //

}
