package JAVARuntime;

public class InaccessibleFilePathException extends RuntimeException {
    @MethodArgs(args ={"path"})
    public InaccessibleFilePathException(String path) {
        super("After android 11 update, is not possible to write/read files outside Android data folder\n"
                +"ITsMagic has a function to create files, use Directories.internal() has the root folder\n"
                +"If you want to manage files in the internal storage of android, is necessary to create files like this: new File( Directories.internal() + \"myfile.txt\" );\n"
                +"you can read more about it searching \"Android scoped storage update\"\n"
                +"Current file path:" + path);
    }
}
