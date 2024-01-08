import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SplitwiseService splitwiseService = new SplitwiseService();
        User user1 = new User("id1", "Bob", "bob@gmail.com", 9922828);
        User user2 = new User("id2", "Alex", "alex@gmail.com", 9922838);
        User user3 = new User("id3", "Harshit", "harshit@gmail.com", 9932838);
        User user4 = new User("id4", "Zade", "zade@gmail.com", 9924838);

        splitwiseService.addUser(user1);
        splitwiseService.addUser(user2);
        splitwiseService.addUser(user3);
        splitwiseService.addUser(user4);

        Expense expense1 = new EqualSplitExpense(user1, 100, Arrays.asList(user3, user2, user4));
        splitwiseService.addExpense(expense1);
        user1.showBalance();
        user2.showBalance();
        user3.showBalance();
        user4.showBalance();

        System.out.println("------------------");

        Map<User, Double> percentMap = new HashMap<>();
        percentMap.put(user1, 10.0);
        percentMap.put(user4, 90.0);
        Expense expense2 = new PercentSplitExpense(user2, 100, percentMap);
        splitwiseService.addExpense(expense2);


        user1.showBalance();
        user2.showBalance();
        user3.showBalance();
        user4.showBalance();
        System.out.println("------------------");
        Map<User, Double> exactMap = new HashMap<>();
        exactMap.put(user1, 15.0);
        exactMap.put(user4, 85.0);
        Expense expense3 = new ExactSplitExpense(user3, 100, exactMap);
        splitwiseService.addExpense(expense3);

        user1.showBalance();
        user2.showBalance();
        user3.showBalance();
        user4.showBalance();

        List<Expense> expenses = splitwiseService.getExpenses();
        System.out.println(expenses);
    }
}