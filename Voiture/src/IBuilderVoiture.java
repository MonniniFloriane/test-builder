public interface IBuilderVoiture {
    public Voiture.VoitureBuilder addGarniture(String item);

    public Voiture build();
}
