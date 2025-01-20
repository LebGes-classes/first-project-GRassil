package Labirint;

public class Level{
    private final int size;
    private final char[][] map;

    static char wall = '#';
    static char way = '৹';
    static char finishSymbol = '⩓';

    public Level(char[][] map){
        this.map = map;
        this.size = map.length;
    }

    public static Level[] makeLevels() {
        return new Level[]{
                new Level(new char[][]{
                        {way, wall, way, way, way, wall, way, way, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, way, way, wall, way, way, way, wall, finishSymbol},
                }),
                new Level(new char[][]{
                        {way, wall, way, way, way, wall, way, way, way},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, wall, wall, wall, way, wall, way, wall, way},
                        {way, wall, way, wall, way, way, way, wall, wall},
                        {way, wall, way, way, way, wall, way, wall, way},
                        {way, way, way, wall, way, wall, way, way, way},
                        {way, wall, wall, wall, way, wall, way, wall, way},
                        {way, wall, wall, wall, way, wall, way, wall, way},
                        {way, way, way, wall, way, way, way, wall, finishSymbol},
                }),
                new Level(new char[][]{
                        {way, wall, way, way, way, wall, way, way, way},
                        {way, wall, way, wall, way, way, way, wall, way},
                        {way, way, way, wall, way, wall, way, wall, way},
                        {wall, wall, way, wall, way, way, way, wall, wall},
                        {way, wall, way, wall, way, wall, way, wall, way},
                        {way, way, way, wall, way, wall, way, way, way},
                        {way, wall, wall, wall, way, wall, way, wall, way},
                        {way, wall, wall, wall, way, wall, way, wall, way},
                        {way, way, way, wall, way, way, way, wall, finishSymbol},
                })
        };
    }

    public char getWall(){
        return wall;
    }

    public char[][] getMap(){
        return map;
    }


    public int getSize(){
        return size;
    }
}
