import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BatteryController.class)
public class BatteryControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BatteryService batteryService;

    @Test
    public void testGetBatteries() throws Exception {
        when(batteryService.getBatteriesByPostcode("12345")).thenReturn(Arrays.asList(new Battery()));

        mockMvc.perform(get("/api/v1/batteries?postcode=12345"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.length()").value(1));
    }
}
