package com.hagag.behavioral.state;

public class StandingState implements PlayerState {
    @Override
    public void pressUp(GameCharacter context) {
        System.out.println("Jumping...");
        context.setPlayerState(new JumpingState());
    }

    @Override
    public void pressDown(GameCharacter context) {
        System.out.println("Crouching...");
        context.setPlayerState(new CrouchingState());
    }

    @Override
    public void run(GameCharacter context) {
        System.out.println("Running...");
        context.setPlayerState(new RunningState());
    }
}
