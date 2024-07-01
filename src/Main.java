public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        double [] salaryPerWorkers = {80_000, 120_000, 66_000, 170_000, 100_000};
        double salaryAllWorkers = 0;
        for (int i = 0; i < salaryPerWorkers.length; i++) {
            salaryAllWorkers += salaryPerWorkers[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", salaryAllWorkers);

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        double [] spendMoneyForWeek = {80, 120, 66, 170, 100};
        double spendMoneyMin = spendMoneyForWeek[0];
        double spendMoneyMax = spendMoneyForWeek[0];
        for (int i = 0; i < spendMoneyForWeek.length; i++) {
            if (spendMoneyMin > spendMoneyForWeek[i]) {
                spendMoneyMin = spendMoneyForWeek[i];
            }
            if (spendMoneyMax < spendMoneyForWeek[i]) {
                spendMoneyMax = spendMoneyForWeek[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей\n", spendMoneyMin, spendMoneyMax);

        // Task 3
        System.out.println();
        System.out.println("Task 3");
        int [] spendMoneyEveryWeek = {13_000, 20_000, 30_000, 12_000, 17_000};
        double spendMoneyForMonth = 0;
        double spendMoneyAverage = 0;
        for (int i = 0; i < spendMoneyEveryWeek.length; i++) {
            spendMoneyForMonth += spendMoneyEveryWeek[i];
        }
        spendMoneyAverage = spendMoneyForMonth / spendMoneyEveryWeek.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", spendMoneyAverage);

        // Task 4
        System.out.println();
        System.out.println("Task 4");
        String [] fullName = {"n", "a", "v", "I", " ", "v", "o", "n", "a", "v", "I"};
        for (int i = 0, j = fullName.length - 1; i < j; i++, j--) {
            String temp = fullName[i];
            fullName[i] = fullName[j];
            fullName[j] = temp;
        }
        for (int i = 0; i < fullName.length; i++) {
            System.out.print(fullName[i]);
        }
    }
}
