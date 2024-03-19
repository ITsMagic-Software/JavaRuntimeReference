package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Console.Terminal;
//>REMOVE-BRIDGE<

import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public final class Console {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Console(){ }

    /// Abstracts
    @MethodArgs(args ={"message"})
    public static void log(String message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(Vector3 message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage((message == null)?"null":message.instance.toString());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(Vector2 message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage((message == null)?"null":message.instance.toString());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(float message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(int message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(long message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(double message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(char message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message"})
    public static void log(byte message){
        //<REMOVE-BRIDGE>
        Terminal.logMessage(message);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"error"})
    public static void log(Error e){
        //<REMOVE-BRIDGE>
        Terminal.log(e);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"exception"})
    public static void log(Exception e){
        //<REMOVE-BRIDGE>
        Terminal.log(e);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"throwable"})
    public static void log(Throwable e){
        //<REMOVE-BRIDGE>
        Terminal.log(e);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"log"})
    public static void log(Log log){
        //<REMOVE-BRIDGE>
        Terminal.log(log.log);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"array"})
    public static void log(String[] log){
        //<REMOVE-BRIDGE>
        for (int i = 0; i < log.length; i++) {
            log(log[i]);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"list"})
    public static void log(List<String> log){
        //<REMOVE-BRIDGE>
        for (int i = 0; i < log.size(); i++) {
            log(log.get(i));
        }
        //>REMOVE-BRIDGE<
    }
}
