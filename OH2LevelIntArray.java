package JAVARuntime;

@ClassCategory(cat = {"Buffers"})
public class OH2LevelIntArray extends OHIntDataBase {

  @MethodArgs({"countX", "countY"})
  public OH2LevelIntArray(int countX, int countY) {
    this(countX, countY, true);
  }

  @MethodArgs({"countX", "countY", "fill"})
  public OH2LevelIntArray(int countX, int countY, boolean fill) {

    super(countX * countY);
  }

  @MethodArgs({"x", "y"})
  public int get(int x, int y) {

    return 0;
  }

  @MethodArgs({"x", "y", "value"})
  public void set(int x, int y, int value) {}

  @MethodArgs({"x", "y"})
  private int determineIndex(int x, int y) {

    return 0;
  }
}
