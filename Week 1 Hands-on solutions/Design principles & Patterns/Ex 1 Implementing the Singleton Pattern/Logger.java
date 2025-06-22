public class Logger {
    private static Logger logger;

    private Logger(){
        System.out.println("instance created");
    }

    public static Logger getLogger(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }

    public static void testLogger(String str){
        System.out.println(str);
    }
}
