package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Engines.Engine.Admob.RewardedInterstitial;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<
/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

@ClassCategory(cat ={"Admob"})
public final class RewardedInterstitialAd {

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient RewardedInterstitial instance;
    @IgnoreAutoComplete
    public RewardedInterstitialAd(RewardedInterstitial instance) {
        this.instance = instance;
        this.instance.setRuntime(this);
    }
    @BuildClassConstructor
    public RewardedInterstitialAd(Engine engine){}
    //>REMOVE-BRIDGE<

    public RewardedInterstitialAd(String id){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        super();
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this(new RewardedInterstitial(id));
        this.instance.setRuntime(this);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getError(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        java.lang.String returnValue = instance.getError();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getId(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        java.lang.String returnValue = instance.getId();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public int getRewardAmount(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.getRewardAmount();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public String getRewardType(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        java.lang.String returnValue = instance.getRewardType();
        if(returnValue != null) return returnValue;
        return null;
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDisplayError(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isDisplayError();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isDisplayed(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isDisplayed();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLoaded(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isLoaded();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLoading(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isLoading();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isLoadingError(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isLoadingError();
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public boolean isOnUserEarned(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        return instance.isOnUserEarned();
        //>REMOVE-BRIDGE<
    }

    public void load(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.load();
        //>REMOVE-BRIDGE<
    }

    public void show(){
        //<REMOVE-BRIDGE>
        Thread.requestEngineThread();
        
        instance.show();
        //>REMOVE-BRIDGE<
    }


}