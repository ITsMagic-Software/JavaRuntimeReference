package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Utils.Mathematicals.RandomF;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Math"})
public class Random {
    //<REMOVE-BRIDGE>
    //>REMOVE-BRIDGE<

    private Random() { }

    /// Abstracts
    @MethodArgs(args ={"min","max"})
    public static int range(int min, int max){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return RandomF.intRange(min, max);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"min","max"})
    public static float range(float min, float max){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return RandomF.floatRange(min, max);
        //>REMOVE-BRIDGE<
    }
}
