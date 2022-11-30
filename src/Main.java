public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte a=-55;
        short b=25500;
        int c=-888888888;
        long d=541L;
        float e=22.222f;
        double f=-33333.1414141414;
        System.out.println("Значение переменной a с типом byte равно "+a);
        System.out.println("Значение переменной b с типом short равно "+b);
        System.out.println("Значение переменной c с типом int равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной i с типом float равно "+e);
        System.out.println("Значение переменной f с типом double равно "+f);

        System.out.println("Задача 2");
        // Пишем код для задачи 2
        float low=27.12f;
        long planets=987678965549L;
        double weight=2.786;
        int dog=569;
        int temp=-159;
        short finans=27897;
        byte year=67;

        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int class1=23;
        int class2=27;
        int class3=30;
        int sheets=480;
        int sheetStudent=sheets/(class1+class2+class3);
        System.out.println("На каждого ученика рассчитано "+sheetStudent+" листов бумаги.");

        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int bottle=16;
        int minute=2;
        int capacityOneMinute=bottle/minute;
        int capasity1=capacityOneMinute*20;
        int capacityDay=capacityOneMinute*(24*60);
        int capasity2=capacityDay*3;
        int capasity3=capacityDay*30;
        System.out.println("За 20 минут машина произвела "+capasity1+" штук бутылок.");
        System.out.println("За сутки машина произвела "+capacityDay+" штук бутылок.");
        System.out.println("За 3 дня машина произвела "+capasity2+" штук бутылок.");
        System.out.println("За месяц машина произвела "+capasity3+" штук бутылок.");

        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int can=120;
        int canWhite=2;
        int canBrown=4;
        int canClass=canWhite+canBrown;
        int numberClasses=can/canClass;
        int sumCanWhite=numberClasses*canWhite;
        int sumCanBrown=numberClasses*canBrown;
        System.out.println("В школе, где "+numberClasses+" классов, нужно "+sumCanWhite+" банок белой краски и "+sumCanBrown+" банок коричневой краски.");

        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int banana = 5;
        int weightBanana = 80;
        int milk = 200;
        int weightMilk = 105 / 100;
        int plombir = 2;
        int weightPlombir = 100;
        int egg = 4;
        int weightEgg = 70;
        int sumGram = banana * weightBanana + milk * weightMilk + plombir * weightPlombir + egg * weightEgg;
        int sumKilo = sumGram / 1000;
        System.out.println("Вес спортивного завтрака равен " + sumGram + " граммов, или " + sumKilo + " килограмма (ов).");

        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int weightLoss = 7;
        double weightLossMin = 250;
        double weightLossMax = 500;
        double dayMax = weightLoss/(weightLossMin/1000);
        double dayMin = weightLoss/(weightLossMax/1000);
        double dayAverage = weightLoss/ ((weightLossMin + weightLossMax) / 1000/2);
        System.out.println("Для снижения веса на " + weightLoss + " кг, при потере " + weightLossMin + " г веса в день, потребуется " + dayMax + " дней.");
        System.out.println("Для снижения веса на " + weightLoss + " кг, при потере " + weightLossMax + " г веса в день, потребуется " + dayMin + " дней.");
        System.out.println("В среднем потребуется " + dayAverage + " дней, для снижения веса на " + weightLoss + " кг.");

        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int wageMasha = 67760;
        int wageDenis = 83690;
        int wageKristina = 76230;
        double rise = 0.1;
        double riseMasha = wageMasha * rise;
        double riseDenis = wageDenis * rise;
        double riseKristina = wageKristina * rise;
        double newWageMasha = wageMasha + riseMasha;
        double newWageDenis = wageDenis + riseDenis;
        double newWageKristina = wageKristina + riseKristina;
        double bonusMasha = (newWageMasha-wageMasha)*12;
        double bonusDenis = (newWageDenis-wageDenis)*12;
        double bonusKristina =(newWageKristina-wageKristina)*12;
        System.out.println("Маша теперь получает " + newWageMasha + " рублей. Годовой доход вырос на " + bonusMasha + " рублей.");
        System.out.println("Маша теперь получает " + newWageDenis + " рублей. Годовой доход вырос на " + bonusDenis + " рублей.");
        System.out.println("Маша теперь получает " + newWageKristina + " рублей. Годовой доход вырос на " + bonusKristina + " рублей.");
    }
}