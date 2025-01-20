package Labirint;

public class Hero {
    private int corX=0;
    private int corY=0;
    private final char heroChar = '@';

    public char getHeroChar(){
        return heroChar;
    }

    public void move(int x, int y, Level level){
        if (0 <= (corY+y) && (corY+y)< level.getSize()
                && 0 <= (corX+x) && (corX+x) < level.getSize()
                    && level.getMap()[corY+y][corX+x] != level.getWall()){
            corX+=x;
            corY+=y;
        }
    }

    public void setCorY(int corY){
        this.corY = corY;
    }

    public void setCorX(int corX){
        this.corX = corX;
    }

    public int getCorY(){
        return corY;
    }
    public int getCorX(){
        return corX;
    }
}