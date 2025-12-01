package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoElement
        //
{
    public enum RenderMode{
        Triangles, WireFrame, Outline
    }

    //
    private boolean drawInFront;
    private float visibleDistance = -1;
    private float fadeOutRange = -1;
    private boolean additiveMode;
    private float maxScaleBasedCameraSize = -1;
    private boolean enableLight = false;
    private float lightIntensity = 1f;
    private boolean billboard = false;
    private boolean pooling = false;

    private transient Object userPointer = null;

    public Object getUserPointer() { return userPointer; }
    @MethodArgs({"userPointer"})
    public void setUserPointer(Object userPointer) { this.userPointer = userPointer; }

    public Vertex getVertex(){
        return null;
    }
    public Color getColor(){
        return null;
    }
    public Texture getTexture(){
        return null;
    }
    public RenderMode getRenderMode(){
        return RenderMode.Triangles;
    }
    public float[] getMatrix(){
        return null;
    }
    public int getWireFrameWidth(){
        //
        return 0;
        //

        //
    }

    public float getOutlineScale() {
        return 0.1f;
    }

    public boolean isDualFaceRender(){
        return false;
    }

    public boolean isEnableTransparency() {
        //
        return false;
        //

        //
    }
    public void setEnableTransparency(boolean enableTransparency) {
        //
    }

    public boolean isBillboard() {
        return billboard;
    }
    public void setBillboard(boolean billboard) {
        this.billboard = billboard;
    }

    public boolean isDrawInFront() {
        return drawInFront;
    }
    public void setDrawInFront(boolean drawInFront) {
        this.drawInFront = drawInFront;
    }

    public boolean isAdditiveMode() {
        return additiveMode;
    }
    public void setAdditiveMode(boolean additiveMode) {
        this.additiveMode = additiveMode;
    }

    public boolean isEnableLight() {
        return enableLight;
    }
    public void setEnableLight(boolean enableLight) {
        this.enableLight = enableLight;
    }

    public float getMaxScaleBasedCameraSize() {
        return maxScaleBasedCameraSize;
    }
    public void setMaxScaleBasedCameraSize(float maxScaleBasedCameraSize) {
        this.maxScaleBasedCameraSize = maxScaleBasedCameraSize;
    }

    public float getLightIntensity() {
        return lightIntensity;
    }
    public void setLightIntensity(float lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public float getVisibleDistance() {
        return visibleDistance;
    }
    public void setVisibleDistance(float visibleDistance) {
        this.visibleDistance = visibleDistance;
    }

    public float getFadeOutRange() {
        return fadeOutRange;
    }
    public void setFadeOutRange(float fadeOutRange) {
        this.fadeOutRange = fadeOutRange;
    }

    public boolean isPooling() {
        return pooling;
    }
    public void setPooling(boolean pooling) {
        this.pooling = pooling;
    }

    public boolean isScaleBasedCamera(){ return false; }
}
