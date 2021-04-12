package com.corejava.day3.constructors;

class Members {
    private int gen;
    private String name;
    private boolean isHuman;
    private String subs;
    public Members(){

    }
    public Members(int gen, String name, boolean isHuman,String subs) {
        this.gen = gen;
        this.name = name;
        this.isHuman = isHuman;
        this.subs="1.1M";
        System.out.println(gen+" "+name+" "+isHuman+" "+subs    );
    }
    public Members(Members obj,String subs){
        this.gen= obj.gen;
        this.name= obj.name;
        this.isHuman= obj.isHuman;
        this.subs=obj.subs;
        System.out.println(gen+" "+name+" "+isHuman+" "+subs);
    }

    public static void main(String[] args) {
        Members m1 =new Members();
        m1.gen=1;
        m1.name="Fubuki";
        m1.isHuman=false;
        m1.subs="1.2M";
        Members m2 =new Members(1,"Haato",true,"1.1M");
        Members m3=new Members(m2,"1.3M");

    }
}
