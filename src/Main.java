public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        byte A = 100;
        short B = 30_000;
        int C = 2_000_000_000;
        long D = 8L;
        float E = 0.6f;
        double F = 0.15;
        System.out.println("Значение переменной A с типом byte равно " + A);
        System.out.println("Значение переменной B с типом short равно " + B);
        System.out.println("Значение переменной C с типом int равно " + C);
        System.out.println("Значение переменной D с типом long равно " + D);
        System.out.println("Значение переменной E с типом float равно " + E);
        System.out.println("Значение переменной F с типом double равно " + F);

        System.out.println("ЗАДАЧА 2");
        float G = 27.12f;
        long H = 987_678_965_549L;
        float I = 2.789f;
        short J = 569;
        short K = -159;
        short L = 27_897;
        byte M = 67;
        System.out.println("Для решения потребовалось 4 типа данных");

        System.out.println("ЗАДАЧА 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short lists = 480;
        int studentsAll = studentsLP + studentsAS + studentsEA;
        int res = lists / studentsAll;
        System.out.println("На каждого ученика рассчитано " + res + " листов бумаги");

        System.out.println("ЗАДАЧА 4");
        byte capacity1min = 16 / 2;
        byte time20min = 20;
        short time24hour = 24 * 60;
        short time3day = 3 * 24 * 60;
        int time1month = 30 * 24 * 60; // если в месяце 30 дней
        int capacity20min = capacity1min * time20min;
        int capacity24hour = capacity1min * time24hour;
        int capacity3day = capacity1min * time3day;
        int capacity1month = capacity1min * time1month;
        System.out.println("За 20 минут машина произвела " + capacity20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacity24hour + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacity3day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + capacity1month + " штук бутылок");

        System.out.println("ЗАДАЧА 5");
        byte canOfPaint = 120;
        byte canForRoom = 6;
        int room = canOfPaint / canForRoom;
        int whitePaint = room * 2;
        int brownPaint = room * 4;
        System.out.println("В школе, где " + room + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("ЗАДАЧА 6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int weightInGrams = bananas + milk + iceCream + eggs;
        float weightInKilograms = (float) weightInGrams / 1000;
        System.out.println("Фитнес-завтрак будет весить " + weightInGrams + " граммов или " + weightInKilograms + " килограмм");

        System.out.println("ЗАДАЧА 7");
        short targetWeight = 7 * 1000;
        short weightPerDayMin = 250;
        short weightPerDayMax = 500;
        int daysMim = targetWeight / weightPerDayMax;
        int daysMax = targetWeight / weightPerDayMin;
        int daysOnAverage = (daysMim + daysMax) / 2;
        System.out.println("Спортсмену потребуется от " + daysMim + " до " + daysMax + " дней для похудения на 7кг");
        System.out.println("В среднем этого результата можно добиться за " + daysOnAverage + " день");

        System.out.println("ЗАДАЧА 8");
        int monthlySalaryOfMariaInitial = 67_760;
        int monthlySalaryOfDenisInitial = 83_690;
        int monthlySalaryOfKrisInitial = 76_230;
        int annualSalaryOfMariaInitial = monthlySalaryOfMariaInitial * 12;
        int annualSalaryOfDenisInitial = monthlySalaryOfDenisInitial * 12;
        int annualSalaryOfKrisInitial = monthlySalaryOfKrisInitial * 12;
        float salaryGrowth = 1.1f;
        float monthlySalaryOfMariaFinal = monthlySalaryOfMariaInitial * salaryGrowth;
        float monthlySalaryOfDenisFinal = monthlySalaryOfDenisInitial * salaryGrowth;
        float monthlySalaryOfKrisFinal = monthlySalaryOfKrisInitial * salaryGrowth;
        float annualSalaryOfMariaFinal = monthlySalaryOfMariaFinal * 12;
        float annualSalaryOfDenisFinal = monthlySalaryOfDenisFinal * 12;
        float annualSalaryOfKrisFinal = monthlySalaryOfKrisFinal * 12;
        float salaryDifferenceForMaria = annualSalaryOfMariaFinal - annualSalaryOfMariaInitial;
        float salaryDifferenceForDenis = annualSalaryOfDenisFinal - annualSalaryOfDenisInitial;
        float salaryDifferenceForKris = annualSalaryOfKrisFinal - annualSalaryOfKrisInitial;
        System.out.println("Мария теперь получает " + monthlySalaryOfMariaFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForMaria + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryOfDenisFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryOfKrisFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForKris + " рублей");
    }
}