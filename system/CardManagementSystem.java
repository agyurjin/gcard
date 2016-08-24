package system;

import java.util.List;
import java.util.UUID;

import card.UserCard;
import terminal.Terminal;
import user.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public abstract class CardManagementSystem implements DispatcherInterface {
    private List<UserCard> cards;
    private List<User> registeredUsers;
    private List<Terminal> terminals;

    static File file = null;
    static FileWriter filewriter = null;
    static FileReader filereader = null;
    
    public static void processTransaction(UUID cardId, UUID terminalId, int amount) throws IOException {
        //TODO store each transaction in transactions.txt
   		if(file.exists()){
   			filewriter = new FileWriter(file);
   		} else{
   			file = new File("../transactions.txt");
   		}
   		filewriter.write(cardId + "   " + terminalId + "    " + amount);
    }

    boolean isStolen(UUID cardId){
        // TODO implement
        return false;
    }

    public static void printTransactions() throws IOException {
        System.out.println("Print all transactions from file");
        // TODO load payment transactions and print to console
        if(file.exists()){
        	filereader = new FileReader(file);
        }
        CharBuffer buffer = null;
		filereader.read(buffer);
		System.out.println(buffer);
    }
}
