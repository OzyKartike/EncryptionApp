/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author kartc
 */
class Message extends Abstraction
{
    private String[] messages;
    public Message(Implementation encryption, String[] messages) 
    {
        super(encryption);
        this.messages = messages;
    }
    @Override
    public void print() 
    {
        //for (String message : messages)\
        for(int x = 0; x < messages.length ;x++ )
        {
            System.out.print(encrypt(messages[x]) + " ");
        }
        System.out.println(" ");
    }

}
