package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

public final class RenderableVertex {

  public RenderableVertex() {}

  @HideGetSet
  public Vertex getVertex() {

    return null;
  }

  @HideGetSet
  public void setVertex(Vertex vertex) {}

  public int objectCount() {

    return 0;
  }

  @MethodArgs({"idx"})
  public RenderableObject objectAt(int idx) {

    return null;
  }

  public void addObject(RenderableObject object) {}
}
