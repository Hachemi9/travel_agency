package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TravelSiteController {
    final List<Registration> users = new ArrayList<>();


    @PostMapping(value = "api/inscription")
    public void addUser(@RequestBody Registration user){
        users.add(user);
    }

    @GetMapping(value="/api/travels")
    public Object get(@RequestParam String userName){
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Algeria",40));
        return countries;
    }
}
