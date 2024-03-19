package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Components.Application.Application;
import com.itsmagic.engine.Engines.Utils.Mathematicals.Mathf;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"String"})
public final class StringOperations {

    @MethodArgs(args ={"a","b"})
    public static String[] div(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.split(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static String[] div(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        int size = b;
        String text = a;
        List<String> ret = new ArrayList<>((text.length() + size - 1) / size);

        for (int start = 0; start < text.length(); start += size) {
            ret.add(text.substring(start, (int) Mathf.min(text.length(), start + size)));
        }
        String[] array = new String[ret.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = ret.get(i);
        }
        return array;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a","b"})
    public static String sub(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.replace(b, "");
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static String sub(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.substring(0, a.length() - b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a","b"})
    public static String mul(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < b; i++) {
            str.append(a);
        }
        return str.toString();
        //>REMOVE-BRIDGE<
    }


    @MethodArgs(args ={"a","b"})
    public static String modulus(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.substring(b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.equals(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if (a.length() == 1) {
            if(a.charAt(0) == b){
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag(Locale.getDefault().getLanguage()));
            Number parsedNumber = nf.parse(a);
            int n = parsedNumber.intValue();
            return n == b;
        } catch (ParseException e) {
            throw new IllegalOperatorException(e);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            if (a.contains(",")) {
                NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag("pt"));
                Number parsedNumber = nf.parse(a);
                float n = parsedNumber.floatValue();
                return n == b;
            } else if (a.contains(".")) {
                NumberFormat nf = NumberFormat.getInstance(Locale.US);
                Number parsedNumber = nf.parse(a);
                float n = parsedNumber.floatValue();
                return n == b;
            } else {
                NumberFormat nf = NumberFormat.getInstance(Application.localeLG);
                Number parsedNumber = nf.parse(a);
                float n = parsedNumber.floatValue();
                return n == b;
            }
        } catch (ParseException e) {
            throw new IllegalOperatorException(e);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, long b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag(Locale.getDefault().getLanguage()));
            Number parsedNumber = nf.parse(a);
            long n = parsedNumber.longValue();
            return n == b;
        } catch (ParseException e) {
            throw new IllegalOperatorException(e);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, double b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag(Locale.getDefault().getLanguage()));
            Number parsedNumber = nf.parse(a);
            double n = parsedNumber.doubleValue();
            return n == b;
        } catch (ParseException e) {
            throw new IllegalOperatorException(e);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean equals(String a, boolean b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.equals(""+b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean notEquals(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return !a.equals(b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean notEquals(String a, char b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if (a.length() == 1) {
            if(a.charAt(0) != b){
                return true;
            }
        }
        return false;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean notEquals(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return !a.equals(""+b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean notEquals(String a, float b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return !a.equals(""+b);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean notEquals(String a, boolean b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return !a.equals(""+b);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a","b"})
    public static boolean higherThan(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() > b.length();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean higherEqualThan(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() >= b.length();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean higherThan(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() > b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean higherEqualThan(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() >= b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a","b"})
    public static boolean lessThan(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() < b.length();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean lessEqualThan(String a, String b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() <= b.length();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean lessThan(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() < b;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a","b"})
    public static boolean lessEqualThan(String a, int b){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.length() <= b;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a"})
    public static String toUpper(String a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.toUpperCase();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public static String toLower(String a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return a.toLowerCase();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public static String invert(String a){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        return sb.toString();
        //>REMOVE-BRIDGE<
    }
}
