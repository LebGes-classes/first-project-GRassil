package Labirint;

public class MoveHero{
	public static void moveHero(int x, int y, Level level, Hero hero){
		int newCorY = hero.getCorY()+y;
		int newCorX = hero.getCorX()+x;
        if (0 <= (newCorY) && (newCorY)< level.getSize()
                && 0 <= (newCorX) && (newCorX) < level.getSize()
                    && level.getMap()[newCorY][newCorX] != level.getWall()){
            hero.setCorY(newCorY);
			hero.setCorX(newCorX);
        }
		else {
			System.out.println("Вы не можете туда сходить, выберите другой ход");
		}
    }
}