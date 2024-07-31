package engtelecom;

public enum Naipe {
    PAUS("\u2660"),
    COPAS("\u2665"),
    OUROS("\u2666"),
    ESPADAS("\u2663");

    private String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }
}
