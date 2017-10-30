import java.util.Scanner;


public class Game {
    Scanner scanner = new Scanner (System.in);
    Creature creature;
    boolean userQuits=false;
    public void run() {


        startTutorial();
        while (!userQuits) {

            interact();

        }
    }
        private void startTutorial(){
        System.out.println ("hey there ! welcome to JavaGotchi!");
        System.out.println ("What is your creature name?");
        String name = scanner.nextLine();
        this.creature=new Creature(name);
        System.out.println ("What is your creature name?");
        System.out.println ("Great, your creature now is " +creature.getName());

    }


    public void interact(){
        System.out.println ("What would you like to do?");
        System.out.println ("[1] Play");
        System.out.println ("[2] Eat");
        System.out.println ("[3] Sleep");
        System.out.println ("[4] Quit");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                break;

        }
    }

}
