public class App {
    public static void main(String[] args) {
        //create duelers
        Dueler harry = new Dueler("Harry Potter", false);
        Dueler hermione = new Dueler("Hermione Granger", true);
        Dueler preesh = new Dueler("Preeshwick Pepperwell", false);
        //feel free to change the name of the duelers, if they haven't won a duel before set it to false, if they have set it to true 

        //create spells
        Spell protego = new Spell("Protego", "Shield charm, protects the spell caster with an invisible shield that reflects spells.");
        Spell expelliarmus = new Spell("Expelliarmus", " Disarming charm, knocks the victim's weapon out of their hands.");
        Spell stupefy = new Spell("Stupefy", "Stunning spell, renders its target unconscious if the spell's impact is 10");
        // if you want to change the spells, you can change the name and the description of the spell

        // Set spells for duelers, if you want to change the spells that they use, change it to the spell you want in the parenthesis
        harry.setSpell(protego);
        hermione.setSpell(stupefy);
        preesh.setSpell(expelliarmus);

        //create duel
        Duel duel = new Duel(harry, hermione, preesh);

        //start the duel
        duel.startDuel();

        //duel results
        System.out.println("The results of today's duel:");
        System.out.println(harry.getName() + "'s total impact: " + harry.getCurrentImpact());
        System.out.println(hermione.getName() + "'s total impact: " + hermione.getCurrentImpact());
        System.out.println(preesh.getName() + "'s total impact: " + preesh.getCurrentImpact());
       
        if (harry.getCurrentImpact() > hermione.getCurrentImpact() && harry.getCurrentImpact() > preesh.getCurrentImpact()) {
            System.out.println("The Winner of today's duel is: " + harry.getName() + "!");
        } else if (hermione.getCurrentImpact() > harry.getCurrentImpact() && hermione.getCurrentImpact() > preesh.getCurrentImpact()) {
            System.out.println("The Winner of today's duel is: " + hermione.getName() + "!");
        } else if (preesh.getCurrentImpact() > harry.getCurrentImpact() && preesh.getCurrentImpact() > hermione.getCurrentImpact()) {
            System.out.println("The Winner of today's duel is: " + preesh.getName() + "!");
        } else {
            System.out.println("The duel is declared a draw. No winner.");
        }

        System.out.println(); //break in the code to make it easier to read.
        System.out.println("Run the code again to start a new duel!!");
    }
}
