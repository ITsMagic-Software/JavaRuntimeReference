package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Texture.TextureInstance;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Voxels","Components"})
public final class VoxelHand extends Component{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelHand component;
    @IgnoreAutoComplete
    public VoxelHand(com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelHand component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    @BuildClassConstructor
    public VoxelHand(Engine engine){}
    //>REMOVE-BRIDGE<

    public VoxelHand() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelHand());
        //>REMOVE-BRIDGE<
    }


    @HideGetSet
    public float getDistance(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getDistance();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setDistance(float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setDistance(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getCrossHairSize(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getCrossHairSize();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairSize(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setCrossHairSize(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Color getCrossHairColor(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getCrossHairColor().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairSize(Color value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null){
            throw new NullPointerException("Color can't be null");
        }
        component.setCrossHairColor(value.instance);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Texture getCrossHairTexture(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        TextureInstance i = component.getCrossHair();
        if(i != null){
            return i.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setCrossHairTexture(Texture value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value != null) {
            component.setCrossHairTexture(value.instance);
        } else {
            component.setCrossHairTexture((TextureInstance) null);
        }
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isShowCrosshair(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isShowCrosshair();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setShowCrosshair(boolean value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setShowCrosshair(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getSelectedBlockID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getSelectedBlockID();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setSelectedBlockID(int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        component.setSelectedBlockID(value);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getLastHitBlockID(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.getLastHitBlockID();
        //>REMOVE-BRIDGE<
    }

    public void requestPut(){
        //<REMOVE-BRIDGE>
        component.requestPut();
        //>REMOVE-BRIDGE<
    }
    public void requestBreak(){
        //<REMOVE-BRIDGE>
        component.requestBreak();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isBlockBroken(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isBlockBroken();
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public boolean isBlockPlaced(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return component.isBlockPlaced();
        //>REMOVE-BRIDGE<
    }

    public interface Listener{
        void onBlockBroken(int blockType, int x, int y, int z);
        void onBlockPlaced(int blockType, int x, int y, int z);
        void onBlockSelected(int blockType, int x, int y, int z);
    }

    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setListener(Listener value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(value == null){
            component.setListener(null);
        } else {
            component.setListener(new com.itsmagic.engine.Engines.Engine.ComponentsV2.VoxelSystem.PlayerSystem.VoxelHand.Listener() {
                @Override
                public void onBlockBroken(int blockType, int x, int y, int z) {
                    value.onBlockBroken(blockType, x, y, z);
                }

                @Override
                public void onBlockPlaced(int blockType, int x, int y, int z) {
                    value.onBlockPlaced(blockType, x, y, z);
                }

                @Override
                public void onBlockSelected(int blockType, int x, int y, int z) {
                    value.onBlockSelected(blockType, x, y, z);
                }
            });
        }
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, VoxelHand.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
