package JAVARuntime;

//

import java.io.File;
import java.io.IOException;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public class FileLoader {
    private FileLoader() { }

    /// Abstracts
    @MethodArgs(args ={"text","file"})
    public static void exportTextToFile(String text, String file) throws IOException {
        //
    }
    @MethodArgs(args ={"text","file"})
    public static void exportTextToFile(String text, File file) throws IOException {
        //
    }

    @MethodArgs(args ={"file"})
    public static String loadTextFromFile(File file) throws IOException {
        //
        return "";
        //

        //
    }
    @MethodArgs(args ={"file"})
    public static String loadTextFromFile(ProjectFile file){
        //
        return "";
        //

        //
    }
}
