package class_work031122;

import java.util.*;

public class Task1 {
    private List<Integer> arrayList = new ArrayList();
    private HashMap<Integer, String> numberOfVarious = new HashMap<>();
    int[] num;
    private boolean endFlag = true;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.getText();

        do {
            task1.variousOfDo();
        } while (task1.endFlag);
    }

    public void createdMap() {
        System.out.println("Выберете пункт из меню: ");
        numberOfVarious.put(1, "Добавить элемент в список");
        numberOfVarious.put(2, "Удалить элемент из списка");
        numberOfVarious.put(3, "Показать содержимое списка");
        numberOfVarious.put(4, "Проверить есть ли значение в списке");
        numberOfVarious.put(5, "Заменить значение в списке");
        numberOfVarious.put(6, "Выход");
        System.out.println(numberOfVarious);
    }

    public int getMenuPoint() {
        return scan();
    }

    private void variousOfDo() {
        createdMap();
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 1:
                addNewNumber();
                break;
            case 2:
                deleteElement();
                break;
            case 3:
                watchList();
                break;
            case 4:
                chekList();
                break;
            case 5:
                changedElement();
                break;
            case 6:
                System.out.println("Программа завершена!");
                endFlag = false;
        }
    }

    public int scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void addNewNumber() {
        System.out.println("Введите число, которое хотите добавить: ");
        arrayList.add(scan());
    }

    public void deleteElement() {
        System.out.println("Выберете номер элемента, который хотите удалить(отсчет идет от нуля): ");
        arrayList.remove(scan());
    }

    public void watchList() {
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public void chekList() {
        System.out.println("Введите число, которое хотите проверить на наличие в списке: ");
        boolean contains = arrayList.contains(scan());
        System.out.println(contains);
    }

    public void changedElement() {
        System.out.println("Введите порядковый номер элемента, который хотите удалить(отсчет идет от нуля): ");
        Scanner scannerOne = new Scanner(System.in);
        Integer k = scannerOne.nextInt();
        System.out.println("Введите номер, который хотите добавить: ");
        Scanner scannerTwo = new Scanner(System.in);
        Integer i = scannerTwo.nextInt();
        arrayList.set(k, i);
    }

    public void getText() {
        Scanner sc = new Scanner(System.in);
        String text = null;
        try {
            System.out.println("Введите числа через пробел: ");
            text = sc.nextLine();

            String[] text1 = text.split(" ");
            num = new int[text1.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(text1[i]);
                arrayList.add(num[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(text + " это не число");
            getText();
        }
    }

}