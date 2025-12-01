package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Files"})
public class OutPFile {
    //

    private transient String filePath;

    public OutPFile() {

    }
    @MethodArgs({"filePath"})
    public OutPFile(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
    @MethodArgs({"filePath"})
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
