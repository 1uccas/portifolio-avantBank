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
public class UserInput {
    String name;
    private String surname;
    private String CPF;
    
    public UserInput(){
        
    }
    
    public UserInput(String name, String surname, String CPF){
        this.name = name;
        this.surname = surname;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void InsertData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("$ Enter your Name:");
        this.name = scanner.next();
        this.setName(name);
        
        System.out.println("$ Enter your Surname:");
        this.surname = scanner.next();
        this.setSurname(surname);
        
        System.out.println("$ Enter your CPF (only numbers):");
        this.CPF = scanner.next();
        this.setCPF(CPF);
    }
    
}
