import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

@ExtendWith(PyroscopeJupiterInitExtension.class)
public class SampleTest {

    @Test
    public void wait10Sec() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
    }
}
