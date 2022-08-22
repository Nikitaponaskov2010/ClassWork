package game;


public class TaskGame {



    public static void main(String[] args) {
        TaskGame game = new TaskGame();
        Task1map map = new Task1map();
        TaskContr ctr = new TaskContr();
        game.createMap(map);
        game.addStone(map);

        map.addPlayer(9,0);
        map.displayMap();
        while (map.x != 0 || map.y != 9 ) {
            ctr.moveVersion(map);

        }


    }

    public char[][] createMap(Task1map map) {
        map.map = new char[10][10];


        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
        return map.map;
    }





    public void addStone(Task1map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
               if (isStone()) {
                   map.map [i][j] = 'S';
               }
            }
            }


        }
        public boolean isStone () {
        int random = (int) (Math.random() * 100);
        return random  >= 80;

        }
    }