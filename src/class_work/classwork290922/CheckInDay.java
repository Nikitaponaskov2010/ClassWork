package classwork290922;

public class CheckInDay implements InCheckDayOfTheWeek {

    @Override
    public void InCheckDayOfTheWeek(DaysOfTheWeek days) {
        switch (days) {
            case FIRST_DAY:
                if (days.getName().equals("Понедельник")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case SECOND_DAY:
                if (days.getName().equals("Вторник")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case THIRD_DAY:
                if (days.getName().equals("Среда")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case FOURTH_DAY:
                if (days.getName().equals("Четверг")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case  FIFTH_DAY:
                if (days.getName().equals("Пятница")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case SIXTH_DAY:
                if (days.getName().equals("Суббота")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            case SEVENS_DAY:
                if (days.getName().equals("Воскресенье")) {
                    System.out.println(days.getName() + " - Текст корректный");
                } else {
                    System.out.println(days.getName() + " - Текст некорректный");
                }
                break;
            default:
                System.out.println("Не день");
        }

    }
}



