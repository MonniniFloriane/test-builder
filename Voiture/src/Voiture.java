import java.util.ArrayList;

public class Voiture {
    private String typePain = "";
    private ArrayList<String> ingredients = new ArrayList<String>();

    private Voiture(VoitureBuilder builder) {
        this.typePain = builder.typePain;
        this.ingredients = builder.ingredients;
    }

    public static class VoitureBuilder implements IBuilderVoiture {
        private String typePain = "";
        private ArrayList<String> ingredients = new ArrayList<String>();

        public VoitureBuilder(String typePain) {
            this.typePain = typePain;
        }

        @Override
        public VoitureBuilder addGarniture(String item) {
            this.ingredients.add(item);
            return this;
        }

        @Override
        public Voiture build() {
            return new Voiture(this);
        }
    }
}