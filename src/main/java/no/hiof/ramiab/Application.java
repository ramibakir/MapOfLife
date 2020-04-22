package no.hiof.ramiab;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.ramiab.controller.ObservationController;
import no.hiof.ramiab.repository.MapOfLifeJSONObservationRepository;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7001);

        app.config.enableWebjars();

        app.before("/", ctx -> ctx.redirect("/observations"));

        MapOfLifeJSONObservationRepository mapOfLifeJSONRepository = new MapOfLifeJSONObservationRepository();
        ObservationController observationController = new ObservationController(mapOfLifeJSONRepository);

        app.get("/observations/", new VueComponent("observations-overview"));
        app.get("api/observations", observationController::getAllObservations);
    }
}
