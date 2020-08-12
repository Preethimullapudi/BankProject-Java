package Bank;

import java.util.Scanner;

public class Customer {


        public String Name;
        public int Age;
        public int Aadhar;
        public long AccNo;
        public double Blnz;
        public String Sex;
        public long MobileNo;


        Scanner sc = new Scanner(System.in);
        void NewCustomer() {

            System.out.println("Enter the customer name");
            Name = sc.nextLine();

            System.out.println("Enter the sex of customer: Male/Female/Others");
            Sex = sc.nextLine();

            System.out.println("Enter the age of customer");
            Age = sc.nextInt();
            if(Age < 21) {
                System.out.println("Ineligible");
            }

            System.out.println("Enter customer's Aadhar number");
            Aadhar = sc.nextInt();

            System.out.println("Enter customer's Mobile number");
            MobileNo = sc.nextLong();

            System.out.println("Customer added successfully");
        }

        void NewAccount(){


            System.out.println("Enter the account number");
            AccNo = sc.nextLong();

            System.out.println("Enter the opening account balance");
            Blnz = sc.nextLong();

            System.out.println("Enter the customer name");
            sc.nextLine();
            Name = sc.nextLine();

            System.out.println("Account created successfully");
        }





    }


