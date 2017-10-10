package profs_13;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Player p1 = new Player(500, 1000, "Георгий");
        Player p2 = new Player(r.nextInt(1000), r.nextInt(2000), "Дмитрий");
        boolean turnDone = true;

        p1.PreFightStatus();
        p2.PreFightStatus();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();



        while (p1.healthPoints > 0 | p2.healthPoints > 0) {
            while (turnDone & p1.healthPoints > 0 & p1.healthPoints != 0) {
                switch (choice) {
                    case "Fire": {
                        if (p1.manaPoints > 0 & turnDone) {
                            p2.healthPoints = p1.fireStyle(p2.healthPoints, p2.playerName);
                            turnDone = false;
                            p2.HealthStatus();
                        }
                        break;
                    }
                    case "Water": {
                        if (p1.manaPoints > 0 & turnDone) {
                            p2.healthPoints = p1.waterStyle(p2.healthPoints, p2.playerName);
                            turnDone = false;
                            p2.HealthStatus();
                        }
                        break;
                    }
                }
            }
            while (!turnDone & p2.healthPoints > 0 & p2.healthPoints != 0) {
                switch (choice) {
                    case "Fire": {
                        if (p2.manaPoints > 0 & !turnDone) {
                            p1.healthPoints = p2.fireStyle(p1.healthPoints, p1.playerName);
                            turnDone = true;
                            p1.HealthStatus();
                        }
                        break;
                    }
                }
            }
        }


    }
}
