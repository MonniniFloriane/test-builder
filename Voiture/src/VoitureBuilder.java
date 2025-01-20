// Builder
public interface VoitureBuilder {
    public Voiture.VoitureBuilder estPateEpaisse(boolean valeur);
    public Voiture.VoitureBuilder garnitures(String garniture);
    public Voiture build();
}