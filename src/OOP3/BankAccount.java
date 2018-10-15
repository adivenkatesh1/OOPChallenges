/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP3;

/**
 *
 * @author Adi Venkatesh
 */
public class BankAccount implements Account, Needs {
   private double balance;
   private String name;
    
    
    public void deposit(double amt){
        
    }
    
    public void withdrawal(double amt){
        
    }
    
    public BankAccount(String newName){
        name = newName;
        balance = 0;
    }
    
    public BankAccount(String newName, double initAmt){
        name = newName;
        initAmt = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName the name to set
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double transfer(double balance, double transfer, double temp, double newBalance){
        newBalance = balance - transfer;
        temp = transfer;
        return newBalance;
    }
    
    public double send(double balance, double pay, double newBalance){
        newBalance = balance - pay;
        return newBalance;
    }

    @Override
    public void setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double transfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double send() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
