package JAVARuntime;

//
import java.util.HashMap;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Color implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator, JsonSerializer
{
    //

    //

    public Color() {
        //
    }
    @MethodArgs({"r","g","b"})
    public Color(int r, int g, int b) {
        //
    }
    @MethodArgs({"r","g","b"})
    public Color(float r, float g, float b) {
        //
    }
    @MethodArgs({"a","r","g","b"})
    public Color(int a, int r, int g, int b) {
        //
    }
    @MethodArgs({"a","r","g","b"})
    public Color(float a, float r, float g, float b) {
        //
    }
    @MethodArgs({"hex"})
    public Color(String hex){
        //
    }
    
    @JRDoc_EN("Sets the Color of this instance to the specified Color.")
    @JRDoc_PT("Define a Cor desta instância para a Cor especificada.")
    @MethodArgs({"color"})
    public void set(Color color){
        //
    }

    /**
     * Integer color
     * Also called by HEX
     */
    @JRDoc_EN("Returns the int value of the Color.")
    @JRDoc_PT("Retorna o valor int da Cor.")
    public int getInt(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the Color to the Color of the specified int value.")
    @JRDoc_PT("Define a Cor para a Cor do valor int especificado.")
    @MethodArgs({"color"})
    public void setInt(int color){
        //
    }

    /**
     * Hex color
     */
    @JRDoc_EN("Sets the Color to the Color of the specified hex code.")
    @JRDoc_PT("Define a Cor para a Cor do código hexadecimal especificado.")
    @MethodArgs({"hex"})
    public void fromHexString(String hex){
        //
    }
    @JRDoc_EN("Sets the Color to the Color of the specified hex code.")
    @JRDoc_PT("Define a Cor para a Cor do código hexadecimal especificado.")
    @MethodArgs({"hex"})
    public void fromHex(String hex){
        //
    }
    @JRDoc_EN("Returns the hexadecimal code of the Color.")
    @JRDoc_PT("Retorna o código hexadecimal da Cor.")
    public String getHexString(){
        //
        return "";
        //

        //
    }
    @JRDoc_EN("Returns the hexadecimal code of the Color.")
    @JRDoc_PT("Retorna o código hexadecimal da Cor.")
    public String toHex(){
        //
        return "";
        //

        //
    }

    /**
     * Integer value of the ARGB channels (0-255)
     */
    @JRDoc_EN("Returns the int value of the opacity (alpha channel) of the Color (0-255).")
    @JRDoc_PT("Retorna o valor int da opacidade (canal alfa) da Cor (0-255).")
    public int getIntAlpha(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the int value of the opacity (alpha channel) of the Color (0-255).")
    @JRDoc_PT("Define o valor int da opacidade (canal alfa) da Cor (0-255).")
    @MethodArgs({"value"})
    public void setIntAlpha(int value){
        //
    }
    @JRDoc_EN("Returns the int value of the red channel of the color (0-255).")
    @JRDoc_PT("Retorna o valor int do canal vermelho da Cor (0-255).")
    public int getIntRed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the int value of the red channel of the color (0-255).")
    @JRDoc_PT("Define o valor int do canal vermelho da Cor (0-255).")
    @MethodArgs({"value"})
    public void setIntRed(int value){
        //
    }
    @JRDoc_EN("Returns the int value of the green channel of the color (0-255).")
    @JRDoc_PT("Retorna o valor int do canal verde da Cor (0-255).")
    public int getIntGreen(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the int value of the green channel of the color (0-255).")
    @JRDoc_PT("Define o valor int do canal verde da Cor (0-255).")
    @MethodArgs({"value"})
    public void setIntGreen(int value){
        //
    }
    @JRDoc_EN("Returns the int value of the blue channel of the color (0-255).")
    @JRDoc_PT("Retorna o valor int do canal azul da Cor (0-255).")
    public int getIntBlue(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the int value of the blue channel of the color (0-255).")
    @JRDoc_PT("Define o valor int do canal azul da Cor (0-255).")
    @MethodArgs({"value"})
    public void setIntBlue(int value){
        //
    }
    
    @JRDoc_EN("Sets the int values of the ARGB channels (alpha, red, green, and blue) to the specified values, respectively.")
    @JRDoc_PT("Define os valores int dos canais ARGB (alfa, vermelho, verde e azul) para os valores especificados, respectivamente.")
    @MethodArgs({"a","r","g","b"})
    public void setInts(int a, int r, int g, int b){
        //
    }
    @JRDoc_EN("Sets the int values of the RGB channels (red, green, and blue) to the specified values, respectively.")
    @JRDoc_PT("Define os valores int dos canais RGB (vermelho, verde e azul) para os valores especificados, respectivamente.")
    @MethodArgs({"r","g","b"})
    public void setInts(int r, int g, int b){
        //
    }

    /**
     * Float value of the ARGB channels (0.0f - 1.0f)
     */
    @JRDoc_EN("Returns the float value of the opacity (alpha channel) of the Color (0.0f - 1.0f).")
    @JRDoc_PT("Retorna o valor float da opacidade (canal alfa) da Cor (0.0f - 1.0f).")
    public float getFloatAlpha(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the float value of the opacity (alpha channel) of the Color (0.0f - 1.0f).")
    @JRDoc_PT("Define o valor float da opacidade (canal alfa) da Cor (0.0f - 1.0f).")
    @MethodArgs({"value"})
    public void setFloatAlpha(float value){
        //
    }
    
    @JRDoc_EN("Returns the float value of the red channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Retorna o valor float do canal vermelho da Cor (0.0f - 1.0f).")
    public float getFloatRed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the float value of the red channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Define o valor float do canal vermelho da Cor (0.0f - 1.0f).")
    @MethodArgs({"value"})
    public void setFloatRed(float value){
        //
    }

    @JRDoc_EN("Returns the float value of the green channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Retorna o valor float do canal verde da Cor (0.0f - 1.0f).")
    public float getFloatGreen(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the float value of the green channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Define o valor float do canal verde da Cor (0.0f - 1.0f).")
    @MethodArgs({"value"})
    public void setFloatGreen(float value){
        //
    }

    @JRDoc_EN("Returns the float value of the blue channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Retorna o valor float do canal azul da Cor (0.0f - 1.0f).")
    public float getFloatBlue(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the float value of the blue channel of the color (0.0f - 1.0f).")
    @JRDoc_PT("Define o valor float do canal azul da Cor (0.0f - 1.0f).")
    @MethodArgs({"value"})
    public void setFloatBlue(float value){
        //
    }
    
    @JRDoc_EN("Sets the float values of the ARGB channels (alpha, red, green, and blue) to the specified values, respectively.")
    @JRDoc_PT("Define os valores float dos canais ARGB (alfa, vermelho, verde e azul) para os valores especificados, respectivamente.")
    @MethodArgs({"a","r","g","b"})
    public void setFloats(float a, float r, float g, float b){
        //
    }
    @JRDoc_EN("Sets the float values of the RGB channels (red, green, and blue) to the specified values, respectively.")
    @JRDoc_PT("Define os valores float dos canais RGB (vermelho, verde e azul) para os valores especificados, respectivamente.")
    @MethodArgs({"r","g","b"})
    public void setFloats(float r, float g, float b){
        //
    }
    
    @JRDoc_EN("Adds the current Color to the specified Color and returns a new Color.")
    @JRDoc_PT("Soma a Cor atual com a Cor especificada e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sum(Color color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Adds the current Color to the specified Vector3 and returns a new Color.")
    @JRDoc_PT("Soma a Cor atual com o Vector3 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sum(Vector3 color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Adds the current Color to the specified Vector2 and returns a new Color.")
    @JRDoc_PT("Soma a Cor atual com o Vector2 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sum(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @JRDoc_EN("Subtracts the specified Color from the current Color and returns a new Color.")
    @JRDoc_PT("Subtrai a Cor especificada da Cor atual e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sub(Color color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified Vector3 from the current Color and returns a new Color.")
    @JRDoc_PT("Subtrai o Vector3 especificado da Cor atual e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sub(Vector3 color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified Vector2 from the current Color and returns a new Color.")
    @JRDoc_PT("Subtrai o Vector2 especificado da Cor atual e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color sub(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @JRDoc_EN("Multiplies the current Color by the specified Color and returns a new Color.")
    @JRDoc_PT("Multiplica a Cor atual pela Cor especificada e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color mul(Color color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies the current Color by the specified Vector3 and returns a new Color.")
    @JRDoc_PT("Multiplica a Cor atual pelo Vector3 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color mul(Vector3 color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies the current Color by the specified Vector2 and returns a new Color.")
    @JRDoc_PT("Multiplica a Cor atual pelo Vector2 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color mul(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @JRDoc_EN("Divides the current Color by the specified Color and returns a new Color.")
    @JRDoc_PT("Divide a Cor atual pela Cor especificada e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color div(Color color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Divides the current Color by the specified Vector3 and returns a new Color.")
    @JRDoc_PT("Divide a Cor atual pelo Vector3 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color div(Vector3 color){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Divides the current Color by the specified Vector2 and returns a new Color.")
    @JRDoc_PT("Divide a Cor atual pelo Vector2 especificado e retorna uma nova Cor.")
    @MethodArgs({"color"})
    public Color div(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @JRDoc_EN("Adds the current Color to the specified Color and modifies the current Color.")
    @JRDoc_PT("Soma a Cor atual com a Cor especificada e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void sumLocal(Color color){
        //
    }
    @JRDoc_EN("Adds the current Color to the specified Vector3 and modifies the current Color.")
    @JRDoc_PT("Soma a Cor atual com o Vector3 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void sumLocal(Vector3 color){
        //
    }
    @JRDoc_EN("Adds the current Color to the specified Vector2 and modifies the current Color.")
    @JRDoc_PT("Soma a Cor atual com o Vector2 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void sumLocal(Vector2 color){
        //
    }
    
    @JRDoc_EN("Subtracts the specified Color from the current Color and modifies the current Color.")
    @JRDoc_PT("Subtrai a Cor especificada da Cor atual e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void subLocal(Color color){
        //
    }
    @JRDoc_EN("Subtracts the specified Vector3 from the current Color and modifies the current Color.")
    @JRDoc_PT("Subtrai o Vector3 especificado da Cor atual e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void subLocal(Vector3 color){
        //
    }
    @JRDoc_EN("Subtracts the specified Vector2 from the current Color and modifies the current Color.")
    @JRDoc_PT("Subtrai o Vector2 especificado da Cor atual e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void subLocal(Vector2 color){
        //
    }
    
    @JRDoc_EN("Multiplies the current Color by the specified Color and modifies the current Color.")
    @JRDoc_PT("Multiplica a Cor atual pela Cor especificada e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void mulLocal(Color color){
        //
    }
    @JRDoc_EN("Multiplies the current Color by the specified Vector3 and modifies the current Color.")
    @JRDoc_PT("Multiplica a Cor atual pelo Vector3 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void mulLocal(Vector3 color){
        //
    }
    @JRDoc_EN("Multiplies the current Color by the specified Vector2 and modifies the current Color.")
    @JRDoc_PT("Multiplica a Cor atual pelo Vector2 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void mulLocal(Vector2 color){
        //
    }
    
    @JRDoc_EN("Divides the current Color by the specified Color and modifies the current Color.")
    @JRDoc_PT("Divide a Cor atual pela Cor especificada e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void divLocal(Color color){
        //
    }
    @JRDoc_EN("Divides the current Color by the specified Vector3 and modifies the current Color.")
    @JRDoc_PT("Divide a Cor atual pelo Vector3 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void divLocal(Vector3 color){
        //
    }
    @JRDoc_EN("Divides the current Color by the specified Vector2 and modifies the current Color.")
    @JRDoc_PT("Divide a Cor atual pelo Vector2 especificado e modifica a Cor atual.")
    @MethodArgs({"color"})
    public void divLocal(Vector2 color){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified Color based on the provided speed/interval and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e a Cor especificada com base na velocidade/intervalo fornecido e modifica a Cor atual.")
    @MethodArgs({"value","speed"})
    public void lerp(Color color, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided speed/interval and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na velocidade/intervalo fornecido e modifica a Cor atual.")
    @MethodArgs({"a","r","g","b","speed"})
    public void lerp(float a, float r, float g, float b, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified value based on the provided speed/interval and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e o valor especificado com base na velocidade/intervalo fornecido e modifica a Cor atual.")
    @MethodArgs({"a","speed"})
    public void lerp(float a, float speed){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified Color based on the provided speed/interval and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e a Cor especificada com base na velocidade/intervalo fornecido e retorna uma nova Cor.")
    @MethodArgs({"value","speed"})
    @UnimplementedDoc
    public Color lerpOut(Color color, float speed){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided speed/interval and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na velocidade/intervalo fornecido e retorna uma nova Cor.")
    @MethodArgs({"a","r","g","b","speed"})
    @UnimplementedDoc
    public Color lerpOut(float a, float r, float g, float b, float speed){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified value based on the provided speed/interval and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e o valor especificado com base na velocidade/intervalo fornecido e retorna uma nova Cor.")
    @MethodArgs({"a","speed"})
    @UnimplementedDoc
    public Color lerpOut(float a, float speed){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified Color based on the provided speed/interval in one second and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e a Cor especificada com base na velocidade/intervalo fornecido em um segundo e modifica a Cor atual.")
    @MethodArgs({"value","speed"})
    public void lerpInSeconds(Color color, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided speed/interval in one second and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na velocidade/intervalo fornecido em um segundo e modifica a Cor atual.")
    @MethodArgs({"a","r","g","b","speed"})
    public void lerpInSeconds(float a, float r, float g, float b, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified value based on the provided speed/interval in one second and modifies the current Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e o valor especificado com base na velocidade/intervalo fornecido em um segundo e modifica a Cor atual.")
    @MethodArgs({"a","speed"})
    public void lerpInSeconds(float a, float speed){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified Color based on the provided speed/interval in one second and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e a Cor especificada com base na velocidade/intervalo fornecido em um segundo e retorna uma nova Cor.")
    @MethodArgs({"value","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(Color color, float speed){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided speed/interval in one second and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na velocidade/intervalo fornecido em um segundo e retorna uma nova Cor.")
    @MethodArgs({"a","r","g","b","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(float a, float r, float g, float b, float speed){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Interpolates/smoothes between the current Color and the specified value based on the provided speed/interval in one second and returns a new Color.")
    @JRDoc_PT("Faz uma interpolação/suavização entre a Cor atual e o valor especificado com base na velocidade/intervalo fornecido em um segundo e retorna uma nova Cor.")
    @MethodArgs({"a","blend"})
    @UnimplementedDoc
    public Color lerpOutInSeconds(float a, float speed){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Blends between the current Color and the specified Color based on the provided percentage (0-1) and modifies the current Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e a Cor especificada com base na porcentagem fornecida (0-1) e modifica a Cor atual.")
    @MethodArgs({"value","blend"})
    public void blend(Color color, float blend){
        //
    }
    @JRDoc_EN("Blends between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided percentage (0-1) and modifies the current Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na porcentagem fornecida (0-1) e modifica a Cor atual.")
    @MethodArgs({"a","r","g","b","blend"})
    public void blend(float a, float r, float g, float b, float blend){
        //
    }
    @JRDoc_EN("Blends between the current Color and the specified value based on the provided percentage (0-1) and modifies the current Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e o valor especificado com base na porcentagem fornecida (0-1) e modifica a Cor atual.")
    @MethodArgs({"a","blend"})
    public void blend(float a, float blend){
        //
    }

    @JRDoc_EN("Blends between the current Color and the specified Color based on the provided percentage (0-1) and returns a new Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e a Cor especificada com base na porcentagem fornecida (0-1) e retorna uma nova Cor.")
    @MethodArgs({"value","blend"})
    @UnimplementedDoc
    public Color blendOut(Color color, float blend){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Blends between the current Color and the specified ARGB (alpha, red, green, and blue) values based on the provided percentage (0-1) and returns a new Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e os valores ARGB (alfa, vermelho, verde e azul) especificados com base na porcentagem fornecida (0-1) e retorna uma nova Cor.")
    @MethodArgs({"a","r","g","b","blend"})
    @UnimplementedDoc
    public Color blendOut(float a, float r, float g, float b, float blend){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Blends between the current Color and the specified value based on the provided percentage (0-1) and returns a new Color.")
    @JRDoc_PT("Faz uma mistura entre a Cor atual e o valor especificado com base na porcentagem fornecida (0-1) e retorna uma nova Cor.")
    @MethodArgs({"a","blend"})
    @UnimplementedDoc
    public Color blendOut(float a, float blend){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a String of the int ARGB values (alpha, red, green, and blue) of the Color.")
    @JRDoc_PT("Retorna uma String dos valores int ARGB (alfa, vermelho, verde e azul) da Cor.")
    public String toString() {
        //
        return "";
        //

        //
    }

    @JRDoc_EN("Returns the red Color (255, 255, 0, 0).")
    @JRDoc_PT("Retorna a Cor vermelha (255, 255, 0, 0).")
    public static Color RED(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the white Color (255, 255, 255, 255).")
    @JRDoc_PT("Retorna a Cor branca (255, 255, 255, 255).")
    public static Color WHITE(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the black Color (255, 0, 0, 0).")
    @JRDoc_PT("Retorna a Cor preta (255, 0, 0, 0).")
    public static Color BLACK(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the green Color (255, 0, 255, 0).")
    @JRDoc_PT("Retorna a Cor verde (255, 0, 255, 0).")
    public static Color GREEN(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the blue Color (255, 0, 0, 255).")
    @JRDoc_PT("Retorna a Cor azul (255, 0, 0, 255).")
    public static Color BLUE(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the yellow Color (255, 241, 196, 15).")
    @JRDoc_PT("Retorna a Cor amarela (255, 241, 196, 15).")
    public static Color YELLOW(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the red Color (255, 255, 0, 255).")
    @JRDoc_PT("Retorna a Cor vermelha (255, 255, 0, 255).")
    public static Color PINK(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a copy of the current Color instance.")
    @JRDoc_PT("Retorna uma cópia da instância da Cor atual.")
    public Color copy() {
        //
        return null;
        //

        //
    }

    /// Comparators
    @JRDoc_EN("Returns true if the specified Color is equal to the current Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor especificada é igual à Cor atual.")
    @MethodArgs({"otherObject"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the instance of the specified Color is equal to the instance of the current Color.")
    @JRDoc_PT("Retorna verdadeiro se à instância da Cor especificada é igual a instância da Cor atual.")
    @MethodArgs({"otherObject"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the specified Color is different from the current Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor especificada é diferente da Cor atual.")
    @MethodArgs({"otherObject"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the specified Color is null.")
    @JRDoc_PT("Retorna verdadeiro se a Cor especificada for nula.")
    @MethodArgs({"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }
    
    @JRDoc_EN("Returns true if the current Color has greater values than the specified Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores que a Cor especificada.")
    @MethodArgs({"otherObject"})
    public boolean greaterThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater than or equal values to the specified Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores ou iguais aos da Cor especificada.")
    @MethodArgs({"otherObject"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has greater than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores maiores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }
    
    @JRDoc_EN("Returns true if the current Color has less values than the specified Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores que a Cor especificada.")
    @MethodArgs({"otherObject"})
    public boolean lessThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean lessThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean lessThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean lessThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less values than the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores que o valor especificado.")
    @MethodArgs({"value"})
    public boolean lessThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less than or equal values to the specified Color.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores ou iguais aos da Cor especificada.")
    @MethodArgs({"otherObject"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores ou iguais ao valor especificado.")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores ou iguais ao valor especificado.")
    @MethodArgs({"color"})
    public boolean lessOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns true if the current Color has less than or equal values to the specified value.")
    @JRDoc_PT("Retorna verdadeiro se a Cor atual tiver valores menores ou iguais ao valor especificado.")
    @MethodArgs({"color"})
    public boolean lessOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    /// Operators
    @JRDoc_EN("Adds 2 colors and returns a new Color.")
    @JRDoc_PT("Soma 2 cores e retorna uma nova Cor.")
    @MethodArgs({"otherObject"})
    public <T> T sum(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Adds 2 colors and modifies the current Color with the result.")
    @JRDoc_PT("Soma 2 cores e modifica a própria Cor com o resultado.")
    @MethodArgs({"otherObject"})
    public void sumEqual(Object otherObject) {
        //
    }
    
    @JRDoc_EN("Divides 2 colors and returns a new Color.")
    @JRDoc_PT("Divide 2 cores e retorna uma nova Cor.")
    @MethodArgs({"otherObject"})
    public <T> T div(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Divides 2 colors and modifies the current Color with the result.")
    @JRDoc_PT("Divide 2 cores e modifica a própria Cor com o resultado.")
    @MethodArgs({"otherObject"})
    public void divEqual(Object otherObject) {
        //
    }
    
    @JRDoc_EN("Multiplies 2 colors and returns a new Color.")
    @JRDoc_PT("Multiplica 2 cores e retorna uma nova Cor.")
    @MethodArgs({"otherObject"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies 2 colors and modifies the current Color with the result.")
    @JRDoc_PT("Multiplica 2 cores e modifica a própria Cor com o resultado.")
    @MethodArgs({"otherObject"})
    public void mulEqual(Object otherObject) {
        //
    }
    
    @JRDoc_EN("Subtracts 2 colors and returns a new Color.")
    @JRDoc_PT("Subtrai 2 cores e retorna uma nova Cor.")
    @MethodArgs({"otherObject"})
    public <T> T sub(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts 2 colors and modifies the current Color with the result.")
    @JRDoc_PT("Subtrai 2 cores e modifica a própria Cor com o resultado.")
    @MethodArgs({"otherObject"})
    public void subEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Serializes the color to a String in the format '[R;G;B;A]'.")
    @JRDoc_PT("Serializa a cor para uma String no formato '[R;G;B;A]'.")
    //
    public String serializeToString() {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Deserializes a String in the format '[R;G;B;A]' and sets the values to this color.")
    @JRDoc_PT("Desserializa uma String no formato '[R;G;B;A]' e define os valores nesta cor.")
    //
    public void deserializeLocal(String str) {
        //
    }

    /**
     * Bridge to: android.graphics.Color;
     */
    public static class Android {
        public static final int BLACK       = 0xFF000000;
        public static final int DKGRAY      = 0xFF444444;
        public static final int GRAY        = 0xFF888888;
        public static final int LTGRAY      = 0xFFCCCCCC;
        public static final int WHITE       = 0xFFFFFFFF;
        public static final int RED         = 0xFFFF0000;
        public static final int GREEN       = 0xFF00FF00;
        public static final int BLUE        = 0xFF0000FF;
        public static final int YELLOW      = 0xFFFFFF00;
        public static final int CYAN        = 0xFF00FFFF;
        public static final int MAGENTA     = 0xFFFF00FF;
        public static final int TRANSPARENT = 0;

        /**
         * Bridge to: android.graphics.Color.parseColor();
          */
        @JRDoc_EN("Parses a color String and returns the corresponding color-int.")
        @JRDoc_PT("Parseia uma String de cor e retorna o correspondente color-int.")
        public static int parseColor(String colorString) {
            //
            return 0;
            //

            //
        }

        private static float saturate(float v) {
            return v <= 0.0f ? 0.0f : (v >= 1.0f ? 1.0f : v);
        }

        /**
         * Return the alpha component of a color int. This is the same as saying
         * color >>> 24
         */
        @JRDoc_EN("Returns the alpha component of a color-int. This is equivalent to 'color >>> 24'.")
        @JRDoc_PT("Retorna o componente alfa de um color-int. Equivalente a 'color >>> 24'.")
        public static int alpha(int color) {
            return color >>> 24;
        }

        /**
         * Return the red component of a color int. This is the same as saying
         * (color >> 16) & 0xFF
         */
        @JRDoc_EN("Returns the red component of a color-int. This is equivalent to '(color >> 16) & 0xFF'.")
        @JRDoc_PT("Retorna o componente vermelho de um color-int. Equivalente a '(color >> 16) & 0xFF'.")
        public static int red(int color) {
            return (color >> 16) & 0xFF;
        }

        /**
         * Return the green component of a color int. This is the same as saying
         * (color >> 8) & 0xFF
         */
        @JRDoc_EN("Returns the green component of a color-int. This is equivalent to '(color >> 8) & 0xFF'.")
        @JRDoc_PT("Retorna o componente verde de um color-int. Equivalente a '(color >> 8) & 0xFF'.")
        public static int green(int color) {
            return (color >> 8) & 0xFF;
        }

        /**
         * Return the blue component of a color int. This is the same as saying
         * color & 0xFF
         */
        @JRDoc_EN("Returns the blue component of a color-int. This is equivalent to 'color & 0xFF'.")
        @JRDoc_PT("Retorna o componente azul de um color-int. Equivalente a 'color & 0xFF'.")
        public static int blue(int color) {
            return color & 0xFF;
        }

        /**
         * Return a color-int from red, green, blue components.
         * The alpha component is implicitly 255 (fully opaque).
         * These component values should be \([0..255]\), but there is no
         * range check performed, so if they are out of range, the
         * returned color is undefined.
         *
         * @param red  Red component \([0..255]\) of the color
         * @param green Green component \([0..255]\) of the color
         * @param blue  Blue component \([0..255]\) of the color
         */
        @JRDoc_EN("Returns a color-int from red, green, blue components (0–255). Alpha is implicitly 255.")
        @JRDoc_PT("Retorna um color-int a partir dos componentes vermelho, verde e azul (0–255). O alfa é implicitamente 255.")
        public static int rgb(
                int red,
                int green,
                int blue) {
            return 0xff000000 | (red << 16) | (green << 8) | blue;
        }

        /**
         * Return a color-int from red, green, blue float components
         * in the range \([0..1]\). The alpha component is implicitly
         * 1.0 (fully opaque). If the components are out of range, the
         * returned color is undefined.
         *
         * @param red Red component \([0..1]\) of the color
         * @param green Green component \([0..1]\) of the color
         * @param blue Blue component \([0..1]\) of the color
         */
        @JRDoc_EN("Returns a color-int from red, green, blue float components (0.0f – 1.0f). Alpha is implicitly 1.0.")
        @JRDoc_PT("Retorna um color-int a partir dos componentes vermelho, verde e azul (0.0f – 1.0f) do tipo float. O alfa é implicitamente 1.0.")
        public static int rgb(float red, float green, float blue) {
            return 0xff000000 |
                    ((int) (red   * 255.0f + 0.5f) << 16) |
                    ((int) (green * 255.0f + 0.5f) <<  8) |
                    (int) (blue  * 255.0f + 0.5f);
        }

        /**
         * Return a color-int from alpha, red, green, blue components.
         * These component values should be \([0..255]\), but there is no
         * range check performed, so if they are out of range, the
         * returned color is undefined.
         * @param alpha Alpha component \([0..255]\) of the color
         * @param red Red component \([0..255]\) of the color
         * @param green Green component \([0..255]\) of the color
         * @param blue Blue component \([0..255]\) of the color
         */
        @JRDoc_EN("Returns a color-int from alpha, red, green, blue components (0–255).")
        @JRDoc_PT("Retorna um color-int a partir dos componentes alfa, vermelho, verde e azul (0–255).")
        public static int argb(
                int alpha,
                int red,
                int green,
                int blue) {
            return (alpha << 24) | (red << 16) | (green << 8) | blue;
        }

        /**
         * Return a color-int from alpha, red, green, blue float components
         * in the range \([0..1]\). If the components are out of range, the
         * returned color is undefined.
         *
         * @param alpha Alpha component \([0..1]\) of the color
         * @param red Red component \([0..1]\) of the color
         * @param green Green component \([0..1]\) of the color
         * @param blue Blue component \([0..1]\) of the color
         */
        @JRDoc_EN("Returns a color-int from alpha, red, green, blue float components (0.0f – 1.0f).")
        @JRDoc_PT("Retorna um color-int a partir dos componentes alfa, vermelho, verde e azul (0.0f – 1.0f) do tipo float.")
        public static int argb(float alpha, float red, float green, float blue) {
            return ((int) (alpha * 255.0f + 0.5f) << 24) |
                    ((int) (red   * 255.0f + 0.5f) << 16) |
                    ((int) (green * 255.0f + 0.5f) <<  8) |
                    (int) (blue  * 255.0f + 0.5f);
        }
    }
}
