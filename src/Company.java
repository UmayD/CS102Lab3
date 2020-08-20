
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Umay
 */
public class Company implements Locatable {

    private final int EMPLOYEE_CAPACITY = 15;
    private Employee[] employees;
    private ArrayList<Customer> customers;
    private int numOfEmployees = 0;
    private int employeeNo;
    private int packageNo;
    private int posX;
    private int posY;

    public Company(int x, int y) {
        posX = x;
        posY = y;
        employees = new Employee[EMPLOYEE_CAPACITY];
        customers = new ArrayList<Customer>();
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public void setPos(int x, int y) {
        posX = x;
        posY = y;
    }

    public boolean addEmployee(Employee candidate) {
        boolean check = true;
        if (numOfEmployees < employees.length) {
            employees[numOfEmployees] = candidate;
            numOfEmployees++;
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    //adding customers to the arraylist
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //to delete the contract of the employee
    public boolean terminateContract(int employeeIndex) {
        boolean check2 = false;
        Employee[] etempt = new Employee[15];
        if (employeeIndex < employees.length) {
            for (int i = 0; i < employeeIndex; i++) {
                etempt[i] = employees[i];
            }
            for (int k = employeeIndex + 1; k < employees.length; k++) {
                etempt[k] = employees[k];
            }
            etempt = employees;
            check2 = true;
        } else {
            check2 = false;
        }
        return check2;
    }

    //to create delivery and  add job to the available employee
    public boolean createDeliverable(Item sendItem, Customer sender, Customer receiver) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getAvailability()) {
                System.out.println(sendItem);
                employees[i].addJob(sendItem, sender, receiver, packageNo);
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    //to deliver and print the results
    public void deliverPackages() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null)
            employees[i].deliverPackage();
        }
    }

    public String toString() {
        String result, resultDelivery= "";
        result = "Employees: ";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += "-----------------" + employees[i].currentJobs;
                result = result + "\n" + employees[i];
            }
        }
        result = result + "\n" + "Customers: " + "\n" + customers + "\n";
        result = result + "\n" + resultDelivery;
        return result;
    }
}
