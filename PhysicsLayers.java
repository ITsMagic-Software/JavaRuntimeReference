package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Main.Main;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Settings.Physics.Layer;
import com.itsmagic.engine.Engines.Native.OHString.OHString;
//>REMOVE-BRIDGE<

public class PhysicsLayers {

    private PhysicsLayers() {}

    @MethodArgs(args ={"name"})
    public static PhysicsLayer findByName(String name){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Layer l = Engine.getGameSettings(Main.getContext()).getPhysicsSettings().findName(new OHString(name));
        if(l != null) {
            return l.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"layer"})
    public static void add(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer == null){
            throw new NullPointerException("layer can't be null");
        }
        Engine.getGameSettings(Main.getContext()).getPhysicsSettings().addLayer(layer.layer);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"layer"})
    public static void remove(PhysicsLayer layer){
        //<REMOVE-BRIDGE>
        if(layer == null){
            throw new NullPointerException("layer can't be null");
        }
        Engine.getGameSettings(Main.getContext()).getPhysicsSettings().removeLayer(layer.layer);
        //>REMOVE-BRIDGE<
    }

    public static void apply(){
        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Physics.PhysicsLayers.invalidate();
        //>REMOVE-BRIDGE<
    }
}


