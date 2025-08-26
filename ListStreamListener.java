package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Lists"})
public interface ListStreamListener {
  @MethodArgs({"object", "idx", "userData"})
  void execute(Object object, int idx, Object userData);

  @MethodArgs({"exception", "error", "idx", "userData"})
  void onError(Exception ex, Error er, int idx, Object userData);

  @MethodArgs({"userData"})
  void onFinish(Object userData);
}
