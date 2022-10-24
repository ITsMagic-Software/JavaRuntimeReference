package JAVARuntime;

public interface CustomLightShadowViewCalculator {
    @MethodArgs(args ={"camera","light","outTargetPosition", "outForwardPosition","outUpDirection"})
    void calculate(Camera camera, Light light, Vector3 outTargetPosition, Vector3 outForwardDirection, Vector3 outUpDirection);
}
