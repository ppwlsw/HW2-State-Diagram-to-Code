//6510450658 Pinpawat Limsuwat

public class Main {
    public static void main(String[] args) {
        int n = 10;
        GumballMachine gumballMachine = new GumballMachine(n);

        for (int i = 0; i <= n ; i++){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrack();
        }

        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();

    }
}
