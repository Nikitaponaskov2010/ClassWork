package class_work.class_work031122;

import java.util.*;

public class CollectionsFramework {
    private List<Integer> arrayList = new ArrayList();
    private Map<Integer, String> menu = new HashMap<>();


    public static void main(String[] args) {
        CollectionsFramework collectionsFramework = new CollectionsFramework();

        collectionsFramework.arrayList.add(collectionsFramework.getNumberFromConsole());
        collectionsFramework.arrayList.add(collectionsFramework.getNumberFromConsole());
        collectionsFramework.arrayList.add(collectionsFramework.getNumberFromConsole());

        collectionsFramework.generationMenu();
        collectionsFramework.showMenu();

    }

    public void showMenu(){
        for (int i = 1; i < menu.size()+1; i++){
            System.out.println(i+ ". " + menu.get(i));
        }
   }

      public Scanner getMenuPoint(){
          System.out.print("Введите пунк меню: ");
          return new Scanner (System.in);

      }


    public int getNumberFromConsole() {
        System.out.print("Вудите число");
        return new Scanner(System.in).nextInt();


    }


    public void generationMenu() {
        menu.put(1, "Добавить элемент в список");
        menu.put(2, "Удалить элемент из списка");
        menu.put(3, "Показать содержимое");
        menu.put(4, "Проверить есть ли значение в списке");
        menu.put(5, "Заменить значение в списке");
        menu.put(6, "Выход");
    }
}

