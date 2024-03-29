/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
public class BridgePattern {

    public static void main(String[] args) {

       Abstraction a1 = new UserProfile(new EncryptionOne(), "john", 5);

       a1.print(); String[] arr = {"hello", "world"};

       Abstraction a2 = new Message( new EncryptionOne(), arr );

       a2.print();

      

       a1.setEncryption(new EncryptionTwo()); a1.print();

       a2.setEncryption(new EncryptionTwo()); a2.print();

    }

}