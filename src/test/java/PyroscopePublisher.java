import io.pyroscope.javaagent.PyroscopeAgent;
import io.pyroscope.javaagent.config.Config;
import io.pyroscope.javaagent.impl.DefaultConfigurationProvider;

import java.util.concurrent.atomic.AtomicBoolean;

public class PyroscopePublisher {

    private static final AtomicBoolean started = new AtomicBoolean(false);
    public static final String PYROSCOPE_ENABLED_CONFIG = "PYROSCOPE_ENABLED";

    public static void start() {
        if(!started.getAndSet(true)) {
            if (pyroscopeEnabled()) {
                System.out.println("Starting pyroscope");
                PyroscopeAgent.start(Config.build(DefaultConfigurationProvider.INSTANCE));
            } else {
                System.out.println("Pyroscope disabled");
            }
        }
    }

    private static boolean pyroscopeEnabled() {
        if ("TRUE".equalsIgnoreCase(System.getProperty(PYROSCOPE_ENABLED_CONFIG)))
            return true;
        if ("FALSE".equalsIgnoreCase(System.getProperty(PYROSCOPE_ENABLED_CONFIG)))
            return true;
        return "TRUE".equalsIgnoreCase(System.getProperty(PYROSCOPE_ENABLED_CONFIG));
    }
}
