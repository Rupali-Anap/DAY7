package GamblingSimulator;

public class Gambler {

        public static void main(String args[]) {
            //Initialise
            int stake=100;
            int bet=1;
            // stake=stake-bet;
            while(stake>=0) {

                System.out.println(stake);
                stake=stake-bet;
            }

        }


}
