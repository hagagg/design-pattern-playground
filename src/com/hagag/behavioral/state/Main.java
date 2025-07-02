package com.hagag.behavioral.state;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.run();
        character.pressUp();
        character.pressDown();
        character.run();
        character.pressDown();
    }
}
