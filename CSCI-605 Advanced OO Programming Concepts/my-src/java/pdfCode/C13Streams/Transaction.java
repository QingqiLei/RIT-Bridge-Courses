package C13Streams;

import C10IO.tokenMath.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Transaction {
    int id = 0;
    String type = "";
    static final String GROCERY = "f1";
    int value = 0;
    String getType(){
        return type;
    }
    int getValue(){
        return value;
    }

    int getId(){
        return id;
    }

    public Transaction() {}

    public Transaction(int id, String type, int value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }



    public static void main(String[] args) {
        List<Transaction> groceryTransactions = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(11, "f1", 100));
        for(Transaction t: transactions)
            if(t.getType() == Transaction.GROCERY)
                groceryTransactions.add(t);
        Collections.sort(groceryTransactions, (a,b)->(a.value - b.value));

        List<Integer> transactionIds = new ArrayList<>();
        for(Transaction t : groceryTransactions) transactionIds.add(t.getId());



        List<Integer> transactionIds1 = transactions.stream()
                .filter(t->t.getType() == Transaction.GROCERY)
                .sorted(comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(toList());
    }
}


