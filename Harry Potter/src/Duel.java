import java.util.Random;

public class Duel {
    private Dueler dueler1;
    private Dueler dueler2;
    private Dueler dueler3;

    // Constructor
    public Duel(Dueler dueler1, Dueler dueler2, Dueler dueler3) {
        this.dueler1 = dueler1;
        this.dueler2 = dueler2;
        this.dueler3 = dueler3;
    }

    public void startDuel() {
        System.out.println("Today's duel is between these wizards: " + dueler1.getName() + ", " + dueler2.getName() + ", and " + dueler3.getName());
        System.out.println("Has " + dueler1.getName() + " won a duel before? " + dueler1.hasWonBefore() + ". What about " + dueler2.getName() + "? " + dueler2.hasWonBefore() + ". And what about " + dueler3.getName() + "? " + dueler3.hasWonBefore() + ".");
        System.out.println(); 

        // Dueling process
        duel();

    }

    private void duel() {
        Random random = new Random();
        int totalTurns = random.nextInt(6) + 1; // Random number between 1 and 6 to determine how many turns each dueler gets 

        for (int turn = 0; turn < totalTurns; turn++) {
            // Dueler 1's turn
            castSpell(dueler1, dueler2, random);

            // Dueler 2's turn
            castSpell(dueler2, dueler3, random);

            //Dueler 3's turn
            castSpell(dueler3, dueler1, random);
        }
    }

    private void castSpell(Dueler caster, Dueler opponent, Random random) {
        Spell spell = caster.getSpell();
        System.out.println(caster.getName() + " casts " + spell.getName() + " - " + spell.getDescription());

        // The impact of the spell based on a number between 1 and 10
        int impact = spell.getImpact();
        caster.increaseImpact(impact);

        System.out.println(opponent.getName() + " is impacted with " + impact + " damage/impact.");
        System.out.println(caster.getName() + "'s total impact: " + caster.getCurrentImpact());
        System.out.println(opponent.getName() + "'s total impact: " + opponent.getCurrentImpact());
        System.out.println(); // break in the code 
    }
}
