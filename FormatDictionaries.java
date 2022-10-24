package JAVARuntime;

//

@ClassCategory(cat ={"Files"})
public class FormatDictionaries {
    public static String BACKUP                = ".itsmbp";
    public static String TEXTURE               = ".png|.jpg|.jpeg|.bmp|.webp|.heif|.ppm|.tif|.tga";
    public static String Brush                 = ".png|.jpg|.jpeg|.bmp|.webp|.heif|.ppm"; // only native supported images
    public static String TIF                   = ".tif";
    public static String TGA                   = ".tga";
    public static String NODESCRIPT            = ".ns";
    public static String NODESCRIPT_V2         = ".ns2";
    public static String MAGICSCRIPT           = ".ms";
    public static String MAGICSCRIPT_COMPILED  = ".msc";
    public static String SCRIPT                = ".ns|.ms";
    public static String OBJECT                = ".go";
    public static String VERTEX                = ".vertex";
    public static String OBJ                   = ".obj";
    public static String MTL                   = ".mtl";
    public static String WORLD                 = ".world";
    public static String SOUND                 = ".mp3|.wav|.ogg|.3gp|.m4a|.aac|.ts|.flac|.gsm|.mid|.xmf|.ota|.imy|.rtx|.mkv";
    public static String ANIMATION             = ".anim";
    public static String MATERIAL              = ".mat";
    public static String HPOP                  = ".hpop";
    public static String TERRAINDATA           = ".tdata";
    public static String DAE                   = ".dae";
    public static String FBX                   = ".fbx";
    public static String JAVA                  = ".java";
    public static String JAVAC                 = ".javac";
    public static String JAVACLASS             = ".class";
    public static String JAVADEX               = ".dex";
    public static String SKELETONDATA          = ".skedata";
    public static String D3DS                  = ".3ds";
    public static String JKS                   = ".jks";
    public static String CONFIG                = ".config";
    public static String VERTEX_GLSL           = ".vglsl";
    public static String FRAGMENT_GLSL         = ".fglsl";
    public static String GEOMETRY_GLSL         = ".gglsl";
    public static String BLEND                 = ".blend";
    public static String ITJAR                 = ".itjar";
    public static String TXT                   = ".txt";
    public static String PDF                   = ".pdf";
    public static String DOC                   = ".doc";
    public static String DOCX                  = ".docx";
    public static String XML                   = ".xml";
    public static String JSON                  = ".json";
    public static String FONT                  = ".ttf|.otf";

    private FormatDictionaries() { }

    @MethodArgs(args ={"format"})
    public static String createFrom(String format){
        //
        return null;
        //

        //
    }
}
