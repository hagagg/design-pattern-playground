package com.hagag.behavioral.state;

public interface PlayerState {
    void pressUp (GameCharacter context);
    void pressDown (GameCharacter context);
    void run (GameCharacter context);

}
