package JAVARuntime;

public class System {

    private System() {}

    public static void gc(){
        //
    }

    public static void exit(){
        //
    }
    public static void exit(int status){
        //
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
        //
        return null;
        //

        //
    }

    public static void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length){
        //
    }

    public static long currentTimeMillis(){
        throw new RuntimeException("Use Time.deltaTime instead to count time passage!!!");
    }

    public static long nanoTime(){
        throw new RuntimeException("Use Time.deltaTime instead to count time passage!!! If are you trying to profile performance times, use TimeCounter class");
    }
}
