package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Fonts"})
public class Font {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.TextRender.Font font;
    @IgnoreAutoComplete
    public Font(com.itsmagic.engine.Engines.Engine.TextRender.Font font) {
        this.font = font;
    }

    @BuildClassConstructor
    public Font(Engine engine){ }
    //>REMOVE-BRIDGE<

    private Font() { }

    public int getResolution() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return font.getResolution();
        //>REMOVE-BRIDGE<
    }

    public float measureWidth(String text){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return font.measureWidth(text);
        //>REMOVE-BRIDGE<
    }
    public float measureWidth(String[] lines){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return font.measureWidth(lines);
        //>REMOVE-BRIDGE<
    }
    public float measureHeight(String text){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return font.measureHeight(text);
        //>REMOVE-BRIDGE<
    }
    public float measureHeight(String[] lines){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return font.measureHeight(lines);
        //>REMOVE-BRIDGE<
    }
}
