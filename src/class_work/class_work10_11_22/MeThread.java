package class_work10_11_22;

public class MeThread extends Thread{
    private static Schet schet = new Schet();

    @Override
    public void run() {
        super.run();
    }

    public int getSumm(int sum){
        return schet.getMyMoney(sum);
    }
}
