public class DecoratorPatternDriver {

    public static void main(String[] args) {

        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println("1) " + tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println("2) " + tree2.decorate());

    }

}
