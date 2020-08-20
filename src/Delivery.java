/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
abstract class Delivery {
    protected int packageNo;
    protected Customer sender;
    protected Customer receiver;
    
    public Delivery(Customer sender, Customer receiver, int packageNo){
        this.sender = sender;
        this.receiver = receiver;
        this.packageNo = packageNo;
    }
    
    public Customer getSender(){
        return sender;
    }
    
    public Customer getReceiver(){
        return receiver;
    }
    
    public int getPackageNo(){
        return packageNo;
    }
    
    public abstract double getWeight();
}
