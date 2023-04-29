/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
class EncryptionOne extends Implementation {

    @Override
    public String encrypt(String s) 
    {
         return new StringBuilder(s).reverse().toString();
    }

    @Override
    public int encrypt(int i) 
    {
        return (i * 2) + 1;
    }

    //write the necessary code below

}
