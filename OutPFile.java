package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public class OutPFile {
    //

    private String filePath;

    public OutPFile() {

    }
    @MethodArgs(args ={"filePath"})
    public OutPFile(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
    @MethodArgs(args ={"filePath"})
    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
