package JAVARuntime;

//

import java.io.FileFilter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

@ClassCategory(cat={"Files"})
public class File extends java.io.File {

    @MethodArgs(args={"pathName"})
    public File(String pathname) {
        super(pathname);
        isAccessible();
    }
    @MethodArgs(args={"parent","child"})
    public File(String parent, String child) {
        super(parent, child);
        isAccessible();
    }
    @MethodArgs(args={"parent","child"})
    public File(java.io.File parent, String child) {
        super(parent, child);
        isAccessible();
    }
    @MethodArgs(args={"uri"})
    public File(URI uri) {
        super(uri);
        isAccessible();
    }

    public String getName() {
        isAccessible();
        return super.getName();
    }
    public String getParent() {
        isAccessible();
        return super.getParent();
    }
    public java.io.File getParentFile() {
        isAccessible();
        return super.getParentFile();
    }
    public String getPath() {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.getPath();
    }
    public boolean isAbsolute() {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.isAbsolute();
    }
    public String getAbsolutePath() {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.getAbsolutePath();
    }
    public java.io.File getAbsoluteFile() {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.getAbsoluteFile();
    }
    public String getCanonicalPath() throws IOException {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.getCanonicalPath();
    }
    public java.io.File getCanonicalFile() throws IOException {
        /**
         * Don't check here, it will throw a stack overflow error
         */
        return super.getCanonicalFile();
    }
    public URL toURL() throws MalformedURLException {
        isAccessible();
        return super.toURL();
    }
    public URI toURI() {
        isAccessible();
        return super.toURI();
    }
    public boolean canRead() {
        isAccessible();
        return super.canRead();
    }
    public boolean canWrite() {
        isAccessible();
        return super.canWrite();
    }
    public boolean exists() {
        isAccessible();
        return super.exists();
    }
    public boolean isDirectory() {
        isAccessible();
        return super.isDirectory();
    }
    public boolean isFile() {
        isAccessible();
        return super.isFile();
    }
    public boolean isHidden() {
        isAccessible();
        return super.isHidden();
    }
    public long lastModified() {
        isAccessible();
        return super.lastModified();
    }
    public long length() {
        isAccessible();
        return super.length();
    }
    public boolean createNewFile() throws IOException {
        isAccessible();
        return super.createNewFile();
    }
    public boolean delete() {
        isAccessible();
        return super.delete();
    }
    public void deleteOnExit() {
        isAccessible();
        super.deleteOnExit();
    }
    public String[] list() {
        isAccessible();
        return super.list();
    }
    @MethodArgs(args={"filter"})
    public String[] list(FilenameFilter filter) {
        isAccessible();
        return super.list(filter);
    }
    public java.io.File[] listFiles() {
        isAccessible();
        return super.listFiles();
    }
    @MethodArgs(args={"filter"})
    public java.io.File[] listFiles(FilenameFilter filter) {
        isAccessible();
        return super.listFiles(filter);
    }
    @MethodArgs(args={"filter"})
    public java.io.File[] listFiles(FileFilter filter) {
        isAccessible();
        return super.listFiles(filter);
    }
    public boolean mkdir() {
        isAccessible();
        return super.mkdir();
    }
    public boolean mkdirs() {
        isAccessible();
        return super.mkdirs();
    }
    @MethodArgs(args={"destination"})
    public boolean renameTo(java.io.File dest) {
        isAccessible();
        return super.renameTo(dest);
    }
    @MethodArgs(args={"time"})
    public boolean setLastModified(long time) {
        isAccessible();
        return super.setLastModified(time);
    }
    public boolean setReadOnly() {
        isAccessible();
        return super.setReadOnly();
    }
    @MethodArgs(args={"writable","ownerOnly"})
    public boolean setWritable(boolean writable, boolean ownerOnly) {
        isAccessible();
        return super.setWritable(writable, ownerOnly);
    }
    @MethodArgs(args={"writable"})
    public boolean setWritable(boolean writable) {
        isAccessible();
        return super.setWritable(writable);
    }
    @MethodArgs(args={"writable","ownerOnly"})
    public boolean setReadable(boolean readable, boolean ownerOnly) {
        isAccessible();
        return super.setReadable(readable, ownerOnly);
    }
    @MethodArgs(args={"readable"})
    public boolean setReadable(boolean readable) {
        isAccessible();
        return super.setReadable(readable);
    }
    @MethodArgs(args={"writable","ownerOnly"})
    public boolean setExecutable(boolean executable, boolean ownerOnly) {
        isAccessible();
        return super.setExecutable(executable, ownerOnly);
    }
    @MethodArgs(args={"executable"})
    public boolean setExecutable(boolean executable) {
        isAccessible();
        return super.setExecutable(executable);
    }
    public boolean canExecute() {
        isAccessible();
        return super.canExecute();
    }
    public long getTotalSpace() {
        isAccessible();
        return super.getTotalSpace();
    }
    public long getFreeSpace() {
        isAccessible();
        return super.getFreeSpace();
    }
    public long getUsableSpace() {
        isAccessible();
        return super.getUsableSpace();
    }
    @MethodArgs(args={"pathname"})
    public int compareTo(java.io.File pathname) {
        isAccessible();
        return super.compareTo(pathname);
    }
    @MethodArgs(args={"obj"})
    public boolean equals(Object obj) {
        isAccessible();
        return super.equals(obj);
    }
    public int hashCode() {
        isAccessible();
        return super.hashCode();
    }
    public String toString() {
        isAccessible();
        return super.toString();
    }
    public Path toPath() {
        isAccessible();
        return super.toPath();
    }
    protected Object clone() throws CloneNotSupportedException {
        isAccessible();
        return super.clone();
    }
    protected void finalize() throws Throwable {
        isAccessible();
        super.finalize();
    }

    /**
     * Check if the address is inside the folders accessible by ITsMagic
     */
    public boolean isAccessible(){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"path"})
    public boolean isAccessible(String path){
        //
        return false;
        //

        //
    }
}

