package no.hiof.ramiab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.ramiab.model.*;
import no.hiof.ramiab.model.animal.Amphibia;
import no.hiof.ramiab.model.animal.Aves;
import no.hiof.ramiab.model.animal.Invertebrate;
import no.hiof.ramiab.model.animal.Mammalia;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            Planet mercury = new Planet("Mercury", "Solar System", 3.283E23, 2439.7, 88, 430);
            Planet venus = new Planet("Venus", "Solar System", 4.867E24, 6051.8, 225, 462);
            Planet earth = new Planet("Earth", "Solar System", 5.972E24, 6371.1, 365, 14);
            Planet mars = new Planet("Mars", "Solar System", 6.39E23, 3389.5, 687, -60);
            Planet jupiter = new Planet("Jupiter", "Solar System", 1.898E27, 69911, 4380, -145);
            Planet saturn = new Planet("Saturn", "Solar System", 5.683E26, 58232, 10585, -178);
            Planet uranus = new Planet("Uranus", "Solar System", 8.681E25, 25362, 30660, -224);
            Planet neptune = new Planet("Neptune", "Solar System", 1.024E26, 24622, 60225, -214);

            Amphibia hulaFrog = new Amphibia("HF100", "Hula Painted Frog", "Latonia Nigriventer", "Dark belly with small white spots, ochre on the top with a " +
                    "rusty color grading into dark olive-grey to greyish-black on the sides.", "https://www.edgeofexistence.org/wp-content/uploads/2017/05/Latonia_nigriventer_Photo_Frank_Glaw-1.jpg", true, false, true, 5.6, "Lissamphibia", "Salientia", 4);
            Aves eskimoCurlew = new Aves("EC100", "Eskimo Curlew", "Numenius Borealis", "Motted brown upperparts and light brown underparts",
                    "https://www.un-habitat.org/wp-content/uploads/2017/08/article-4-prairie-pigeon.jpg", false, true, true, 10, 15, 30, true, 2);
            Mammalia narwhal = new Mammalia("NA100", "Narwhal", "Monodon Monoceros", "White", "https://www.un-habitat.org/wp-content/uploads/2017/08/article-4-narwhal.jpg", true, false, false, 940, 0,
                    "Monodontidae", 5.5, false);
            Invertebrate snakeSeaCucumber = new Invertebrate("SSC100", "Snake Sea Cucumber", "Synapta maculata", "Red, black, green, blue or brown.", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Reef1118_-_Flickr_-_NOAA_Photo_Library.jpg/1200px-Reef1118_-_Flickr_-_NOAA_Photo_Library.jpg", true, false, true, 400,
                    0, "Echinodermata", "Holothuroidea");

            ClimateGroup groupA = new ClimateGroup('A', "Tropical Climate", 18);
            ClimateGroup groupB = new ClimateGroup('B', "Dry Climate", 10);
            ClimateGroup groupC = new ClimateGroup('C', "Temperate Climate", 5);
            ClimateGroup groupD = new ClimateGroup('D', "Continental Climate", 5);
            ClimateGroup groupE = new ClimateGroup('E', "Polar & Alpine Climate", 5);

            Biome tropicalRainforest = new Biome("Tropical Rainforest", groupA);
            Biome temperateForest = new Biome("Temperate Forest", groupC);
            Biome taiga = new Biome("Taiga", groupD);
            Biome desert = new Biome("Desert", groupB);
            Biome grassland = new Biome("Grassland", groupB);
            Biome savanna = new Biome("Savanna", groupA);
            Biome tundra = new Biome("Tundra", groupE);

            Location URL001 = new Location("URL001", "Uranus location 001", -82.666936, 113.268002, tundra, 1);
            Location URL002 = new Location("URL002", "Uranus location 002", -42.935436, 146.075000, savanna, 1);
            Location MAL001 = new Location("MAL001", "Mars location 001", 30.276675, 35.406524, desert, 1);
            Location JUL001 = new Location("JUL001", "Jupiter location 001", 81.667958, -32.429851, tundra, 1);

            Observation uranus001 = new Observation("First observation on Uranus", String.format("First observation of an animal on planet %s. Because we landed near the ocean," +
                    "we got to observe the ocean for a while, but to avail. It was not until we sent a drone underwater that we saw signs of life in the form of a %s." +
                    "After going both further out and deeper we actually saw a %s, which is amazing!", uranus.getPlanetName(), snakeSeaCucumber.getName(), snakeSeaCucumber.getName()),
                    LocalDate.of(2345, 04, 12), URL001, snakeSeaCucumber);
            Observation uranus002 = new Observation("Second observation on Uranus", String.format("Second observation of an animal on planet %s. After seeing the %s at location %s," +
                    "we went further along the water until we got to something that looked like the Great Barrier Reef. We sat there and enjoyed the view for a while. As we were about to leave that we saw something moving in the water and chose to send out the drone to find out what this was." +
                    "After going both further out and deeper we actually saw a living %s, which is amazing!", uranus.getPlanetName(), narwhal.getName(), URL001.getLocationName(), narwhal.getName()),
                    LocalDate.of(2345, 04, 12), URL001, narwhal);
            Observation uranus003 = new Observation("Third observation on Uranus", String.format("Almost two weeks has passed since we last saw an animal, I think we scared them away when we landed." +
                            "Anyway great news, during our expedition today we saw a pack of %s s flying around, confirming our suspicion that there were some species of %s on this planet.", eskimoCurlew.getName(),
                    Aves.class.getSimpleName()), LocalDate.of(2345, 04, 24), URL002, eskimoCurlew);
            Observation mars001 = new Observation("First observation on Mars", String.format("Just landed on %s after almost a year of travelling, and we almost immediately saw a %s at location %s!",
                    mars.getPlanetName(), hulaFrog.getName(), mars.getOneLocation("MAL001")), LocalDate.of(2338, 05, 17), MAL001, hulaFrog);

            ArrayList<Observation> observations = new ArrayList<>();
            observations.add(uranus001);
            observations.add(uranus002);
            observations.add(uranus003);
            observations.add(mars001);

            uranus.addLocation(URL001);
            uranus.addLocation(URL002);
            mars.addLocation(MAL001);
            jupiter.addLocation(JUL001);

            objectMapper.writeValueAsString(uranus001);
            objectMapper.writeValueAsString(uranus002);
            objectMapper.writeValueAsString(uranus003);
            objectMapper.writeValueAsString(mars001);

            writeToFile(observations, "mal.json");

            ArrayList<Observation> observationsFromJSONFile = readFromFile("mal.json");

            System.out.println("Read from file: ");
            for (Observation o : observationsFromJSONFile) {
                System.out.println(o.getName());
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void writeToFile(ArrayList<Observation> observations, String file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(file), observations);
    }

    public static ArrayList<Observation> readFromFile(String file) {
        File observationFile = new File(file);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        ArrayList<Observation> observationsFromFile = new ArrayList<>();

        try {
            Observation[] observationArray = objectMapper.readValue(observationFile, Observation[].class);

            observationsFromFile.addAll(Arrays.asList(observationArray));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return observationsFromFile;
    }


}