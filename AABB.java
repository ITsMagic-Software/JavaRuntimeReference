package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Vector"})
public final class AABB {

    //

    public AABB() {
        //
    }
    @MethodArgs({"x","y","z", "xn","yn","zn"})
    public AABB(float x, float y, float z, float xn, float yn, float zn) {
        //
    }
    @MethodArgs({"x","y","z", "xn","yn","zn", "cx","cy","cz"})
    public AABB(float x, float y, float z, float xn, float yn, float zn, float cx, float cy, float cz) {
        //
    }
    @MethodArgs({"min", "max"})
    public AABB(Vector3 min, Vector3 max) {
        this(max.getX(), max.getY(), max.getZ(), min.getX(), min.getY(), min.getZ());
    }
    @MethodArgs({"min", "center", "max"})
    public AABB(Vector3 min, Vector3 center, Vector3 max) {
        this(max.getX(), max.getY(), max.getZ(), min.getX(), min.getY(), min.getZ(), center.getX(), center.getY(), center.getZ());
    }

    @JRDoc_EN("Returns the minimum of the bounds.")
    @JRDoc_PT("Retorna o mínimo das bordas/limites.")
    @HideGetSet
    public Vector3 getMin(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Changes the minimum of the bounds.")
    @JRDoc_PT("Altera o mínimo das bordas/limites.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setMin(Vector3 value){
        //
    }

    @JRDoc_EN("Returns the maximum of the bounds.")
    @JRDoc_PT("Retorna o máximo das bordas/limites.")
    @HideGetSet
    public Vector3 getMax(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Changes the maximum of the bounds.")
    @JRDoc_PT("Altera o máximo das bordas/limites.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setMax(Vector3 value){
        //
    }

    @JRDoc_EN("Returns the X of the maximum of the bounds.")
    @JRDoc_PT("Retorna o X do máximo das bordas.")
    @HideGetSet
    public float getX(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the maximum X of the bounds.")
    @JRDoc_PT("Altera o X do máximo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setX(float value){
        //
    }
    @JRDoc_EN("Returns the Y of the maximum of the bounds.")
    @JRDoc_PT("Retorna o Y do máximo das bordas.")
    @HideGetSet
    public float getY(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the maximum Y of the bounds.")
    @JRDoc_PT("Altera o Y do máximo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setY(float value){
        //
    }
    @JRDoc_EN("Returns the Z of the maximum of the bounds.")
    @JRDoc_PT("Retorna o Z do máximo das bordas.")
    @HideGetSet
    public float getZ(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the maximum Z of the bounds.")
    @JRDoc_PT("Altera o Z do máximo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setZ(float value){
        //
    }

    @JRDoc_EN("Returns the X of the minimum of the bounds.")
    @JRDoc_PT("Retorna o X do mínimo das bordas.")
    @HideGetSet
    public float getXN(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the minimum X of the bounds.")
    @JRDoc_PT("Altera o X do mínimoo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setXN(float value){
        //
    }
    @JRDoc_EN("Returns the Y of the minimum of the bounds.")
    @JRDoc_PT("Retorna o Y do mínimo das bordas.")
    @HideGetSet
    public float getYN(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the minimum Y of the bounds.")
    @JRDoc_PT("Altera o Y do mínimoo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setYN(float value){
        //
    }
    @JRDoc_EN("Returns the Z of the minimum of the bounds.")
    @JRDoc_PT("Retorna o Z do mínimo das bordas.")
    @HideGetSet
    public float getZN(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Changes the minimum Z of the bounds.")
    @JRDoc_PT("Altera o Z do mínimoo das bordas.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setZN(float value){
        //
    }

    @JRDoc_EN("Returns the length of the maximum of the bounds.")
    @JRDoc_PT("Retorna o comprimento do máximo das bordas/limites.")
    public float lengthMax(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the length of the minimum of the bounds.")
    @JRDoc_PT("Retorna o comprimento do mínimo das bordas/limites.")
    public float lengthMin(){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the length of the maximum of the bounds.")
    @JRDoc_PT("Retorna o comprimento do máximo das bordas/limites.")
    @HideGetSet
    public float getLengthMax(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the length of the minimum of the bounds.")
    @JRDoc_PT("Retorna o comprimento do mínimo das bordas/limites.")
    @HideGetSet
    public float getLengthMin(){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the maximum distance from the center.")
    @JRDoc_PT("Retorna a distância máxima do centro.")
    public float maxDistanceFromCenter(){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns true if the point is inside the AABB, otherwise returns false.")
    @JRDoc_PT("Retorna verdadeiro se o ponto estiver dentro do AABB, caso contrário, retorna falso.")
    @UnimplementedDoc
    @MethodArgs({"point"})
    public boolean isInside(Vector3 point) {
        //
       return false;
        //

        //
    }

    @JRDoc_EN("Returns the center position of the AABB.")
    @JRDoc_PT("Retorna a posição central do AABB.")
    public Vector3 getCenter(){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Returns a copy of the current class instance.")
    @JRDoc_PT("Retorna uma cópia da instância da classe atual.")
    public AABB copy(){
        //
        return null;
        //

        //
    }
}
