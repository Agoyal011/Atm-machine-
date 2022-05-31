package com.apnacollege;

import java.util.Scanner;

public class Main extends Account {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Main main=new Main();

        Account account1 = new Account();


        System.out.print("Enter your account number :");

        int accnumber = scan.nextInt();

        System.out.print("Enter your password:");

        int password = scan.nextInt();

        System.out.println("Entered information was right");

        optionMenu();



    }



        public static void optionMenu() {

            System.out.println("Select the option you want to access :");

            System.out.println("Type 1: checking account");

            System.out.println("Type 2: Saving Account");

            System.out.print("Choice: ");

            Scanner scan= new Scanner(System.in);

            int type = scan.nextInt();

            switch (type) {
                case 1:
                    getChecking();
                    break;

                case 2:
                    getSaving();
                    break;



                default:
                    System.out.println("\n" + "Invalid choice" + "\n");

            }
        }


        public static void getChecking()
        {

            System.out.println("Type 1- View balance");
            System.out.println("Type 2- Withdraw funds");
            System.out.println("Type 3- Deposit funds");
            System.out.println("Type 4- Exit or go back ");
            System.out.println("Choice: ");

            Scanner scan = new Scanner(System.in);
            Account account1 = new Account();


            int type = scan.nextInt();


            switch (type) {
                case 1:
                    account1.accCheqbal();

                    break;

                case 2:

                    account1.checkWithDraw();

                    break;

                case 3:

                    account1.depositAmt();

                    break;
                case 4:

                    optionMenu();



                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
        }

        public static void getSaving() {

            System.out.println("Type 1- View balance");
            System.out.println("Type 2- Withdraw funds");
            System.out.println("Type 2- Deposit funds");
            System.out.println("Type 4- Exit or go back to main menu");
            System.out.println("Choice: ");

            Scanner scan=new Scanner(System.in);
            Account account1 = new Account();

            int c = scan.nextInt();

            switch (c) {

                case 1:
                    account1.savaccBal();

                    break;

                case 2:

                    account1.savWithdraw();

                    break;

                case 3:

                    account1.savDeposit();

                    break;
                case 4:

                    optionMenu();

                    break;
            }


        }

    }

























