package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskContr {
    int direction = 0;
    public void moveVersion ( TaskGame map) {
       int move = getDirection();
       switch (move) {
           case (4): {
               map.goToLeft();
               map.displayMap();
               break;

           }
           case (6) :{
               map.goToRight();
               map.displayMap();
               break;

           }
           case (8) :{
               map.goToTop();
               map.displayMap();
               break;

           }
           case (2) :{
               map.goToDown();
               map.displayMap();
               break;

           }
           default:  {
               System.out.println("Вы ввели неверное число");
           }

       }


        }
    private int getDirection() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in
            ));
            direction = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println("Ошибка ввода");
            getDirection();
        }
        return (direction);
    }


}
