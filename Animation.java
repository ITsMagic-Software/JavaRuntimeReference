package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations"})
public final class Animation {
    //

    public Animation() {
        //
    }

    @JRDoc_EN("Returns the speed of the animation.")
    @JRDoc_PT("Retorna a velocidade da animação.")
    @HideGetSet
    public float getSpeed(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Defines the speed of the animation.")
    @JRDoc_PT("Define a velocidade da animação.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setSpeed(float value){
        //
    }

    @JRDoc_EN("Returns the fps of the animation.")
    @JRDoc_PT("Retorna o fps da animação.")
    @HideGetSet
    public float getFps(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Defines the fps of the animation.")
    @JRDoc_PT("Define o fps da animação.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setFps(int value){
        //
    }

    @JRDoc_EN("Plays the animation.")
    @JRDoc_PT("Reproduz a animação.")
    public void play(){
        //
    }
    @JRDoc_EN("Plays the animation in a loop.")
    @JRDoc_PT("Reproduz a animação em loop.")
    public void playInLoop(){
        //
    }
    @JRDoc_EN("Stops the animation.")
    @JRDoc_PT("Para a animação.")
    public void stop(){
        //
    }
    @JRDoc_EN("Stops the looping animation.")
    @JRDoc_PT("Para a animação em loop.")
    public void stopLoop(){
        //
    }

    @JRDoc_EN("Returns whether the animation is playing.")
    @JRDoc_PT("Retorna se a animação está sendo reproduzida.")
    public boolean isPlaying(){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Returns whether the animation is looping.")
    @JRDoc_PT("Retorna se a animação está em loop.")
    public boolean isLoop(){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns the current frame of the animation.")
    @JRDoc_PT("Retorna o quadro atual da animação.")
    @UnimplementedDoc
    @HideGetSet
    public float getFrameTime() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Sets the current frame of the animation.")
    @JRDoc_PT("Define o quadro atual da animação.")
    @UnimplementedDoc
    @HideGetSet
    @MethodArgs({"frameTime"})
    public void setFrameTime(float t) {
        //
    }

    @JRDoc_EN("Returns the frame count of the animation.")
    @JRDoc_PT("Retorna a quantidade de quadros da animação.")
    @UnimplementedDoc
    @HideGetSet
    public int getFrameCount() {
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Returns the animation frame at the specified index.")
    @JRDoc_PT("Retorna o quadro da animação do índice especificado.")
    @UnimplementedDoc
    @MethodArgs({"index"})
    public AnimationFrame getFrameAt(int index) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the index frame to the specified AnimationFrame.")
    @JRDoc_PT("Define o quadro do índice para o AnimationFrame especificado.")
    @UnimplementedDoc
    @MethodArgs({"index","frame"})
    public void setFrameAt(int index, AnimationFrame frame) {
        //
    }
    @JRDoc_EN("Add the frame to the animation.")
    @JRDoc_PT("Adiciona o frame na animação.")
    @UnimplementedDoc
    @MethodArgs({"frame"})
    public void addFrame(AnimationFrame frame) {
        //
    }
    @JRDoc_EN("Removes the frame from the animation.")
    @JRDoc_PT("Remove o frame da animação.")
    @UnimplementedDoc
    @MethodArgs({"entry"})
    public void removeFrame(AnimationFrame frame) {
        //
    }

    @JRDoc_EN("Returns the length of the animation.")
    @JRDoc_PT("Retorna a duração da animação.")
    public int getLength() {
        //
        return 0;
        //

        //
    }

    @JRDoc_EN("Sorts animation frames. Call after modifying an animation.")
    @JRDoc_PT("Reorganiza os frames da animação. Chame após modificar uma animação.")
    @UnimplementedDoc
    public void sortFrames(){
        //
    }

    /// ABSTRACT
    @JRDoc_EN("Load an AnimationFile.")
    @JRDoc_PT("Carrega um AnimationFile.")
    @MethodArgs({"file"})
    public static Animation loadFile(AnimationFile file){
        //
        return null;
        //

        //
    }
}


