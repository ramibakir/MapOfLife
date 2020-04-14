package no.hiof.ramiab.model;

import no.hiof.ramiab.model.animal.Amphibia;
import no.hiof.ramiab.model.animal.Aves;
import no.hiof.ramiab.model.animal.Invertebrate;
import no.hiof.ramiab.model.animal.Mammalia;
import no.hiof.ramiab.model.climate.ClimateGroup;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /* Animal creation below */
        Amphibia hulaFrog = new Amphibia("HF100", "Hula Painted Frog", "Latonia Nigriventer", "Dark belly with small white spots, ochre on the top with a " +
                "rusty color grading into dark olive-grey to greyish-black on the sides.", "https://www.edgeofexistence.org/wp-content/uploads/2017/05/Latonia_nigriventer_Photo_Frank_Glaw-1.jpg", true, false, true, 5.6, "Lissamphibia", "Salientia", 4);
        Aves eskimoCurlew = new Aves("EC100", "Eskimo Curlew", "Numenius Borealis", "Motted brown upperparts and light brown underparts",
                "https://www.un-habitat.org/wp-content/uploads/2017/08/article-4-prairie-pigeon.jpg",false, true, true, 10, 15, 30, true, 2);
        Mammalia narwhal = new Mammalia("NA100", "Narwhal", "Monodon Monoceros", "White", "https://www.un-habitat.org/wp-content/uploads/2017/08/article-4-narwhal.jpg",true, false, false, 940, 0,
                "Monodontidae", 5.5, false);
        Invertebrate snakeSeaCucumber = new Invertebrate("SSC100", "Snake Sea Cucumber", "Synapta maculata", "Red, black, green, blue or brown.","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Reef1118_-_Flickr_-_NOAA_Photo_Library.jpg/1200px-Reef1118_-_Flickr_-_NOAA_Photo_Library.jpg", true, false, true, 400,
                0, "Echinodermata", "Holothuroidea");
        /* Animal creation above */

        /*Create climate groups & subgroups*/
        ClimateGroup groupA = new ClimateGroup('A', "Tropical Climate", 18);
        ClimateGroup groupB = new ClimateGroup('B', "Dry Climate", 10);
        ClimateGroup groupC = new ClimateGroup('C', "Temperate Climate", 5);
        ClimateGroup groupD = new ClimateGroup('D', "Continental Climate", 5);
        ClimateGroup groupE = new ClimateGroup('E', "Polar & Alpine Climate", 5);
        /*Climate groups above*/

        /* Biome creation below */
        Biome tropicalRainforest = new Biome("Tropical Rainforest", groupA);
        Biome temperateForest = new Biome("Temperate Forest", groupC);
        Biome taiga = new Biome("Taiga", groupD);
        Biome desert = new Biome("Desert", groupB);
        Biome grassland = new Biome("Grassland", groupB);
        Biome savanna = new Biome("Savanna", groupA);
        Biome tundra = new Biome("Tundra", groupE);
        /* Biome creation above */

        /* Planet creation below */
        Planet mercury = new Planet("Mercury", 3.283E23,2439.7, 88, 430);
        Planet venus = new Planet("Venus",4.867E24,6051.8, 225, 462);
        Planet earth = new Planet("Earth",5.972E24,6371.1, 365,14);
        Planet mars = new Planet("Mars",6.39E23,3389.5, 687, -60);
        Planet jupiter = new Planet("Jupiter",1.898E27,69911, 4380, -145);
        Planet saturn = new Planet("Saturn",5.683E26,58232, 10585, -178);
        Planet uranus = new Planet("Uranus",8.681E25,25362, 30660, -224);
        Planet neptune = new Planet("Neptune",1.024E26,24622, 60225, -214);
        /* Planet creation above */

        /* Location creation below */
        uranus.addLocation(new Location("URL001", "Uranus location 001", -82.666936, 113.268002, tundra, 2));
        uranus.addLocation(new Location("URL002", "Uranus location 002", -42.935436, 146.075000, savanna, 1));
        mars.addLocation(new Location("MAL001", "Mars location 001", 30.276675, 35.406524, desert, 3));
        jupiter.addLocation(new Location("JUL001", "Jupiter location 001", 81.667958, -32.429851, tundra, 2));
        /* Location creation above */

        /* Observation creation below */
        Observation uranus001 = new Observation("First observation on Uranus", String.format("First observation of an animal on planet %s. Because we landed near the ocean," +
                "we got to observe the ocean for a while, but to avail. It was not until we sent a drone underwater that we saw signs of life in the form of a %s." +
                "After going both further out and deeper we actually saw a %s, which is amazing!", uranus.getName(), snakeSeaCucumber.getAnimalName(), narwhal.getAnimalName()),
                LocalDate.of(2345, 04, 12));
        Observation uranus002 = new Observation("Second observation on Uranus", String.format("Almost two weeks has passed since we last saw an animal, I think we scared them away when we landed." +
                "Anyway great news, during our expedition today we saw a pack of %s s flying around, confirming our suspicion that there were some species of %s on this planet.", eskimoCurlew.getAnimalName(),
                Aves.class.getSimpleName()), LocalDate.of(2345, 04, 24));
        Observation mars001 = new Observation("First observation on Mars",   String.format("Just landed on %s after almost a year of travelling, and we almost immediately saw a %s at location %s!",
                mars.getName(), hulaFrog.getAnimalName(), mars.getOneLocation("MAL001")), LocalDate.of(2338, 05, 17));
        /* Observation creation above */

        uranus001.addAnimals(snakeSeaCucumber);
        uranus001.addAnimals(narwhal);
        uranus002.addAnimals(eskimoCurlew);
        mars001.addAnimals(hulaFrog);

        uranus.getOneLocation("URL001").addObservation(uranus001);
        uranus.getOneLocation("URL002").addObservation(uranus002);
        mars.getOneLocation("MAL001").addObservation(mars001);
        
        System.out.println(uranus001);
        System.out.println("***********************************************");
        System.out.println(uranus002);
        System.out.println("***********************************************");
        System.out.println(mars001);
        System.out.println("***********************************************");
        System.out.println(hulaFrog);
        System.out.println("***********************************************");
        System.out.println(uranus.getAllLocations());


    }
}
