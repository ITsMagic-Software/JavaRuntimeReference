package JAVARuntime;

public final class System {

  private System() {}

  @JRDoc_EN("Runs the Java garbage collector.")
  @JRDoc_PT("Executa o coletor de lixo do Java.")
  public static void gc() {}

  @JRDoc_EN("Quits the game by calling GameController.quit().")
  @JRDoc_PT("Encerra o jogo chamando GameController.quit().")
  public static void exit() {}

  @JRDoc_EN("Quits the game by calling GameController.quit().")
  @JRDoc_PT("Encerra o jogo chamando GameController.quit().")
  public static void exit(int status) {}

  @JRDoc_EN("Not supported.")
  @JRDoc_PT("Não suportado.")
  public static void load(String filename) {
    throw new RuntimeException("Unsupported");
  }

  @JRDoc_EN("Not supported.")
  @JRDoc_PT("Não suportado.")
  public static void loadLibrary(String libname) {
    throw new RuntimeException("Unsupported");
  }

  @JRDoc_EN("Not supported.")
  @JRDoc_PT("Não suportado.")
  public static String mapLibraryName(String libname) {
    throw new RuntimeException("Unsupported");
  }

  @JRDoc_EN("Returns the line separator string for the current operating system.")
  @JRDoc_PT("Retorna o separador de linha do sistema operacional atual.")
  public static String lineSeparator() {

    return null;
  }

  @JRDoc_EN("Copies an array from the specified source to the specified destination.")
  @JRDoc_PT("Copia um array da origem especificada para o destino especificado.")
  @MethodArgs({"src", "srcPos", "dest", "destPos", "length"})
  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) {}

  @JRDoc_EN("Returns the current time in milliseconds.")
  @JRDoc_PT("Retorna o tempo atual em milissegundos.")
  public static long currentTimeMillis() {
    return java.lang.System.currentTimeMillis();
  }

  @JRDoc_EN("Returns the current time in nanoseconds.")
  @JRDoc_PT("Retorna o tempo atual em nanossegundos.")
  public static long nanoTime() {
    return java.lang.System.nanoTime();
  }
}
