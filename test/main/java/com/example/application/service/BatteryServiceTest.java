
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BatteryServiceTest {

    @Mock
    private BatteryRepository batteryRepository;

    @InjectMocks
    private BatteryService batteryService;

    @Test
    public void testGetBatteriesByPostcode() {
        when(batteryRepository.findByPostcode("12345")).thenReturn(Arrays.asList(new Battery()));

        List<Battery> batteries = batteryService.getBatteriesByPostcode("12345");

        assertEquals(1, batteries.size());
    }
}
