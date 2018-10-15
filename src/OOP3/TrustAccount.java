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
public class TrustAccount extends BankAccount {
    
    String trusteeName;

    public TrustAccount(String newName, String newTrustee) {
        super(newName);
        trusteeName = newTrustee;
    }
}
