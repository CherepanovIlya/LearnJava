package com.company;


public class Kotik {

    int hungy = 0;

    int b = 10;

    String q = "fish";


    public void play() {
        System.out.println("Кот поиграл");
    }

    public void sleep() {
        System.out.println("Кот поспал");
    }

    public void fightwithme() {
        System.out.println("Кот подрался со мной");
    }

    public void singsong() {
        System.out.println("Кот попел песни");
    }

    public void cleanuphimself() {
        System.out.println("Кот вылизался");
    }

    public void ogle() {
        System.out.println("Кот построил глазки");
    }

    public void eat(int a) {
        hungy = hungy + a;
        System.out.println("Кот поел");
        System.out.println("Сытость кота: " + hungy);
    }

    public void eat(int a, String b) {
        hungy = hungy + a;
        System.out.println("Кот поел " + b);
        System.out.println("Сытость кота: " + hungy);
    }

    public void eat() {
        eat(15, "вискас");
    }


    public void LiveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * 6 + 1);


            if (hungy <= 0) {
                System.out.println("Сытость кота до кормёжки: " + hungy);
                eat();
            } else {
                switch (random) {
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        fightwithme();
                        break;
                    case 4:
                        singsong();
                        break;
                    case 5:
                        cleanuphimself();
                        break;
                    case 6:
                        ogle();
                        break;
                }
                hungy = hungy - 5;
            }
        }
    }


}
