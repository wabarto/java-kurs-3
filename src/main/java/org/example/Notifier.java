package org.example;

public interface Notifier {

    // stala - automatycznie public static final
    int MAX_MESSAGE_LENGTH = 100;

    //abstrakcyjne - domyslnie public abstract
    void send(String message);

    String getChannel();


    // DEFAULT - implementacja domyslna
    default String describe() {
        return "Powiadomienie kanalem: " + getChannel();
    }


    // STATIC
    static Notifier silent() {
        return new NoOpNotifier();
    }
}
