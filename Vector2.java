package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Vector2 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator, JsonSerializer
{

    //

    //

    public Vector2() {
        //
    }
    @MethodArgs({"x","y"})
    public Vector2(float x, float y) {
        //
    }
    @MethodArgs({"x","y"})
    public Vector2(int x, float y) {
        //
    }
    @MethodArgs({"x","y"})
    public Vector2(float x, int y) {
        //
    }
    @MethodArgs({"x","y"})
    public Vector2(int x, int y) {
        //
    }
    @MethodArgs({"value"})
    public Vector2(float a) {
        //
    }

    @JRDoc_EN("Returns the X component of this Vector2.")
    @JRDoc_PT("Retorna o componente X deste Vector2.")
    @HideGetSet
    public float getX(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the X component of this Vector2.")
    @JRDoc_PT("Define o componente X deste Vector2.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setX(float value){
        //
    }
    @JRDoc_EN("Returns the Y component of this Vector2.")
    @JRDoc_PT("Retorna o componente Y deste Vector2.")
    @HideGetSet
    public float getY(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the Y component of this Vector2.")
    @JRDoc_PT("Define o componente Y deste Vector2.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setY(float value){
        //
    }


    /// Calcs
    @JRDoc_EN("Multiplies this Vector2 by the specified Vector2 and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo Vector2 especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 mul(Vector2 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified X and Y values and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelos valores X e Y especificados e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 mul(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified value and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo valor especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 mul(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified Vector3 (using only X and Y components) and updates this Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo Vector3 especificado (usando apenas os componentes X e Y) e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void mulLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified Vector2 and updates this Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo Vector2 especificado e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void mulLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified X and Y values and updates this Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelos valores X e Y especificados e atualiza este Vector2.")
    @MethodArgs({"x","y"})
    public void mulLocal(float x, float y){
        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified value and updates this Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo valor especificado e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void mulLocal(float a){
        //
    }

    @JRDoc_EN("Multiplies this Vector2 by the specified Vector2 and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo Vector2 especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 multiply(Vector2 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified X and Y values and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelos valores X e Y especificados e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 multiply(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified value and returns a new Vector2.")
    @JRDoc_PT("Multiplica este Vector2 pelo valor especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 multiply(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Divides this Vector2 by the specified Vector2 and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo Vector2 especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 div(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified X and Y values and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelos valores X e Y especificados e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 div(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified value and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo valor especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 div(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified Vector3 (using only X and Y components) and updates this Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo Vector3 especificado (usando apenas os componentes X e Y) e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void divLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified Vector2 and updates this Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo Vector2 especificado e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void divLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified X and Y values and updates this Vector2.")
    @JRDoc_PT("Divide este Vector2 pelos valores X e Y especificados e atualiza este Vector2.")
    @MethodArgs({"x","y"})
    public void divLocal(float x, float y){
        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified value and updates this Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo valor especificado e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void divLocal(float a){
        //
    }

    @JRDoc_EN("Divides this Vector2 by the specified Vector2 and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo Vector2 especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 divide(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified X and Y values and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelos valores X e Y especificados e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 divide(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified value and returns a new Vector2.")
    @JRDoc_PT("Divide este Vector2 pelo valor especificado e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 divide(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Adds the specified Vector2 to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma o Vector2 especificado a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 sum(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified X and Y values to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma os valores X e Y especificados a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 sum(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified value to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma o valor especificado a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 sum(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified Vector3 (using only X and Y components) to this Vector2 and updates this Vector2.")
    @JRDoc_PT("Soma o Vector3 especificado (usando apenas os componentes X e Y) a este Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void sumLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Adds the specified Vector2 to this Vector2 and updates this Vector2.")
    @JRDoc_PT("Soma o Vector2 especificado a este Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void sumLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Adds the specified X and Y values to this Vector2 and updates this Vector2.")
    @JRDoc_PT("Soma os valores X e Y especificados a este Vector2 e atualiza este Vector2.")
    @MethodArgs({"x","y"})
    public void sumLocal(float x, float y){
        //
    }
    @JRDoc_EN("Adds the specified value to this Vector2 and updates this Vector2.")
    @JRDoc_PT("Soma o valor especificado a este Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void sumLocal(float a){
        //
    }

    @JRDoc_EN("Adds the specified Vector2 to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma o Vector2 especificado a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 add(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified X and Y values to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma os valores X e Y especificados a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 add(float x, float y){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified value to this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Soma o valor especificado a este Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 add(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Subtracts the specified Vector2 from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai o Vector2 especificado deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 sub(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified X and Y values from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai os valores X e Y especificados deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 sub(float x, float y){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 sub(float a){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified Vector3 (using only X and Y components) from this Vector2 and updates this Vector2.")
    @JRDoc_PT("Subtrai o Vector3 especificado (usando apenas os componentes X e Y) deste Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void subLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Subtracts the specified Vector2 from this Vector2 and updates this Vector2.")
    @JRDoc_PT("Subtrai o Vector2 especificado deste Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void subLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Subtracts the specified X and Y values from this Vector2 and updates this Vector2.")
    @JRDoc_PT("Subtrai os valores X e Y especificados deste Vector2 e atualiza este Vector2.")
    @MethodArgs({"x","y"})
    public void subLocal(float x, float y){
        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector2 and updates this Vector2.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector2 e atualiza este Vector2.")
    @MethodArgs({"value"})
    public void subLocal(float a){
        //
    }

    @JRDoc_EN("Subtracts the specified Vector2 from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai o Vector2 especificado deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 subtract(Vector2 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified X and Y values from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai os valores X e Y especificados deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"x","y"})
    public Vector2 subtract(float x, float y){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector2 and returns a new Vector2.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector2 e retorna um novo Vector2.")
    @MethodArgs({"value"})
    public Vector2 subtract(float a){
        //
        return null;
        //

        //
    }

    /// Utils
    @JRDoc_EN("Checks if this Vector2 is equal to the specified Vector2.")
    @JRDoc_PT("Verifica se este Vector2 é igual ao Vector2 especificado.")
    @MethodArgs({"value"})
    public boolean equals(Vector2 vector){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is equal to the specified X and Y values.")
    @JRDoc_PT("Verifica se este Vector2 é igual aos valores X e Y especificados.")
    @MethodArgs({"x","y"})
    public boolean equals(float x, float y){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if all components of this Vector2 are equal to the specified value.")
    @JRDoc_PT("Verifica se todos os componentes este Vector2 é igual ao valor especificado.")
    @MethodArgs({"value"})
    public boolean equals(float a){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Sets the components of this Vector2 to the specified Vector2.")
    @JRDoc_PT("Define os componentes deste Vector2 para o Vector2 especificado.")
    @MethodArgs({"value"})
    public void set(Vector2 vector2){
        //
    }
    @JRDoc_EN("Sets the components of this Vector2 to the specified X and Y values.")
    @JRDoc_PT("Define os componentes deste Vector2 para os valores X e Y especificados.")
    @MethodArgs({"x","y"})
    public void set(float x, float y){
        //
    }
    @JRDoc_EN("Sets all components of this Vector2 to the specified value.")
    @JRDoc_PT("Define todos os componentes deste Vector2 para o valor especificado.")
    @MethodArgs({"value"})
    public void set(float a){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified Vector2 based on the provided speed/interval and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e o Vector2 especificado com base na velocidade/intervalo fornecido e atualiza este Vector2.")
    @MethodArgs({"value","speed"})
    public void lerp(Vector2 vector2, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified X and Y values based on the provided speed/interval and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e os valores X e Y especificados com base na velocidade/intervalo fornecido e atualiza este Vector2.")
    @MethodArgs({"x","y","speed"})
    public void lerp(float x, float y, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified value based on the provided speed/interval and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e o valor especificado com base na velocidade/intervalo fornecido e atualiza este Vector2.")
    @MethodArgs({"value","speed"})
    public void lerp(float a, float speed){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified Vector2 based on the provided speed/interval in one second and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e o Vector2 especificado com base na velocidade/intervalo fornecido em um segundo e atualiza este Vector2.")
    @MethodArgs({"value","speed"})
    public void lerpInSeconds(Vector2 vector2, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified X and Y values based on the provided speed/interval in one second and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e os valores X e Y especificados com base na velocidade/intervalo fornecido em um segundo e atualiza este Vector2.")
    @MethodArgs({"x","y","speed"})
    public void lerpInSeconds(float x, float y, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector2 and the specified value based on the provided speed/interval in one second and updates this Vector2.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector2 e o valor especificado com base na velocidade/intervalo fornecido em um segundo e atualiza este Vector2.")
    @MethodArgs({"value","speed"})
    public void lerpInSeconds(float a, float speed){
        //
    }

    @JRDoc_EN("Blends between this Vector2 and the specified Vector2 based on the provided blend factor (0 to 1) and updates this Vector2.")
    @JRDoc_PT("Faz uma mistura entre este Vector2 e o Vector2 especificado com base no fator de mistura fornecido (0 a 1) e atualiza este Vector2.")
    @MethodArgs({"value","blend"})
    public void blend(Vector2 vector2, float blend){
        //
    }
    @JRDoc_EN("Blends between this Vector2 and the specified X and Y values based on the provided blend factor (0 to 1) and updates this Vector2.")
    @JRDoc_PT("Faz uma mistura entre este Vector2 e os valores X e Y especificados com base no fator de mistura fornecido (0 a 1) e atualiza este Vector2.")
    @MethodArgs({"x","y","blend"})
    public void blend(float x, float y, float blend){
        //
    }
    @JRDoc_EN("Blends between this Vector2 and the specified value based on the provided blend factor (0 to 1) and updates this Vector2.")
    @JRDoc_PT("Faz uma mistura entre este Vector2 e o valor especificado com base no fator de mistura fornecido (0 a 1) e atualiza este Vector2.")
    @MethodArgs({"value","blend"})
    public void blend(float a, float blend){
        //
    }

    @JRDoc_EN("Returns a normalized copy of this Vector2 (length equals 1).")
    @JRDoc_PT("Retorna uma cópia normalizada deste Vector2 (comprimento igual a 1).")
    public Vector2 normalize(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Normalizes this Vector2 (sets its length to 1).")
    @JRDoc_PT("Normaliza este Vector2 (define seu comprimento para 1).")
    public void normalizeLocal(){
        //
    }

    @JRDoc_EN("Rotates this Vector2 by the specified angle (in degrees) and updates this Vector2.")
    @JRDoc_PT("Rotaciona este Vector2 pelo ângulo especificado (em graus) e atualiza este Vector2.")
    @MethodArgs({"angle"})
    public void rotateLocal(float angle){
        //
    }

    @JRDoc_EN("Returns the length (magnitude) of this Vector2.")
    @JRDoc_PT("Retorna o comprimento (magnitude) deste Vector2.")
    public float length(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the squared length of this Vector2. Faster than length() as it doesn't use a square root; useful for comparing distances.")
    @JRDoc_PT("Retorna o comprimento ao quadrado deste Vector2. Mais rápido que length() pois não usa raiz quadrada; útil para comparar distâncias.")
    public float sqrLength(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the distance between this Vector2 and the specified Vector2.")
    @JRDoc_PT("Retorna a distância entre este Vector2 e o Vector2 especificado.")
    @MethodArgs({"value"})
    public float distance(Vector2 vector2){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the squared distance between this Vector2 and the specified Vector2. Faster than distance() as it doesn't use a square root; useful for comparing distances.")
    @JRDoc_PT("Retorna a distância ao quadrado entre este Vector2 e o Vector2 especificado. Mais rápido que distance() pois não usa raiz quadrada; útil para comparar distâncias.")
    @MethodArgs({"value"})
    public float sqrDistance(Vector2 vector2){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the dot product of this Vector2 and the specified Vector2.")
    @JRDoc_PT("Retorna o produto escalar deste Vector2 e do Vector2 especificado.")
    @MethodArgs({"value"})
    public float dot(Vector2 vector2){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the dot product of this Vector2 and the specified X and Y values.")
    @JRDoc_PT("Retorna o produto escalar deste Vector2 e dos valores X e Y especificados.")
    @MethodArgs({"x","y"})
    public float dot(float x, float y){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the dot product of this Vector2 and the specified value, used for both components.")
    @JRDoc_PT("Retorna o produto escalar deste Vector2 com o valor especificado, usado para ambos os componentes.")
    @MethodArgs({"value"})
    public float dot(float a){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the cross product of this Vector2 and the specified Vector2 as a Vector3.")
    @JRDoc_PT("Retorna o produto vetorial deste Vector2 e do Vector2 especificado como um Vector3.")
    @MethodArgs({"value"})
    public Vector3 cross(Vector2 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the cross product of this Vector2 and the specified X and Y values as a Vector3.")
    @JRDoc_PT("Retorna o produto vetorial deste Vector2 e dos valores X e Y especificados como um Vector3.")
    @MethodArgs({"x","y"})
    public Vector3 cross(float x, float y){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a copy of this Vector2.")
    @JRDoc_PT("Retorna uma cópia deste Vector2.")
    public Vector2 copy(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a String representation of this Vector2.")
    @JRDoc_PT("Retorna uma representação em String deste Vector2.")
    public String toString() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a String representation of this Vector2 with the specified number of decimal places.")
    @JRDoc_PT("Retorna uma representação em String deste Vector2 com o número especificado de casas decimais.")
    @MethodArgs({"decimals"})
    public String toString(int decimals) {
        //
        return null;
        //

        //
    }

    /// Abstracts
    @JRDoc_EN("Returns a Vector2 with all components set to zero (0, 0).")
    @JRDoc_PT("Retorna um Vector2 com todos os componentes definidos como zero (0, 0).")
    public static Vector2 zero(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Rotates the specified Vector2 by the given angle (in degrees) and returns the result.")
    @JRDoc_PT("Rotaciona o Vector2 especificado pelo ângulo fornecido (em graus) e retorna o resultado.")
    @MethodArgs({"vector","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, float angle){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Rotates the specified Vector2 around the given pivot point by the specified angle (in degrees) and returns the result.")
    @JRDoc_PT("Rotaciona o Vector2 especificado ao redor do ponto de pivô fornecido pelo ângulo especificado (em graus) e retorna o resultado.")
    @MethodArgs({"vector","pivot","angle"})
    public static Vector2 rotateAroundPivot(Vector2 vector, Vector2 pivot, float angle){
        //
        return null;
        //

        //
    }

    /// Comparators
    @JRDoc_EN("Checks if this Vector2 is equal to the specified object.")
    @JRDoc_PT("Verifica se este Vector2 é igual ao objeto especificado.")
    @MethodArgs({"value"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is the same instance as the specified object.")
    @JRDoc_PT("Verifica se este Vector2 é a mesma instância do objeto especificado.")
    @MethodArgs({"value"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is not equal to the specified object.")
    @JRDoc_PT("Verifica se este Vector2 não é igual ao objeto especificado.")
    @MethodArgs({"value"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if the specified object is null.")
    @JRDoc_PT("Verifica se o objeto especificado é nulo.")
    @MethodArgs({"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Checks if this Vector2 is greater than the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior que o objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than or equal to the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior ou igual ao objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Checks if this Vector2 is less than the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor que o objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than or equal to the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor ou igual ao objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector2 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector2 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    /// Operators
    @JRDoc_EN("Returns the sum of this Vector2 and the specified object.")
    @JRDoc_PT("Retorna a soma deste Vector2 e do objeto especificado.")
    @MethodArgs({"value"})
    public <T> T sum(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sums the specified object to this Vector2.")
    @JRDoc_PT("Soma o objeto especificado a este Vector2.")
    @MethodArgs({"value"})
    public void sumEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the division of this Vector2 by the specified object.")
    @JRDoc_PT("Retorna a divisão deste Vector2 pelo objeto especificado.")
    @MethodArgs({"value"})
    public <T> T div(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector2 by the specified object.")
    @JRDoc_PT("Divide este Vector2 pelo objeto especificado.")
    @MethodArgs({"value"})
    public void divEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the multiplication of this Vector2 by the specified object.")
    @JRDoc_PT("Retorna a multiplicação deste Vector2 pelo objeto especificado.")
    @MethodArgs({"value"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector2 by the specified object.")
    @JRDoc_PT("Multiplica este Vector2 pelo objeto especificado.")
    @MethodArgs({"value"})
    public void mulEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the subtraction of this Vector2 and the specified object.")
    @JRDoc_PT("Retorna a subtração deste Vector2 e do objeto especificado.")
    @MethodArgs({"value"})
    public <T> T sub(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified object from this Vector2.")
    @JRDoc_PT("Subtrai o objeto especificado deste Vector2.")
    @MethodArgs({"value"})
    public void subEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Increments this Vector2 by 1.")
    @JRDoc_PT("Incrementa este Vector2 em 1.")
    public void addAdd() {
        //
    }
    @JRDoc_EN("Decrements this Vector2 by 1.")
    @JRDoc_PT("Decrementa este Vector2 em 1.")
    public void removeRemove() {
        //
    }

    @JRDoc_EN("Returns a String representation of this Vector2 in the format '[X;Y]'.")
    @JRDoc_PT("Retorna uma representação em String deste Vector2 no formato '[X;Y]'.")
    //
    public String serializeToString() {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Deserializes a String in the format '[X;Y]' and sets the values to this Vector2.")
    @JRDoc_PT("Desserializa uma String no formato '[X;Y]' e define os valores neste Vector2.")
    //
    public void deserializeLocal(String str) {
        //
    }
}
