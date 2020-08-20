/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Mail extends Delivery {
    String content;
    
    public Mail(String content, Customer sender, Customer receiver, int packageNo){   
        super(sender, receiver, packageNo);
        this.content = content;
    }
    
    @Override
    public double getWeight(){
        return 0.1;
    }
    
    @Override
    public String toString(){
        String result;
        result = "Mail: " + "Content: " + content + " Weight: " + getWeight() + " Sender: " + sender + " Receiver: " +  receiver;
        return result;
    }
    
}
