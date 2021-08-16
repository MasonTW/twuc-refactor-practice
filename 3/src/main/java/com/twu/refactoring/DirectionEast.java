package com.twu.refactoring;

public class DirectionEast implements DirectionSpecific{

    @Override
    public Direction turnRight() {
        return new Direction('S');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('N');
    }
}
