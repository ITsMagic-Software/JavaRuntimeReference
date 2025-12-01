package JAVARuntime;

import android.text.Editable;
//

public class TextScriptingExtension extends ScriptingExtension{
    public enum LineTip{
        None, Error, Alert
    }

    //

    // Util methods
    public String getText(){
        //
        return "";
        //

        //
    }
    @MethodArgs({"str"})
    public void setText(String str){
        //
    }

    @MethodArgs({"theme"})
    public void setTheme(TextScriptingTheme theme){
        //
    }
    @MethodArgs({"textScriptingProvider"})
    public void setProvider(TextScriptingProvider textScriptingProvider){
        //
    }
    @MethodArgs({"textScriptingStyler"})
    public void setStyler(TextScriptingStyler textScriptingStyler){
        //
    }

    // Override methods
    @MethodArgs({"line"})
    public LineTip getTipForLine(int line) {
        return LineTip.None;
    }
    @MethodArgs({"line"})
    public String getTipTextForLine(int line) {
        return "";
    }

    @Override
    @MethodArgs({"file"})
    public void replaceScript(File newScript) {

    }

    @Override
    @MethodArgs({"file"})
    public void openScript(File script) {

    }

    @Override
    public void onClose() {

    }

    @Override
    public void init() {

    }

    @Override
    public void unload() {

    }

    @Override
    public boolean saveScript() {
        return false;
    }

    @Override
    public boolean hasScript() {
        return false;
    }

    @Override
    @MethodArgs({"file"})
    public boolean supportFile(File file) {
        return false;
    }

    @MethodArgs({"charSequence", "start", "before", "count"})
    public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {
    }

    @MethodArgs({"charSequence", "start", "before", "count"})
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

    }

    @MethodArgs({"editable"})
    public void afterTextChanged(Editable editable) {
    }
}
