package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Framerate"})
public interface FixedFrameListener {
    @MethodArgs(args={"deltaTime"})
    void repeat(float deltaTime);
}
