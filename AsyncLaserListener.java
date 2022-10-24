package JAVARuntime;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Vertex"})
public interface AsyncLaserListener {
    @MethodArgs(args ={"laserHit"})
    void onFinish(LaserHit laserHit);
}
