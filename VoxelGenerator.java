package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.TerrainSystem.GeneratorListener;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.ObjectOriented.GameObject.ObjectUtils;
import com.itsmagic.engine.Engines.Engine.Runnables.EngineRunnable;
import com.itsmagic.engine.Engines.Native.Adapters.OH3LevelIntArray;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelGenerator extends Component{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.TerrainSystem.VoxelGenerator component;
    @IgnoreAutoComplete
    public VoxelGenerator(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.TerrainSystem.VoxelGenerator component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public VoxelGenerator() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.TerrainSystem.VoxelGenerator());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"listener"})
    public void setListener(Component value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null){
            this.component.setListener(null);
            return;
        }
        if(value.type == Type.JavaComponent){
            if(value instanceof VoxelGeneratorListener){
                VoxelVertexGeneratorListener vertexGeneratorListener = null;
                if(value instanceof VoxelVertexGeneratorListener){
                    vertexGeneratorListener = (VoxelVertexGeneratorListener) value;
                } else {
                    vertexGeneratorListener = new VoxelVertexGeneratorListener() {
                        @Override
                        public boolean drawFace(int blockType, int sideBlockType, int sideFace) {
                            return sideBlockType == 0;
                        }
                    };
                }

                VoxelGeneratorListener voxelGeneratorListener = (VoxelGeneratorListener) value;
                final VoxelVertexGeneratorListener finalVertexGeneratorListener = vertexGeneratorListener;
                GeneratorListener ll = new GeneratorListener() {
                    @Override
                    public void storeChunk(OH3LevelIntArray chunk, int x, int z) {
                        voxelGeneratorListener.storeChunk(chunk.toJAVARuntime(), x, z);
                    }

                    @Override
                    public OH3LevelIntArray loadChunk(int x, int z) {
                        JAVARuntime.OH3LevelIntArray rt = voxelGeneratorListener.loadChunk(x, z);
                        if (rt != null) {
                            return rt.buffer;
                        }
                        return null;
                    }

                    @Override
                    public int getGroundHeight(int x, int z) {
                        return voxelGeneratorListener.getGroundHeight(x, z);
                    }

                    @Override
                    public int getBlockType(int x, int y, int z, int groundHeight) {
                        return voxelGeneratorListener.getBlockType(x, y, z, groundHeight);
                    }

                    @Override
                    public boolean drawFace(int blockType, int sideBlockType, int sideFace) {
                        return finalVertexGeneratorListener.drawFace(blockType, sideBlockType, sideFace);
                    }
                };
                this.component.setListener(ll);
                Engine.runOnEngine(new EngineRunnable(new EngineRunnable.Runnable() {
                    @Override
                    public boolean run() {
                        if(VoxelGenerator.this.component.getListener() != ll){
                            return false;
                        }
                        if(value.javaComponent == null || ObjectUtils.isGarbage(value.javaComponent.gameObject)){
                            VoxelGenerator.this.component.setListener(null);
                            return false;
                        }

                        return true;
                    }
                }));
            } else {
                throw new RuntimeException("Component doesn't explicit implement VoxelGeneratorListener");
            }
        } else {
            throw new RuntimeException("Component doesn't explicit implement VoxelGeneratorListener");
        }
        //>REMOVE-BRIDGE<
    }

    public void removeListener(){
        //<REMOVE-BRIDGE>
        setListener(null);
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, VoxelGenerator.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
