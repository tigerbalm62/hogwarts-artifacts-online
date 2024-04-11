package edu.tcu.cs.hogwartsartifactsonline.system.actuator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;
import java.io.File;

@Component
public class UsableMemoryHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        File path = new File(".");
        long diskUsableInBytes = path.getUsableSpace();
        boolean isHealthy = diskUsableInBytes >= 10 * 1024 * 1024; // 10MB
        Status  status = isHealthy ? Status.UP : Status.DOWN;
        return Health.status(status)
                .withDetail("usable memory", diskUsableInBytes) // In addition to UP/DOWN, you can also provide more details
                .withDetail("threshold", 10 * 1024 * 1024)
                .build();
    }
}
