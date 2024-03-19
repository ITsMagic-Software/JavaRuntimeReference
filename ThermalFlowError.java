package JAVARuntime;

public class ThermalFlowError extends RuntimeException{
    public static final int TYPE_SIMPLE = 0;
    public static final int TYPE_EXCEPTION = 1;
    public static final int TYPE_ERROR = 2;

    //<REMOVE-BRIDGE>
    private transient final com.itsmagic.engine.Engines.Native.OHString.OHString message;
    private transient final com.itsmagic.engine.Engines.Native.OHString.OHString callStack;
    private transient final Exception exception;
    private transient final Error error;
    private transient final int type;
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"message","callStack"})
    public ThermalFlowError(String message, String callStack) {
        super();
        //<REMOVE-BRIDGE>
        this.message = new com.itsmagic.engine.Engines.Native.OHString.OHString(message);
        this.callStack = new com.itsmagic.engine.Engines.Native.OHString.OHString(callStack);
        this.exception = null;
        this.error = null;
        this.type = 0;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message","callStack", "exception"})
    public ThermalFlowError(String message, String callStack, Exception e) {
        super();
        //<REMOVE-BRIDGE>
        this.message = new com.itsmagic.engine.Engines.Native.OHString.OHString(message);
        this.callStack = new com.itsmagic.engine.Engines.Native.OHString.OHString(callStack);
        this.exception = e;
        this.error = null;
        this.type = 1;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"message","callStack","error"})
    public ThermalFlowError(String message, String callStack, Error e) {
        super();
        //<REMOVE-BRIDGE>
        this.message = new com.itsmagic.engine.Engines.Native.OHString.OHString(message);
        this.callStack = new com.itsmagic.engine.Engines.Native.OHString.OHString(callStack);
        this.exception = null;
        this.error = e;
        this.type = 2;
        //>REMOVE-BRIDGE<
    }

    public String getMessage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return message.toString();
        //>REMOVE-BRIDGE<
    }
    public String getCallStack(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return callStack.toString();
        //>REMOVE-BRIDGE<
    }

    public Exception getException() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return exception;
        //>REMOVE-BRIDGE<
    }
    public Error getError() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return error;
        //>REMOVE-BRIDGE<
    }

    public int getType() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return type;
        //>REMOVE-BRIDGE<
    }
}
