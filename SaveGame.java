package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Engines.Engine.SaveGame.ColorPair;
import com.itsmagic.engine.Engines.Engine.SaveGame.FloatPair;
import com.itsmagic.engine.Engines.Engine.SaveGame.IntPair;
import com.itsmagic.engine.Engines.Engine.SaveGame.QuaternionPair;
import com.itsmagic.engine.Engines.Engine.SaveGame.StringPair;
import com.itsmagic.engine.Engines.Engine.SaveGame.Vector2Pair;
import com.itsmagic.engine.Engines.Engine.SaveGame.Vector3Pair;
import com.itsmagic.engine.Engines.Engine.Color.ColorINT;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"SaveGame"})
public final class SaveGame {

    private SaveGame() { }

    /// Abstracts
    @MethodArgs(args ={"key","value"})
    public static void saveString(String key, String str){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, str);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static String loadString(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        StringPair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchString(key);
        if(pair != null){
            String value = pair.getValue();
            if(value == null){
                return "";
            } else {
                return value;
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteString(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteString(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveFloat(String key, float value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static float loadFloat(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        FloatPair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchFloat(key);
        if(pair != null){
            return pair.getValue();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteFloat(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteFloat(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveInt(String key, int value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static int loadInt(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        IntPair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchInt(key);
        if(pair != null){
            return pair.getValue();
        }
        return 0;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteInt(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteInt(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveVector3(String key, Vector3 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value.instance);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static Vector3 loadVector3(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        Vector3Pair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchVector3(key);
        if(pair != null){
            com.itsmagic.engine.Engines.Engine.Vector.Vector3 value = pair.getValue();
            if(value == null){
                return null;
            } else {
                return value.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteVector3(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteVector3(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveVector2(String key, Vector2 value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value.instance);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static Vector2 loadVector2(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        Vector2Pair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchVector2(key);
        if(pair != null){
            com.itsmagic.engine.Engines.Engine.Vector.Vector2 value = pair.getValue();
            if(value == null){
                return null;
            } else {
                return value.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteVector2(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteVector2(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveQuaternion(String key, Quaternion value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value.instance);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static Quaternion loadQuaternion(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        QuaternionPair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchQuaternion(key);
        if(pair != null){
            com.itsmagic.engine.Engines.Engine.Quaternion.Quaternion value = pair.getValue();
            if(value == null){
                return null;
            } else {
                return value.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteQuaternion(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteQuaternion(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"key","value"})
    public static void saveColor(String key, Color value){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().save(key, value.instance);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static Color loadColor(String key){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        ColorPair pair = com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().searchColor(key);
        if(pair != null){
            ColorINT value = pair.getValue();
            if(value == null){
                return null;
            } else {
                return value.toJAVARuntime();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"key"})
    public static void deleteColor(String key){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().deleteColor(key);
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }

    public static void deleteAll(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.load();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.getSaveGameFile().clear();
        com.itsmagic.engine.Engines.Engine.SaveGame.SaveGame.save();
        //>REMOVE-BRIDGE<
    }
}
