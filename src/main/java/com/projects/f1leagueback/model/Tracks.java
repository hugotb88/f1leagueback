package com.projects.f1leagueback.model;

public enum Tracks {

    AUSTRALIA(1,"Albert Park", "Australia", "Australian GP"),
    CHINA(2,"Shangai International Circuit", "China", "Chinese GP"),
    JAPAN(3,"Suzuka Circuit","Japan", "Japanese GP"),
    BAHRAIN(4,"Bahrain International Circuit", "Bahrain", "Bahrain GP"),
    SAUDI_ARABIA(5,"Jeddah Street Circuit", "Saudi Arabia", "Saudi Arabian GP"),
    USA_MIAMI(6,"Miami International Autodrome", "United States of America", "Miami GP"),
    ITALY_IMOLA(7,"Autromo Enzo e Dino Ferrari", "Italy", "Imola GP"),
    MONACO(8,"Circuit de Monaco", "Monaco", "Monaco GP"),
    SPAIN_BARCELONA(9,"Circuit de Catalunya", "Spain", "Spanish GP"),
    CANADA(10,"Circuit Gillea Villeneuve", "Canada", "Canadian GP"),
    AUSTRIA(11,"Red Bull Ring", "Austria", "Austrian GP"),
    UNITED_KINGDOM(12,"Circuit Silverstone", "United Kingdom", "British GP"),
    BELGIUM(13,"Spa-Francorchamps","Belgium", "Belgian GP"),
    HUNGARY(14,"Hungaroring", "Hungary", "Hungarian GP"),
    NETHERLANDS(15,"Circuit Zandvoort", "Netherlands", "Dutch GP"),
    ITALY_MONZA(16,"Autodromo Nazionale Monza", "Italy", "Italian GP"),
    AZERBAIJAN(17,"Baku City Circuit", "Azerbaijan", "Azerbaijan GP"),
    SINGAPORE(18,"Marina Bay Street Circuit", "Singapore", "Singapore GP"),
    USA_TEXAS(19,"Circuit of the Americas", "United States of America", "United States GP"),
    MEXICO(20,"Autodromo Hermanos Rodriguez","Mexico", "Mexican GP"),
    BRAZIL(21,"Autodromo Jose Carlos Pace Interlagos", "Brazil", "Brazilian GP"),
    USA_VEGAS(22,"Las Vegas Street Circuit", "United States of America", "Las Vegas GP"),
    QATAR(23,"Losail International Circuit", "Qatar", "Qatar GP"),
    ABU_DHABI(24, "Yas Marina Circuit", "Abu Dhabi", "Abu Dhabi GP");


    // Attributes
    private final long trackId;
    private final String trackName;
    private final String trackCountry;
    private final String gpName;

    // Constructor
    private Tracks(long trackId, String trackName, String trackCountry, String gpName) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackCountry = trackCountry;
        this.gpName = gpName;
    }

    // Getter methods
    public long getTrackId() {
        return trackId;
    }

    public String getFullTrackInfo(){
        return String.format("%s in %s, Official Name is : %s",
                trackName, trackCountry, gpName);
    }

    public String getTrackName() {
        return trackName;
    }

    public String getTrackCountry() {
        return trackCountry;
    }

    public String getGpName() {
        return gpName;
    }
}
