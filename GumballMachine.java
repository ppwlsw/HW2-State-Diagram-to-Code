//6510450658 Pinpawat Limsuwat
public class GumballMachine {
    final static int OUT_OF_GUMBALL = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int GUMBALL_SOLD = 3;

    int state ;
    int gumballs;

    public GumballMachine( int gumballs) {
        this.gumballs = gumballs;
        this.state = NO_QUARTER;
    }

    void insertQuarter(){
        if(state == OUT_OF_GUMBALL){
            System.out.println("You can't insert a quarter, the machine is sold out.");
        } else if (state == NO_QUARTER){
            System.out.println("You inserted a quarter.");
            state = HAS_QUARTER;
        }else if (state == HAS_QUARTER){
            System.out.println("You can't insert another quarter.");
        }else if (state == GUMBALL_SOLD){
            System.out.println("Please wait! the gumball is rolling out.");

        }
    }

    void ejectQuarter(){
        if(state == OUT_OF_GUMBALL){
            System.out.println("You can't insert a quarter, the machine is sold out.");
        } else if (state == NO_QUARTER){
            System.out.println("There is no quarter, Why you trying tho?");
        }else if (state == HAS_QUARTER){
            System.out.println("Quarter returned!");
            state = NO_QUARTER;
        }else if (state == GUMBALL_SOLD){
            System.out.println("No refund! , You already turned the crank!");
        }
    }

    void turnCrack(){

        if(state == OUT_OF_GUMBALL){
            System.out.println("THERE ARE NO MORE GUMBALLS LEFT, WE ARE SORRY");
        } else if (state == NO_QUARTER){
            System.out.println("Please Insert the coin first!");
        }else if (state == HAS_QUARTER){
            System.out.println("You turned the crank :>");
            state = GUMBALL_SOLD;
            dispenseGumball();
        }else if (state == GUMBALL_SOLD){
            System.out.println("Please wait! the gumball is rolling out.");
        }
    }

    void dispenseGumball() {
        if (state == GUMBALL_SOLD) {
            System.out.println("Gumball is roooooooolling out !");
            gumballs -= 1;
            state = NO_QUARTER;
            if(gumballs == 0){
                state = OUT_OF_GUMBALL;
            }

        } else if (state == OUT_OF_GUMBALL) {
            System.out.println("There are no GUMBALL Left... Sorry :(");
        }
    }

}
