package edu.tcu.cs.hogwartsartifactsonline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "dev") // override the active profile in application.properties
class HogwartsArtifactsOnlineApplicationTests {

    @Test
    void contextLoads() {
    }

}
