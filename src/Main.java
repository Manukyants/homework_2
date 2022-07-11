public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte box = 127;
        System.out.println(box);
        short box1 = 32767;
        System.out.println(box1);
        int box3 = 15465454;
        System.out.println(box3);
        long box4 = 4645625L;
        System.out.println(box4);
        float box5 = 3.25f;
        System.out.println(box5);
        double box6 = 4.658;
        System.out.println(box6);

        float fighter1 = 78.2f;
        float fighter2 = 82.7f;
        float summWeigthFighters = fighter1 + fighter2;
        System.out.println("Общий вес двух боксеров равен " +summWeigthFighters + " кг" );
        float differenceWeigt = fighter2 - fighter1;
        System.out.println("Разница веса между боксером 1 и 2 составила " + differenceWeigt + " кг!");

        int bananas = 80;
        int bananasWeight = bananas * 5;
        System.out.println(bananasWeight);
        int milk = 105;
        int milkWeight = milk * 2;
        int icecreame = 100;
        int icecreameWeight = icecreame * 2;
        int eggs = 70;
        int eggsWeight = eggs * 4;
        int cocktail = bananasWeight + milkWeight + icecreameWeight + eggsWeight;
        float cocktailWeightInKg = cocktail / 1000f;
        System.out.println("Завтрак спортсмена составил " + cocktailWeightInKg + " кг");


        int totalWeight = 7;
        float minWeight = 250/1000f;
        float maxWeight = 500/1000f;
        float dayMinWeight = totalWeight / minWeight;
        System.out.println(dayMinWeight + " дней уйдет на похудении при 250 грамм в день");
        float dayMaxWeight = totalWeight / maxWeight;
        System.out.println(dayMaxWeight + " дней уйдет на похудении при 500 грамм в день");
        float AverageWeight = (maxWeight + minWeight) / 2f;
        System.out.println(AverageWeight);
        float dayAverageWeight = (totalWeight%AverageWeight)*100f;
        System.out.println("В среднем для похудения спортсмену потребуется: " + dayAverageWeight + " дней");


        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        int kash10masha = (masha / 100 * 10) + masha;
        System.out.println("ЗП Маши после увеличения на 10% " + kash10masha + "руб/мес");
        int kash10denis = (denis / 100 * 10) + denis;
        System.out.println("ЗП Дениса после увеличения на 10% " + kash10denis + "руб/мес");
        int kash10kris = (kris / 100 * 10) + kris;
        System.out.println("ЗП Кристины после увеличения на 10% " + kash10kris + "руб/мес");

        int differenceMasha = (kash10masha-masha)*12;
        System.out.println("Разница среднегодового дохода Маши составила: " + differenceMasha + " руб.");
        int differenceDenis = (kash10denis-denis)*12;
        System.out.println("Разница среднегодового дохода Дениса составила: " + differenceDenis + " руб.");
        int differenceKris = (kash10kris-kris)*12;
        System.out.println("Разница среднегодового дохода Маши составила: " + differenceKris + " руб.");



        System.out.println("Я старался как только мог, если что, сильно не ругайтесь =)");




    }
}