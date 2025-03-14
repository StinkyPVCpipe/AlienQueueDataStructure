//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("HELLO THERE!!!! You are the captain of the legendary zoopazatzop 5000, and in charge of" +
                "\nleading a squadron of your kind to investigate the alien planet Earth and its inhabitants! " +
                "\nYour mission is now finished, and you need to make sure that your squadron gets on safe and sound" +
                "\nin a single file line!!!");
    AlienQueue AQ = new AlienQueue();
    System.out.println("lets see whos in line so far!");
    AQ.printAlienQueue();
    System.out.println("Aw shucks. oh wait-!");
    AQ.addAlienToEnd("Polly");
    AQ.addAlienToEnd("Zorb");
    AQ.addAlienToEnd("Noelle");
    AQ.addAlienToEnd("Amelia");
    System.out.println("Looks like " +AQ.amntOfAliens() + " venusians have lined up! ");
    AQ.printAlienQueue();
    AQ.removeAlienFromStart();
    System.out.println("Polly successfully boarded the saucer! There are now " + AQ.amntOfAliens() + " venusians left!" +
            "\nHere is the current line to board the craft:");
    AQ.printAlienQueue();
    AQ.addAlienToEnd("Ryl");
    System.out.println("Whoops! Looks like someone was running a little late! but" + AQ.getRear() + "is here now!");
    AQ.printAlienQueue();
    System.out.println("Go ahead and open the door nice and wide so everyone can get on board ^__^");
    AQ.boardAllAliens(AQ);
    }
}