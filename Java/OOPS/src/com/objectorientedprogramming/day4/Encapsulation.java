package com.objectorientedprogramming.day4;
class Roster{
    private String name;
    private String type;
    private int HealthPoints;
    private int AttackStrength;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isEmpty() || name == null)
            throw new Exception("Name cannot be empty");
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws Exception{
        if(type.isEmpty() || type == null)
            throw new Exception("Name cannot be empty");
        this.type = type;
    }

    public int getHealthPoints() {
        return HealthPoints;
    }

    public void setHealthPoints(int HealthPoints) throws Exception{
        if(HealthPoints < 0 )
            throw new Exception("Invalid value");
        this.HealthPoints=HealthPoints;
    }

    public int getAttackStrength() {
        return AttackStrength;
    }

    public void setAttackStrength(int AttackStrength) throws Exception {
        if(AttackStrength < 0)
            throw new Exception("Invalid value");
        this.AttackStrength=AttackStrength;
    }
    public void typeinfo(){
        System.out.println(getName());
        System.out.println(getType());
        System.out.println(getHealthPoints());
        System.out.println(getAttackStrength());
    }

}
public class Encapsulation {
    public static void main(String[] args) throws Exception {
    Roster r= new Roster();
        Roster s= new Roster();

//        r.setName("Arthur");
//    r.setType("Saber");
//    r.setAttackStrength(13000);
//    r.setHealthPoints(11000);
//    r.typeinfo();
        s.setName("");
        s.setType("");
        s.setAttackStrength(10000);
        s.setHealthPoints(11000);
        s.typeinfo();

    }
}
