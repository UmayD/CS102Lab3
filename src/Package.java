/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Package extends Delivery{
    Item packedItem;
    
    public Package(Item content, Customer sender, Customer receiver, int packageNo){
        super(sender, receiver, packageNo);
        packedItem = content;
    }
    
    @Override
    public double getWeight(){
        return 2; //change it
    }
    
    @Override
    public String toString(){
        String result;
        result = "Package: " + "Item: " + packedItem + " Sender: " + sender + " Receiver: " +  receiver;
        return result;
    }
}
