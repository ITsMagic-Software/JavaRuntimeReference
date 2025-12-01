package JAVARuntime;

//

public final class AnimationEntry {

    //

    @MethodArgs({"object"})
    public AnimationEntry(SpatialObject object) {
        //
    }
    @MethodArgs({"metaID"})
    public AnimationEntry(String metaID) {
        //
    }

    @JRDoc_EN("Returns the meta id of the object.")
    @JRDoc_PT("Retorna o meta id do objeto.")
    @UnimplementedDoc
    @HideGetSet
    public String getObjectMetaID() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the meta id of the object.")
    @JRDoc_PT("Define a meta id do objeto.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"value"})
    public void setObjectMetaID(String value) {
        //
    }

    @JRDoc_EN("Returns the position of the object.")
    @JRDoc_PT("Retorna a posição do objeto.")
    @UnimplementedDoc
    @HideGetSet
    public Vector3 getPosition() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the position of the object.")
    @JRDoc_PT("Define a posição do objeto.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"value"})
    public void setPosition(Vector3 value) {
        //
    }

    @JRDoc_EN("Returns the rotation of the object.")
    @JRDoc_PT("Retorna a rotação do objeto.")
    @UnimplementedDoc
    @HideGetSet
    public Quaternion getRotation() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the rotation of the object.")
    @JRDoc_PT("Define a rotação do objeto.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"value"})
    public void setRotation(Quaternion value) {
        //
    }

    @JRDoc_EN("Returns the scale of the object.")
    @JRDoc_PT("Retorna a escala do objeto.")
    @UnimplementedDoc
    @HideGetSet
    public Vector3 getScale() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the scale of the object.")
    @JRDoc_PT("Define a escala do objeto.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"value"})
    public void setScale(Vector3 value) {
        //
    }
}
