package JAVARuntime;

//

public class TextScriptingStyleSpan {
    public transient Color color;
    public transient boolean bold = false;
    public transient boolean italic = false;
    public transient boolean underline = false;
    public transient boolean strikethrough = false;

    @MethodArgs({"color"})
    public TextScriptingStyleSpan(Color color) {
        this.color = color;
    }
    @MethodArgs({"color","bold","italic","underline","strikethrough"})
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
    @MethodArgs({"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isBold() {
        return bold;
    }
    @MethodArgs({"value"})
    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }
    @MethodArgs({"value"})
    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public boolean isUnderline() {
        return underline;
    }
    @MethodArgs({"value"})
    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public boolean isStrikethrough() {
        return strikethrough;
    }
    @MethodArgs({"value"})
    public void setStrikethrough(boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    //
}
