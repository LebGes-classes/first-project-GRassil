package Labirint;

import java.util.Scanner;

public class Game{
    public static void startGame(Scanner scanner){
        Hero hero = new Hero();

        final Level[] levels = Level.makeLevels();
        for (int levelID=0; levelID<levels.length; levelID++){
            playLevel(levels[levelID], hero, scanner);
        }
        finishGame(scanner);
    }
    public static void finishGame(Scanner scanner){
        System.out.println("Игра окончена! Спасибо за игру!");
        MainMenu.menu();
    }

    static void playLevel(Level level, Hero hero, Scanner scanner){
        while (!isFinish(hero, level)){
            printScreen(level, hero);
			System.out.println("Цель -  дойти до нижнего правого угла");
            System.out.println("Введите ход (w - вверх, s - вниз, a - влево, d - вправо), " +
                    "если хотите выйти то q: ");
            switch (scanner.next()){
                case "w":
                    MoveHero.moveHero(0,-1, level, hero);
                    break;
                case "s":
                    MoveHero.moveHero(0,1, level, hero);
                    break;
                case "a":
                    MoveHero.moveHero(-1,0, level, hero);
                    break;
                case "d":
                    MoveHero.moveHero(1,0, level, hero);
                    break;
                case "q":
                    MainMenu.menu();
                    break;
                case "0":
                    MoveHero.moveHero(level.getSize()-1,level.getSize()-1, level, hero);
                    break;
                default:
                    System.out.println("Неправильный ввод. Повторите ввод...");
                    break;
            }
        }
        finishLevel(scanner, hero);
    }

    static void finishLevel(Scanner scanner, Hero hero){
        System.out.println("Ура ты прошел уровень! Перейдем к следующему? Y - да, N - Вернуться в меню");
        switch (scanner.next()){
            case "y":
            case "Y":
                hero.setCorX(0);
                hero.setCorY(0);
                return;
            case "N":
                MainMenu.menu();
                break;
            default:
                System.out.println("Неправильный ввод. Перезапускаем ввод...");
                finishLevel(scanner, hero);
                break;
        }

    }

    private static boolean isFinish(Hero hero, Level Level){
        return (hero.getCorX() == Level.getSize()-1 && hero.getCorY() == Level.getSize()-1);
    }

    private static void cleanScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void printScreen(Level Level, Hero hero){
        cleanScreen();

        char[][] level = Level.getMap();

        for (int y=0; y<Level.getSize();y++){
            for (int x=0; x<Level.getSize();x++){
                if (hero.getCorY()==y && hero.getCorX()==x) {
                    System.out.print(hero.getHeroChar());
                } else {
                    System.out.print(level[y][x]);
                }
            }
            System.out.println();
        }
    }
}