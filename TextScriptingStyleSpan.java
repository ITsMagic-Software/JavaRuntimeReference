package JAVARuntime;

//

public class TextScriptingStyleSpan {
    public transient Color color;
    public transient boolean bold = false;
    public transient boolean italic = false;
    public transient boolean underline = false;
    public transient boolean strikethrough = false;

    @MethodArgs(args ={"color"})
    public TextScriptingStyleSpan(Color color) {
        this.color = color;
    }
    @MethodArgs(args ={"color","bold","italic","underline","strikethrough"})
    public TextScriptingStyleSpan(Color color, boolean bold, boolean italic, boolean underline, boolean strikethrough) {
        this.color = color;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
        this.strikethrough = strikethrough;
    }

    public Color getColor() {
        return color;
    }
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isBold() {
        return bold;
    }
    @MethodArgs(args ={"value"})
    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }
    @MethodArgs(args ={"value"})
    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public boolean isUnderline() {
        return underline;
    }
    @MethodArgs(args ={"value"})
    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public boolean isStrikethrough() {
        return strikethrough;
    }
    @MethodArgs(args ={"value"})
    public void setStrikethrough(boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    //
}
