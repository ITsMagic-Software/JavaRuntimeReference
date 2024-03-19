package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.Screen;
import com.itsmagic.engine.Engines.Engine.Texture.DepthTexture;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Shaders"})
public final class FrameBuffer {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer frameBuffer;
    @IgnoreAutoComplete
    public FrameBuffer(com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer frameBuffer) {
        this.frameBuffer = frameBuffer;
    }

    //@IgnoreAutoComplete
    //public int width, height, renderPercentage;
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"width", "height"})
    public FrameBuffer(int width, int height) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.frameBuffer = new com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer(width, height,  100);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"width", "height", "renderPercentage"})
    public FrameBuffer(int width, int height, int renderPercentage) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.frameBuffer = new com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer(width, height,  renderPercentage);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"width", "height", "renderPercentage", "colorAttachments"})
    public FrameBuffer(int width, int height, int renderPercentage, int colorAttachments) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        this.frameBuffer = new com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer(width, height,  renderPercentage, colorAttachments);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"width", "height", "renderPercentage", "colorAttachments", "depthAttachment"})
    public FrameBuffer(int width, int height, int renderPercentage, int colorAttachments, Texture depthAttachment) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(depthAttachment == null){
            throw new RuntimeException("DepthAttachment can't be null");
        }
        if(!(depthAttachment.instance instanceof DepthTexture)){
            throw new RuntimeException("DepthAttachment needs to be a depth texture. You can create one using Texture.newDepth()");
        }
        this.frameBuffer = new com.itsmagic.engine.Engines.Graphics.FBOS.FrameBuffer(width, height,  renderPercentage, colorAttachments, (DepthTexture) depthAttachment.instance);
        //>REMOVE-BRIDGE<
    }

    public void bind(){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.bind();
        }
        //>REMOVE-BRIDGE<
    }
    public void unbind(){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.unbind(com.itsmagic.engine.Engines.Engine.Screen.getWidth(), Screen.getHeight());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"width", "height"})
    public void resize(int width, int height){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.resize(width, height);
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"width", "height", "renderPercentage"})
    public void resize(int width, int height, int renderPercentage){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.setRenderPercentage(renderPercentage);
            this.frameBuffer.resize(width, height);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getActiveWidth();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getActiveHeight();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getMaxWidth(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getOriginalWidth();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getMaxHeight(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getOriginalHeight();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getRenderPercentage(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getRenderPercentage();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setRenderPercentage(int value){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.setRenderPercentage(value);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public int getColorAttachmentsCount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getColorAttachmentsCount();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }


    @HideGetSet
    public Texture getColorTexture(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getColorTexture().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Texture getColorAttachment(){
        return getColorTexture();
    }
    @MethodArgs(args ={"idx"})
    public Texture getColorTexture(int idx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getColorTexture(idx).toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Texture getColorAttachment(int idx){
        return getColorTexture(idx);
    }
    public Texture[] getColorTextureArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            Texture[] textures = new Texture[this.frameBuffer.getColorAttachmentsCount()];
            for (int i = 0; i < this.frameBuffer.colorTexturesCount(); i++) {
                textures[i] = this.frameBuffer.getColorTexture(i).toJAVARuntime();
            }
            return textures;
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    public Texture[] getColorAttachmentArray(){
        return getColorTextureArray();
    }

    @HideGetSet
    public Texture getDepthTexture(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(validate()) {
            return this.frameBuffer.getDepth().toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setDepthTexture(Texture texture){
        //<REMOVE-BRIDGE>
        if(validate()) {
            if(texture == null){
                throw new RuntimeException("Texture can't be null");
            }
            if(!(texture.instance instanceof DepthTexture)){
                throw new RuntimeException("Texture needs to be a depth texture. You can create one using Texture.newDepth()");
            }
            this.frameBuffer.setDepthTexture((DepthTexture) texture.instance);
        }
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public Texture getDepthAttachment(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return this.frameBuffer.getDepth().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"texture"})
    public void setDepthAttachment(Texture texture){
        //<REMOVE-BRIDGE>
        if(validate()) {
            if(texture == null){
                throw new RuntimeException("Texture can't be null");
            }
            if(!(texture.instance instanceof DepthTexture)){
                throw new RuntimeException("Texture needs to be a depth texture. You can create one using Texture.newDepth()");
            }
            this.frameBuffer.setDepthTexture((DepthTexture) texture.instance);
        }
        //>REMOVE-BRIDGE<
    }

    public void destroy(){
        //<REMOVE-BRIDGE>
        if(validate()) {
            this.frameBuffer.delete();
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    public boolean validate(){
        Thread.requestEngineThread();
        if(!this.frameBuffer.destroyed){
            return true;
        }
        throw new RuntimeException("Framebuffer was destroyed!");
    }
    //>REMOVE-BRIDGE<
}
