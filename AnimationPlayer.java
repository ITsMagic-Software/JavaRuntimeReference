package JAVARuntime;

//
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations","Components"})
public final class AnimationPlayer extends Component{
    //

    public AnimationPlayer() {
        //
        super();
        //

        //
    }

    @JRDoc_EN("Returns the animation with the specified name.")
    @JRDoc_PT("Retorna a animação com o nome especificado.")
    @MethodArgs({"name"})
    public Animation getAnimation(String name) {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Returns the animation at the specified index.")
    @JRDoc_PT("Retorna a animação do índice especificado.")
    @MethodArgs({"idx"})
    public Animation getAnimation(int idx) {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Sets the animation at the specified index to the provided animation.")
    @JRDoc_PT("Define a animação no índice especificado para a animação fornecida.")
    @MethodArgs({"idx", "animation"})
    public void setAnimation(int idx, Animation animation) {
        //
    }

    @JRDoc_EN("Returns a list of all animations in the AnimationPlayer.")
    @JRDoc_PT("Retorna uma lista com todas as animações do AnimationPlayer.")
    public List<Animation> getAnimationList() {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Adds the specified Animation to the AnimationPlayer.")
    @JRDoc_PT("Adiciona a Animação especificada no AnimationPlayer.")
    @MethodArgs({"animation"})
    public void addAnimation(Animation animation) {
        //
    }

    @JRDoc_EN("Adds an animation transition between the current animation and the specified one (to) with a delay (delay).")
    @JRDoc_PT("Adiciona uma transição de animação entre a animação atual e a especificada (to) com um atraso (delay).")
    @UnimplementedDoc
    @MethodArgs({"to","delay"})
    public AnimationTransition addTransition(Animation to, float delay){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Adds an animation transition between the current animation and the specified one (to) with a delay (delay) and an interpolation curve (curve).")
    @JRDoc_PT("Adiciona uma transição de animação entre a animação atual e a especificada (to) com um atraso (delay) e uma curva de interpolação (curve).")
    @UnimplementedDoc
    @MethodArgs({"to","delay","curve"})
    public AnimationTransition addTransition(Animation to, float delay, Curve curve){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Adds an animation transition between two animations (from and to) with a specified delay (delay).")
    @JRDoc_PT("Adiciona uma transição de animação entre duas animações (from e to) com um atraso (delay) especificado.")
    @UnimplementedDoc
    @MethodArgs({"from","to","delay"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Adds an animation transition between two animations (from and to) with a specified delay (delay) and an interpolation curve (curve).")
    @JRDoc_PT("Adiciona uma transição de animação entre duas animações (from e to) com um atraso (delay) e uma curva de interpolação (curve) especificados.")
    @UnimplementedDoc
    @MethodArgs({"from","to","delay","curve"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay, Curve curve){
        //
        return null;
        //

        //
    }

    //
}
