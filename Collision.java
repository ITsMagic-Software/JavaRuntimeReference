package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public final class Collision {
    //

    public Collision() {
        //
    }

    @JRDoc_EN("Returns the other object involved in the collision.")
    @JRDoc_PT("Retorna o outro objeto envolvido na colisão.")
    @HideGetSet
    public SpatialObject getObject() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the other object involved in the collision.")
    @JRDoc_PT("Define o outro objeto envolvido na colisão.")
    @HideGetSet
    @MethodArgs({"otherObject"})
    public void setObject(SpatialObject otherObject){
        //
    }

    @JRDoc_EN("Returns the physics of the other object involved in the collision.")
    @JRDoc_PT("Retorna a física do outro objeto envolvido na colisão.")
    @UnimplementedDoc
    @HideGetSet
    public PhysicsComponent getPhysicsComponent() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the physics of the other object involved in the collision.")
    @JRDoc_PT("Define a física do outro objeto envolvido na colisão.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"otherObject"})
    public void setPhysicsComponent(PhysicsComponent otherObject){
        //
    }

    @JRDoc_EN("Returns the collider associated with this collision.")
    @JRDoc_PT("Retorna o Collider associado a esta colisão.")
    @UnimplementedDoc
    @HideGetSet
    public Collider getCollider() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the collider associated with this collision.")
    @JRDoc_PT("Define o Collider associado a esta colisão.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"collider"})
    public void setCollider(Collider col){
        //
    }

    @JRDoc_EN("Returns the object associated with the Collider in this collision.")
    @JRDoc_PT("Retorna o objeto associado ao Collider nesta colisão.")
    @HideGetSet
    @UnimplementedDoc
    public SpatialObject getColliderObject() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the object associated with the Collider in this collision.")
    @JRDoc_PT("Define o objeto associado ao Collider nesta colisão.")
    @HideGetSet
    @UnimplementedDoc
    @MethodArgs({"object"})
    public void setColliderObject(SpatialObject object){
        //
    }

    @JRDoc_EN("Returns the number of contact points in the collision.")
    @JRDoc_PT("Retorna o número de pontos de contato na colisão.")
    @UnimplementedDoc
    public int contactCount() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Returns the number of contact points in the collision.")
    @JRDoc_PT("Retorna o número de pontos de contato na colisão.")
    @UnimplementedDoc
    @HideGetSet
    public int getContactCount() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Returns the contact at the specified index.")
    @JRDoc_PT("Retorna o contato no índice especificado.")
    @MethodArgs({"index"})
    @UnimplementedDoc
    public Contact contactAt(int index){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the list of contact points in the collision.")
    @JRDoc_PT("Retorna a lista de pontos de contato na colisão.")
    public List<Contact> getContactList(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the normal vector of the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call getNormal() on it).")
    @JRDoc_PT("Retorna o vetor normal do primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use getNormal() nele).")
    @UnimplementedDoc
    @HideGetSet
    public Vector3 getNormal() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the normal vector of the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call setNormal() on it).")
    @JRDoc_PT("Define o vetor normal do primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use setNormal() nele).")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"normal"})
    public void setNormal(Vector3 vector){
        //
    }

    @JRDoc_EN("Returns the contact position of the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call getContactPoint() on it).")
    @JRDoc_PT("Retorna a posição do primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use getContactPoint() nele).")
    @UnimplementedDoc
    @HideGetSet
    public Vector3 getContactPoint() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the contact position of the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call setContactPoint() on it).")
    @JRDoc_PT("Define a posição do primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use setContactPoint() nele).")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"point"})
    public void setContactPoint(Vector3 vector){
        //
    }

    @JRDoc_EN("Returns the impulse magnitude at the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call getImpulse() on it).")
    @JRDoc_PT("Retorna a magnitude do impulso no primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use getImpulse() nele).")
    @UnimplementedDoc
    @HideGetSet
    public float getImpulse() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the impulse magnitude at the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call setImpulse() on it).")
    @JRDoc_PT("Define a magnitude do impulso no primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use setImpulse() nele).")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"value"})
    public void setImpulse(float value){
        //
    }

    @JRDoc_EN("Returns the penetration distance at the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call getDistance() on it).")
    @JRDoc_PT("Retorna a distância de penetração no primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use getDistance() nele).")
    @HideGetSet
    public float getDistance() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the penetration distance at the first contact point (deprecated, get a Contact using contactAt() or getContactList() and call setDistance() on it).")
    @JRDoc_PT("Define a distância de penetração no primeiro ponto de contato (obsoleto, pegue um Contact com contactAt() ou getContactList() e use setDistance() nele).")
    @HideGetSet
    @MethodArgs({"value"})
    public void setDistance(float value){
        //
    }

    @UnimplementedDoc
    public static class Contact{
        //

        public Contact() {
            //
        }

        @JRDoc_EN("Returns the normal vector of the contact point.")
        @JRDoc_PT("Retorna o vetor normal do ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        public Vector3 getNormal() {
            //
        return null;
        //

            //
        }
        @JRDoc_EN("Sets the normal vector of the contact point.")
        @JRDoc_PT("Define o vetor normal do ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs({"normal"})
        public void setNormal(Vector3 vector){
            //
        }

        @JRDoc_EN("Returns the exact contact point.")
        @JRDoc_PT("Retorna o ponto exato de contato.")
        @UnimplementedDoc
        @HideGetSet
        public Vector3 getContactPoint() {
            //
        return null;
        //

            //
        }
        @JRDoc_EN("Sets the exact contact point.")
        @JRDoc_PT("Define o ponto exato de contato.")
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs({"point"})
        public void setContactPoint(Vector3 vector){
            //
        }

        @JRDoc_EN("Returns the impulse magnitude applied at this contact point.")
        @JRDoc_PT("Retorna a magnitude do impulso aplicado neste ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        public float getImpulse() {
            //
        return 0;
        //

            //
        }
        @JRDoc_EN("Sets the impulse magnitude applied at this contact point.")
        @JRDoc_PT("Define a magnitude do impulso aplicado neste ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs({"value"})
        public void setImpulse(float value){
            //
        }

        @JRDoc_EN("Returns the penetration distance at this contact point.")
        @JRDoc_PT("Retorna a distância de penetração nesse ponto de contato.")
        @HideGetSet
        public float getDistance() {
            //
        return 0;
        //

            //
        }
        @JRDoc_EN("Sets the penetration distance at this contact point.")
        @JRDoc_PT("Define a distância de penetração nesse ponto de contato.")
        @HideGetSet
        @MethodArgs({"value"})
        public void setDistance(float value){
            //
        }

        @JRDoc_EN("Returns the Collider associated with this contact point.")
        @JRDoc_PT("Retorna o Collider associado a este ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        public Collider getCollider() {
            //
        return null;
        //

            //
        }
        @JRDoc_EN("Sets the Collider associated with this contact point.")
        @JRDoc_PT("Define o Collider associado a este ponto de contato.")
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs({"collider"})
        public void setCollider(Collider col){
            //
        }

        @JRDoc_EN("Returns the object associated with the Collider at this contact point.")
        @JRDoc_PT("Retorna o objeto associado ao Collider neste ponto de contato.")
        @HideGetSet
        @UnimplementedDoc
        public SpatialObject getColliderObject() {
            //
        return null;
        //

            //
        }
        @JRDoc_EN("Sets the object associated with the Collider at this contact point.")
        @JRDoc_PT("Define o objeto associado ao Collider neste ponto de contato.")
        @HideGetSet
        @UnimplementedDoc
        @MethodArgs({"object"})
        public void setColliderObject(SpatialObject object){
            //
        }
    }
}
