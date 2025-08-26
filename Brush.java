package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) MethodArgs filled by Carlos at 22-04-2022 */
@ClassCategory(cat = {"Brush"})
public interface Brush {
  /** get the intensity of this brush, based on the coordinates 0f - 1f return the intensity from 0f - 1f */
  @MethodArgs({"x", "y"})
  float getIntensity(float x, float y);
}
