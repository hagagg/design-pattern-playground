package com.hagag.behavioral.state;

public class JumpingState implements PlayerState {
    @Override
    public void pressUp(GameCharacter context) {
        System.out.println("Already Jumping...");
    }

    @Override
    public void pressDown(GameCharacter context) {
        System.out.println("Crouching...");
        context.setPlayerState(new CrouchingState());
    }

    @Override
    public void run(GameCharacter context) {
        System.out.println("Jumping from running...");
        context.setPlayerState(new JumpingState());
    }
}
