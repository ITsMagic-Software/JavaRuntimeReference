package JAVARuntime;

//<REMOVE-BRIDGE>
//<inspector>

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Vector4 {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vector.Vector4 instance;
    @IgnoreAutoComplete
    public Vector4(com.itsmagic.engine.Engines.Engine.Vector.Vector4 instance) {
        this.instance = instance;
    }
    //>REMOVE-BRIDGE<

    public Vector4() {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(float x, float y, float z, float w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(float x, float y, float z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(float x, float y, int z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(float x, int y, int z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(int x, int y, int z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(int x, float y, int z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(int x, int y, float z, int w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public Vector4(int x, int y, int z, float w) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, w);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y","z"})
    public Vector4(float x, float y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector4(int x, float y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector4(float x, int y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector4(float x, float y, int z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector4(int x, int y, float z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z"})
    public Vector4(float x, int y, int z) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, z, 0);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"x","y"})
    public Vector4(float x, float y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, 0, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector4(int x, float y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, 0, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector4(float x, int y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, 0, 0);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y"})
    public Vector4(int x, int y) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(x, y, 0, 0);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"a"})
    public Vector4(float a) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(a);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public Vector4(int a) {
        //<REMOVE-BRIDGE>
        this.instance = new com.itsmagic.engine.Engines.Engine.Vector.Vector4(a);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public float getX(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.x;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setX(float value){
        //<REMOVE-BRIDGE>
        instance.x = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getY(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.y;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setY(float value){
        //<REMOVE-BRIDGE>
        instance.y = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getZ(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.z;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setZ(float value){
        //<REMOVE-BRIDGE>
        instance.z = value;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    public float getW(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return instance.w;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"value"})
    public void setW(float value){
        //<REMOVE-BRIDGE>
        instance.w = value;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public void set(Vector4 vector){
        //<REMOVE-BRIDGE>
        this.instance.set(vector.instance);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public void set(float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        this.instance.set(x, y, z, w);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"a"})
    public void set(float a){
        //<REMOVE-BRIDGE>
        this.instance.set(a);
        //>REMOVE-BRIDGE<
    }
}
