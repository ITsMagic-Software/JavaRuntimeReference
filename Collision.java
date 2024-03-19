package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics"})
public final class Collision {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision instance;
    @IgnoreAutoComplete
    @MethodArgs(args ={"collision"})
    public Collision(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public Collision() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getNormal() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.normal != null) {
            return instance.normal.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setNormal(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.normal = vector.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getContactPoint() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.contactPoint != null) {
            return instance.contactPoint.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"vector"})
    public void setContactPoint(Vector3 vector){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.contactPoint = vector.instance;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public SpatialObject getOtherObject() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.other != null) {
            return instance.other.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setOtherObject(SpatialObject otherObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(otherObject != null) {
            otherObject.validateNTC();
            instance.other = otherObject.instance.get();
        } else {
            instance.other = null;
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public PhysicsEntity getOtherPhysics() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.otherPhysicsController != null) {
            return instance.otherPhysicsController.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setOtherPhysics(PhysicsEntity otherObject){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(otherObject != null) {
            instance.otherPhysicsController = otherObject.instance;
        } else {
            instance.otherPhysicsController = null;
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @HideGetSet
    public Collider getCollider() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance.collider != null) {
            return (Collider) instance.collider.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs(args ={"otherObject"})
    public void setCollider(Collider col){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(col != null) {
            instance.collider = col.component;
        } else {
            instance.collider = null;
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getImpulse() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.appliedImpulse;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setImpulse(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.appliedImpulse = value;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getDistance() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.distance;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        instance.distance = value;
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public int contactCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance != null) {
            return instance.contactsList.size();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @HideGetSet
    public int getContactCount() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(instance != null) {
            return instance.contactsList.size();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"index"})
    @UnimplementedDoc
    public Contact contactAt(int index){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision.Contact contact = instance.contactsList.get(index);
        if(contact == null) return null;
        return contact.toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    public static class Contact{
        //<REMOVE-BRIDGE>
        @IgnoreAutoComplete
        public com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision.Contact instance;
        @IgnoreAutoComplete
        @MethodArgs(args ={"collision"})
        public Contact(com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision.Contact instance) {
            this.instance = instance;
        }
        //>REMOVE-BRIDGE<

        public Contact() {
            //<REMOVE-BRIDGE>
            this.instance = new com.itsmagic.engine.Engines.Engine.ObjectOriented.Physics.Utils.Collision.Contact();
            //>REMOVE-BRIDGE<
        }

        @UnimplementedDoc
        @HideGetSet
        public Vector3 getNormal() {
            //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            if(instance.normal != null) {
                return instance.normal.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"vector"})
        public void setNormal(Vector3 vector){
            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            instance.normal = vector.instance;
            //>REMOVE-BRIDGE<
        }

        @UnimplementedDoc
        @HideGetSet
        public Vector3 getContactPoint() {
            //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            if(instance.contactPoint != null) {
                return instance.contactPoint.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"vector"})
        public void setContactPoint(Vector3 vector){
            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            instance.contactPoint = vector.instance;
            //>REMOVE-BRIDGE<
        }

        @UnimplementedDoc
        @HideGetSet
        public float getImpulse() {
            //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            return instance.appliedImpulse;
            //>REMOVE-BRIDGE<
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"value"})
        public void setImpulse(float value){
            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            instance.appliedImpulse = value;
            //>REMOVE-BRIDGE<
        }

        @HideGetSet
        public float getDistance() {
            //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            return instance.distance;
            //>REMOVE-BRIDGE<
        }
        @HideGetSet
        @MethodArgs(args ={"value"})
        public void setDistance(float value){
            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            instance.distance = value;
            //>REMOVE-BRIDGE<
        }

        @UnimplementedDoc
        @HideGetSet
        public Collider getCollider() {
            //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            if(instance.collider != null) {
                return (Collider) instance.collider.toJAVARuntime();
            }
            return null;
            //>REMOVE-BRIDGE<
        }
        @UnimplementedDoc
        @HideGetSet
        @MethodArgs(args ={"otherObject"})
        public void setCollider(Collider col){
            //<REMOVE-BRIDGE>
            Thread.requestEngineThread();
            if(col != null) {
                instance.collider = col.component;
            } else {
                instance.collider = null;
            }
            //>REMOVE-BRIDGE<
        }
    }
}
