/**
 * Created by k1763625 on 30/10/17.
 */
public class Creature {

    int energy, fullness, happiness;
    String name;

    public Creature( String name){
        energy=15;
        fullness=15;
        happiness=15;

        this.name=name;
    }

    public void eat(){
       if(fullness>=12){
           print("whoops"+ this.name +"is not that sleepy...");
       } else {
           fullness += 8;
           happiness -= 6;
           energy -= 4;
           print("*yum* that was a good meal");
       }
       if (fullness>15) fullness=15;

    }

    public void sleep(){
        if(energy>=12){
            print("whoops"+ this.name +"is full...");
        } else {
            fullness -= 6;
            happiness -= 6;
            energy += 8;
            print("*yawn* that was a good sleep");
        }
        if (energy>15) energy=15;
    }

    public void play(){
        fullness -= 6;
        happiness += 8;
        energy -= 6;
       print("That was fun!");
        if (happiness>15) happiness=15;
    }

    public String checkStatus(){
        String status="";

        if (happiness<=6){
            status +="Oh," +this.getName()+"is feeling sad...\n";
        }

        if (energy<=6){
            status +="Oh," +this.getName()+"is really tired...\n";
        }

        if (fullness<=6){
            status +="Oh," +this.getName()+"is super hungry...\n";
        }
        return status;
    }

    public String getName() {
        return name;
    }

    public void print(String string)
    {
        System.out.println(string);
    }
}
