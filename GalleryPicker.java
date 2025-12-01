package JAVARuntime;

//

import java.io.File;

public class GalleryPicker {

    public interface Listener {
        void onSuccess(String imageName, File imageFile);
        void onCancel();
        void onError(String error);
    }

    private GalleryPicker() {
    }

    public static void open(Listener listener){
        //
    }
}
