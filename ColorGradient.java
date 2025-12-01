package JAVARuntime;

//


/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class ColorGradient {

    public static class Point {
        //

        public Point() {
            //
        }

        public float getLocation() {
            //
            return 0;
            //

            //
        }
        @MethodArgs({"location"})
        public void setLocation(float location) {
            //
        }

        public Color getColor() {
            //
            return null;
            //

            //
        }
        @MethodArgs({"color"})
        public void setColor(Color color) {
            //
        }
    }

    //

    //

    public ColorGradient() {
        //
    }

    @MethodArgs({"location","color"})
    public ColorGradient.Point addPoint(float location, Color colorINT){
        //
        return null;
        //

        //
    }

    @MethodArgs({"index"})
    public void removePointAt(int idx){
        //
    }

    @MethodArgs({"index"})
    public Point pointAt(int idx){
        //
        return null;
        //

        //
    }
    public void clear(){
        //
    }
    public int pointsCount(){
        //
        return 0;
        //

        //
    }

    @MethodArgs({"location"})
    public Color evaluate(float location){
        //
        return null;
        //

        //
    }

    public String toJson(){
        //
        return null;
        //

        //
    }
    public ColorGradient fromJson(String json){
        //
        return null;
        //

        //
    }
}
