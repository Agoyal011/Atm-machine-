package com.apnacollege;

import java.util.Scanner;

public class Account {

    static int inibalance=12000;



    public void accCheqbal()
    {
        System.out.println("The initial balance in your account is"+ inibalance);
    }

    public void checkWithDraw() {

        System.out.println("Enter the amount of funds you want to withdraw :");
        Scanner sc = new Scanner(System.in);

        int j = sc.nextInt();

        int remainingb = inibalance - j;

        if (j > 12000) {
            System.out.println("Insufficient balance");

        } else {
            System.out.println("Balance remaining in the account is: " + remainingb);
            System.out.println("Transaction approved");

        }
    }

        public void depositAmt() {

            System.out.println("Enter the amount you want to deposit :");
            Scanner sc1= new Scanner(System.in);
            int k= sc1.nextInt();
            int finbalance=inibalance+k;

            System.out.println("Transaction Approved");
            System.out.println("New balance in the account is :"+ finbalance);
            System.out.println("Thank you");

        }

        public void savaccBal(){

            System.out.println("The current balance in your account is: "+ inibalance);

        }

        public void savWithdraw(){

            System.out.println("Enter the amount of funds you want to withdraw :");
            Scanner scan=new Scanner(System.in);
            int j=scan.nextInt();

            int remainingb = inibalance - j;

            if (j > 12000) {
                System.out.println("Insufficient balance");

            } else {
                System.out.println("Balance remaining in the account is: " + remainingb);
                System.out.println("Transaction approved");

            }

    }

        public void savDeposit(){

            System.out.println("Enter the amount you want to deposit :");
            Scanner sc1= new Scanner(System.in);
            int k= sc1.nextInt();
            int finbalance=inibalance+k;

            System.out.println("Transaction Approved");
            System.out.println("New balance in the account is :"+ finbalance);
            System.out.println("Thank you");

        }



    }





