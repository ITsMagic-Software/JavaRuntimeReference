package JAVARuntime;

import android.text.Editable;
//

public class TextScriptingExtension extends ScriptingExtension{
    public enum LineTip{
        None, Error, Alert
    }

    //

    // Util methods
    @MethodArgs(args ={"str"})
    public void setText(String str){
        //
    }
    public String getText(){
        //
        return "";
        //

        //
    }
    @MethodArgs(args ={"theme"})
    public void setTheme(TextScriptingTheme theme){
        //
    }
    @MethodArgs(args ={"textScriptingProvider"})
    public void setProvider(TextScriptingProvider textScriptingProvider){
        //
    }
    @MethodArgs(args ={"textScriptingStyler"})
    public void setStyler(TextScriptingStyler textScriptingStyler){
        //
    }

    // Override methods
    @MethodArgs(args ={"line"})
    public LineTip getTipForLine(int line) {
        return LineTip.None;
    }
    @MethodArgs(args ={"line"})
    public String getTipTextForLine(int line) {
        return "";
    }

    @Override
    @MethodArgs(args ={"file"})
    public void replaceScript(File newScript) {

    }

    @Override
    @MethodArgs(args ={"file"})
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
    @MethodArgs(args ={"file"})
    public boolean supportFile(File file) {
        return false;
    }

    @MethodArgs(args ={"charSequence", "start", "before", "count"})
    public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {
    }

    @MethodArgs(args ={"charSequence", "start", "before", "count"})
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

    }

    @MethodArgs(args ={"editable"})
    public void afterTextChanged(Editable editable) {
    }
}
