package JAVARuntime;

import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class Terminal {


    private Terminal(){ }

    /// Abstracts
    @MethodArgs({"message"})
    public static void log(Object message){
        //
    }
    @MethodArgs({"message"})
    public static void log(String message){
        //
    }
    @MethodArgs({"message"})
    public static void log(Vector3 message){
        //
    }
    @MethodArgs({"message"})
    public static void log(Quaternion message){
        //
    }
    @MethodArgs({"message"})
    public static void log(Vector2 message){
        //
    }
    @MethodArgs({"message"})
    public static void log(float message){
        //
    }
    @MethodArgs({"message"})
    public static void log(int message){
        //
    }
    @MethodArgs({"message"})
    public static void log(long message){
        //
    }
    @MethodArgs({"message"})
    public static void log(double message){
        //
    }
    @MethodArgs({"message"})
    public static void log(char message){
        //
    }
    @MethodArgs({"message"})
    public static void log(byte message){
        //
    }
    @MethodArgs({"error"})
    public static void log(Error e){
        //
    }
    @MethodArgs({"exception"})
    public static void log(Exception e){
        //
    }
    @MethodArgs({"throwable"})
    public static void log(Throwable e){
        //
    }
    @MethodArgs({"log"})
    public static void log(Log log){
        //
    }
    @MethodArgs({"array"})
    public static void log(String[] log){
        //
    }
    @MethodArgs({"list"})
    public static void log(List<String> log){
        //
    }
}
