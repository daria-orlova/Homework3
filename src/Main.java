public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        byte a = 100;
        short b = 30_000;
        int c = 2_000_000_000;
        long d = 8L;
        float e = 0.6f;
        double f = 0.15;
        System.out.println("Значение переменной A с типом byte равно " + a);
        System.out.println("Значение переменной B с типом short равно " + b);
        System.out.println("Значение переменной C с типом int равно " + c);
        System.out.println("Значение переменной D с типом long равно " + d);
        System.out.println("Значение переменной E с типом float равно " + e);
        System.out.println("Значение переменной F с типом double равно " + f);

        System.out.println("ЗАДАЧА 2");
        float g = 27.12f;
        long h = 987_678_965_549L;
        float i = 2.789f;
        short j = 569;
        short k = -159;
        short l = 27_897;
        byte m = 67;
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
        int time3day = 3 * time24hour;
        int time1month = 10 * time3day; // если в месяце 30 дней
        int capacity20min = capacity1min * time20min;
        int capacity24hour = capacity1min * time24hour;
        int capacity3day = capacity1min * time3day;
        int capacity1month = capacity1min * time1month;
        System.out.println("За 20 минут машина произвела " + capacity20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacity24hour + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacity3day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + capacity1month + " штук бутылок");

        System.out.println("ЗАДАЧА 5");
        byte whiteCanForRoom = 2;
        byte brownCanForRoom = 4;
        int canForRoom = whiteCanForRoom + brownCanForRoom;
        byte canOfPaintTotal = 120;
        int room = canOfPaintTotal / canForRoom;
        int whitePaint = room * whiteCanForRoom;
        int brownPaint = room * brownCanForRoom;
        System.out.println("В школе, где " + room + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("ЗАДАЧА 6");
        byte weightOfBanana = 80;
        byte volumeOfBananas = 5;
        byte weightOfMilk = 105;
        byte volumeOfMilk = 2;
        byte weightOfIceCream = 100;
        byte volumeOfIceCream = 2;
        byte weightOfEggs = 70;
        byte volumeOfEggs = 4;
        int bananas = weightOfBanana * volumeOfBananas;
        int milk = weightOfMilk * volumeOfMilk;
        int iceCream = weightOfIceCream * volumeOfIceCream;
        int eggs = weightOfEggs * volumeOfEggs;
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
        float salaryGrowth = 1.1f;
        float monthlySalaryOfMariaFinal = monthlySalaryOfMariaInitial * salaryGrowth;
        float monthlySalaryOfDenisFinal = monthlySalaryOfDenisInitial * salaryGrowth;
        float monthlySalaryOfKrisFinal = monthlySalaryOfKrisInitial * salaryGrowth;
        float salaryDifferenceForMaria = (monthlySalaryOfMariaFinal - monthlySalaryOfMariaInitial) * 12;
        float salaryDifferenceForDenis = (monthlySalaryOfDenisFinal - monthlySalaryOfDenisInitial) * 12;
        float salaryDifferenceForKris = (monthlySalaryOfKrisFinal - monthlySalaryOfKrisInitial) * 12;
        System.out.println("Мария теперь получает " + monthlySalaryOfMariaFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForMaria + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryOfDenisFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryOfKrisFinal + " рублей в месяц. Годовой доход вырос на " + salaryDifferenceForKris + " рублей");
    }
}