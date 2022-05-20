package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Laser"})
public class Laser {
    //

    public Laser() {
        //
    }
    @MethodArgs(args={"color"})
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
    @MethodArgs(args={"color"})
    public void setColor(Color color){
        //
    }

    @MethodArgs(args={"ray"})
    public LaserHit trace(JAVARuntime.Ray ray){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"position","direction","distance"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"position","direction","distance","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer){
        //
        return null;
        //

        //
    }

    public void destroy(){
        //
    }
}
