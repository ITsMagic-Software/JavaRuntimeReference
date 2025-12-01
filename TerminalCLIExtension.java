package JAVARuntime;

//

import java.util.List;

public abstract class TerminalCLIExtension {

    //

    public TerminalCLIExtension() {
    }

    public abstract String getCommand();
    public String getInfo() {
        return "Custom command";
    }

    public abstract void start(String[] args);
    public abstract void run(String command);

    public void exit(){
        //
    }

    @MethodArgs({"message"})
    public void log(Object message){
        //
    }
    @MethodArgs({"message"})
    public void log(String message){
        //
    }
    @MethodArgs({"message"})
    public void log(Vector3 message){
        //
    }
    @MethodArgs({"message"})
    public void log(Quaternion message){
        //
    }
    @MethodArgs({"message"})
    public void log(Vector2 message){
        //
    }
    @MethodArgs({"message"})
    public void log(float message){
        //
    }
    @MethodArgs({"message"})
    public void log(int message){
        //
    }
    @MethodArgs({"message"})
    public void log(long message){
        //
    }
    @MethodArgs({"message"})
    public void log(double message){
        //
    }
    @MethodArgs({"message"})
    public void log(char message){
        //
    }
    @MethodArgs({"message"})
    public void log(byte message){
        //
    }
    @MethodArgs({"error"})
    public void log(Error e){
        //
    }
    @MethodArgs({"exception"})
    public void log(Exception e){
        //
    }
    @MethodArgs({"throwable"})
    public void log(Throwable e){
        //
    }
    @MethodArgs({"log"})
    public void log(Log log){
        //
    }
    @MethodArgs({"array"})
    public void log(String[] log){
        //
    }
    @MethodArgs({"list"})
    public void log(List<String> log){
        //
    }
}