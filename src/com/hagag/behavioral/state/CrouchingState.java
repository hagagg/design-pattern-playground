package com.hagag.behavioral.state;

public class CrouchingState implements PlayerState {
    @Override
    public void pressUp(GameCharacter context) {
        System.out.println("Standing up...");
        context.setPlayerState(new StandingState());
    }

    @Override
    public void pressDown(GameCharacter context) {
        System.out.println("Already crouching...");
    }

    @Override
    public void run(GameCharacter context) {
        System.out.println("Crawling");
    }
}
