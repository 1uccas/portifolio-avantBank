/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciabanco;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class BankingOperations{
    private double MyCash = 545.78;
    
    public BankingOperations(){
        
    }
    
    public double getMyCash() {
        return MyCash;
    }

    public void setMyCash(double MyCash) {
        this.MyCash = MyCash;
    }
    
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            System.out.println("   _____                            __    __________                  __    \n" +
            "  /  _  \\  ___  _______     ____  _/  |_  \\______   \\_____     ____  |  | __\n" +
            " /  /_\\  \\ \\  \\/ /\\__  \\   /    \\ \\   __\\  |    |  _/\\__  \\   /    \\ |  |/ /\n" +
            "/    |    \\ \\   /  / __ \\_|   |  \\ |  |    |    |   \\ / __ \\_|   |  \\|    < \n" +
            "\\____|__  /  \\_/  (____  /|___|  / |__|    |______  /(____  /|___|  /|__|_ \\\n" +
            "        \\/             \\/      \\/                 \\/      \\/      \\/      \\/");
            System.out.println("A ~ CONSULTAR SALDO\nB ~ DEPOSITO\nc ~ SAQUE\nD ~ SAIR(X)");
            String option = scanner.next().toUpperCase();
            
            switch(option){
                case "A":
                    this.myBalance();
                    System.out.print ('\u000C');
                    break;
                case "B":
                    this.Bankdeposit();
                    System.out.print ('\u000C');
                    break;
                case "C":
                    this.Bankwithdrawal();
                    System.out.print ('\u000C');
                    break;
                case "D":
                    System.out.println("$ GoodBye 😪");
                    System.exit(0);
                    break;
                default:
                    System.out.println("$ error 404");
                    System.out.print ('\u000C');
            }
        }
        
    }
    
    public double Bankdeposit(){ // + mais
        Scanner scanner = new Scanner(System.in);
        
        double cash = this.MyCash;
        
        try {
            System.out.println("$ Quanto deseja Depositar?");
            float deposito = scanner.nextFloat();
            
            if (deposito <= 0) {
                System.out.println("$ Deposito invalido!");
            }else{
                float soma = (float) (cash + deposito);
                setMyCash(soma);
                System.out.println("$ Deposito feito!");
                return soma;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("$ Invalid Option ~ "+e);
        }
        
        return 0;
    }
    
    public double Bankwithdrawal(){ // - menos
        Scanner scanner = new Scanner(System.in);
        
        double cash = this.MyCash;
        
        try {
            System.out.println("Quanto deseja retirar/sacar?");
            float saque = scanner.nextFloat();

            if(saque > cash || saque <= 0){
                System.out.println("$ Saque invalido!");
            }else{
                float subtracao = (float) cash - saque;
                setMyCash(subtracao);
                System.out.println("$ Saque feito!");
                return subtracao;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("$ Invalid Option ~ "+e);
        }
        return 0;
    }
    
    public void myBalance(){
        System.out.printf("$ This your balance ~ R$ %.2f\n",this.getMyCash());
    }
}
