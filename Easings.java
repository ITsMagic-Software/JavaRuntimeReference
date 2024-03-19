package JAVARuntime;

//<REMOVE-BRIDGE>
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Math"})
public final class Easings {
    /**
     * Easing functions from easings.net
     */

    private static final float c1 = 1.70158f;
    private static final float c3 = c1 + 1f;
    private static final float c2 = c1 * 1.525f;
    private static final float c4 = (float) ((2 * java.lang.Math.PI) / 3f);
    private static final float c5 = (float) ((2 * java.lang.Math.PI) / 4.5);

    private static final float n1 = 7.5625f;
    private static final float d1 = 2.75f;

    private Easings() { }

    @MethodArgs(args ={"x"})
    public static float easeInSine(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 - java.lang.Math.cos((x * java.lang.Math.PI) / 2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutSine(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) java.lang.Math.sin((x * java.lang.Math.PI) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutSine(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (-(java.lang.Math.cos(java.lang.Math.PI * x) - 1) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInQuad(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x * x;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutQuad(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return 1 - (1 - x) * (1 - x);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutQuad(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x < 0.5 ? 2 * x * x : (float) (1 - java.lang.Math.pow(-2 * x + 2, 2) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInCubic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x * x * x;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutCubic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 - java.lang.Math.pow(1 - x, 3));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutCubic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x < 0.5 ? 4 * x * x * x : (float) (1 - java.lang.Math.pow(-2 * x + 2, 3) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInQuart(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x * x * x * x;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutQuart(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 - java.lang.Math.pow(1 - x, 4));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutQuart(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x < 0.5 ? 8 * x * x * x * x : (float) (1 - java.lang.Math.pow(-2 * x + 2, 4) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInQuint(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x * x * x * x * x;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutQuint(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 - java.lang.Math.pow(1 - x, 5));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutQuint(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x < 0.5 ? 16 * x * x * x * x * x : (float) (1 - java.lang.Math.pow(-2 * x + 2, 5) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInExpo(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x == 0 ? 0 : (float) java.lang.Math.pow(2, 10 * x - 10);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutExpo(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x == 1 ? 1 : (float) (1 - java.lang.Math.pow(2, -10 * x));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutExpo(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x == 0
                ? 0
                : (float) (x == 1
                ? 1
                : x < 0.5 ? java.lang.Math.pow(2, 20 * x - 10) / 2
                : (2 - java.lang.Math.pow(2, -20 * x + 10)) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInCirc(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 - java.lang.Math.sqrt(1 - java.lang.Math.pow(x, 2)));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutCirc(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) java.lang.Math.sqrt(1 - java.lang.Math.pow(x - 1, 2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutCirc(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (x < 0.5
                        ? (1 - java.lang.Math.sqrt(1 - java.lang.Math.pow(2 * x, 2))) / 2
                        : (java.lang.Math.sqrt(1 - java.lang.Math.pow(-2 * x + 2, 2)) + 1) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInBack(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return c3 * x * x * x - c1 * x * x;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutBack(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (1 + c3 * java.lang.Math.pow(x - 1, 3) + c1 * java.lang.Math.pow(x - 1, 2));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutBack(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (x < 0.5
                        ? (java.lang.Math.pow(2 * x, 2) * ((c2 + 1) * 2 * x - c2)) / 2
                        : (java.lang.Math.pow(2 * x - 2, 2) * ((c2 + 1) * (x * 2 - 2) + c2) + 2) / 2);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInElastic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        return x == 0
                ? 0
                : (float) (x == 1
                ? 1
                : -java.lang.Math.pow(2, 10 * x - 10) * java.lang.Math.sin((x * 10 - 10.75) * c4));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutElastic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>

        return x == 0
                ? 0
                : (float) (x == 1
                ? 1
                : java.lang.Math.pow(2, -10 * x) * java.lang.Math.sin((x * 10 - 0.75) * c4) + 1);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutElastic(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x == 0
                ? 0
                : (float) (x == 1
                ? 1
                : x < 0.5
                ? -(java.lang.Math.pow(2, 20 * x - 10) * java.lang.Math.sin((20 * x - 11.125) * c5)) / 2
                : (java.lang.Math.pow(2, -20 * x + 10) * java.lang.Math.sin((20 * x - 11.125) * c5)) / 2 + 1);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInBounce(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return 1 - easeOutBounce(1 - x);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeOutBounce(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if (x < 1 / d1) {
            return n1 * x * x;
        } else if (x < 2 / d1) {
            return (float) (n1 * (x -= 1.5 / d1) * x + 0.75);
        } else if (x < 2.5 / d1) {
            return (float) (n1 * (x -= 2.25 / d1) * x + 0.9375);
        } else {
            return (float) (n1 * (x -= 2.625 / d1) * x + 0.984375);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x"})
    public static float easeInOutBounce(float x){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return x < 0.5
                ? (1 - easeOutBounce(1 - 2 * x)) / 2
                : (1 + easeOutBounce(2 * x - 1)) / 2;
        //>REMOVE-BRIDGE<
    }
}
