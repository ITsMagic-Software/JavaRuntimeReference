package JAVARuntime;

/** @Author Lucas Leandro (ITsMagic Founder) */
@ClassCategory(cat = {"Math"})
public final class Math {
  /** ITsMagic math class are designed to execute float calculations with degrees alternative functions to radians are available, or instead you can use direct java.lang.Math */
  public static final float PI = 3.141592653f;

  public static final float PI2 = PI * 2;
  public static final float RADIANS = PI / 180;
  public static final int BYTES_IN_FLOAT = (Float.SIZE / Byte.SIZE);
  public static final int BYTES_IN_INT = (Integer.SIZE / Byte.SIZE);
  public static final int BYTES_IN_SHORT = (Short.SIZE / Byte.SIZE);

  private Math() {}

  /// Abstracts
  @JRDoc_EN("Returns the value for this frame to reach 1 in one second (using deltaTime).")
  @JRDoc_PT("Retorna o valor deste frame para alcançar 1 em um segundo (usando o deltaTime).")
  public static float bySecond() {

    return 0;
  }

  @JRDoc_EN("Returns the value for this frame to reach the specified value in one second (using deltaTime).")
  @JRDoc_PT("Retorna o valor deste frame para alcançar o valor especificado em um segundo (usando o deltaTime).")
  @MethodArgs({"value"})
  public static float bySecond(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the sine of the angle in degrees.")
  @JRDoc_PT("Retorna o seno do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float sin(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the cosine of the angle in degrees.")
  @JRDoc_PT("Retorna o cosseno do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float cos(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the tangent of the angle in degrees.")
  @JRDoc_PT("Retorna a tangente do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float tan(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arcsine of the angle in degrees.")
  @JRDoc_PT("Retorna o arco seno do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float asin(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arccosine of the angle in degrees.")
  @JRDoc_PT("Retorna o arco cosseno do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float acos(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arctangent of the angle in degrees.")
  @JRDoc_PT("Retorna o arco tangente do ângulo em graus.")
  @MethodArgs({"angle"})
  public static float atan(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arctangent of y/x in degrees.")
  @JRDoc_PT("Retorna o arco tangente de y/x em graus.")
  @MethodArgs({"x", "y"})
  public static float atan2(float x, float y) {

    return 0;
  }

  @JRDoc_EN("Returns the sine of the angle in radians.")
  @JRDoc_PT("Retorna o seno do ângulo em radianos.")
  @MethodArgs({"rad"})
  public static float sinRad(float rad) {

    return 0;
  }

  @JRDoc_EN("Returns the cosine of the angle in radians.")
  @JRDoc_PT("Retorna o cosseno do ângulo em radianos.")
  @MethodArgs({"rad"})
  public static float cosRad(float rad) {

    return 0;
  }

  @JRDoc_EN("Returns the tangent of the angle in radians.")
  @JRDoc_PT("Retorna a tangente do ângulo em radianos.")
  @MethodArgs({"rad"})
  public static float tanRad(float rad) {

    return 0;
  }

  @JRDoc_EN("Returns the arctangent of y/x in radians.")
  @JRDoc_PT("Retorna o arco tangente de y/x em radianos.")
  @MethodArgs({"x", "y"})
  public static float atan2Rad(float x, float y) {

    return 0;
  }

  @JRDoc_EN("Returns the arcsine of the angle in radians.")
  @JRDoc_PT("Retorna o arco seno do ângulo em radianos.")
  @MethodArgs({"angle"})
  public static float asinRad(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arccosine of the angle in radians.")
  @JRDoc_PT("Retorna o arco cosseno do ângulo em radianos.")
  @MethodArgs({"angle"})
  public static float acosRad(float angle) {

    return 0;
  }

  @JRDoc_EN("Returns the arctangent of the angle in radians.")
  @JRDoc_PT("Retorna o arco tangente do ângulo em radianos.")
  @MethodArgs({"rad"})
  public static float atanRad(float rad) {

    return 0;
  }

  @JRDoc_EN("Returns the square root of the value.")
  @JRDoc_PT("Retorna a raiz quadrada do valor.")
  @MethodArgs({"value"})
  public static float sqrt(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the cubic root of the value.")
  @JRDoc_PT("Retorna a raiz cúbica do valor.")
  @MethodArgs({"value"})
  public static float cbrt(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the value raised to the power of b.")
  @JRDoc_PT("Retorna o valor elevado à potência de b.")
  @MethodArgs({"value", "b"})
  public static float pow(float value, float b) {

    return 0;
  }

  @JRDoc_EN("Returns the absolute value.")
  @JRDoc_PT("Retorna o valor absoluto.")
  @MethodArgs({"value"})
  public static float abs(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the absolute value.")
  @JRDoc_PT("Retorna o valor absoluto.")
  @MethodArgs({"value"})
  public static int abs(int value) {

    return 0;
  }

  @JRDoc_EN("Returns the absolute value.")
  @JRDoc_PT("Retorna o valor absoluto.")
  @MethodArgs({"value"})
  public static double abs(double value) {

    return 0;
  }

  @JRDoc_EN("Returns the smallest integer greater than or equal to the value.")
  @JRDoc_PT("Retorna o menor inteiro maior ou igual ao valor.")
  @MethodArgs({"value"})
  public static float ceil(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the largest integer less than or equal to the value.")
  @JRDoc_PT("Retorna o maior inteiro menor ou igual ao valor.")
  @MethodArgs({"value"})
  public static float floor(float v) {

    return 0;
  }

  @JRDoc_EN("Rounds the value to the nearest integer.")
  @JRDoc_PT("Arredonda o valor para o inteiro mais próximo.")
  @MethodArgs({"value"})
  public static float round(float value) {

    return 0;
  }

  @JRDoc_EN("Returns Euler's number (e ≈ 2.718) raised to the given value.")
  @JRDoc_PT("Retorna o número de Euler (e ≈ 2.718) elevado à potência do valor informado.")
  @MethodArgs({"value"})
  public static float exp(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the natural logarithm (base e) of the value.")
  @JRDoc_PT("Retorna o logaritmo natural (base e) do valor.")
  @MethodArgs({"value"})
  public static float log(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the base 10 logarithm of the value.")
  @JRDoc_PT("Retorna o logaritmo de base 10 do valor.")
  @MethodArgs({"value"})
  public static float log10(float value) {

    return 0;
  }

  @JRDoc_EN("Converts degrees to radians.")
  @JRDoc_PT("Converte graus para radianos.")
  @MethodArgs({"value"})
  public static float toRadians(float value) {

    return 0;
  }

  @JRDoc_EN("Converts radians to degrees.")
  @JRDoc_PT("Converte radianos para graus.")
  @MethodArgs({"value"})
  public static float toDegrees(float value) {

    return 0;
  }

  @JRDoc_EN("Converts the value from dp (density-independent pixels) to px (pixels) based on the device screen density.")
  @JRDoc_PT("Converte o valor de dp (density-independent pixels) para px (pixels) com base na densidade da tela do dispositivo.")
  @MethodArgs({"value"})
  public static int dptopx(int value) {

    return 0;
  }

  @JRDoc_EN("Returns 0 if the value is within the deadzone, otherwise returns the original value.")
  @JRDoc_PT("Retorna 0 se o valor estiver dentro da zona morta, caso contrário retorna o valor original.")
  @MethodArgs({"value", "deadZone"})
  public static float deadzone(float value, float deadzone) {

    return 0;
  }

  @JRDoc_EN("Checks if the value is within the deadzone. Returns true if it is, false otherwise.")
  @JRDoc_PT("Verifica se o valor está dentro da zona morta. Retorna true se estiver, false caso contrário.")
  @MethodArgs({"value", "deadZone"})
  public static boolean isOnDeadzone(float value, float deadzone) {

    return false;
  }

  @JRDoc_EN("Clamps the value between min and max.")
  @JRDoc_PT("Restringe o valor entre min e max.")
  @MethodArgs({"min", "value", "max"})
  public static float clamp(float min, float value, float max) {

    return 0;
  }

  @JRDoc_EN("Clamps the value to be at least the specified minimum.")
  @JRDoc_PT("Restringe o valor para ser no mínimo o valor especificado.")
  @MethodArgs({"min", "value"})
  public static float clamp(float min, float value) {

    return 0;
  }

  @JRDoc_EN("Clamps the value to be at least the specified minimum.")
  @JRDoc_PT("Restringe o valor para ser no mínimo o valor especificado.")
  @MethodArgs({"min", "value"})
  public static float clampMin(float min, float value) {

    return 0;
  }

  @JRDoc_EN("Clamps the value between 0 and 1.")
  @JRDoc_PT("Restringe o valor entre 0 e 1.")
  @MethodArgs({"value"})
  public static float clamp01(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"a", "b"})
  public static float max(float a, float b) {
    return java.lang.Math.max(a, b);
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"values"})
  public static float max(float... values) {
    float max = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > max) {
        max = values[i];
      }
    }
    return max;
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"a", "b"})
  public static int max(int a, int b) {
    return java.lang.Math.max(a, b);
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"values"})
  public static int max(int... values) {
    int max = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > max) {
        max = values[i];
      }
    }
    return max;
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"a", "b"})
  public static double max(double a, double b) {
    return java.lang.Math.max(a, b);
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"values"})
  public static double max(double... values) {
    double max = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > max) {
        max = values[i];
      }
    }
    return max;
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"a", "b"})
  public static long max(long a, long b) {
    return java.lang.Math.max(a, b);
  }

  @JRDoc_EN("Returns the largest value.")
  @JRDoc_PT("Retorna o maior valor.")
  @MethodArgs({"values"})
  public static long max(long... values) {
    long max = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > max) {
        max = values[i];
      }
    }
    return max;
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"a", "b"})
  public static float min(float a, float b) {
    return java.lang.Math.min(a, b);
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"values"})
  public static float min(float... values) {
    float min = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] < min) {
        min = values[i];
      }
    }
    return min;
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"a", "b"})
  public static int min(int a, int b) {
    return java.lang.Math.min(a, b);
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"values"})
  public static int min(int... values) {
    int min = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] < min) {
        min = values[i];
      }
    }
    return min;
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"a", "b"})
  public static double min(double a, double b) {
    return java.lang.Math.min(a, b);
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"values"})
  public static double min(double... values) {
    double min = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] < min) {
        min = values[i];
      }
    }
    return min;
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"a", "b"})
  public static long min(long a, long b) {
    return java.lang.Math.min(a, b);
  }

  @JRDoc_EN("Returns the smallest value.")
  @JRDoc_PT("Retorna o menor valor.")
  @MethodArgs({"values"})
  public static long min(long... values) {
    long min = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] < min) {
        min = values[i];
      }
    }
    return min;
  }

  @JRDoc_EN("Blends a value towards the target using the specified blend factor (0..1).")
  @JRDoc_PT("Mistura um valor em direção ao alvo usando o fator de mistura especificado (0..1).")
  @MethodArgs({"value", "target", "blend"})
  public static float blend(float value, float target, float blend) {

    return 0;
  }

  @JRDoc_EN("Interpolates a value towards the target with the specified speed.")
  @JRDoc_PT("Interpola um valor até o alvo (value até target) com a velocidade especificada.")
  @MethodArgs({"value", "target", "speed"})
  public static float lerp(float value, float target, float speed) {

    return 0;
  }

  @JRDoc_EN("Interpolates a value towards the target with the specified speed per second.")
  @JRDoc_PT("Interpola um valor até o alvo (value até target) com a velocidade especificada em um segundo.")
  @MethodArgs({"value", "target", "speed"})
  public static float lerpInSeconds(float value, float target, float speed) {

    return 0;
  }

  @JRDoc_EN("Returns the inverse of the value.")
  @JRDoc_PT("Retorna o valor inverso.")
  @MethodArgs({"value"})
  public static boolean negative(boolean value) {

    return false;
  }

  @JRDoc_EN("Returns the negative value.")
  @JRDoc_PT("Retorna o valor negativo.")
  @MethodArgs({"value"})
  public static float negative(float value) {

    return 0;
  }

  @JRDoc_EN("Returns the negative value.")
  @JRDoc_PT("Retorna o valor negativo.")
  @MethodArgs({"value"})
  public static int negative(int value) {

    return 0;
  }

  @JRDoc_EN("Returns the inverse square root of the value.")
  @JRDoc_PT("Retorna a raiz quadrada inversa do valor.")
  @MethodArgs({"value"})
  public static float inverseSQRT(float x) {

    return 0;
  }

  /** Support only values between 0-360 value = 0-360 target = 0-360 */
  @JRDoc_EN("Interpolates between two angles (0-360) with the specified progress, keeping the result in this range.")
  @JRDoc_PT("Interpola entre dois ângulos (0-360) com o progresso especificado, mantendo o resultado nesse intervalo.")
  @MethodArgs({"value", "target", "progress"})
  public static float lerpAngle(float value, float target, float progress) {

    return 0;
  }
  /** Support only values between 0-360 value = 0-360 target = 0-360 */
  @JRDoc_EN("Interpolates between two angles (0-360) with the specified progress per second, keeping the result in this range.")
  @JRDoc_PT("Interpola entre dois ângulos (0-360) com o progresso especificado em um segundo, mantendo o resultado nesse intervalo.")
  @MethodArgs({"value", "target", "progress"})
  public static float lerpAngleInSeconds(float value, float target, float progress) {

    return 0;
  }

  @JRDoc_EN("Keeps the angle between 0 and 360, keeping values in this range.")
  @JRDoc_PT("Mantém o ângulo entre 0 e 360, mantendo os valores nesse intervalo.")
  @MethodArgs({"value"})
  public static float clampAngleTo360(float value) {

    return 0;
  }

  @JRDoc_EN("Converts a value from the range [oldMin, oldMax] to the range [newMin, newMax].")
  @JRDoc_PT("Converte um valor do intervalo [oldMin, oldMax] para o intervalo [newMin, newMax].")
  @MethodArgs({"oldMin", "oldMax", "value", "newMin", "newMax"})
  public static float rangeConverter(float oldMin, float oldMax, float value, float newMin, float newMax) {

    return 0;
  }

  @JRDoc_EN("Returns 0 if the value is NaN, otherwise returns the specified value.")
  @JRDoc_PT("Retorna 0 se o valor for NaN, caso contrário retorna o valor especificado.")
  @MethodArgs({"value"})
  public static float fixNaN(float v) {

    return 0;
  }
}
