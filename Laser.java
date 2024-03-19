package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class Laser {
    //

    //

    public Laser() {
        //
    }
    @MethodArgs(args ={"color"})
    public Laser(Color color) {
        //
    }

    @HideGetSet
    public Color getColor() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color){
        //
    }

    @HideGetSet
    public boolean isShowGizmo() {
        //
        return false;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"showGizmo"})
    public void setShowGizmo(boolean showGizmo) {
        //
    }

    @MethodArgs(args ={"ray"})
    public LaserHit trace(JAVARuntime.Ray ray){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"position","direction"})
    public LaserHit trace(Vector3 position, Vector3 direction){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"position","direction","distance"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"position","direction","distance","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer){
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"position","direction","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, PhysicsLayer layer){
        //
        return null;
        //

        //
    }
}
