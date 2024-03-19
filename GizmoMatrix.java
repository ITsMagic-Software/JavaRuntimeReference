package JAVARuntime;

//<REMOVE-BRIDGE>
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoMatrix extends GizmoElement{

    private transient float[] matrix;

    public GizmoMatrix() {

    }

    @Override
    @HideGetSet
    public float[] getMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return matrix;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setMatrix(float[] matrix) {
        this.matrix = matrix;
    }
}
