package JAVARuntime;

//

@ClassCategory(cat ={"Physics"})
public final class Characterbody extends PhysicsComponent {

    //

    public Characterbody() {
        //
        super();
        //

        //
    }

    @JRDoc_EN("Returns whether the character's gravity is enabled.")
    @JRDoc_PT("Retorna se a gravidade do personagem está ativada.")
    @HideGetSet
    public boolean isGravityEnabled(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether character gravity is enabled.")
    @JRDoc_PT("Define se a gravidade do personagem está ativada.")
    @MethodArgs({"enabled"})
    @HideGetSet
    public void setGravityEnabled(boolean enabled){
        //
    }

    @JRDoc_EN("Returns whether the movement direction is global.")
    @JRDoc_PT("Retorna se a direção de movimentação é global.")
    @HideGetSet
    public boolean isGlobalDirections(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether movement direction is global or local.")
    @JRDoc_PT("Define se a direção de movimento é global ou local.")
    @MethodArgs({"enabled"})
    @HideGetSet
    public void setGlobalDirections(boolean enabled){
        //
    }

    @JRDoc_EN("Returns whether the character is grounded.")
    @JRDoc_PT("Retorna se o personagem está no chão.")
    public boolean isGrounded(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns whether the character is on the ground.")
    @JRDoc_PT("Retorna se o personagem está sobre o chão.")
    public boolean onGround(){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns whether the character is on the ground.")
    @JRDoc_PT("Retorna se o personagem está sobre o chão.")
    public boolean canJump(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Makes the character jump.")
    @JRDoc_PT("Faz o personagem pular.")
    public void jump(){
        //
    }
    
    @JRDoc_EN("Sets the lateral (X) and forward (Z) movement speed.")
    @JRDoc_PT("Define a velocidade lateral (X) e para frente (Z).")
    @MethodArgs({"x","z"})
    public void setSpeed(float x, float z){
        //
    }

    @JRDoc_EN("Returns the forward movement speed.")
    @JRDoc_PT("Retorna a velocidade de movimento para frente.")
    @HideGetSet
    public float getForwardSpeed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the forward movement speed.")
    @JRDoc_PT("Define a velocidade de movimento para frente.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setForwardSpeed(float value){
        //
    }
    @JRDoc_EN("Returns the lateral movement speed.")
    @JRDoc_PT("Retorna a velocidade de movimento lateral.")
    @HideGetSet
    public float getSideSpeed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the lateral movement speed.")
    @JRDoc_PT("Define a velocidade de movimento lateral.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setSideSpeed(float value){
        //
    }

    @JRDoc_EN("Returns the PhysicsLayer of the Characterbody.")
    @JRDoc_PT("Retorna a PhysicsLayer do Characterbody.")
    @HideGetSet
    public JAVARuntime.PhysicsLayer getPhysicsLayer() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the PhysicsLayer of the Characterbody to the specified layer.")
    @JRDoc_PT("Define a PhysicsLayer do Characterbody para o layer especificado.")
    @HideGetSet
    @MethodArgs({"layer"})
    public void setPhysicsLayer(PhysicsLayer layer){
        //
    }

    @JRDoc_EN("Returns the gravity multiplier of the character.")
    @JRDoc_PT("Retorna o multiplicador de gravidade do personagem.")
    @HideGetSet
    public Vector3 getGravityMultiplier() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the gravity multiplier of the character.")
    @JRDoc_PT("Define o multiplicador de gravidade do personagem.")
    @HideGetSet
    @MethodArgs({"vector"})
    public void setGravityMultiplier(Vector3 vector){
        //
    }

    @JRDoc_EN("Resets lateral and forward speed to zero.")
    @JRDoc_PT("Reseta as velocidades lateral e para frente para zero.")
    public void zeroSpeed(){
        //
    }

    @JRDoc_EN("Returns the character's height.")
    @JRDoc_PT("Retorna a altura do personagem.")
    @HideGetSet
    public float getHeight(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the character's height.")
    @JRDoc_PT("Define a altura do personagem.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setHeight(float value){
        //
    }

    @JRDoc_EN("Returns the character's width.")
    @JRDoc_PT("Retorna a largura do personagem.")
    @HideGetSet
    public float getWidth(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the character's width.")
    @JRDoc_PT("Define a largura do personagem.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setWidth(float value){
        //
    }

    @JRDoc_EN("Returns the jump speed of the character.")
    @JRDoc_PT("Retorna a velocidade do pulo do personagem.")
    @HideGetSet
    public float getJumpSpeed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the jump speed of the character.")
    @JRDoc_PT("Define a velocidade do pulo do personagem.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setJumpSpeed(float value){
        //
    }

    @JRDoc_EN("Returns the maximum step height the character can climb.")
    @JRDoc_PT("Retorna a altura máxima de degrau que o personagem pode subir.")
    @HideGetSet
    public float getStepHeight(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the maximum step height the character can climb.")
    @JRDoc_PT("Define a altura máxima de degrau que o personagem pode subir.")
    @MethodArgs({"value"})
    @HideGetSet
    public void setStepHeight(float value){
        //
    }

    @JRDoc_EN("Returns the character's velocity.")
    @JRDoc_PT("Retorna a velocidade do personagem.")
    @HideGetSet
    public Vector3 getPhysicsVelocity(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the character's horizontal velocity.")
    @JRDoc_PT("Retorna a velocidade horizontal do personagem.")
    @HideGetSet
    public Vector2 getHorizontalPhysicsVelocity(){
        //
        return null;
        //

        //
    }
}
