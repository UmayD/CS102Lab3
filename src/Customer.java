/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Customer extends Person {

    Item currentItem;

    public Customer(String name) {
        super(name);
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item cI) {
        currentItem = cI;
    }

    public boolean sendItem(Company company, Item item, Customer receiver) {
        boolean check = false;
        if (currentItem == null) {
            if(company.createDeliverable(item, this, receiver) == false){
                currentItem = item;
                check = true;
            }
        } else {
            company.createDeliverable(item, this, receiver);
            check = false;
        }
        return check;
    }

    @Override
    public String toString() {
        String result;
        result = "Customer Name:" + name;
        return result;
    }

}
