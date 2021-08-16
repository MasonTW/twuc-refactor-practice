package com.twu.refactoring;

public class Direction {
    private final char direction;;
    public DirectionSpecific directionSpecific;


    public Direction(char direction) {
        this.direction = direction;
        this.directionSpecific = createSpecificDirection(direction);
    }



    public DirectionSpecific createSpecificDirection (char direction) {
        switch (direction) {
            case 'N':
                return new DirectionNorth();
            case 'S':
                return new DirectionSouth();
            case 'E':
                return new DirectionEast();
            case 'W':
                return new DirectionWest();
            default:
                throw  new IllegalArgumentException();
        }
    }

    public Direction turnRight() {
     return directionSpecific.turnRight();
    }

    public Direction turnLeft() {
      return directionSpecific.turnLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        if (direction != direction1.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }
}


