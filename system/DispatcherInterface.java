package system;

import javax.smartcardio.Card;

import card.UserCard;

import java.util.Date;


public interface DispatcherInterface {
    public UserCard issueNewCard(Date date);
}
