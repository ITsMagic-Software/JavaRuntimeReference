package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat={"Editor"})
public class EditorPanel {

    //

    public EditorPanel() {
        //
    }

    @MethodArgs(args={"touch","x","y","width","height"})
    public boolean isTouchInside(Touch touch){
        //
        return false;
        //

        //
    }

    @MethodArgs(args={"touchFilter"})
    public Touch determineTouch(GUIUtils.TouchFilter touchFilter){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"touchFilter","offset"})
    public Touch determineTouch(GUIUtils.TouchFilter touchFilter, int offset){
        //
        return null;
        //

        //
    }

    @MethodArgs(args={"touch"})
    public Vector2 determineTouchPosition(Touch touch){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"touch","out"})
    public Vector2 determineTouchPosition(Touch touch, Vector2 out){
        //
        return null;
        //

        //
    }

    @HideGetSet
    public int getContentXPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getContentYPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getContentWidthPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getContentHeightPixels(){
        //
        return 0;
        //

        //
    }

    @HideGetSet
    public int getTotalXPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getTotalYPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getTotalWidthPixels(){
        //
        return 0;
        //

        //
    }
    @HideGetSet
    public int getTotalHeightPixels(){
        //
        return 0;
        //

        //
    }

    public void requestDetach(){
        //
    }

    @HideGetSet
    public boolean isVisible(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public boolean isFloating(){
        //
        return false;
        //

        //
    }

    @HideGetSet
    public String getTittle(){
        //
        return null;
        //

        //
    }

    public EditorPanel copy(){
        //
        return null;
        //

        //
    }
}
