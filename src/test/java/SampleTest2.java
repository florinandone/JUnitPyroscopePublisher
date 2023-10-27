import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

@ExtendWith(PyroscopeJupiterInitExtension.class)
public class SampleTest2 {

    @Test
    public void wait100ec() throws InterruptedException {

        TimeUnit.SECONDS.sleep(10);
    }
}
