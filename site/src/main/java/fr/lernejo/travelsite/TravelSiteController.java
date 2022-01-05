package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TravelSiteController {
    final List<Registration> users = new ArrayList<>();


    @PostMapping(value = "api/inscription")
    public Object addUser(@RequestBody Registration user){
        for (Registration u:users){
          if (u.userName().equals(user.userName())){
              return users;
          }
        }
        users.add(user);
        return users;
    }

    @GetMapping(value="/api/travels")
    public Object get(@RequestParam String userName){
        List<Country> countries = new ArrayList<>();
        for (Registration u:users){
            if (u.userName().equals(userName)){
                countries.add(new Country("France",24));
                countries.add(new Country("Algeria",40));
            }}
        return countries;
    }
}
