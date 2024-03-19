package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Engines.Engine.Time;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat = {"Math"})
public final class Math {
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

    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Math() { }

    /// Abstracts
    public static float bySecond(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Time.getScaledDeltaTime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float bySecond(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value * Time.getScaledDeltaTime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"angle"})
    public static float sin(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.sin(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle"})
    public static float cos(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.cos(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle"})
    public static float tan(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.tan(angle);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"angle"})
    public static float asin(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.asin(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle"})
    public static float acos(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.acos(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle"})
    public static float atan(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.atan(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public static float atan2(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.atan2(x, y);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"rad"})
    public static float sinRad(float rad){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.sinRad(rad);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"rad"})
    public static float cosRad(float rad){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.cosRad(rad);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"rad"})
    public static float tanRad(float rad){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.tanRad(rad);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public static float atan2Rad(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.atan2Rad(x, y);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"angle"})
    public static float asinRad(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.asinRad(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"angle"})
    public static float acosRad(float angle){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.acosRad(angle);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"rad"})
    public static float atanRad(float rad){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.atanRad(rad);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float sqrt(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.sqrt(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float cbrt(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.cbrt(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","b"})
    public static float pow(float value, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.pow(value, b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float abs(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.abs(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static int abs(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.abs(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static double abs(double value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.abs(value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float ceil(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.ceil(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float floor(float v){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float)java.lang.Math.floor(v);
        //int xi = (int)v;
        //return v<xi ? xi-1 : xi;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float round(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.round(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float exp(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.exp(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float log(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.log(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float log10(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.log10(value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float toRadians(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) Mathf.toRadians(value);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float toDegrees(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.toDegrees(value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static int dptopx(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.dpToPx(value, Main.getActivity());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","deadZone"})
    public static float deadzone(float value, float deadzone){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.deadzone(value, deadzone);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","deadZone"})
    public static boolean isOnDeadzone(float value, float deadzone){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.isOnDeadzone(value, deadzone);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"min","value","max"})
    public static float clamp(float min, float value, float max){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.clamp(min, value, max);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"min","value"})
    public static float clamp(float min, float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.clampMin(min, value);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value","target","speed"})
    public static float lerp(float value, float target, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.lerp(value, target, speed);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value","target","speed"})
    public static float lerpInSeconds(float value, float target, float speed){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        float deltaTime = Time.getScaledDeltaTime();
        deltaTime = Mathf.clamp(0, deltaTime, 0.1f);
        return Mathf.lerp(value, target, speed * deltaTime);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static boolean negative(boolean value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return !value;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float negative(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return -value;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static int negative(int value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return -value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float inverseSQRT(float x) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        float xhalf = 0.5f * x;
        int i = Float.floatToIntBits(x);
        i = 0x5f3759df - (i >> 1);
        x = Float.intBitsToFloat(i);
        x *= (1.5f - xhalf * x * x);
        return x;
        //>REMOVE-BRIDGE<
    }

    /**
     * Support only values between 0-360
     * value = 0-360
     * target = 0-360
     */
    @MethodArgs(args ={"value","target","progress"})
    public static float lerpAngle(float value, float target, float progress){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        progress = Mathf.clamp(0, progress, 1);
        float radValue = toRadians(clampAngleTo360(value));
        float radTarget = toRadians(clampAngleTo360(target));
        float delta = ((radTarget - radValue + PI2 + PI) % PI2) - PI;
        return toDegrees((radValue + delta * progress + PI2) % PI2);
        //>REMOVE-BRIDGE<
    }
    /**
     * Support only values between 0-360
     * value = 0-360
     * target = 0-360
     */
    @MethodArgs(args ={"value","target","progress"})
    public static float lerpAngleInSeconds(float value, float target, float progress){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return lerpAngle(value, target, progress * JAVARuntime.Time.deltaTime());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static float clampAngleTo360(float value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(value < 0){
            if(value > -360) {
                return 360 + value;
            } else {
                float div = value / -360f;
                int intValue = (int) div;
                float decimals = div - intValue;
                return 360 - (360 * decimals);
            }
        }
        if(value > 360){
            float div = value / 360f;
            int intValue = (int) div;
            float decimals = div - intValue;
            return 360 * decimals;
        }
        return value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"oldMin","oldMax","value","newMin","newMax"})
    public static float rangeConverter(float oldMin, float oldMax, float value, float newMin, float newMax){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return Mathf.rangeConverter(value, oldMin, oldMax, newMin, newMax);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public static float fixNaN(float v){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(Float.isNaN(v)) return 0f;
        return v;
        //>REMOVE-BRIDGE<
    }
}
