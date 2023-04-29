/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
class EncryptionTwo extends Implementation {

    @Override
    public String encrypt(String s) 
    {
        return "2" + s + "2";
    }

    @Override
    public int encrypt(int i) 
    {
        return (i * 3) + 2;
    }

    //write the necessary code below

}