package JAVARuntime;

//



/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@Deprecated
@DeprecatedInfo(info={"PFile is now obsolete.\n"+
        "\n" +
        "PFile creates a problem when exporting the project in APK, because the file structure changes completely after exporting. Therefore, if you dynamically create a PFile during the script, your game will not work after exporting the game.\n" +
        "\n" +
        "In order for ITsMagic to convert the PFile to the APK files, it needs to be a PUBLIC variable in the script's global scope. However, due to the large number of users who were creating dynamic PFiles during the script execution, several projects exported with errors.\n" +
        "\n" +
        "To solve this, it was necessary to create new specific classes for each case (WorldFile, ObjectFile, MaterialFile, VertexFile, FragmentGLSLFile, VertexGLSLFile, SoundFile, TextureFile) which are immutable, without a constructor and unalterable. Only the ITsMagic interface (Inspector) can build these classes.\n" +
        "\n" +
        "This means that the only way to create a WorldFile, for example, is to create a public variable with null value in the script's global scope, so you select the file through itsmagic interface. This way itsmagic will have access to that class and will change the value in the game's export.\n" +
        "\n" +
        "Not all files in your project are uploaded to the APK, so you can't access them dynamically during the game, as it may simply not even exist in the APK, and when it does, it has a totally different name and directory structure.\n" +
        "\n" +
        "If you want to dynamically load files while the game is running, use the functions for reading external files such as Java.Io.File, in the Material, Texture and Vertex classes for example\n" +
        "\n" +
        "Example:\n" +
        "File file = new File(\"External directory, which points to your file in the internal device memory\");\n" +
        "Vertex vertex = Vertex.loadFile(file);\n" +
        "This will load a file from the external device hard disk to a Vertex class."})
@ClassCategory(cat={"Files"})
public class PFile {
    //

    private String filePath;

    //

    public PFile() {
        //
    }
    public PFile(String filePath) {
        this.filePath = filePath;

        //
    }



    public String getFilePath() {
        return filePath;
    }
    //
    public void setFilePath(String filePath) {
        this.filePath = filePath;

        //
    }

    public String getAbsolutePath() {
        //
        return "";
        //

        //
    }

    public String toString() {
        return getFilePath();
    }
}
