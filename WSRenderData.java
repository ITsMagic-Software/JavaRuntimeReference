package JAVARuntime;

@ClassCategory(cat = {"Shaders"})
public class WSRenderData {

  private WSRenderData() {}

  public int lightCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public Light lightAt(int idx) {

    return null;
  }

  public int cameraCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public Camera cameraAt(int idx) {

    return null;
  }
}
