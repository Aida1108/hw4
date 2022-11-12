public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 150;
        System.out.println("Значение переменной a с типом int равна " + a );
        byte b = 20;
        System.out.println("Значение переменной b с типом byte равна " + b );
        short c = 1000;
        System.out.println("Значение переменной c с типом short равна " + c );
        long d = 1500000000L;
        System.out.println("Значение переменной d с типом long равна " + d );
        double f = 0.568;
        System.out.println("Значение переменной f с типом double равна " + f );
        float g = 2.5f;
        System.out.println("Значение переменной g с типом float равна " + g );

        //Задача 2
        System.out.println("Задача 2");
        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786;
        boolean ff = false;
        short gg = 569;
        short p = -159;
        int s = 27897;
        byte t = 67;

        // Задача 3
        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int list = 480;
        int listClass = list / (class1+class2+class3);
        System.out.println("На каждого ученика рассчитано " + listClass + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int carB = 16;
        int carM = 2;
        int product1Min = carB / carM;
        int min20 = 20;
        System.out.println("За " + min20 + " минут машина произвела бутылок " + ( product1Min * min20) + " штук");
        int day = 24*60;
        System.out.println("За " + day + " минут машина произвела бутылок " + ( product1Min * day) + " штук");
        int day3 = day * 3;
        System.out.println("За " + day3 + " минут машина произвела бутылок " + ( product1Min * day3) + " штук");
        int mounth = day3 * 10;
        System.out.println("За " + mounth + " минут машина произвела бутылок " + ( product1Min * mounth) + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int whiteCans = 2;
        int brownCans = 4;
        int totalCans = 120;
        int totalClass = totalCans / (whiteCans+brownCans);
        int totalWhiteClass = totalClass * whiteCans;
        int totalBrownClass = totalClass * brownCans;
        System.out.println("В школе, где " + totalClass + " классов, нужно " +  totalWhiteClass + " банок белой краски и " + totalBrownClass +" банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        int banan = 5;
        int bananGr = 80;
        int milk = 200;
        int milkGr = 105;
        int icecream = 2;
        int icecreamGr = 100;
        int eggs = 4;
        int egssGr = 70;
        int breakfast = ( (banan * bananGr) + (milk * milkGr) + (icecream * icecreamGr) + (eggs * egssGr) );
        int kg = 1000;
        int breakfastKg = breakfast / kg;
        System.out.println("Спорт-завтрак весит " + breakfastKg + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int weight = 7;
        int weightGr = weight * 1000;
        int weight1 = 250;
        int weight2 = 500;
        int weight1Day = weightGr / weight1;
        System.out.println("Если спортсмен будет терять каждый день по " + weight1 +  "грамм, то на похудение уйдет " + weight1Day + " дней.");
        int weight2Day =  weightGr/ weight2;
        System.out.println("Если спортсмен будет терять каждый день по " + weight2 +  "грамм, то на похудение уйдет " + weight2Day + " дней.");
        int weight3Day = (weight1Day +weight2Day) / 2;
        System.out.println("Чтобы добиться результата похудения может потребоваться в среднем "  + weight3Day + " день.");

        // Задача 8
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        float pro = 0.10f;
        float MashaPro = Masha + Masha *pro;
        int year = 12;
        float MashaProYear = MashaPro * year - Masha * year;
        System.out.println("Маша теперь получает " + MashaPro + " рублей. Годовой доход вырос на "+ MashaProYear + " рублей.");
        float DenisPro = Denis + Denis *pro;
        float DenisProYear = DenisPro * year - Denis * year;
        System.out.println("Денис теперь получает " + DenisPro + " рублей. Годовой доход вырос на "+ DenisProYear +  " рублей.");
        float KristinaPro = Kristina + Kristina *pro;
        float KristinaProYear = KristinaPro * year - Kristina * year;
        System.out.println("Кристина теперь получает " + KristinaPro + " рублей. Годовой доход вырос на "+ KristinaProYear +  " рублей.");








    }
}