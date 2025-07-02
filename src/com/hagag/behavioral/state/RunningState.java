package com.hagag.behavioral.state;

public class RunningState implements  PlayerState {
    @Override
    public void pressUp(GameCharacter context) {
        System.out.println("Jumping from running...");
        context.setPlayerState(new JumpingState());
    }

    @Override
    public void pressDown(GameCharacter context) {
        System.out.println("Running slowly...");
    }

    @Override
    public void run(GameCharacter context) {
        System.out.println("Already running...");
    }
}
