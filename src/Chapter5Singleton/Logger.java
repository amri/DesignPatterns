package Chapter5Singleton;

/**
 * Created by amri on 13/8/14.
 */
public class Logger {
    private static Logger logger;
    private String value;

    private Logger()
    {
        value = "empty";
    }

    public synchronized static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
