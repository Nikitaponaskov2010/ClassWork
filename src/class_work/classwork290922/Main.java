package classwork290922;

public class Main {
    public static void main(String[] args) {
        InCheckDayOfTheWeek startCheck = new InCheckDayOfTheWeek() {
            @Override
            public void InCheckDayOfTheWeek(DaysOfTheWeek days) {

            }
        };
        DaysOfTheWeek[] array = DaysOfTheWeek.values();
        for (DaysOfTheWeek day : array
        ) {
            startCheck.InCheckDayOfTheWeek(day);
        }

    }
    }
