package JAVARuntime;

//<REMOVE-BRIDGE>

import com.itsmagic.engine.Activities.Editor.Interface.Objects.PercentageRect;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion;
import com.itsmagic.engine.Engines.Engine.Texture.Manager.TextureManager;
import com.itsmagic.engine.Engines.Graphics.Utils.QuadImage;
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;
//>REMOVE-BRIDGE<


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"GUI"})
public final class GUIImage extends GUIElement {

    private transient Color color;
    private transient Texture texture;
    private transient boolean flipX = false;
    private transient boolean flipY = false;
    private transient boolean overrideAlpha = false;
    private transient float alpha = 1;
    //<REMOVE-BRIDGE>
    private transient float directDrawLayer = 0f;
    public float getDirectDrawLayer() { return directDrawLayer; }
    public void setDirectDrawLayer(float directDrawLayer) {
        if(directDrawLayer > 1 || directDrawLayer < -1){
            throw new IllegalArgumentException("directdrawlayer needs to be -1 < 0 > 1");
        }
        this.directDrawLayer = directDrawLayer;
    }
    //>REMOVE-BRIDGE<

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

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    @MethodArgs(args ={"graphicsEngine","rect"})
    public void drawRender(PercentageRect rect){

        Quaternion rot = null;
        if(getRotation() != null){ rot = getRotation().instance; }
        if(color == null){ color = new Color(); }
        if(texture != null && texture.instance != null && texture.instance.isRenderable()) {
            QuadImage.draw(texture.instance.getID(),
                    color.instance,
                    GraphicsEngine.Utils.shaderManager,
                    getGameViewW(rect),
                    getGameViewH(rect),
                    getGameViewX(rect),
                    getGameViewY(rect),
                    rot,
                    flipX,
                    flipY,
                    overrideAlpha,
                    alpha,
                    -directDrawLayer);
        } else {
            try {
                QuadImage.draw(TextureManager.whiteTexture.getID(),
                        color.instance,
                        GraphicsEngine.Utils.shaderManager,
                        getGameViewW(rect),
                        getGameViewH(rect),
                        getGameViewX(rect),
                        getGameViewY(rect),
                        rot,
                        flipX,
                        flipY,
                        overrideAlpha,
                        alpha,
                        -directDrawLayer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //>REMOVE-BRIDGE<

}
