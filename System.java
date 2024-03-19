package JAVARuntime;

public final class System {

    private System() {}

    public static void gc(){
        //<REMOVE-BRIDGE>
        java.lang.System.gc();
        //>REMOVE-BRIDGE<
    }

    public static void exit(){
        //<REMOVE-BRIDGE>
        GameController.quit();
        //>REMOVE-BRIDGE<
    }
    public static void exit(int status){
        //<REMOVE-BRIDGE>
        GameController.quit();
        //>REMOVE-BRIDGE<
    }

    public static void load(String filename) {
        throw new RuntimeException("Unsupported");
    }

    public static void loadLibrary(String libname) {
        throw new RuntimeException("Unsupported");
    }

    public static String mapLibraryName(String libname){
        throw new RuntimeException("Unsupported");
    }

    public static String lineSeparator() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return java.lang.System.lineSeparator();
        //>REMOVE-BRIDGE<
    }

    public static void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length){
        //<REMOVE-BRIDGE>
        java.lang.System.arraycopy(src, srcPos, dest, destPos, length);
        //>REMOVE-BRIDGE<
    }

    public static long currentTimeMillis(){
        throw new RuntimeException("Use Time.deltaTime instead to count time passage!!!");
    }

    public static long nanoTime(){
        throw new RuntimeException("Use Time.deltaTime instead to count time passage!!! If are you trying to profile performance times, use TimeCounter class");
    }
}
