package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Math"})
public class Math {
    /**
     * ITsMagic math class are designed to execute float calculations with degrees
     * alternative functions to radians are available, or instead you can use direct java.lang.Math
     */

    public static final float PI  = 3.141592653f;
    static public final float PI2 = PI * 2;
    public static final float RADIANS = PI / 180;
    public static final int BYTES_IN_FLOAT = (Float.SIZE / Byte.SIZE);
    public static final int BYTES_IN_INT = (Integer.SIZE / Byte.SIZE);
    public static final int BYTES_IN_SHORT = (Short.SIZE / Byte.SIZE);

    //

    private Math() { }

    /// Abstracts
    public static float bySecond(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float bySecond(float value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"angle"})
    public static float sin(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"angle"})
    public static float cos(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"angle"})
    public static float tan(float angle){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"angle"})
    public static float asin(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"angle"})
    public static float acos(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"angle"})
    public static float atan(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y"})
    public static float atan2(float x, float y){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"rad"})
    public static float sinRad(float rad){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"rad"})
    public static float cosRad(float rad){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"rad"})
    public static float tanRad(float rad){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y"})
    public static float atan2Rad(float x, float y){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"angle"})
    public static float asinRad(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"angle"})
    public static float acosRad(float angle){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"rad"})
    public static float atanRad(float rad){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static float sqrt(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float cbrt(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value","b"})
    public static float pow(float value, float b){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static float abs(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static int abs(int value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static double abs(double value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static float ceil(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float floor(float x){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float round(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float exp(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float log(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float log10(float value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static float toRadians(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float toDegrees(float value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static int dptopx(int value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value","deadZone"})
    public static float deadzone(float value, float deadzone){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value","deadZone"})
    public static boolean isOnDeadzone(float value, float deadzone){
        //
        return false;
        //

        //
    }

    @MethodArgs(args={"min","value","max"})
    public static float clamp(float min, float value, float max){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"min","value"})
    public static float clamp(float min, float value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value","target","speed"})
    public static float lerp(float value, float target, float speed){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value","target","speed"})
    public static float lerpInSeconds(float value, float target, float speed){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static boolean negative(boolean value){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float negative(float value){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static int negative(int value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"value"})
    public static float inverseSQRT(float x) {
        //
        return 0;
        //

        //
    }

    /**
     * Support only values between 0-360
     * value = 0-360
     * target = 0-360
     */
    @MethodArgs(args={"value","target","progress"})
    public static float lerpAngle(float value, float target, float progress){
        //
        return 0;
        //

        //
    }
    /**
     * Support only values between 0-360
     * value = 0-360
     * target = 0-360
     */
    @MethodArgs(args={"value","target","progress"})
    public static float lerpAngleInSeconds(float value, float target, float progress){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static float clampAngleTo360(float value){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"oldMin","oldMax","value","newMin","newMax"})
    public static float rangeConverter(float oldMin, float oldMax, float value, float newMin, float newMax){
        //
        return 0;
        //

        //
    }
}
