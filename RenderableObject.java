package JAVARuntime;

public final class RenderableObject {
    private transient Component component;
    private transient float[] renderMatrix;
    private transient boolean visibleByCamera;

    public RenderableObject() {
    }
    public RenderableObject(Component component, float[] renderMatrix, boolean visibleByCamera) {
        this.component = component;
        this.renderMatrix = renderMatrix;
        this.visibleByCamera = visibleByCamera;
    }
    public RenderableObject(float[] renderMatrix, boolean visibleByCamera) {
        this.renderMatrix = renderMatrix;
        this.visibleByCamera = visibleByCamera;
    }

    @HideGetSet
    public <T extends Component> T getComponent() {
        return (T) component;
    }
    @HideGetSet
    public void setComponent(Component component) {
        this.component = component;
    }

    @HideGetSet
    public float[] getRenderMatrix() {
        return renderMatrix;
    }
    @HideGetSet
    public void setRenderMatrix(float[] renderMatrix) {
        this.renderMatrix = renderMatrix;
    }

    @HideGetSet
    public boolean isVisibleByCamera() {
        return visibleByCamera;
    }
    @HideGetSet
    public void setVisibleByCamera(boolean visibleByCamera) {
        this.visibleByCamera = visibleByCamera;
    }
}
