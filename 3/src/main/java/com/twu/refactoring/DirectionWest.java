package com.twu.refactoring;

public class DirectionWest implements DirectionSpecific{

    @Override
    public Direction turnRight() {
        return new Direction('N');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('S');
    }
}
