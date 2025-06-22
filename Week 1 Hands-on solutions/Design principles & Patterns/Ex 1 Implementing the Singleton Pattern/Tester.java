public class Tester {
    public static void main(String[] args) {
        Logger logger1=Logger.getLogger();
        Logger logger2=Logger.getLogger();

        logger1.testLogger("i am logger 1 ");
        logger2.testLogger("i am logger 2 ");

        System.out.println();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        System.out.println();

        System.out.println(logger1.equals(logger2));
    }
}
