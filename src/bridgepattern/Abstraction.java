/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
abstract class Abstraction {

    protected Implementation encryption;

    public Abstraction(Implementation encryption)
    {
        this.encryption = encryption;
    }
  public void setEncryption(Implementation encryption) 
  {
        this.encryption = encryption;
    }

    public String encrypt(String s) {

         return encryption.encrypt(s);

    }

    public int encrypt(int i) {

        return encryption.encrypt(i);

    }  

    public abstract void print();

}
