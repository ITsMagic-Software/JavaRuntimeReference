package JAVARuntime;

import java.util.List;

public class TextScriptingProvider {

  public List<TextScriptingSuggestion> getAll() {
    return null;
  }

  @MethodArgs({"lineNumber", "text"})
  public void processLine(int lineNumber, String text) {}

  @MethodArgs({"lineNumber"})
  public void deleteLine(int lineNumber) {}

  public void clearLines() {}
}
