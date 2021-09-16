package ru.mirea.task2;

    public class Ball {
        private double radius,weight,count;
        private String color;

        public Ball() {
            radius=1;
            weight=10;
            count=5;
            color="red";
        }
        public Ball(double r) {
            radius=r;
            weight=10;
            count=5;
            color="red";
        }
        public Ball(double r, double w,double c) {
            radius=r;
            weight=w;
            count=c;
            color="red";
        }
        public Ball(String c) {
            radius=1;
            weight=10;
            count=5;
            color="c";
        };
        public void setRadius(double radius)
        {
            this.radius=radius;
        }


        public double getDiameter() {
            return 2*radius;
        };
        public double getAllWeight() {
            return weight*count;
        };

        public String toString(){
            return "Diameter is "+ getDiameter()+ " All weigth is " + getAllWeight();
        }


    }

