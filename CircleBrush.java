package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * Creates a circle brush
 */
@ClassCategory(cat={"Brushs"})
public class CircleBrush implements Brush{

    /**
     *  get the intensity of this brush, based on the coordinates 0f - 1f
     *  return the intensity from 0f - 1f
     */
    //
    @MethodArgs(args={"x","y"})
    public float getIntensity(float x, float y){
        float distance = Math.sqrt((x * x) + (y*y));
        if(distance <= 1f){
            return 1f;
        }
        return 0f;
    }
}
