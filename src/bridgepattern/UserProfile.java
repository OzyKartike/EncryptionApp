/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
class UserProfile extends Abstraction {

    private String name;
    private int id;

    public UserProfile(Implementation encryption, String name, int id)
    {
        super(encryption);
        this.name = name;
        this.id = id;
    }

    @Override
    public void print() 
    {
        System.out.println(encrypt(name) +" " +encrypt(id));
       // System.out.println("ID: " + encrypt(id));
    }

}
