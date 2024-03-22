public class Dueler {

    private String name;
    private boolean hasWonBefore;
    private int currentImpact;
    private Spell spell;  // Add a Spell field

    // Constructor
    public Dueler(String name, boolean hasWonBefore) {
        this.name = name;
        this.hasWonBefore = hasWonBefore;
        this.currentImpact = 0;
    }

    // Get the information of each of the duelers  
    public String getName() {
        return name;
    }

    public boolean hasWonBefore() {
        return hasWonBefore;
    }

    public int getCurrentImpact() {
        return currentImpact;
    }

    public void increaseImpact(int impact) {
        this.currentImpact += impact;
    }

    // Set the spell for the dueler
    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    // Get the spell for the dueler
    public Spell getSpell() {
        return spell;
    }
}
