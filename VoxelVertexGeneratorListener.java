package JAVARuntime;

public interface VoxelVertexGeneratorListener {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    public static final int FRONT = 4;
    public static final int BACK = 5;
    boolean drawFace(int blockType, int sideBlockType, int sideFace);
}
