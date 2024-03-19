package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Engines.Utils.PerlinNoise.SimplexNoise;
//>REMOVE-BRIDGE<

/**
 * A speed-improved simplex noise algorithm for 2D, 3D and 4D in Java.
 *
 * Based on example code by Stefan Gustavson (stegu@itn.liu.se).
 * Optimisations by Peter Eastman (peastman@drizzle.stanford.edu).
 * Better rank ordering method by Stefan Gustavson in 2012.
 *
 * This could be speeded up even further, but it's useful as it is.
 *
 * Version 2012-03-09
 *
 * This code was placed in the public domain by its original author,
 * Stefan Gustavson. You may use it as you see fit, but
 * attribution is appreciated.
 *
 * This class was not made by ITsMagic Engine!
 * OUTPUT VALUES ARE NORMALIZED (-1, 1)
 */
@ClassCategory(cat ={"Algorithms","Math"})
public class PerlinNoise {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient float scale = 1f;
    //>REMOVE-BRIDGE<

    public PerlinNoise() {}
    public PerlinNoise(float scale) {
        //<REMOVE-BRIDGE>
        this.scale = scale;
        //>REMOVE-BRIDGE<
    }

    /**
     * Defautl scale = 10
     */


    /// Builder
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(float scale){
        //<REMOVE-BRIDGE>
        this.scale = scale;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getScale(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return scale;
        //>REMOVE-BRIDGE<
    }

    /// Abstracts
    @MethodArgs(args ={"x","y"})
    public double noise(double x, double y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SimplexNoise.noise(x / scale, y / scale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public double noise(double x, double y, double z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SimplexNoise.noise(x / scale, y / scale, z / scale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public double noise(double x, double y, double z, double w){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return SimplexNoise.noise(x / scale, y / scale, z / scale, w / scale);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public float noise(int x, int y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale);
        //return (int) SimplexNoise.noise(x, y);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public float noise(int x, int y, int z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale, z / scale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public float noise(int x, int y, int z, int w){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale, z / scale, w / scale);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public float noise(float x, float y){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public float noise(float x, float y, float z){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale, z / scale);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public float noise(float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return (float) SimplexNoise.noise(x / scale, y / scale, z / scale, w / scale);
        //>REMOVE-BRIDGE<
    }
}
