package place;

//on a daily basis a shopkeeper merchant wants to deposit as much as indain currecy notes and coins to bank that he has in his locker he hs the following: currency coins:1,2,5,10.currency notes:5,10,20,50,100,200.500.he doesnt know how much coins and notes he has in locker.consider only coins whenamount to deposited<100 else notes.for a given input total count of coins/notes should not exceed 10.write a program to help the merchsntto arrange and rearrange currencies with all the possible combinations
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyCombinations {
    static int[] coins = {1, 2, 5, 10};
    static int[] notes = {5, 10, 20, 50, 100, 200, 500};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        int amount = sc.nextInt();

        if (amount < 100) {
            System.out.println("Possible combinations using coins:");
            findCombinations(coins, amount, new ArrayList<>(), 0);
        } else {
            System.out.println("Possible combinations using notes:");
            findCombinations(notes, amount, new ArrayList<>(), 0);
        }
    }

    private static void findCombinations(int[] denominations, int amount, List<Integer> combination, int start) {
        if (amount == 0 && combination.size() <= 10) {
            System.out.println(combination);
            return;
        }
        if (amount < 0 || combination.size() >= 10) {
            return;
        }
        for (int i = start; i < denominations.length; i++) {
            combination.add(denominations[i]);
            findCombinations(denominations, amount - denominations[i], combination, i);
            combination.remove(combination.size() - 1);
        }
    }
}
