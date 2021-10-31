package ru.mirea.task14;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Durak {
        Stack<Integer> playerOneStack = new Stack<Integer>();
        Stack<Integer> playerTwoStack = new Stack<Integer>();
        Queue<Integer> playerOneQueue = new LinkedList<Integer>();
        Queue<Integer> playerTwoQueue = new LinkedList<Integer>();
        Deque<Integer> playerOneDeque = new LinkedBlockingDeque<Integer>();
        Deque<Integer> playerTwoDeque = new LinkedBlockingDeque<Integer>();
        LinkedList<Integer> playerOneDL = new LinkedList<Integer>();
        LinkedList<Integer> playerTwoDL = new LinkedList<Integer>();

        int[] randomArray = new int[10];

        public boolean isHere(int[] arr, int key){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == key)
                    return true;
            }
            return false;
        }

        Durak(){
            boolean flag = true;
            int count = 0;
            int number;
            Random random = new Random();
            while(flag){
                number = random.nextInt(10);
                if (!isHere(randomArray, number)){
                    count++;
                    randomArray[count] = number;
                }
                if (count == 9)
                    flag = false;
            }

            System.out.println(Arrays.toString(randomArray));
        }

        private void fillStack(){
            int count = 0;
            while (count < 10){
                playerOneStack.push(randomArray[count++]);
                playerTwoStack.push(randomArray[count++]);
            }
            System.out.println(Arrays.toString(playerOneStack.toArray()) + Arrays.toString(playerTwoStack.toArray()));
        }

        public void playStack(){
            fillStack();
            Stack<Integer> playerOneNew = new Stack<Integer>();
            Stack<Integer> playerTwoNew = new Stack<Integer>();
            int count = 0;
            boolean flag = true;
            while(flag){
                count++;
                if (playerOneStack.peek() > playerTwoStack.peek() || playerOneStack.peek() == 0 && playerTwoStack.peek() == 9) {
                    System.out.println(playerOneStack.peek() + " > " + playerTwoStack.peek());
                    playerOneNew.push(playerOneStack.pop());
                    playerOneNew.push(playerTwoStack.pop());
                }
                else if(playerOneStack.peek() < playerTwoStack.peek() || playerOneStack.peek() == 9 && playerTwoStack.peek() == 0){
                    System.out.println(playerOneStack.peek() + " < " + playerTwoStack.peek());
                    playerTwoNew.push(playerTwoStack.pop());
                    playerTwoNew.push(playerOneStack.pop());
                }

                if (playerTwoStack.empty()){
                    if (!playerTwoNew.empty()){
                        playerTwoStack.addAll(playerTwoNew);
                        playerTwoNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player one win! " + count);
                    }
                }
                if (playerOneStack.empty()){
                    if (!playerOneNew.empty()){
                        playerOneStack.addAll(playerOneNew);
                        playerOneNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player two win! " + count);
                    }
                }
                if (count == 106){
                    flag = false;
                    System.out.println("Botva!");
                }
                //System.out.println(playerOne.toString() + "   " + playerOneNew.toString() + "\n" + playerTwo.toString() + "   " + playerTwoNew.toString());
            }
        }

        private void fillQueue(){
            int count = 0;
            while (count < 10){
                playerOneQueue.add(randomArray[count++]);
                playerTwoQueue.add(randomArray[count++]);
            }
            System.out.println(Arrays.toString(playerOneQueue.toArray()) + Arrays.toString(playerTwoQueue.toArray()));
        }

        public void playQueue(){
            fillQueue();
            Queue<Integer> playerOneNew = new LinkedList<Integer>();
            Queue<Integer> playerTwoNew = new LinkedList<Integer>();
            int count = 0;
            boolean flag = true;
            while(flag) {
                count++;
                if (playerOneQueue.element() > playerTwoQueue.element() || playerOneQueue.element() == 0 && playerTwoQueue.element() ==9) {
                    System.out.println(playerOneQueue.peek() + " > " + playerTwoQueue.peek());
                    playerOneNew.add(playerOneQueue.poll());
                    playerOneNew.add(playerTwoQueue.poll());
                }
                else if(playerOneQueue.peek() < playerTwoQueue.peek() || playerOneQueue.peek() == 9 && playerTwoQueue.peek() == 0){
                    System.out.println(playerOneQueue.peek() + " < " + playerTwoQueue.peek());
                    playerTwoNew.add(playerTwoQueue.poll());
                    playerTwoNew.add(playerOneQueue.poll());
                }

                if (playerTwoQueue.isEmpty()){
                    if (!playerTwoNew.isEmpty()){
                        playerTwoQueue.addAll(playerTwoNew);
                        playerTwoNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player one win! " + count);
                    }
                }
                if (playerOneQueue.isEmpty()){
                    if (!playerOneNew.isEmpty()){
                        playerOneQueue.addAll(playerOneNew);
                        playerOneNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player two win! " + count);
                    }
                }
                if (count == 106){
                    flag = false;
                    System.out.println("Botva!");
                }
            }
        }

        private void fillDeque(){
            int count = 0;
            while (count < 10){
                playerOneDeque.add(randomArray[count++]);
                playerTwoDeque.add(randomArray[count++]);
            }
            System.out.println(Arrays.toString(playerOneDeque.toArray()) + Arrays.toString(playerTwoDeque.toArray()));
        }

        public void playDeque(){
            fillDeque();
            Deque<Integer> playerOneNew = new LinkedBlockingDeque<Integer>();
            Deque<Integer> playerTwoNew = new LinkedBlockingDeque<Integer>();
            int count = 0;
            boolean flag = true;
            while(flag) {
                count++;
                if (playerOneDeque.element() > playerTwoDeque.element() || playerOneDeque.element() == 0 && playerTwoDeque.element() == 9) {
                    System.out.println(playerOneDeque.peek() + " > " + playerTwoDeque.peek());
                    playerOneNew.add(playerOneDeque.poll());
                    playerOneNew.add(playerTwoDeque.poll());
                }
                else if(playerOneDeque.peek() < playerTwoDeque.peek() || playerOneStack.peek() == 9 && playerTwoStack.peek() == 0){
                    System.out.println(playerOneDeque.peek() + " < " + playerTwoDeque.peek());
                    playerTwoNew.add(playerTwoDeque.poll());
                    playerTwoNew.add(playerOneDeque.poll());
                }

                if (playerTwoDeque.isEmpty()){
                    if (!playerTwoNew.isEmpty()){
                        playerTwoDeque.addAll(playerTwoNew);
                        playerTwoNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player one win! " + count);
                    }
                }
                if (playerOneDeque.isEmpty()){
                    if (!playerOneNew.isEmpty()){
                        playerOneDeque.addAll(playerOneNew);
                        playerOneNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player two win! " + count);
                    }
                }
                if (count == 106){
                    flag = false;
                    System.out.println("Botva!");
                }
            }
        }

        private void fillDoubleList(){
            int count = 0;
            while (count < 10){
                playerOneDL.add(randomArray[count++]);
                playerTwoDL.add(randomArray[count++]);
            }
            System.out.println(Arrays.toString(playerOneDL.toArray()) + Arrays.toString(playerTwoDL.toArray()));
        }

        public void playDL(){
            fillDoubleList();
            LinkedList<Integer> playerOneNew = new LinkedList<Integer>();
            LinkedList<Integer> playerTwoNew = new LinkedList<Integer>();
            int count = 0;
            boolean flag = true;
            while(flag) {
                count++;
                if (playerOneDL.get(playerOneDL.size() - 1) > playerTwoDL.get(playerTwoDL.size() - 1) || playerOneDL.get(playerOneDL.size() - 1) != 9 && playerTwoDL.get(playerTwoDL.size() - 1) != 0) {
                    System.out.println(playerOneDL.get(playerOneDL.size() - 1) + " > " + playerTwoDL.get(playerTwoDL.size() - 1));
                    playerOneNew.add(playerOneDL.remove(playerOneDL.size() - 1));
                    playerOneNew.add(playerTwoDL.remove(playerTwoDL.size() - 1));
                }
                else {
                    System.out.println(playerOneDL.get(playerOneDL.size() - 1) + " < " + playerTwoDL.get(playerTwoDL.size() - 1));
                    playerTwoNew.add(playerTwoDL.remove(playerTwoDL.size() - 1));
                    playerTwoNew.add(playerOneDL.remove(playerOneDL.size() - 1));
                }

                if (playerTwoDL.isEmpty()){
                    if (!playerTwoNew.isEmpty()){
                        playerTwoDL.addAll(playerTwoNew);
                        playerTwoNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player one win! " + count);
                    }
                }
                if (playerOneDL.isEmpty()){
                    if (!playerOneNew.isEmpty()){
                        playerOneDL.addAll(playerOneNew);
                        playerOneNew.clear();
                    }
                    else {
                        flag = false;
                        System.out.println("Player two win! " + count);
                    }
                }
                if (count == 106){
                    flag = false;
                    System.out.println("Botva!");
                }
            }
        }
    }
