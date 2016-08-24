package card;

import java.util.UUID;

import terminal.Terminal;


public class UserCard implements Payable, ICardAction {
    private UUID id;
    int balance;
    static int tapped;
 
    @Override
    public void doPayment(int amount) {
        balance -= amount;
        System.out.println("Paid amount " + amount);
        System.out.println("New balance " + balance);
    }

	@Override
	public void topUp(int amount) {
		this.balance += amount;
	}

	@Override
	public void tap(Terminal terminal) {
		// no need of terminal
		tapped++;
		
	}
	
	public int getTapped(){
		return tapped;
	}
}
