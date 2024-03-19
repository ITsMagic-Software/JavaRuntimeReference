package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public final class Collision {
    //

    public Collision() {
        //
    }

    @HideGetSet
    public Vector3 getNormal() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setNormal(Vector3 vector){
        //
    }

    @HideGetSet
    public Vector3 getContactPoint() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setContactPoint(Vector3 vector){
        //
    }

    @HideGetSet
    public SpatialObject getOtherObject() {
        //
        return null;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setOtherObject(SpatialObject otherObject){
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public PhysicsEntity getOtherPhysics() {
        //
        return null;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setOtherPhysics(PhysicsEntity otherObject){
        //
    }

    @UnimplementedDoc
    @HideGetSet
    public Collider getCollider() {
        //
        return null;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setCollider(Collider col){
        //
    }

    @HideGetSet
    public float getImpulse() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImpulse(float value){
        //
    }

    @HideGetSet
    public float getDistance() {
        //
        return 0;
        //

        //
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //
    }

    @UnimplementedDoc
    public int contactCount() {
        //
        return 0;
        //

        //
    }
    @UnimplementedDoc
    @HideGetSet
    public int getContactCount() {
        //
        return 0;
        //

        //
    }
    @MethodArgs(args ={"index"})
    @UnimplementedDoc
    public Contact contactAt(int index){
        //
        return null;
        //

        //
    }

    @UnimplementedDoc
    public static class Contact{
        //

        public Contact() {
            //
        }

        @UnimplementedDoc
        @HideGetSet
        public Vector3 getNormal() {
            //
        return null;
        //

            //
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"vector"})
        public void setNormal(Vector3 vector){
            //
        }

        @UnimplementedDoc
        @HideGetSet
        public Vector3 getContactPoint() {
            //
        return null;
        //

            //
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"vector"})
        public void setContactPoint(Vector3 vector){
            //
        }

        @UnimplementedDoc
        @HideGetSet
        public float getImpulse() {
            //
        return 0;
        //

            //
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"value"})
        public void setImpulse(float value){
            //
        }

        @HideGetSet
        public float getDistance() {
            //
        return 0;
        //

            //
        }
        @HideGetSet
        @MethodArgs(args ={"value"})
        public void setDistance(float value){
            //
        }

        @UnimplementedDoc
        @HideGetSet
        public Collider getCollider() {
            //
        return null;
        //

            //
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"otherObject"})
        public void setCollider(Collider col){
            //
        }
    }
}
