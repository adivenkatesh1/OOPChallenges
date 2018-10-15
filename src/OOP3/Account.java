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
public interface Account {
   
    public void deposit(double amt);
    public void withdrawal(double amt);
    public double getBalance();
}
