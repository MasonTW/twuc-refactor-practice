package com.twu.refactoring;

public class DirectionSouth implements DirectionSpecific{

    @Override
    public Direction turnRight() {
        return new Direction('W');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('E');
    }
}
