package com.objectorientedprogramming.day4;
class Features{
    interface FeaturesInfo{
        void mainFeatures();
        void minorFeatures();
       default void bugsFixed(){
           System.out.println("Reported bugs fixed");
       }
    }
}
interface Version{
    void getVersion();
    default boolean isAlpha(){
        return false;
    }
}
interface UDetails{
    void getDetails();
}
class AppInfo implements Version,UDetails,Features.FeaturesInfo{


    @Override
    public void getVersion() {
        System.out.println("v2.2");
    }

    @Override
    public void getDetails() {
        System.out.println("Latest Version");
    }

    @Override
    public void mainFeatures() {
        System.out.println("UI Overhaul");
    }

    @Override
    public void minorFeatures() {
        System.out.println("Added Login through Google");
    }

}
public class InterfaceType2 {
    public static void main(String[] args) {
        AppInfo user =new AppInfo();
        user.getVersion();
        user.getDetails();
        if(!user.isAlpha())
            System.out.println("Stable Release");
        System.out.println("New Features:");
        user.mainFeatures();
        user.minorFeatures();
        user.bugsFixed();
    }
}
