package card;

import java.io.IOException;

import system.CardManagementSystem;
import terminal.MetroTerminal;

public class GamprCard {
    public static void main(String ... args) throws IOException {
        // loadTerminalsAndCards()
        // example usage
        UserCard card = new UserCard();
        MetroTerminal terminal = new MetroTerminal();
        terminal.cardTapped(card);

        CardManagementSystem.printTransactions();
        while (true) {
            //String text = read from console; goggle - reading from command line
            // travel from station 1 to station 4

            //if (inputMsg.equals("printTransaction"))
            // printTransaction

            // exit

            // issue card

            // new user
        }
    }
}
