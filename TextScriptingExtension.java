package JAVARuntime;

import android.text.Editable;

public class TextScriptingExtension extends ScriptingExtension {
  public enum LineTip {
    None,
    Error,
    Alert
  }

  // <editor>

  // >editor<

  // Util methods
  public String getText() {

    return "";
  }

  @MethodArgs({"str"})
  public void setText(String str) {}

  @MethodArgs({"theme"})
  public void setTheme(TextScriptingTheme theme) {}

  @MethodArgs({"textScriptingProvider"})
  public void setProvider(TextScriptingProvider textScriptingProvider) {}

  @MethodArgs({"textScriptingStyler"})
  public void setStyler(TextScriptingStyler textScriptingStyler) {}

  // Override methods
  @MethodArgs({"line"})
  public LineTip getTipForLine(int line) {
    return LineTip.None;
  }

  @MethodArgs({"line"})
  public String getTipTextForLine(int line) {
    return "";
  }

  @MethodArgs({"file"})
  public void replaceScript(File newScript) {}

  @MethodArgs({"file"})
  public void openScript(File script) {}

  public void onClose() {}

  public void init() {}

  public void unload() {}

  public boolean saveScript() {
    return false;
  }

  public boolean hasScript() {
    return false;
  }

  @MethodArgs({"file"})
  public boolean supportFile(File file) {
    return false;
  }

  @MethodArgs({"charSequence", "start", "before", "count"})
  public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {}

  @MethodArgs({"charSequence", "start", "before", "count"})
  public void onTextChanged(CharSequence charSequence, int start, int before, int count) {}

  @MethodArgs({"editable"})
  public void afterTextChanged(Editable editable) {}
}
