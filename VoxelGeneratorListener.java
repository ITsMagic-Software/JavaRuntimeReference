package JAVARuntime;

public interface VoxelGeneratorListener {
    void storeChunk(OH3LevelIntArray chunk, int x, int z);
    OH3LevelIntArray loadChunk(int x, int z);
    int getGroundHeight(int x, int z);
    int getBlockType(int x, int y, int z, int groundHeight);
}
