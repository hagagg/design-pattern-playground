package com.hagag.behavioral.state;

public class GameCharacter {
    private PlayerState currentState;

    public GameCharacter() {
        currentState = new StandingState();
    }

    public void setPlayerState(PlayerState playerState) {
        this.currentState = playerState;
    }

    public void pressUp (){currentState.pressUp(this);}
    public void pressDown (){currentState.pressDown(this);}
    public void run (){currentState.run(this);}
}
