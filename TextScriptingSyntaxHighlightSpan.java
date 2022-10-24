package JAVARuntime;

public class TextScriptingSyntaxHighlightSpan {
    public TextScriptingStyleSpan span;
    public int start;
    public int end;

    public TextScriptingSyntaxHighlightSpan() { }
    @MethodArgs(args ={"span","start","end"})
    public TextScriptingSyntaxHighlightSpan(TextScriptingStyleSpan span, int start, int end) {
        this.span = span;
        this.start = start;
        this.end = end;
    }

    public TextScriptingStyleSpan getSpan() {
        return span;
    }
    @MethodArgs(args ={"span"})
    public void setSpan(TextScriptingStyleSpan span) {
        this.span = span;
    }

    public int getStart() {
        return start;
    }
    @MethodArgs(args ={"start"})
    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }
    @MethodArgs(args ={"end"})
    public void setEnd(int end) {
        this.end = end;
    }
}
