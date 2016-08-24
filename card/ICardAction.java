package card;

import java.util.UUID;

import terminal.Terminal;

public interface ICardAction {
    void topUp(int amount);
    void tap(Terminal terminal);
}
