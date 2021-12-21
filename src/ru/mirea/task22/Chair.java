package ru.mirea.task22;

import java.util.Scanner;

public interface Chair {
    public void info();
}

abstract class Factory implements Chair {
    private String type;

    public Factory(String type) {
        this.type = type;
    }

    @Override
    public void info() {
        System.out.println("Выбран " + this.type + " стул");
    }
}

class VictorianChair extends Factory {
    public VictorianChair(String type) {
        super(type);
    }

    @Override
    public void info() {
        super.info();
    }
}

class MagicChair extends Factory {
    public MagicChair(String type) {
        super(type);
    }

    @Override
    public void info() {
        super.info();
    }
}

class MultifunctionalChair extends Factory {
    public MultifunctionalChair(String type) {
        super(type);
    }

    @Override
    public void info() {
        super.info();
    }
}

class Client {
    public void Sit(Chair chair) {
        chair.info();
    }

    public static void main(String[] args) {
        Chair chair;
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        switch (type) {
            case "Викторианкий": {
                chair = new VictorianChair(type);
                break;
            }
            case "Магический": {
                chair = new MagicChair(type);
                break;
            }
            default: {
                chair = new MultifunctionalChair(type);
                break;
            }
        }
        Client client = new Client();
        client.Sit(chair);
    }
}
