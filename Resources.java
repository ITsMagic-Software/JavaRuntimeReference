package JAVARuntime;

//

import java.io.InputStream;

public class Resources {

    public static class File {
        private final String path;
        private final boolean isDirectory;

        public File(String path, boolean isDirectory) {
            this.path = path;
            this.isDirectory = isDirectory;
        }

        public InputStream getInputStream() {
            //
            return null;
            //

            //
        }

        public String getPath() {
            return path;
        }

        public String getName() {
            //
            return null;
            //

            //
        }

        public int fileCount() {
            //
            return 0;
            //

            //
        }

        public File[] getFiles() {
            //
            return null;
            //

            //
        }

        public boolean isDirectory() {
            return isDirectory;
        }
    }

    public static File getFile(String path) {
        //
        return null;
        //

        //
    }

    public static boolean isFolder(String path) {
        //
        return false;
        //

        //
    }
}