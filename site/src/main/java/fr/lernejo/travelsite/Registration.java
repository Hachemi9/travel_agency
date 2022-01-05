package fr.lernejo.travelsite;

public record Registration(
     String userEmail,
     String userName,
     String userCountry,
     WeatherExpectation weatherExpectation
) {

    public  enum WeatherExpectation{WARMER,COLDER};


}
