package game;

public class Task1map {
   public char[][] map;
    int x = 9;
    int y = 0;


  public void addPlayer(int indexX, int indexY) { map [indexX] [indexY] = 'P' ; }


    public void goToTop() {
      if  (x - 1 < 0 || map[x-1][y] == 'S' ) {
            System.out.println("Сюда ходить нельзя");
        }else {
          addPlayer(x-1,y);
          map[x][y] = '_';
          x--;
      }


    }

    public void goToDown() {
        if  (x + 1 > 9 || map [x+1] [y] == 'S' ) {
            System.out.println("Сюда ходить нельзя");
        }else {
            addPlayer(x+1,y);
            map[x][y] = '_';
            x++;
        }

    }

    public void goToLeft() {
        if (y - 1 < 0 || map[x][y - 1] == 'S') {
            System.out.println("Сюда ходить нельзя");
        }else {
            addPlayer(x,y-1);
            map[x][y] = '_';
            y--;
        }
    }

    public void goToRight() {
        if (y + 1 > 9  || map[x][y + 1] == 'S') {
            System.out.println("Сюда ходить нельзя");
        }else {
            addPlayer(x, y + 1);
            map[x][y] = '_';
            y++;
        }

        }
    public void displayMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map [i] [j] + " ");

            }
            System.out.println();

        }
    }}
