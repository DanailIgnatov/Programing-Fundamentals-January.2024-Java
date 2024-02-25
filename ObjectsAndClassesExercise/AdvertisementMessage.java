package ObjectsAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public String phrase;
    public String event;
    public String author;
    public String city;

    public AdvertisementMessage(String phrase, String event, String author, String city) {
        this.phrase = phrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getEvent() {
        return event;
    }

    public String getAuthor() {
        return author;
    }

    public String getCity() {
        return city;
    }
}
