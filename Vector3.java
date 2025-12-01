package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vector"})
public final class Vector3 implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator,
        AddAddOperator, RemoveRemoveOperator, JsonSerializer
{

    //

    //

    public Vector3() {
        //
    }
    @MethodArgs({"value"})
    public Vector3(float a) {
        //
    }
    @MethodArgs({"value"})
    public Vector3(int a) {
        //
    }

    @MethodArgs({"x","y","z"})
    public Vector3(float x, float y, float z) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3(int x, int y, int z) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3(float x, float y, int z) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3(int x, float y, int z) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3(int x, float y, float z) {
        //
    }
    @MethodArgs({"x","y","z"})
    public Vector3(int x, int y, float z) {
        //
    }

    @JRDoc_EN("Returns the X component of this Vector3.")
    @JRDoc_PT("Retorna o componente X deste Vector3.")
    @HideGetSet
    public float getX(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the X component of this Vector3.")
    @JRDoc_PT("Define o componente X deste Vector3.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setX(float value){
        //
    }
    @JRDoc_EN("Returns the Y component of this Vector3.")
    @JRDoc_PT("Retorna o componente Y deste Vector3.")
    @HideGetSet
    public float getY(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the Y component of this Vector3.")
    @JRDoc_PT("Define o componente Y deste Vector3.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setY(float value){
        //
    }
    @JRDoc_EN("Returns the Z component of this Vector3.")
    @JRDoc_PT("Retorna o componente Z deste Vector3.")
    @HideGetSet
    public float getZ(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the Z component of this Vector3.")
    @JRDoc_PT("Define o componente Z deste Vector3.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setZ(float value){
        //
    }

    @JRDoc_EN("Returns a Vector2 with the X and Y components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes X e Y deste Vector3.")
    public Vector2 getXY(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector2 with the X and Z components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes X e Z deste Vector3.")
    public Vector2 getXZ(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector2 with the Y and Z components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes Y e Z deste Vector3.")
    public Vector2 getYZ(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector2 with the Y and X components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes Y e X deste Vector3.")
    public Vector2 getYX(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector2 with the Z and X components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes Z e X deste Vector3.")
    public Vector2 getZX(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector2 with the Z and Y components of this Vector3.")
    @JRDoc_PT("Retorna um Vector2 com os componentes Z e Y deste Vector3.")
    public Vector2 getZY(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Sets the X and Y components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes X e Y deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setXY(Vector2 v){
        //
    }
    @JRDoc_EN("Sets the X and Z components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes X e Z deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setXZ(Vector2 v){
        //
    }
    @JRDoc_EN("Sets the Y and Z components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes Y e Z deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setYZ(Vector2 v){
        //
    }
    @JRDoc_EN("Sets the Y and X components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes Y e X deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setYX(Vector2 v){
        //
    }
    @JRDoc_EN("Sets the Z and X components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes Z e X deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setZX(Vector2 v){
        //
    }
    @JRDoc_EN("Sets the Z and Y components of this Vector3 with the values of the specified Vector2.")
    @JRDoc_PT("Define os componentes Z e Y deste Vector3 com os valores do Vector2 especificado.")
    @MethodArgs({"value"})
    public void setZY(Vector2 v){
        //
    }

    @JRDoc_EN("Sets the X and Y components of this Vector3.")
    @JRDoc_PT("Define os componentes X e Y deste Vector3.")
    @MethodArgs({"x","y"})
    public void setXY(float x, float y){
        //
    }
    @JRDoc_EN("Sets the X and Z components of this Vector3.")
    @JRDoc_PT("Define os componentes X e Z deste Vector3.")
    @MethodArgs({"x","z"})
    public void setXZ(float x, float z){
        //
    }
    @JRDoc_EN("Sets the Y and Z components of this Vector3.")
    @JRDoc_PT("Define os componentes Y e Z deste Vector3.")
    @MethodArgs({"y","z"})
    public void setYZ(float y, float z){
        //
    }
    @JRDoc_EN("Sets the Y and X components of this Vector3.")
    @JRDoc_PT("Define os componentes Y e X deste Vector3.")
    @MethodArgs({"y","x"})
    public void setYX(float y, float x){
        //
    }
    @JRDoc_EN("Sets the Z and X components of this Vector3.")
    @JRDoc_PT("Define os componentes Z e X deste Vector3.")
    @MethodArgs({"z","x"})
    public void setZX(float z, float x){
        //
    }
    @JRDoc_EN("Sets the Z and Y components of this Vector3.")
    @JRDoc_PT("Define os componentes Z e Y deste Vector3.")
    @MethodArgs({"z","y"})
    public void setZY(float z, float y){
        //
    }

    @JRDoc_EN("Adds the specified value to the X component of this Vector3.")
    @JRDoc_PT("Soma o valor especificado ao componente X deste Vector3.")
    @MethodArgs({"value"})
    public void sumX(float value){
        //
    }
    @JRDoc_EN("Adds the specified value to the Y component of this Vector3.")
    @JRDoc_PT("Soma o valor especificado ao componente Y deste Vector3.")
    @MethodArgs({"value"})
    public void sumY(float value){
        //
    }
    @JRDoc_EN("Adds the specified value to the Z component of this Vector3.")
    @JRDoc_PT("Soma o valor especificado ao componente Z deste Vector3.")
    @MethodArgs({"value"})
    public void sumZ(float value){
        //
    }

    @JRDoc_EN("Subtracts the specified value from the X component of this Vector3.")
    @JRDoc_PT("Subtrai o valor especificado do componente X deste Vector3.")
    @MethodArgs({"value"})
    public void subX(float value){
        //
    }
    @JRDoc_EN("Subtracts the specified value from the Y component of this Vector3.")
    @JRDoc_PT("Subtrai o valor especificado do componente Y deste Vector3.")
    @MethodArgs({"value"})
    public void subY(float value){
        //
    }
    @JRDoc_EN("Subtracts the specified value from the Z component of this Vector3.")
    @JRDoc_PT("Subtrai o valor especificado do componente Z deste Vector3.")
    @MethodArgs({"value"})
    public void subZ(float value){
        //
    }

    @JRDoc_EN("Multiplies the X component of this Vector3 by the specified value.")
    @JRDoc_PT("Multiplica o componente X deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void mulX(float value){
        //
    }
    @JRDoc_EN("Multiplies the Y component of this Vector3 by the specified value.")
    @JRDoc_PT("Multiplica o componente Y deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void mulY(float value){
        //
    }
    @JRDoc_EN("Multiplies the Z component of this Vector3 by the specified value.")
    @JRDoc_PT("Multiplica o componente Z deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void mulZ(float value){
        //
    }

    @JRDoc_EN("Divides the X component of this Vector3 by the specified value.")
    @JRDoc_PT("Divide o componente X deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void divX(float value){
        //
    }
    @JRDoc_EN("Divides the Y component of this Vector3 by the specified value.")
    @JRDoc_PT("Divide o componente Y deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void divY(float value){
        //
    }
    @JRDoc_EN("Divides the Z component of this Vector3 by the specified value.")
    @JRDoc_PT("Divide o componente Z deste Vector3 pelo valor especificado.")
    @MethodArgs({"value"})
    public void divZ(float value){
        //
    }

    /// Calcs
    @JRDoc_EN("Multiplies this Vector3 by the specified Vector3 and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo Vector3 especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 mul(Vector3 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified X, Y and Z values and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelos valores X, Y e Z especificados e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 mul(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified value and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo valor especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 mul(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified Vector3 and updates this Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo Vector3 especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void mulLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified Vector2 and updates this Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo Vector2 especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void mulLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified X, Y and Z values and updates this Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelos valores X, Y e Z especificados e atualiza este Vector3.")
    @MethodArgs({"x","y","z"})
    public void mulLocal(float x, float y, float z){
        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified value and updates this Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo valor especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void mulLocal(float a){
        //
    }

    @JRDoc_EN("Multiplies this Vector3 by the specified Vector3 and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo Vector3 especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 multiply(Vector3 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified X, Y and Z values and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelos valores X, Y e Z especificados e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 multiply(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified value and returns a new Vector3.")
    @JRDoc_PT("Multiplica este Vector3 pelo valor especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 multiply(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Divides this Vector3 by the specified Vector3 and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo Vector3 especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 div(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified X, Y and Z values and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelos valores X, Y e Z especificados e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 div(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified value and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo valor especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 div(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified Vector3 and updates this Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo Vector3 especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void divLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified Vector2 and updates this Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo Vector2 especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void divLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified X, Y and Z values and updates this Vector3.")
    @JRDoc_PT("Divide este Vector3 pelos valores X, Y e Z especificados e atualiza este Vector3.")
    @MethodArgs({"x","y","z"})
    public void divLocal(float x, float y, float z){
        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified value and updates this Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo valor especificado e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void divLocal(float a){
        //
    }

    @JRDoc_EN("Divides this Vector3 by the specified Vector3 and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo Vector3 especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 divide(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified X, Y and Z values and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelos valores X, Y e Z especificados e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 divide(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified value and returns a new Vector3.")
    @JRDoc_PT("Divide este Vector3 pelo valor especificado e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 divide(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Adds the specified Vector3 to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma o Vector3 especificado a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 sum(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified X, Y and Z values to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma os valores X, Y e Z especificados a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 sum(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified value to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma o valor especificado a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 sum(float a){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified Vector3 to this Vector3 and updates this Vector3.")
    @JRDoc_PT("Soma o Vector3 especificado a este Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void sumLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Adds the specified Vector2 to this Vector3 and updates this Vector3.")
    @JRDoc_PT("Soma o Vector2 especificado a este Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void sumLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Adds the specified X, Y and Z values to this Vector3 and updates this Vector3.")
    @JRDoc_PT("Soma os valores X, Y e Z especificados a este Vector3 e atualiza este Vector3.")
    @MethodArgs({"x","y","z"})
    public void sumLocal(float x, float y, float z){
        //
    }
    @JRDoc_EN("Adds the specified value to this Vector3 and updates this Vector3.")
    @JRDoc_PT("Soma o valor especificado a este Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void sumLocal(float a){
        //
    }

    @JRDoc_EN("Adds the specified Vector3 to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma o Vector3 especificado a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 add(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified X, Y and Z values to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma os valores X, Y e Z especificados a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 add(float x, float y, float z){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Adds the specified value to this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Soma o valor especificado a este Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 add(float a){
        //
       return null;
        //

        //
    }

    @JRDoc_EN("Subtracts the specified Vector3 from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai o Vector3 especificado deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 sub(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified X, Y and Z values from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai os valores X, Y e Z especificados deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 sub(float x, float y, float z){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 sub(float a){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified Vector3 from this Vector3 and updates this Vector3.")
    @JRDoc_PT("Subtrai o Vector3 especificado deste Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void subLocal(Vector3 value){
        //
    }
    @JRDoc_EN("Subtracts the specified Vector2 from this Vector3 and updates this Vector3.")
    @JRDoc_PT("Subtrai o Vector2 especificado deste Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void subLocal(Vector2 value){
        //
    }
    @JRDoc_EN("Subtracts the specified X, Y and Z values from this Vector3 and updates this Vector3.")
    @JRDoc_PT("Subtrai os valores X, Y e Z especificados deste Vector3 e atualiza este Vector3.")
    @MethodArgs({"x","y","z"})
    public void subLocal(float x, float y, float z){
        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector3 and updates this Vector3.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector3 e atualiza este Vector3.")
    @MethodArgs({"value"})
    public void subLocal(float a){
        //
    }

    @JRDoc_EN("Subtracts the specified Vector3 from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai o Vector3 especificado deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 subtract(Vector3 value){
        //
       return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified X, Y and Z values from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai os valores X, Y e Z especificados deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"x","y","z"})
    public Vector3 subtract(float x, float y, float z){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified value from this Vector3 and returns a new Vector3.")
    @JRDoc_PT("Subtrai o valor especificado deste Vector3 e retorna um novo Vector3.")
    @MethodArgs({"value"})
    public Vector3 subtract(float a){
        //
        return null;
        //

        //
    }


    /// Utils
    @JRDoc_EN("Checks if this Vector3 is equal to the specified Vector3.")
    @JRDoc_PT("Verifica se este Vector3 é igual ao Vector3 especificado.")
    @MethodArgs({"value"})
    public boolean equals(Vector3 vector){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is equal to the specified X, Y and Z values.")
    @JRDoc_PT("Verifica se este Vector3 é igual aos valores X, Y e Z especificados.")
    @MethodArgs({"x","y","z"})
    public boolean equals(float x, float y, float z){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if all components of this Vector3 are equal to the specified value.")
    @JRDoc_PT("Verifica se todos os componentes este Vector3 é igual ao valor especificado.")
    @MethodArgs({"value"})
    public boolean equals(float a){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Sets the components of this Vector3 to the specified Vector3.")
    @JRDoc_PT("Define os componentes deste Vector3 para o Vector3 especificado.")
    @MethodArgs({"value"})
    public void set(Vector3 vector3){
        //
    }
    @JRDoc_EN("Sets the components of this Vector3 to the specified X, Y and Z values.")
    @JRDoc_PT("Define os componentes deste Vector3 para os valores X, Y e Z especificados.")
    @MethodArgs({"x","y","z"})
    public void set(float x, float y, float z){
        //
    }
    @JRDoc_EN("Sets all components of this Vector3 to the specified value.")
    @JRDoc_PT("Define todos os componentes deste Vector3 para o valor especificado.")
    @MethodArgs({"value"})
    public void set(float a){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified Vector3 based on the provided speed/interval and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e o Vector3 especificado com base na velocidade/intervalo fornecido e atualiza este Vector3.")
    @MethodArgs({"value","speed"})
    public void lerp(Vector3 vector3, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified X, Y and Z values based on the provided speed/interval and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e os valores X, Y e Z especificados com base na velocidade/intervalo fornecido e atualiza este Vector3.")
    @MethodArgs({"x","y","z","speed"})
    public void lerp(float x, float y, float z, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified value based on the provided speed/interval and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e o valor especificado com base na velocidade/intervalo fornecido e atualiza este Vector3.")
    @MethodArgs({"value","speed"})
    public void lerp(float a, float speed){
        //
    }

    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified Vector3 based on the provided speed/interval in one second and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e o Vector3 especificado com base na velocidade/intervalo fornecido em um segundo e atualiza esse Vector3.")
    @MethodArgs({"value","speed"})
    public void lerpInSeconds(Vector3 vector3, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified X, Y and Z values based on the provided speed/interval in one second and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e os valores X, Y e Z especificados com base na velocidade/intervalo fornecido em um segundo e atualiza esse Vector3.")
    @MethodArgs({"x","y","z","speed"})
    public void lerpInSeconds(float x, float y, float z, float speed){
        //
    }
    @JRDoc_EN("Interpolates/smoothes between this Vector3 and the specified value based on the provided speed/interval in one second and updates this Vector3.")
    @JRDoc_PT("Faz uma interpolação/suavização entre este Vector3 e o valor especificado com base na velocidade/intervalo fornecido em um segundo e atualiza esse Vector3.")
    @MethodArgs({"value","speed"})
    public void lerpInSeconds(float a, float speed){
        //
    }

    @JRDoc_EN("Blends between this Vector3 and the specified Vector3 based on the provided blend factor (0 to 1) and updates this Vector3.")
    @JRDoc_PT("Faz uma mistura entre este Vector3 e o Vector3 especificado com base no fator de mistura fornecido (0 a 1) e atualiza este Vector3.")
    @MethodArgs({"value","blend"})
    public void blend(Vector3 vector3, float blend){
        //
    }
    @JRDoc_EN("Blends between this Vector3 and the specified X, Y and Z values based on the provided blend factor (0 to 1) and updates this Vector3.")
    @JRDoc_PT("Faz uma mistura entre este Vector3 e os valores X, Y e Z especificados com base no fator de mistura fornecido (0 a 1) e atualiza este Vector3.")
    @MethodArgs({"x","y","z","blend"})
    public void blend(float x, float y, float z, float blend){
        //
    }
    @JRDoc_EN("Blends between this Vector3 and the specified value based on the provided blend factor (0 to 1) and updates this Vector3.")
    @JRDoc_PT("Faz uma mistura entre este Vector3 e o valor especificado com base no fator de mistura fornecido (0 a 1) e atualiza este Vector3.")
    @MethodArgs({"value","blend"})
    public void blend(float a, float blend){
        //
    }

    @JRDoc_EN("Returns a normalized copy of this Vector3 (length equals 1).")
    @JRDoc_PT("Retorna uma cópia normalizada deste Vector3 (comprimento igual a 1).")
    public Vector3 normalize(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Normalizes this Vector3 (sets its length to 1).")
    @JRDoc_PT("Normaliza este Vector3 (define seu comprimento para 1).")
    public void normalizeLocal(){
        //
    }

    @JRDoc_EN("Returns the length (magnitude) of this Vector3.")
    @JRDoc_PT("Retorna o comprimento (magnitude) deste Vector3.")
    public float length(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the squared length of this Vector3. Faster than length() as it doesn't use a square root; useful for comparing distances.")
    @JRDoc_PT("Retorna o comprimento ao quadrado deste Vector3. Mais rápido que length() pois não usa raiz quadrada; útil para comparar distâncias.")
    public float sqrLength(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the magnitude of this Vector3.")
    @JRDoc_PT("Retorna a magnitude deste Vector3.")
    public float magnitude(){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the squared magnitude of this Vector3. Faster than magnitude() as it doesn't use a square root; useful for comparing distances.")
    @JRDoc_PT("Retorna a magnitude ao quadrado deste Vector3. Mais rápido que magnitude() pois não usa raiz quadrada; útil para comparar distâncias.")
    public float sqrMagnitude(){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Rotates this Vector3 by the specified angles (in degrees) and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 pelos ângulos especificados (em graus) e retorna o Vector3 resultante.")
    @MethodArgs({"angleX","angleY","angleZ"})
    public Vector3 rotate(float angleX, float angleY, float angleZ){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Rotates this Vector3 by the specified rotation Vector3 (in degrees) and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 pelo Vector3 de rotação especificado (em graus) e retorna o Vector3 resultante.")
    @MethodArgs({"rotation"})
    public Vector3 rotate(Vector3 rotation){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Rotates this Vector3 by the specified Quaternion rotation and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 pela rotação do Quaternion especificado e retorna o Vector3 resultante.")
    @MethodArgs({"rotation"})
    public Vector3 rotate(Quaternion rotation){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Rotates this Vector3 around the specified pivot point using the given rotation angles (in degrees) and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 ao redor do ponto de pivô especificado usando os ângulos da rotação fornecidos (em graus) e retorna o Vector3 resultante.")
    @MethodArgs({"angleX","angleY","angleZ","pivot"})
    public Vector3 rotateAroundPivot(float angleX, float angleY, float angleZ, Vector3 pivot){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Rotates this Vector3 around the specified pivot point using the given rotation Vector3 (in degrees) and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 ao redor do ponto de pivô especificado usando o Vector3 de rotação fornecido (em graus) e retorna o Vector3 resultante.")
    @MethodArgs({"rotation","pivot"})
    public Vector3 rotateAroundPivot(Vector3 rotation, Vector3 pivot){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Rotates this Vector3 around the specified pivot point using the given Quaternion rotation and returns the resulting Vector3.")
    @JRDoc_PT("Rotaciona este Vector3 ao redor do ponto de pivô especificado usando a rotação do Quaternion fornecido e retorna o Vector3 resultante.")
    @MethodArgs({"rotation","pivot"})
    public Vector3 rotateAroundPivot(Quaternion rotation, Vector3 pivot){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the distance between this Vector3 and the specified Vector3.")
    @JRDoc_PT("Retorna a distância entre este Vector3 e o Vector3 especificado.")
    @MethodArgs({"value"})
    public float distance(Vector3 vector3){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the squared distance between this Vector3 and the specified Vector3. Faster than distance() as it doesn't use a square root; useful for comparing distances.")
    @JRDoc_PT("Retorna a distância ao quadrado entre este Vector3 e o Vector3 especificado. Mais rápido que distance() pois não usa raiz quadrada; útil para comparar distâncias.")
    @MethodArgs({"value"})
    public float sqrDistance(Vector3 vector3){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the dot product of this Vector3 and the specified Vector3.")
    @JRDoc_PT("Retorna o produto escalar deste Vector3 e do Vector3 especificado.")
    @MethodArgs({"value"})
    public float dot(Vector3 vector3){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the dot product of this Vector3 and the specified X, Y and Z values.")
    @JRDoc_PT("Retorna o produto escalar deste Vector3 e dos valores X, Y e Z especificados.")
    @MethodArgs({"x","y","z"})
    public float dot(float x, float y, float z){
        //
       return 0;
        //

        //
    }
    @JRDoc_EN("Returns the dot product of this Vector3 and the specified value, used for all components.")
    @JRDoc_PT("Retorna o produto escalar deste Vector3 com o valor especificado, usado para todos os componentes.")
    @MethodArgs({"value"})
    public float dot(float a){
        //
       return 0;
        //

        //
    }

    @JRDoc_EN("Returns the cross product of this Vector3 and the specified Vector3.")
    @JRDoc_PT("Retorna o produto vetorial deste Vector3 e do Vector3 especificado.")
    @MethodArgs({"value"})
    public Vector3 cross(Vector3 value){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the cross product of this Vector3 and the specified X, Y and Z values.")
    @JRDoc_PT("Retorna o produto vetorial deste Vector3 e dos valores X, Y e Z especificados.")
    @MethodArgs({"x","y","z"})
    public Vector3 cross(float x, float y, float z){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a copy of this Vector3.")
    @JRDoc_PT("Retorna uma cópia deste Vector3.")
    public Vector3 copy(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a String representation of this Vector3.")
    @JRDoc_PT("Retorna uma representação em String deste Vector3.")
    public String toString() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a String representation of this Vector3 with the specified number of decimal places.")
    @JRDoc_PT("Retorna uma representação em String deste Vector3 com o número especificado de casas decimais.")
    @MethodArgs({"decimals"})
    public String toString(int decimals) {
        //
        return null;
        //

        //
    }

    /// Abstracts
    @JRDoc_EN("Returns a Vector3 with all components set to zero (0, 0, 0).")
    @JRDoc_PT("Retorna um Vector3 com todos os componentes definidos como zero (0, 0, 0).")
    public static Vector3 zero(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a Vector3 with all components set to one (1, 1, 1).")
    @JRDoc_PT("Retorna um Vector3 com todos os componentes definidos como um (1, 1, 1).")
    public static Vector3 one(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Smoothly moves the current vector towards the target vector with smoothing control, maximum speed, in the defined interval.")
    @JRDoc_PT("Move o vetor current suavemente em direção ao target com controle de suavização, velocidade máxima, no intervalo definido.")
    @MethodArgs({"current","target","velocity","smoothTime", "maxSpeed","deltaTime"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Smoothly moves the current vector towards the target vector with smoothing control, maximum speed, in the defined interval and stores the result in the specified vector.")
    @JRDoc_PT("Move o vetor current suavemente em direção ao target com controle de suavização, velocidade máxima, no intervalo definido e armazena o resultado no vetor especificado.")
    @MethodArgs({"current","target","velocity","smoothTime", "maxSpeed","deltaTime","out"})
    public static Vector3 smoothDamp(Vector3 a, Vector3 b, Vector3 velocity, float smoothTime, float maxSpeed, float deltaTime, Vector3 out){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Reflects direction vector off a plane defined by the normal.")
    @JRDoc_PT("Reflete o vetor de direção em um plano definido pela normal.")
    @MethodArgs({"dir","normal"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Reflects direction vector off a plane defined by the normal and stores the result in the specified vector.")
    @JRDoc_PT("Reflete o vetor de direção em um plano definido pela normal e armazena o resultado no vetor especificado.")
    @MethodArgs({"dir","normal","out"})
    public static Vector3 reflect(Vector3 dir, Vector3 normal, Vector3 out){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the angle in degrees between the two specified vectors.")
    @JRDoc_PT("Retorna o ângulo em graus entre os dois vetores especificados.")
    @MethodArgs({"a","b"})
    public static float angle(Vector3 a, Vector3 b){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Calculates the normal of the triangle defined by the three specified vertices.")
    @JRDoc_PT("Calcula a normal do triângulo definido pelos três vértices especificados.")
    @MethodArgs({"a","b","c"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Calculates the normal of the triangle defined by the three specified vertices and stores the result in the specified vector.")
    @JRDoc_PT("Calcula a normal do triângulo definido pelos três vértices especificados e armazena o resultado no vetor especificado.")
    @MethodArgs({"a","b","c","out"})
    public static Vector3 triangleNormal(Vector3 a, Vector3 b, Vector3 c, Vector3 out){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a new Vector3 with the largest component values from the two given vectors.")
    @JRDoc_PT("Retorna um novo Vector3 com os maiores valores de cada componente entre os dois vetores fornecidos.")
    @MethodArgs({"value1","value2"})
    public static Vector3 Max(Vector3 value1, Vector3 value2){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns a new Vector3 with the smallest component values from the two given vectors.")
    @JRDoc_PT("Retorna um novo Vector3 com os menores valores de cada componente entre os dois vetores fornecidos.")
    @MethodArgs({"value1","value2"})
    public static Vector3 Min(Vector3 value1, Vector3 value2){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a new Vector3 with all components inverted (multiplied by -1).")
    @JRDoc_PT("Retorna um novo Vector3 com todos os componentes invertidos (multiplicados por -1).")
    @MethodArgs({"value"})
    public static Vector3 Negate(Vector3 value)
    {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns a Vector3 pointing upwards (0, 1, 0).")
    @JRDoc_PT("Retorna um Vector3 apontando para cima (0, 1, 0).")
    public static Vector3 up() {
        return new Vector3 (0,1,0);
    }
    @JRDoc_EN("Returns a Vector3 pointing downwards (0, -1, 0).")
    @JRDoc_PT("Retorna um Vector3 apontando para baixo (0, -1, 0).")
    public static Vector3 down() {
        return new Vector3 (0,-1,0);
    }
    @JRDoc_EN("Returns a Vector3 pointing backwards (0, 0, -1).")
    @JRDoc_PT("Retorna um Vector3 apontando para trás (0, 0, -1).")
    public static Vector3 back() {
        return new Vector3 (0,0,-1);
    }
    @JRDoc_EN("Returns a Vector3 pointing forwards (0, 0, 1).")
    @JRDoc_PT("Retorna um Vector3 apontando para frente (0, 0, 1).")
    public static Vector3 forward() {
        return new Vector3 (0,0,1);
    }
    @JRDoc_EN("Returns a Vector3 pointing to the left (-1, 0, 0).")
    @JRDoc_PT("Retorna um Vector3 apontando para a esquerda (-1, 0, 0).")
    public static Vector3 left() {
        return new Vector3 (-1,0,0);
    }
    @JRDoc_EN("Returns a Vector3 pointing to the right (1, 0, 0).")
    @JRDoc_PT("Retorna um Vector3 apontando para a direita (1, 0, 0).")
    public static Vector3 right() {
        return new Vector3 (1,0,0);
    }


    /// Comparators
    @JRDoc_EN("Checks if this Vector3 is equal to the specified object.")
    @JRDoc_PT("Verifica se este Vector3 é igual ao objeto especificado.")
    @MethodArgs({"value"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is the same instance as the specified object.")
    @JRDoc_PT("Verifica se este Vector3 é a mesma instância do objeto especificado.")
    @MethodArgs({"value"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is not equal to the specified object.")
    @JRDoc_PT("Verifica se este Vector3 não é igual ao objeto especificado.")
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

    @JRDoc_EN("Checks if this Vector3 is greater than the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior que o objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than or equal to the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior ou igual ao objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is greater than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é maior ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean greaterOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Checks if this Vector3 is less than the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor que o objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor que o valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessThan(double v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than or equal to the specified object (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor ou igual ao objeto especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this Vector3 is less than or equal to the specified value (by magnitude).")
    @JRDoc_PT("Verifica se este Vector3 é menor ou igual ao valor especificado (pela magnitude).")
    @MethodArgs({"value"})
    public boolean lessOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    /// Operators
    @JRDoc_EN("Returns the sum of this Vector3 and the specified object.")
    @JRDoc_PT("Retorna a soma deste Vector3 e do objeto especificado.")
    @MethodArgs({"value"})
    public <T> T sum(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sums the specified object to this Vector3.")
    @JRDoc_PT("Soma o objeto especificado a este Vector3.")
    @MethodArgs({"value"})
    public void sumEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the division of this Vector3 by the specified object.")
    @JRDoc_PT("Retorna a divisão deste Vector3 pelo objeto especificado.")
    @MethodArgs({"value"})
    public <T> T div(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Divides this Vector3 by the specified object.")
    @JRDoc_PT("Divide este Vector3 pelo objeto especificado.")
    @MethodArgs({"value"})
    public void divEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the multiplication of this Vector3 by the specified object.")
    @JRDoc_PT("Retorna a multiplicação deste Vector3 pelo objeto especificado.")
    @MethodArgs({"value"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Multiplies this Vector3 by the specified object.")
    @JRDoc_PT("Multiplica este Vector3 pelo objeto especificado.")
    @MethodArgs({"value"})
    public void mulEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Returns the subtraction of this Vector3 and the specified object.")
    @JRDoc_PT("Retorna a subtração deste Vector3 e do objeto especificado.")
    @MethodArgs({"value"})
    public <T> T sub(Object otherObject) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Subtracts the specified object from this Vector3.")
    @JRDoc_PT("Subtrai o objeto especificado deste Vector3.")
    @MethodArgs({"value"})
    public void subEqual(Object otherObject) {
        //
    }

    @JRDoc_EN("Increments this Vector3 by 1.")
    @JRDoc_PT("Incrementa este Vector3 em 1.")
    public void addAdd() {
        //
    }
    @JRDoc_EN("Decrements this Vector3 by 1.")
    @JRDoc_PT("Decrementa este Vector3 em 1.")
    public void removeRemove() {
        //
    }

    @JRDoc_EN("Returns a String representation of this Vector3 in the format '[X;Y;Z]'.")
    @JRDoc_PT("Retorna uma representação em String deste Vector3 no formato '[X;Y;Z]'.")
    //
    public String serializeToString() {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Deserializes a String in the format '[X;Y;Z]' and sets the values to this Vector3.")
    @JRDoc_PT("Desserializa uma String no formato '[X;Y;Z]' e define os valores neste Vector3.")
    //
    public void deserializeLocal(String str) {
        //
    }
}
