package JAVARuntime;

public interface VoxelGeneratorListenerV2 {
    int getGroundHeight(int x, int z);
    int getBlockType(int x, int y, int z, int groundHeight);

    void storeChunk(OH3LevelIntArray chunk, int x, int z);
    OH3LevelIntArray loadChunk(int x, int z);

    void onChunkCreated(SpatialObject object, VoxelChunk chunk);

    void onChunkBuilt(SpatialObject object, VoxelChunk chunk);

    int LEFT = 0;
    int RIGHT = 1;
    int UP = 2;
    int DOWN = 3;
    int FRONT = 4;
    int BACK = 5;

    boolean drawFace(int blockType, int sideBlockType, int sideFace, Point3 internalCoords);

    int DIR_UP = 0;
    int DIR_DOWN = 1;
    int DIR_FORWARD = 2;
    int DIR_BACK = 3;
    int DIR_LEFT = 4;
    int DIR_RIGHT = 5;
    int getTextureIndex(int blockType, int forwardDir, int face);

    void onFaceBuilt(SpatialObject object, VoxelChunk chunk, int blockType, int forwardDir, int face, Point3 coords, int v0i, int v1i, int v2i, int v3i);
}
