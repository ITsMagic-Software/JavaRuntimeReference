package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"ThermalFlow"})
public final class JavaThermalFlowStatics {

    private JavaThermalFlowStatics(){

    }

    @MethodArgs(args ={"object"})
    public static String convertToString(Object object){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return object.toString();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public static Class extractClass(Object object){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return object.getClass();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object", "type"})
    public static <T> T upCast(Object object, Class type){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(type.isAssignableFrom(object.getClass())){
            return (T) object;
        }
        throw new ClassCastException("the object("+object.getClass().getName()+") cant be cast to type " + type.getName());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object", "type"})
    public static boolean canCast(Object object, Class type){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(type.isAssignableFrom(object.getClass())){
            return true;
        }
        return false;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public static boolean isNull(Object object){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return object == null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"object"})
    public static boolean notNull(Object object){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return object != null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(boolean a, boolean b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean equals(byte a, byte b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a == b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterThan(byte a, byte b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a > b;
        //>REMOVE-BRIDGE<
    }


    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean greaterEqualsThan(byte a, byte b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a >= b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessThan(byte a, byte b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a < b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static boolean lessEqualThan(byte a, byte b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a <= b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float sumFloat(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float sumInt(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static long sumLong(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double sumDouble(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double sumShort(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static char sumChar(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char) (a + b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float subFloat(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float subInt(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static long subLong(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double subDouble(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double subShort(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static char subChar(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char) (a - b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float mulFloat(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float mulInt(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static long mulLong(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double mulDouble(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double mulShort(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static char mulChar(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char) (a * b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float divFloat(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a / b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static float divInt(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a / b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static long divLong(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a / b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double divDouble(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a / b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static double divShort(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a / b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"valueA", "valueB"})
    public static char divChar(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char) (a / b);
        //>REMOVE-BRIDGE<
    }


    /// GENERICS

    // CONCAT
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, boolean b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String concatenate(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }

    // SUM
    //FLOAT
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (float) (a + Mathf.stringToFloat(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sum(float a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    //INT
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return a + Mathf.stringToInt(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sum(int a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    //DOUBLE
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a + Mathf.stringToDouble(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (double) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sum(double a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    //LONG
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a + Mathf.stringToLong(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sum(long a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a + b;
        //>REMOVE-BRIDGE<
    }

    //STRING
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) b = "0";
        if(a.contains(".") || a.contains(",") || b.contains(".") || b.contains(",")) {
            double r = (Mathf.stringToDouble(a) + Mathf.stringToDouble(b));
            return String.valueOf(r);
        } else {
            long r = (Mathf.stringToLong(a) + Mathf.stringToLong(b));
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sum(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(sum(b, a));
        //>REMOVE-BRIDGE<
    }

    //SHORT
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (short) (a + Mathf.stringToInt(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short) (a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sum(short a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a + b);
        //>REMOVE-BRIDGE<
    }

    //CHAR
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;

        return (char) (a + b.charAt(0));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sum(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a + b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sum(Vector2 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sum(Vector3 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }

    //POINT2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b.getX(), b.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sum(Point2 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }

    //POINT3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sum(Point3 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b.getX(), b.getY(), 0);
        //>REMOVE-BRIDGE<
    }

    //COLOR
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sum(Color a, Color b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sum(Color a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sum(Color a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sum(b);
        //>REMOVE-BRIDGE<
    }

    // SUB
    //FLOAT
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (float) (a - Mathf.stringToFloat(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float sub(float a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    //INT
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return a - Mathf.stringToInt(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int sub(int a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    //DOUBLE
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a - Mathf.stringToDouble(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (double) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double sub(double a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    //LONG
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a - Mathf.stringToLong(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long sub(long a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a - b;
        //>REMOVE-BRIDGE<
    }

    //STRING
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) b = "0";
        if(a.contains(".") || a.contains(",") || b.contains(".") || b.contains(",")) {
            double r = (Mathf.stringToDouble(a) - Mathf.stringToDouble(b));
            return String.valueOf(r);
        } else {
            long r = (Mathf.stringToLong(a) - Mathf.stringToLong(b));
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String sub(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) - b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) - (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }

    //SHORT
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (short) (a - Mathf.stringToInt(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short) (a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short sub(short a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a - b);
        //>REMOVE-BRIDGE<
    }

    //CHAR
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;

        return (char) (a - b.charAt(0));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char sub(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a - b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 sub(Vector2 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 sub(Vector3 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }

    //POINT2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b.getX(), b.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 sub(Point2 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }

    //POINT3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 sub(Point3 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b.getX(), b.getY(), 0);
        //>REMOVE-BRIDGE<
    }

    //COLOR
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sub(Color a, Color b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sub(Color a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color sub(Color a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.sub(b);
        //>REMOVE-BRIDGE<
    }

    // DIV
    //FLOAT
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (float) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return (float) (a / Mathf.stringToFloat(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float div(float a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }

    //INT
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (int) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (int) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return a / Mathf.stringToInt(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (int) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int div(int a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }

    //DOUBLE
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return (a / Mathf.stringToDouble(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (double) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double div(double a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }

    //LONG
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (long)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (long)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return (a / Mathf.stringToLong(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long div(long a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return a / b;
        //>REMOVE-BRIDGE<
    }

    //STRING
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) return "0";
        if(a.contains(".") || a.contains(",") || b.contains(".") || b.contains(",")) {
            double db = Mathf.stringToDouble(b);
            if(db == 0) return "0";
            double r = (Mathf.stringToDouble(a) / db);
            return String.valueOf(r);
        } else {
            long dl = Mathf.stringToLong(b);
            if(dl == 0) return "0";
            long r = (Mathf.stringToLong(a) / dl);
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return "0";
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return "0";
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return "0";
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return "0";
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String div(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a.contains(".") || a.contains(",")) {
            double r = Mathf.stringToDouble(a) / b;
            return String.valueOf(r);
        } else {
            long r =  Mathf.stringToLong(a) / (long) b;
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }

    //SHORT
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return (short) (a / Mathf.stringToInt(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short) (a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short div(short a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (short)(a / b);
        //>REMOVE-BRIDGE<
    }

    //CHAR
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        if(b.equals("0")) return 0;
        return (char) (a / b.charAt(0));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char div(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == 0) return 0;
        return (char)(a / b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 div(Vector2 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 div(Vector3 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }

    //POINT2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b.getX(), b.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 div(Point2 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }

    //POINT3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 div(Point3 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b.getX(), b.getY(), 0);
        //>REMOVE-BRIDGE<
    }

    //COLOR
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color div(Color a, Color b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color div(Color a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color div(Color a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.div(b);
        //>REMOVE-BRIDGE<
    }

    // MUL
    //FLOAT
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (float) (a * Mathf.stringToFloat(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static float mul(float a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    //INT
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return a * Mathf.stringToInt(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (int) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static int mul(int a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    //DOUBLE
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a * Mathf.stringToDouble(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (double) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static double mul(double a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    //LONG
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (long)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (a * Mathf.stringToLong(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static long mul(long a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a * b;
        //>REMOVE-BRIDGE<
    }

    //STRING
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) b = "0";
        if(a.contains(".") || a.contains(",") || b.contains(".") || b.contains(",")) {
            double r = (Mathf.stringToDouble(a) * Mathf.stringToDouble(b));
            return String.valueOf(r);
        } else {
            long r = (Mathf.stringToLong(a) * Mathf.stringToLong(b));
            return String.valueOf(r);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static String mul(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return String.valueOf(mul(b, a));
        //>REMOVE-BRIDGE<
    }

    //SHORT
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;
        return (short) (a * Mathf.stringToInt(b));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short) (a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static short mul(short a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (short)(a * b);
        //>REMOVE-BRIDGE<
    }

    //CHAR
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(b == null || b.isEmpty()) return a;

        return (char) (a * b.charAt(0));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, short b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static char mul(char a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (char)(a * b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector2 mul(Vector2 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }

    //VECTOR3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((float)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Vector3 a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }

    //POINT2
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b.getX(), b.getY());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point2 mul(Point2 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }

    //POINT3
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul((int)b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, Point3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Point3 mul(Point3 a, Point2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b.getX(), b.getY(), 0);
        //>REMOVE-BRIDGE<
    }

    //COLOR
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color mul(Color a, Color b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color mul(Color a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Color mul(Color a, Vector2 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }

    //QUATERNION
    @MethodArgs(args ={"valueA", "valueB"})
    public static Quaternion mul(Quaternion a, Quaternion b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }

    //MATRIX4
    @MethodArgs(args ={"valueA", "valueB"})
    public static Matrix4 mul(Matrix4 a, Matrix4 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"valueA", "valueB"})
    public static Vector3 mul(Matrix4 a, Vector3 b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.mul(b);
        //>REMOVE-BRIDGE<
    }
}