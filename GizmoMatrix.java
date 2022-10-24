package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoMatrix extends GizmoElement{

    private float[] matrix;

    public GizmoMatrix() {

    }

    @Override
    @HideGetSet
    public float[] getMatrix(){
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setMatrix(float[] matrix) {
        this.matrix = matrix;
    }
}
