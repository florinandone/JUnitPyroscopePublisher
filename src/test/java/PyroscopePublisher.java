import io.pyroscope.javaagent.PyroscopeAgent;
import io.pyroscope.javaagent.config.Config;
import io.pyroscope.javaagent.impl.DefaultConfigurationProvider;

public class PyroscopePublisher {

    public static final String PYROSCOPE_ENABLED_CONFIG = "PYROSCOPE_ENABLED";
    public static void start() {
        if( pyroscopeEnabled())
         PyroscopeAgent.start(Config.build(DefaultConfigurationProvider.INSTANCE));
    }

    private static boolean pyroscopeEnabled() {
        if("TRUE".equalsIgnoreCase( System.getenv(PYROSCOPE_ENABLED_CONFIG)))
            return true;
        if("FALSE".equalsIgnoreCase( System.getenv(PYROSCOPE_ENABLED_CONFIG)))
            return true;
        if("TRUE".equalsIgnoreCase(System.getProperty(PYROSCOPE_ENABLED_CONFIG)))
            return true;
        return false;
    }
}
