package JAVARuntime;

//

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
 */
@ClassCategory(cat={"Algorithms","Math"})
public class PerlinNoise {

    //

    /**
     * Defautl scale = 10
     */

    /// Builder
    @HideGetSet
    @MethodArgs(args={"scale"})
    public void setScale(float scale){
        //
    }
    @HideGetSet
    public float getScale(){
        //
        return 0;
        //

        //
    }

    /// Abstracts
    @MethodArgs(args={"x","y"})
    public double noise(double x, double y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z"})
    public double noise(double x, double y, double z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z","w"})
    public double noise(double x, double y, double z, double w){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"x","y"})
    public float noise(int x, int y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z"})
    public float noise(int x, int y, int z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z","w"})
    public float noise(int x, int y, int z, int w){
        //
        return 0;
        //

        //
    }

    @MethodArgs(args={"x","y"})
    public float noise(float x, float y){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z"})
    public float noise(float x, float y, float z){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"x","y","z","w"})
    public float noise(float x, float y, float z, float w){
        //
        return 0;
        //

        //
    }
}
