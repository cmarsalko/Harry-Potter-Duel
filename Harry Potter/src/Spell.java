public class Spell {
    private String name;
    private String description;
    private int impact;

    // Constructor
    public Spell(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // This returns the name of the spell
    public String getName() {
        return name;
    }

    // This returns what the spell is and the description of the spell
    public String getDescription() {
        return description;
    }

    // This returns the amount of damage that the spell does in an integer
    public int getImpact() {
        java.util.Random random = new java.util.Random();
        impact = random.nextInt(10) + 1;
        return impact;
    }
}
