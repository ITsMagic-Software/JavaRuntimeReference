package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Utils.PFile;
//
//>REMOVE-BRIDGE<
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public final class FileUtils {

    private FileUtils() { }

    @MethodArgs(args ={"classType"})
    public static String determineClassFolder(Class classType){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return getFileFolder(Core.jCompiler.determineClassLocation(classType)) + "/";
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"classType"})
    public static String determineClassPath(Class classType){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return Core.jCompiler.determineClassLocation(classType);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"paths"})
    public static String commonPath(List paths){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String commonPath = "";

        if(paths.size() > 1) {
            String[][] folders = new String[paths.size()][];
            for (int i = 0; i < paths.size(); i++) {
                folders[i] = ((String)(paths.get(i))).split("/"); //split on file separator
            }
            for (int j = 0; j < folders[0].length; j++) {
                String thisFolder = folders[0][j]; //grab the next folder name in the first path
                boolean allMatched = true; //assume all have matched in case there are no more paths
                for (int i = 1; i < folders.length && allMatched; i++) { //look at the other paths
                    if (folders[i].length < j) { //if there is no folder here
                        allMatched = false; //no match
                        break; //stop looking because we've gone as far as we can
                    }
                    //otherwise
                    allMatched &= folders[i][j].equals(thisFolder); //check if it matched
                }
                if (allMatched) { //if they all matched this folder name
                    commonPath += thisFolder + "/"; //add it to the answer
                } else {//otherwise
                    break;//stop looking
                }
            }
        } else if(paths.size() == 1){
            commonPath = com.itsmagic.engine.Engines.Utils.StringFunctions.StringUtils.getFileFolder(((String)(paths.get(0)))) + "/";
        }

        return commonPath;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"filePath"})
    public static String getFileName(String filePath){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String name = filePath;
        if(filePath != null) {
            if (filePath.contains("/")) {
                try {
                    name = filePath.substring(filePath.lastIndexOf("/") + 1);
                } catch (Exception e) {
                    //e.printStackTrace();
                }
            }
        }

        return name;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"filePath","hideExtension"})
    public static String getFileName(String filePath, boolean hideExtension){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String name = getFileName(filePath);
        if (hideExtension) {
            if (name.contains(".")) {
                name = name.substring(0, name.lastIndexOf("."));
            }
        }
        return name;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"filePath"})
    public static String getFileFolder(String filePath){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            String name = filePath;
            if (name.contains("/")) {
                name = name.substring(0, name.lastIndexOf("/"));
            }
            return name;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"filePath"})
    public static String getExtensionName(String filePath){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        try {
            if (filePath.contains(".")) {
                return filePath.substring(filePath.lastIndexOf("."));
            }
            return filePath;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"filePath"})
    public static String removeExtension(String filePath){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String name = filePath;
        if (filePath.contains(".")) {
            name = filePath.substring(0, filePath.lastIndexOf("."));
        }
        return name;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"filePath"})
    public static String getLastFolder(String filePath){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        String name = filePath;
        if(filePath != null) {
            if (filePath.contains("/")) {
                String[] folders = filePath.split("/");
                if(folders.length > 0) {
                    name = folders[folders.length - 1];
                }
            }
        }

        return name;
        //>REMOVE-BRIDGE<
    }
}
