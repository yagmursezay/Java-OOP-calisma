package polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        //EmailLogger logger = new EmailLogger();
        //logger.log(" log mesajı.");

//        BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new DatabaseLogger(), new FileLogger()};
//        for (BaseLogger logger:loggers){
//            logger.log("log mesajı.");
//
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}
