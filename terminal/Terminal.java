package terminal;

import java.util.UUID;

public abstract class Terminal implements IPaymentReceiver {
    public UUID id;
    public String address;

    public void receivePayment(UUID cardId ,int amount){
        //TODO implement receive part
        // Check for stolen card
        // decline the transaction if it's stolen
        // otherwise update the balance in the system and store the transaction
        return;
    }
}
