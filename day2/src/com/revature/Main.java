package com.revature;
public class Main extends Employee{
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge( int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum( String newId) {
        idNum = newId;
    }

    public static void main(String args[]){
        Main emp = new Main();
        emp.setName("Jimbo");
        emp.setAge(20);
        emp.setIdNum("E123");

        System.out.print("\n Id: " + emp.getIdNum() +"\n Name: " + emp.getName() + "\n Age: " + emp.getAge() + "\n Pass Code: " + emp.sayPassCode());
    }

}

