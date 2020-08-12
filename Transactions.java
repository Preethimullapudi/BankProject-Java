package Bank;

import java.util.Scanner;

public class Transactions {

        public long Accno;
        public  double Blnz;
        public double Damount;
        public double Wamount;
        public String date ;
        public String message = "";

        Scanner sc = new Scanner(System.in);

        void  Deposit(){
            System.out.println("Enter today's date");
            date = sc.next();
            System.out.println("Enter the amount to be Deposited");
            Damount = sc.nextDouble();
            if(Damount <= 0)
                System.out.println("Cannot process the transaction");
            else {
                System.out.println("Amount deposited is : " +Damount);
                Blnz = Blnz + Damount;
                System.out.println("Credit is successfull");
                System.out.println("Current balance is : " +Blnz);
                message = message + " Credited amount of " +Damount + " on " + date + ",";
            }


        }
        void Withdrawal(){
            System.out.println("Enter today's date");
            date = sc.next();

            System.out.println("Enter the amount to be Withdrawn");
            Wamount = sc.nextDouble();
            if(Wamount <= 0 || Wamount > Blnz )
                System.out.println("Cannot process the transaction");
            else {
                System.out.println("Amount withdrawn is:" +Wamount);
                Blnz = Blnz - Wamount;
                System.out.println("Debit is successfull");
                System.out.println("Current balance is : " +Blnz);
                message = message + " Debited amount of " +Wamount + " on " +date + ",";
            }


        }

        void AccntStatement(){
            System.out.println(" ACCOUNT STATEMENT ");
            System.out.println(" Transactions ");
            System.out.println(message);
            System.out.println(" Available balance is : " +Blnz);
        }

    }


