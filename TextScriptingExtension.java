package JAVARuntime;

import android.text.Editable;
//<REMOVE-BRIDGE>
import android.content.Context;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;

//
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.R;

import java.util.List;

//>REMOVE-BRIDGE<

public class TextScriptingExtension extends ScriptingExtension{
    public enum LineTip{
        None, Error, Alert
    }

    //

    // Util methods
    public String getText(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return "";
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        //
        return null;
        //

        //
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void setText(String str){
        //<REMOVE-BRIDGE>
        //
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"theme"})
    public void setTheme(TextScriptingTheme theme){
        //<REMOVE-BRIDGE>
        //
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"textScriptingProvider"})
    public void setProvider(TextScriptingProvider textScriptingProvider){
        //<REMOVE-BRIDGE>
        //
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"textScriptingStyler"})
    public void setStyler(TextScriptingStyler textScriptingStyler){
        //<REMOVE-BRIDGE>
        //
        //>REMOVE-BRIDGE<
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
