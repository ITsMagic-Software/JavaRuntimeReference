package JAVARuntime;

public class ThermalFlowError extends RuntimeException{
    public static final int TYPE_SIMPLE = 0;
    public static final int TYPE_EXCEPTION = 1;
    public static final int TYPE_ERROR = 2;

    //

    @MethodArgs(args ={"message","callStack"})
    public ThermalFlowError(String message, String callStack) {
        super();
        //
    }
    @MethodArgs(args ={"message","callStack", "exception"})
    public ThermalFlowError(String message, String callStack, Exception e) {
        super();
        //
    }
    @MethodArgs(args ={"message","callStack","error"})
    public ThermalFlowError(String message, String callStack, Error e) {
        super();
        //
    }

    public String getMessage(){
        //
        return null;
        //

        //
    }
    public String getCallStack(){
        //
        return null;
        //

        //
    }

    public Exception getException() {
        //
        return null;
        //

        //
    }
    public Error getError() {
        //
        return null;
        //

        //
    }

    public int getType() {
        //
        return 0;
        //

        //
    }
}
