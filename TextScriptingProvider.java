package JAVARuntime;

import java.util.List;
//<REMOVE-BRIDGE>
//>REMOVE-BRIDGE<

public class TextScriptingProvider {

    public List<TextScriptingSuggestion> getAll() {
        return null;
    }

    @MethodArgs(args ={"lineNumber", "text"})
    public void processLine(int lineNumber, String text) {

    }
    @MethodArgs(args ={"lineNumber"})
    public void deleteLine(int lineNumber) {

    }
    public void clearLines() {

    }
}

