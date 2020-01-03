package BehavioralPattern.State;

import java.util.HashMap;

public class ShareStateTest {
    public static void main(String[] args){
        ShareContext shareContext = new ShareContext();
        shareContext.Handler();
        shareContext.Handler();
        shareContext.Handler();
    }
}


class ShareContext{
    private ShareState shareState;
    private HashMap<String, ShareState> shareStates = new HashMap<String, ShareState>();
    public ShareContext(){
        shareState = new ConcreteStateAE();
        shareStates.put("1", shareState);
        shareState = new ConcreteStateBE();
        shareStates.put("2", shareState);
        shareState = shareStates.get("1");
    }
    public void setShareState(ShareState shareState){
        this.shareState = shareState;
    }
    public ShareState getShareState(String s){
        return shareStates.get(s);
    }
    public void Handler(){
        shareState.Handler(this);
    }
}

abstract class ShareState{
    public abstract void Handler(ShareContext shareContext);
}

class ConcreteStateAE extends ShareState{
    public void Handler(ShareContext shareContext){
        System.out.println("state A");
        shareContext.setShareState(shareContext.getShareState("2"));
    }
}

class ConcreteStateBE extends ShareState{
    public void Handler(ShareContext shareContext){
        System.out.println("state B");
        shareContext.setShareState(shareContext.getShareState("1"));
    }
}
