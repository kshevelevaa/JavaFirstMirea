package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft= new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight= new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MoveableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();

    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void Left() {
        topLeft.Left();
        bottomRight.Left();
    }

    @Override
    public void Right() {
        topLeft.Right();
        bottomRight.Right();
    }
}
