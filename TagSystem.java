package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.TagSystem.Tag;
//>REMOVE-BRIDGE<

public final class TagSystem {

    @MethodArgs(args ={"name"})
    public static void addTag(String name){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Engine.getGameSettings().getTagSystem().addTag(name);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"oldName","newName"})
    public static void renameTag(String oldName, String newName){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Tag tag = Engine.getGameSettings().getTagSystem().getTagByName(oldName);
        tag.setName(newName);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public static void deleteTag(String name){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        Engine.getGameSettings().getTagSystem().deleteTagByName(name);
        //>REMOVE-BRIDGE<
    }
}
