/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
abstract class Person implements Locatable{
    String name;
    int posX;
    int posY;
    
    public Person(String name, int x, int y){
        this.name = name;
        this.posX = x;
        this.posY = y;
    }
    
    public Person(String name){
        this.name = name;
        posX = 0;
        posY = 0;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public int getX(){
        return posX;
    }
    
    @Override
    public int getY(){
        return posY;
    }
    
    @Override
    public void setPos(int x, int y){
        posX = x;
        posY = y;
    }
}
