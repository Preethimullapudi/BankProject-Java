package Bank;

import java.util.Scanner;

public class BankMain {


           public static void main(String[] args) {

            System.out.println("Welcome to ABC Bank");

            Scanner sc = new Scanner(System.in);
            System.out.println("Please select the option to continue");
            System.out.println("1. Add customer");
            System.out.println("2. Create new account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Account statement");


            int i = 1;

            Customer customer = new Customer();
            Transactions transactions = new Transactions();

            do {
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        customer.NewCustomer();
                        break;

                    case 2:
                        customer.NewAccount();
                        transactions.Blnz = customer.Blnz;
                        break;

                    case 3:
                        transactions.Deposit();
                        break;

                    case 4:
                        transactions.Withdrawal();
                        break;

                    case 5:
                        transactions.AccntStatement();
                        break;

                    default:
                        System.out.println("Please select a valid option");
                }


            } while (i == 1);
        }
    }


