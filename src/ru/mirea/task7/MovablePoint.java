package ru.mirea.task7;

public class MovablePoint implements Movable{
    protected int x,y,xSpeed,ySpeed;

    public MovablePoint() {
        super();
    }

    @Override
    public void moveUp() {y+=ySpeed;

    }

    @Override
    public void moveDown() {y-=ySpeed;

    }

    @Override
    public void Left() {x-=xSpeed;

    }

    @Override
    public void Right() {x+=xSpeed;

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
}
