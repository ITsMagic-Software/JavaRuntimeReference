package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Shaders"})
public final class FrameBuffer {

  @MethodArgs({"width", "height"})
  public FrameBuffer(int width, int height) {}

  @MethodArgs({"width", "height", "renderPercentage"})
  public FrameBuffer(int width, int height, int renderPercentage) {}

  @MethodArgs({"width", "height", "renderPercentage", "colorAttachments"})
  public FrameBuffer(int width, int height, int renderPercentage, int colorAttachments) {}

  @MethodArgs({"width", "height", "renderPercentage", "colorAttachments", "depthAttachment"})
  public FrameBuffer(int width, int height, int renderPercentage, int colorAttachments, Texture depthAttachment) {}

  public void bind() {}

  public void unbind() {}

  @MethodArgs({"width", "height"})
  public void resize(int width, int height) {}

  @MethodArgs({"width", "height", "renderPercentage"})
  public void resize(int width, int height, int renderPercentage) {}

  @HideGetSet
  public int getWidth() {

    return 0;
  }

  @HideGetSet
  public int getHeight() {

    return 0;
  }

  @HideGetSet
  public int getMaxWidth() {

    return 0;
  }

  @HideGetSet
  public int getMaxHeight() {

    return 0;
  }

  @HideGetSet
  public int getRenderPercentage() {

    return 0;
  }

  @HideGetSet
  @MethodArgs({"value"})
  public void setRenderPercentage(int value) {}

  @HideGetSet
  public int getColorAttachmentsCount() {

    return 0;
  }

  @HideGetSet
  public Texture getColorTexture() {

    return null;
  }

  @HideGetSet
  public Texture getColorAttachment() {
    return getColorTexture();
  }

  @MethodArgs({"idx"})
  public Texture getColorTexture(int idx) {

    return null;
  }

  @MethodArgs({"idx"})
  public Texture getColorAttachment(int idx) {
    return getColorTexture(idx);
  }

  public Texture[] getColorTextureArray() {

    return null;
  }

  public Texture[] getColorAttachmentArray() {
    return getColorTextureArray();
  }

  @HideGetSet
  public Texture getDepthTexture() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setDepthTexture(Texture texture) {}

  @HideGetSet
  public Texture getDepthAttachment() {

    return null;
  }

  @HideGetSet
  @MethodArgs({"texture"})
  public void setDepthAttachment(Texture texture) {}

  public void destroy() {}
}
