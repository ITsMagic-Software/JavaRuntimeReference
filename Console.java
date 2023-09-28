package JAVARuntime;

//

import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class Console {
    //

    private Console(){ }

    /// Abstracts
    @MethodArgs(args ={"message"})
    public static void log(String message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(Vector3 message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(Vector2 message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(float message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(int message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(long message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(double message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(char message){
        //
    }
    @MethodArgs(args ={"message"})
    public static void log(byte message){
        //
    }
    @MethodArgs(args ={"error"})
    public static void log(Error e){
        //
    }
    @MethodArgs(args ={"exception"})
    public static void log(Exception e){
        //
    }
    @MethodArgs(args ={"throwable"})
    public static void log(Throwable e){
        //
    }
    @MethodArgs(args ={"log"})
    public static void log(Log log){
        //
    }
    @MethodArgs(args ={"array"})
    public static void log(String[] log){
        //
    }
    @MethodArgs(args ={"list"})
    public static void log(List<String> log){
        //
    }
}
