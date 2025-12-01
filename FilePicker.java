package JAVARuntime;

//

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilePicker {

    public static class DFile{
        //

        private DFile() {}

        public String getName(){
            //
            return null;
            //

            //
        }
        public String getType(){
            //
            return null;
            //

            //
        }
        public Uri getUri(){
            //
            return null;
            //

            //
        }
        public DFile getParentFile(){
            //
            return null;
            //

            //
        }

        public boolean importTo(File destination){
            //
            return false;
            //

            //
        }
    }

    public interface Listener {
        void onSuccess(List<DFile> files);
        void onCancel();
        void onError(String error);
    }

    private FilePicker() {
    }

    public static void open(Listener listener){
        //
    }

    public static boolean importFile(DFile documentFile, File destination){
        //
        return false;
        //

        //
    }
}
