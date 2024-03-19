package JAVARuntime;
//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 * MethodArgs filled by Carlos at 22-04-2022
 */
@ClassCategory(cat ={"Animations","Components"})
public final class AnimationPlayer extends Component{
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.ComponentsV2.AnimationPlayer.AnimationPlayer component;
    @IgnoreAutoComplete
    @MethodArgs(args ={"component"})
    public AnimationPlayer(com.itsmagic.engine.Engines.Engine.ComponentsV2.AnimationPlayer.AnimationPlayer component) {
        super(component);
        this.component = component;
        this.component.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public AnimationPlayer() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Engine.ComponentsV2.AnimationPlayer.AnimationPlayer());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public Animation getAnimation(String name) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Animation.Animation animation = component.findAnimation(name);
        if(animation != null) {
            try {
                return animation.toJAVARuntime();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"idx"})
    public Animation getAnimation(int idx) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        com.itsmagic.engine.Engines.Engine.Animation.Animation animation = component.findAnimation(idx);
        if(animation != null) {
            try {
                return animation.toJAVARuntime();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"name"})
    public void addAnimation(Animation animation) {
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(animation != null) {
            component.addAnimation(animation.instance);
        } else {
            component.addAnimation(null);
        }
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation to, float delay){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(to == null) throw new NullPointerException("(to) animation can't be null");

        return component.addTransition(to.instance, delay).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation to, float delay, Curve curve){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(to == null) throw new NullPointerException("(to) animation can't be null");
        if(curve == null) throw new NullPointerException("curve cant be null");

        return component.addTransition(to.instance, delay, curve.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(from == null) throw new NullPointerException("(From) animation can't be null");
        if(to == null) throw new NullPointerException("(to) animation can't be null");

        return component.addTransition(from.instance, to.instance, delay).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @UnimplementedDoc
    @MethodArgs(args ={"from","to","delay"})
    public AnimationTransition addTransition(Animation from, Animation to, float delay, Curve curve){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        if(from == null) throw new NullPointerException("(From) animation can't be null");
        if(to == null) throw new NullPointerException("(to) animation can't be null");
        if(curve == null) throw new NullPointerException("curve cant be null");

        return component.addTransition(from.instance, to.instance, delay, curve.instance).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    @Override
    @MethodArgs(args ={"componentA","componentB"})
    public boolean componentClassMatch(Component a, Component b) {
        return super.componentClassMatch(a, b, AnimationPlayer.class);
    }
    @IgnoreAutoComplete
    @Override
    public com.itsmagic.engine.Engines.Engine.ObjectOriented.Components.Component getEngineComponent() {
        return component;
    }
    //>REMOVE-BRIDGE<
}
