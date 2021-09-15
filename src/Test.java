public class Test {
    public static void main(String[] args) {

        ZadachiGeneriki1.Box<String> sample1 = new ZadachiGeneriki1.Box<>("Runtime");
        System.out.println(sample1);

        ZadachiGeneriki1.Box<Integer> sample2 = new ZadachiGeneriki1.Box<>(1); // вместо класса Integer был написан класс String
        System.out.println(sample2);

        ZadachiGeneriki1.Box<Boolean> sample3 = new ZadachiGeneriki1.Box<>(Boolean.TRUE);
        System.out.println(sample3);

        System.out.println();

        Boxes<Integer, String> b1 = new Boxes<>(123, "courses");
        System.out.println(b1);

        Boxes<Boolean, Double> b2 = new Boxes<>(true, 12.4);
        System.out.println(b2);

    }
}