package JAVARuntime;

//<REMOVE-BRIDGE>

import com.itsmagic.engine.Core.Components.ClassExporter;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Utils.IOFileLoader;
//>REMOVE-BRIDGE<

import java.io.File;
import java.io.IOException;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public final class FileLoader {
    private FileLoader() { }

    /// Abstracts
    @MethodArgs(args ={"text","file"})
    public static void exportTextToFile(String text, String file) throws IOException {
        //<REMOVE-BRIDGE>
        IOFileLoader.exportTextToFile(text, new File(file));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"text","file"})
    public static void exportTextToFile(String text, File file) throws IOException {
        //<REMOVE-BRIDGE>
        IOFileLoader.exportTextToFile(text, file);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"file"})
    public static String loadTextFromFile(File file) throws IOException {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return IOFileLoader.loadTextFromFile(file);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file"})
    public static String loadTextFromFile(ProjectFile file){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return IOFileLoader.loadTextFromFile(file.getInputStream());
        //>REMOVE-BRIDGE<
    }
}
