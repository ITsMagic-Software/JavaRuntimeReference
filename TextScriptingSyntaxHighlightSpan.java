package JAVARuntime;

public class TextScriptingSyntaxHighlightSpan {
  public transient TextScriptingStyleSpan span;
  public transient int start;
  public transient int end;

  public TextScriptingSyntaxHighlightSpan() {}

  @MethodArgs({"span", "start", "end"})
  public TextScriptingSyntaxHighlightSpan(TextScriptingStyleSpan span, int start, int end) {
    this.span = span;
    this.start = start;
    this.end = end;
  }

  public TextScriptingStyleSpan getSpan() {
    return span;
  }

  @MethodArgs({"span"})
  public void setSpan(TextScriptingStyleSpan span) {
    this.span = span;
  }

  public int getStart() {
    return start;
  }

  @MethodArgs({"start"})
  public void setStart(int start) {
    this.start = start;
  }

  public int getEnd() {
    return end;
  }

  @MethodArgs({"end"})
  public void setEnd(int end) {
    this.end = end;
  }
}
