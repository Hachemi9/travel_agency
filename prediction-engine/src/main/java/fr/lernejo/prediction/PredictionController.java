package fr.lernejo.prediction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;


@RestController
public class PredictionController {
    final TemperatureService temperatureService = new TemperatureService();
    @GetMapping(value="/api/temperature")
    public Object get(@RequestParam String country){
        Temperature temp = new Temperature(country, new ArrayList<Temperature.Temperatures>());
        try {
            temp.temperatures().add(new Temperature.Temperatures(LocalDate.now().minusDays(1).toString(),temperatureService.getTemperature(country)));
            temp.temperatures().add(new Temperature.Temperatures(LocalDate.now().minusDays(2).toString(),temperatureService.getTemperature(country)));
        }
        catch (UnknownCountryException unknownCountryException) {
            return ResponseEntity.status(417).body("Error");
        }
        return temp;
    }
}
