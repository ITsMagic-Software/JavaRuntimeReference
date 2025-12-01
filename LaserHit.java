package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class LaserHit {
    //

    public LaserHit() {
        //
    }

    @JRDoc_EN("Returns the object hit by the Laser.")
    @JRDoc_PT("Retorna o objeto que o Laser colidiu.")
    @HideGetSet
    public SpatialObject getObject() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the object hit by the Laser.")
    @JRDoc_PT("Define o objeto que foi atingido pelo Laser.")
    @HideGetSet
    @MethodArgs({"object"})
    public void setObject(SpatialObject object){
        //
    }

    @JRDoc_EN("Returns the point where the Laser hit.")
    @JRDoc_PT("Retorna o ponto onde o Laser atingiu.")
    @HideGetSet
    public Vector3 getPoint() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the point where the Laser hit.")
    @JRDoc_PT("Define o ponto onde o Laser atingiu.")
    @HideGetSet
    @MethodArgs({"point"})
    public void setPoint(Vector3 point){
        //
    }

    @JRDoc_EN("Returns the normal vector of the Laser's direction.")
    @JRDoc_PT("Retorna o vetor normal da direção do Laser.")
    @HideGetSet
    public Vector3 getNormal() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the normal vector of the Laser's direction.")
    @JRDoc_PT("Define o vetor normal da direção do Laser.")
    @HideGetSet
    @MethodArgs({"normal"})
    public void setNormal(Vector3 normal){
        //
    }

    @JRDoc_EN("Returns the normal vector of the face the Laser collided with.")
    @JRDoc_PT("Retorna o vetor normal da face que o Laser colidiu.")
    @HideGetSet
    public Vector3 getFaceNormal() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the normal vector of the face the Laser collided with.")
    @JRDoc_PT("Define o vetor normal da face que o Laser colidiu.")
    @HideGetSet
    @MethodArgs({"normal"})
    public void setFaceNormal(Vector3 normal){
        //
    }

    @JRDoc_EN("Returns the distance between the Laser origin and the point it collided.")
    @JRDoc_PT("Retorna a distância entre a origem do Laser e o ponto que o Laser colidiu.")
    @HideGetSet
    public float getDistance() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the distance between the Laser origin and the point it collided.")
    @JRDoc_PT("Define a distância entre a origem do Laser e o ponto que o Laser colidiu.")
    @HideGetSet
    @MethodArgs({"distance"})
    public void setDistance(float distance){
        //
    }

    @JRDoc_EN("Returns the UV coordinates of the point the Laser collided with.")
    @JRDoc_PT("Retorna as coordenadas UV do ponto que o Laser colidiu.")
    @HideGetSet
    @UnimplementedDoc
    public Vector2 getUVCoord() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the UV coordinates of the point the Laser collided with.")
    @JRDoc_PT("Define as coordenadas UV do ponto que o Laser colidiu.")
    @HideGetSet
    @MethodArgs({"normal"})
    @UnimplementedDoc
    public void setUVCoord(Vector2 normal){
        //
    }

    @JRDoc_EN("Returns the object the Laser collided with.")
    @JRDoc_PT("Retorna o objeto que o Laser colidiu.")
    @HideGetSet
    @UnimplementedDoc
    public SpatialObject getColliderObject() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the object the Laser collided with.")
    @JRDoc_PT("Define o objeto que o Laser colidiu.")
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs({"object"})
    public void setColliderObject(SpatialObject object){
        //
    }

    @JRDoc_EN("Returns the Collider the Laser collided with.")
    @JRDoc_PT("Retorna o Collider que o Laser colidiu.")
    @HideGetSet
    @UnimplementedDoc
    public Collider getCollider() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the Collider the Laser collided with.")
    @JRDoc_PT("Define o Collider que o Laser colidiu.")
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs({"collider"})
    public void setCollider(Collider collider){
        //
    }
}
