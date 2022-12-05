package Exceptions;

import com.sparta.Main;
import org.apache.logging.log4j.*;

public class Cat {

    public static Logger logger = LogManager.getLogger(Main.class);

    public String meow(String name) {

        logger.log(Level.ERROR, "My first log message");
        logger.log(Level.WARN, "My second log message");

        try {
            name = name.toUpperCase();          // exception is thrown here when null name is detected
        } catch (NullPointerException e) {
            logger.error(e.getMessage(), e);
        }
        return name + " the cat meows";
    }

}
