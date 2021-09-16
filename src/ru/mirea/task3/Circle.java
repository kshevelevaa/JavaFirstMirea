package ru.mirea.task3;

    public class Circle {
        private double radius,weight,count;
        private String color;

        public Circle() {
            radius=1;
            weight=10;
            count=5;
            color="red";
        }
        public Circle(double r) {
            radius=r;
            weight=10;
            count=5;
            color="red";
        }
        public Circle(double r, double w,double c) {
            radius=r;
            weight=w;
            count=c;
            color="red";
        }
        public Circle(String c) {
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
