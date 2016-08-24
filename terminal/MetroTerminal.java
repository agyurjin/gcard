package terminal;

import card.UserCard;

public class MetroTerminal extends Terminal implements Tapable {

    @Override
    public void cardTapped(UserCard card) {
        // how many times card was tapped??? where to store this informantion?
    	if(card.getTapped()%2 == 1){
    		System.out.println("Entered to terminal");
    	} else {
    		System.out.println("Exit from terminal");
    	}
    }
}
