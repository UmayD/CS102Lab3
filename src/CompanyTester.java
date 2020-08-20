/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class CompanyTester {

    public static void main(String args[]) {
        Item food = new Item(4.2, "Sarma");
        Item book = new Item(2.3, "Bulantı");
        Item pen = new Item(4, "Kalem");
        Item i1 = new Item(4, "i1");
        Item i2 = new Item(4, "i2");
        Item i3 = new Item(4, "i3");
        Item i4 = new Item(4, "i4");
        Item i5 = new Item(4, "i5");
        Item i6 = new Item(4, "i6");
        Item i7 = new Item(4, "i7");
        Item i8 = new Item(4, "i8");

        Company comp = new Company(0, 0);
        
        Customer c1 = new Customer("c1");
        Customer c2 = new Customer("c2");
        Customer c3 = new Customer("c3");
        
        Employee e1 = new Employee(1, "Eren");
        Employee e2 = new Employee(2, "Berk");

        comp.addEmployee(e1);
        comp.addEmployee(e2);
        
        comp.addCustomer(c1);
        comp.addCustomer(c2);
        comp.addCustomer(c3);

        c1.sendItem(comp, food, c2);
        c2.sendItem(comp, pen, c3); 
        c3.sendItem(comp, book, c1);
        c1.sendItem(comp, i1, c2);
        c1.sendItem(comp, i2, c3);
        c1.sendItem(comp, i3, c2);
        c1.sendItem(comp, i4, c3);
        
        System.out.println(comp);
        comp.deliverPackages();
    }
}