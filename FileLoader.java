package JAVARuntime;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Files"})
public final class FileLoader {
  private FileLoader() {}

  /// Abstracts
  @MethodArgs({"text", "file"})
  public static void exportTextToFile(String text, String file) throws IOException {}

  @MethodArgs({"text", "file"})
  public static void exportTextToFile(String text, File file) throws IOException {}

  @MethodArgs({"inputStream"})
  public static String loadTextFromFile(InputStream inputStream) throws IOException {

    return "";
  }

  @MethodArgs({"file"})
  public static String loadTextFromFile(File file) throws IOException {

    return "";
  }

  @MethodArgs({"file"})
  public static String loadTextFromFile(ProjectFile file) {

    return "";
  }
}
