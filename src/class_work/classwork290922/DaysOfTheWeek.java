package classwork290922;

public enum DaysOfTheWeek {
    FIRST_DAY ("MONDAY"),
    SECOND_DAY ("TUESDAY"),
    THIRD_DAY ("WEDNESDAY"),
    FOURTH_DAY ("THURSDAY"),
    FIFTH_DAY ("FRIDAY"),
    SIXTH_DAY ("SATURDAY"),
    SEVENS_DAY ("SUNDAY");


    private final String NAME;

    DaysOfTheWeek (String name) {
        this.NAME = name;
    }

    String getNAME () {
        return NAME;
    }



}
