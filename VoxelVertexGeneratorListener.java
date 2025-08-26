package JAVARuntime;

@Deprecated
@DeprecatedInfo(info = "Use VoxelGeneratorListenerV2 instead")
public interface VoxelVertexGeneratorListener {
  int LEFT = 0;
  int RIGHT = 1;
  int UP = 2;
  int DOWN = 3;
  int FRONT = 4;
  int BACK = 5;

  boolean drawFace(int blockType, int sideBlockType, int sideFace);
}
