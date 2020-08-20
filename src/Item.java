/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Item {
    double weight;
    String content;
    
    public Item(double weight, String content){
        this.weight = weight;
        this.content = content;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String getContent(){
        return content;
    }
    
    public String toString(){
        String result = "";
        result = "Weight: " + weight + " kg" + "\n" + "Content: " + content; 
        return result;
    }
}
