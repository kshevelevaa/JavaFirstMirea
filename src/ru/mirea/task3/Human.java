package ru.mirea.task3;

public class Human {
    public Human() {
        this.head = new Head();
        this.leg = new Leg();
        this.hand = new Hand();
    }

    public class Head{
        public Head(){
            size=10;
            colorOfHair="black";
            isGlasses=true;
        }

        int size;
        String colorOfHair;
        boolean isGlasses;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getColorOfHair() {
            return colorOfHair;
        }

        public void setColorOfHair(String colorOfHair) {
            this.colorOfHair = colorOfHair;
        }

        public boolean isGlasses() {
            return isGlasses;
        }

        public void setGlasses(boolean glasses) {
            isGlasses = glasses;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "size=" + size +
                    ", color of Hair='" + colorOfHair + '\'' +
                    ", is glasses=" + isGlasses +
                    '}';
        }

    };
    public class Leg{
        int sizeOffoot,length;
        public Leg(){
            sizeOffoot=37;
            length=100;
        }

        public int getSizeOffoot() {
            return sizeOffoot;
        }

        public void setSizeOffoot(int sizeOffoot) {
            this.sizeOffoot = sizeOffoot;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "size of foot=" + sizeOffoot +
                    ", length=" + length +
                    '}';
        }
    }
    private class Hand{
        int size, length;
        public Hand(){
            size=5;
            length=60;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getSize() {
            return size;
        }

        public int getLength() {
            return length;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "size=" + size +
                    ", length=" + length +
                    '}';
        }
    }
    public Head head;
    public Leg leg;
    public Hand hand;
    public Leg getLeg() {
        return leg;
    }
    public Hand getHand() {
        return hand;
    }
    public Head getHead() { return head;
    }


}