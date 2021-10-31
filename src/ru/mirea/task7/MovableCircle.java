package ru.mirea.task7;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint( x,y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveUp() {center.moveUp();

    }

    @Override
    public void moveDown() {center.moveDown();

    }

    @Override
    public void Left() {center.Left();

    }

    @Override
    public void Right() {center.Right();

    }
}
