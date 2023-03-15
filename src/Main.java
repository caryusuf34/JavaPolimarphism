public class Main {
    public static void main(String[] args) {
//        BaseLogger [] baseLoggers=new BaseLogger[]{new DataBaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
//
//        for (BaseLogger logger:baseLoggers){
//            logger.Log("Log Mesajı");
//        }
        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.add();


    }
}