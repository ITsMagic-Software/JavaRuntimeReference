package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Creates a square brush
 */
@ClassCategory(cat={"Brush"})
public class SquareBrush implements Brush{
    /**
     *  get the intensity of this brush, based on the coordinates 0f - 1f
     *  return the intensity from 0f - 1f
     */
    //
    @MethodArgs(args={"x","y"})
    public float getIntensity(float x, float y){
        return 1f;
    }
}
