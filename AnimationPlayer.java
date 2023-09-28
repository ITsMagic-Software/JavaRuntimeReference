package JAVARuntime;
//
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations","Components"})
public class AnimationPlayer extends Component{
    //

    public AnimationPlayer() {
        //
        super();
        //

        //
    }

    @MethodArgs(args ={"name"})
    public Animation getAnimation(String name) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args ={"idx"})
    public Animation getAnimation(int idx) {
        //
        return null;
        //

        //
    }

    @MethodArgs(args ={"name"})
    public void addAnimation(Animation animation) {
        //
    }

    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation to, float delay){
        //
        return null;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation to, float delay, Curve curve){
        //
        return null;
        //

        //
    }

    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay){
        //
        return null;
        //

        //
    }
    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay, Curve curve){
        //
        return null;
        //

        //
    }

    //
}
