package Chapter5Singleton;

/**
 * Created by amri on 13/8/14.
 */
public class LoggerClient {
    public static void main(String[] args) {
        Logger one = Logger.getInstance();
        Logger two = Logger.getInstance();
        System.out.println(one.getValue());
        one.setValue("new");
        System.out.println(one.getValue());
        two.setValue("new2");
        System.out.println(one.getValue());
    }
}
