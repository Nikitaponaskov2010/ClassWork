package KW0108;

public class Task6 {
    private String[] Number() {
        String[] s = new String[100000];
        for (int i = 0; i < s.length; i++) {
            if (i < 10) {
                s[i] = "0000" + i;
            } else if (i < 100) {
                s[i] = "000" + i;
            } else if (i < 1000) {
                s[i] = "00" + i;
            } else if (i < 10000) {
                s[i] = "0" + i;
            } else {
                s[i] = "" + i;
            }

        }
        return s; }

        private void displayArr (String[]s){
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
                if (i != 0 && i % 100 == 0) {
                    System.out.println();
                }
            }
        }
    private int devNum (String[] s){
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].contains("13") || s[i].contains("4")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Task6 obj = new Task6();

        String[] arrOfNumbers = obj.Number();
        obj.displayArr(arrOfNumbers);

        int howMany = obj.devNum(arrOfNumbers);
        System.out.println("\nNumbers to deleted " + howMany);

    }
    }


