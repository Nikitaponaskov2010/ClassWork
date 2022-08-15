package CW2107;

public class Task4 {
    public static void main(String[] args) {
        int[] mas1 = new int[5], mas2 = new int[5];
        int s1, s2;
        double a1, a2;
        s1 = 0;
        s2 = 0;
        for(int i=0; i<mas1.length; i++){
            mas1[i] = (int)(Math.random()*6);
            mas2[i] = (int)(Math.random()*6);
        }
        for (int i=0; i<mas1.length; i++) {
            System.out.print(mas1[i]+" ");
        }
        System.out.println();
        for (int i=0; i<mas2.length; i++) {
            System.out.print(mas2[i]+" ");
        }
        for (int i=0; i<mas1.length; i++){
            s1 = s1+mas1[i];
        }
        for (int i=0; i<mas2.length; i++){
            s2 = s2+mas2[i];
        }
        System.out.println();
        a1 = (double)s1/5;
        a2 = (double)s2/5;
        if(a1<a2) {
            System.out.println("Srednee arifmeticheskoje pervogo massiva menjshe srednego arifmethicheskogo vtorogo massiva");
        } else if(a2<a1) {
            System.out.println("Srednee arifmeticheskoje vtorogo massiva menjshe srednego arifmethicheskogo pervogo massiva");
        } else {
            System.out.println("Srednije arifmethicheskije ravni drug drugu");
        }
    }
}
