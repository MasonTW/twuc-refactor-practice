package com.twu.refactoring;

public class DirectionNorth implements DirectionSpecific{

    @Override
    public Direction turnRight() {
        return new Direction('E');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('W');
    }
}
