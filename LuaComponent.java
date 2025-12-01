package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Lua","Components"})
public final class LuaComponent extends Component {

    //

    public LuaComponent() {
        //
        super();
        //

        //
    }

    @MethodArgs({"name"})
    public float getFloat(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toFloat();
        }
        return 0;
    }
    @MethodArgs({"name"})
    public double getDouble(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toDouble();
        }
        return 0;
    }
    @MethodArgs({"name"})
    public float getInt(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toInt();
        }
        return 0;
    }
    @MethodArgs({"name"})
    public long getLong(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toLong();
        }
        return 0;
    }
    @MethodArgs({"name"})
    public String getString(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toString();
        }
        return null;
    }
    @MethodArgs({"name"})
    public boolean getBoolean(String name){
        ValueObject o = getVar(name);
        if(o != null){
            return o.toBoolean();
        }
        return false;
    }
    @MethodArgs({"name"})
    public ValueObject getVar(String name){
        //
        return null;
        //

        //
    }

    @MethodArgs({"name","value"})
    public void setVar(String name, ValueObject value){
        //
    }
    @MethodArgs({"name","value"})
    public void setFloat(String name, float v){
        //
    }
    @MethodArgs({"name","value"})
    public void setDouble(String name, double v){
        //
    }
    @MethodArgs({"name","value"})
    public void setInt(String name, int v){
        //
    }
    @MethodArgs({"name","value"})
    public void setLong(String name, long v){
        //
    }
    @MethodArgs({"name","value"})
    public void setString(String name, String v){
        //
    }
    @MethodArgs({"name","value"})
    public void setBoolean(String name, boolean v){
        //
    }

    @MethodArgs({"name"})
    public void call(String name){
        super.callFunction(name);
    }
    @MethodArgs({"name","args"})
    public void call(String name, int args){
        super.callFunction(name, args);
    }
    @MethodArgs({"name","args"})
    public void call(String name, float args){
        super.callFunction(name, args);
    }
    @MethodArgs({"name","args"})
    public void call(String name, String args){
        super.callFunction(name, args);
    }
    @MethodArgs({"name","args"})
    public void call(String name, boolean args){
        super.callFunction(name, args);
    }
    @MethodArgs({"name","args"})
    public void call(String name, Object... args){
        super.callFunction(name, args);
    }
}