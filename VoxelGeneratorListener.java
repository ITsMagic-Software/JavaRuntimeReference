package JAVARuntime;

@Deprecated
@DeprecatedInfo(info = "Use VoxelGeneratorListenerV2 instead")
public interface VoxelGeneratorListener {
  int getGroundHeight(int x, int z);

  int getBlockType(int x, int y, int z, int groundHeight);

  void storeChunk(OH3LevelIntArray chunk, int x, int z);

  OH3LevelIntArray loadChunk(int x, int z);
}
