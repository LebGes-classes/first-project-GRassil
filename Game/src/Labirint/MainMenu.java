package Labirint;

import java.util.Scanner;

public class MainMenu{
    public static void menu(){
        System.out.println("LABIRINT");

        Button playButton = new Button("Play", 1);
        Button exitButton = new Button("Exit", 2);

        System.out.println(playButton.printButton());
        System.out.println(exitButton.printButton());

        System.out.print("Ваш выбор - ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int operationID = scanner.nextInt();
            switch (operationID){
                case 1:
					Game.startGame(scanner);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод!");
                    menu();
            }
        }
    }

}