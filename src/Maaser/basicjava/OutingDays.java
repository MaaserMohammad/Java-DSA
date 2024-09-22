package Maaser.basicjava;

public class OutingDays {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int evenDaysCount = 0;

        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        System.out.println("Ali can go out with his friends on " + evenDaysCount + " even days in August.");
    }
}
