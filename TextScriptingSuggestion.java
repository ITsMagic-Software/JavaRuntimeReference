package JAVARuntime;

//

public class TextScriptingSuggestion {
    public transient String text;
    public transient String returnType;

    @MethodArgs(args ={"text"})
    public TextScriptingSuggestion(String text) {
        this.text = text;
    }
    @MethodArgs(args ={"text","returnType"})
    public TextScriptingSuggestion(String text, String returnType) {
        this.text = text;
        this.returnType = returnType;
    }

    public String getText() {
        return text;
    }
    @MethodArgs(args ={"text"})
    public void setText(String text) {
        this.text = text;
    }

    public String getReturnType() {
        return returnType;
    }
    @MethodArgs(args ={"returnType"})
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    //
}