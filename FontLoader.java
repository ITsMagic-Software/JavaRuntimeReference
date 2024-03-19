package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Fonts"})
public final class FontLoader {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.TextRender.Font font;
    @IgnoreAutoComplete
    public FontLoader(com.itsmagic.engine.Engines.Engine.TextRender.Font font) {
        this.font = font;
    }

    @BuildClassConstructor
    public FontLoader(Engine engine){ }
    //>REMOVE-BRIDGE<

    private FontLoader() { }

    @MethodArgs(args ={"resolution"})
    public static Font load(int resolution) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.TextRender.Font font = Engine.fontController.loadDefault(resolution);
        return new Font(font);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file","resolution"})
    public static Font load(FontFile file, int resolution) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.TextRender.Font font = Engine.fontController.loadFont(file.getFilePath(), resolution);
        return new Font(font);
        //>REMOVE-BRIDGE<
    }
}
