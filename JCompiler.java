package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Components.JCompiler.Classes.OfficialClass;
import com.itsmagic.engine.Core.Components.JCompiler.LoadedClass;
//>REMOVE-BRIDGE<
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Java"})
public final class JCompiler {

    public static List<JClass> getAllClasses(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        List<JClass> classes = new ArrayList<>();
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassesCount(); i++) {
            OfficialClass reservedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassAt(i);
            classes.add(new JClass(reservedClass.getCls(), reservedClass.getSimpleName(), true));
        }
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassesCount(); i++) {
            LoadedClass loadedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassAt(i);
            Class<?> cls = loadedClass.classAddress;
            classes.add(new JClass(cls, loadedClass.className, false));
        }
        return classes;
        //>REMOVE-BRIDGE<
    }

    public static List<JClass> getEngineClasses(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        List<JClass> classes = new ArrayList<>();
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassesCount(); i++) {
            OfficialClass reservedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassAt(i);
            classes.add(new JClass(reservedClass.getCls(), reservedClass.getSimpleName(), true));
        }
        return classes;
        //>REMOVE-BRIDGE<
    }
    public static int engineClassCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        return com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassesCount();
        //>REMOVE-BRIDGE<
    }
    public static JClass engineClassAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        OfficialClass reservedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassAt(idx);
        JClass jclass = new JClass(reservedClass.getCls(), reservedClass.getSimpleName(), true);
        return jclass;
        //>REMOVE-BRIDGE<
    }

    public static List<JClass> getUsersClasses(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        List<JClass> classes = new ArrayList<>();
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassesCount(); i++) {
            LoadedClass loadedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassAt(i);
            Class<?> cls = loadedClass.classAddress;
            classes.add(new JClass(cls, loadedClass.className, false));
        }
        return classes;
        //>REMOVE-BRIDGE<
    }
    public static int userClassCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        return com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassesCount();
        //>REMOVE-BRIDGE<
    }
    public static JClass userClassAt(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        LoadedClass reservedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassAt(idx);
        JClass jclass = new JClass(reservedClass.classAddress, reservedClass.className, true);
        return jclass;
        //>REMOVE-BRIDGE<
    }

    public static JClass findOfficialClass(String fullName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassesCount(); i++) {
            OfficialClass reservedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.officialClassAt(i);
            if(reservedClass.getFullName().equals(fullName)) {
                return new JClass(reservedClass.getCls(), reservedClass.getSimpleName(), true);
            }
        }

        return null;
        //>REMOVE-BRIDGE<
    }
    public static JClass findUserClass(String fullName){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling()){
            throw new RuntimeException("The compiler is now compiling classes, please wait, you can check using JCompiler.isCompiling()");
        }
        for (int i = 0; i < com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassesCount(); i++) {
            LoadedClass loadedClass = com.itsmagic.engine.Core.Components.JCompiler.JCompiler.userClassAt(i);
            if(loadedClass.classAddress != null && loadedClass.classAddress.getName().equals(fullName)) {
                return new JClass(loadedClass.classAddress, loadedClass.className, false);
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    public static boolean isCompiling(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return com.itsmagic.engine.Core.Components.JCompiler.JCompiler.isCompiling();
        //>REMOVE-BRIDGE<
    }

    public static void addListener(Object object){
        //
    }
    public static void removeListener(Object object){
        //
    }
}


