package JAVARuntime;

public interface JsonSerializer {
  String serializeToString();

  void deserializeLocal(String str);
}
