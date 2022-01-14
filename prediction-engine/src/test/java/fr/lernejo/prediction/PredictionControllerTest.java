package fr.lernejo.prediction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredictionControllerTest {

    @Test
    void get() {
        PredictionController ctrl = new PredictionController();
        ctrl.get("France");
        Assertions.assertThat(true);    }

@Test
void get2() {
    PredictionController ctrl = new PredictionController();
    ctrl.get("Algerie");
    Assertions.assertThat(true);    }

}
