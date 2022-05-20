package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Texture"})
public class ImmutableTexture extends Texture{

    //

    public ImmutableTexture() {
    }

    public void apply() {
        throw new RuntimeException("Texture is immutable");
    }

    public int getHeight() {
        return super.getHeight();
    }

    @MethodArgs(args={"x","y","color"})
    public void setPixel(int x, int y, Color color) {
        throw new RuntimeException("Texture is immutable");
    }
    @MethodArgs(args={"coord","color"})
    public void setPixel(Vector2 coord, Color color) {
        throw new RuntimeException("Texture is immutable");
    }
}