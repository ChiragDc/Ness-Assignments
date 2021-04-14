package com.objectorientedprogramming.day4;
class InsufficientPrivilegeException extends RuntimeException {
    InsufficientPrivilegeException() {
        System.out.println("You do not have enough access to modify the data");
    }
    public void customMessage(String msg){
        System.out.println(msg);
    }
}
class InvalidUserException extends RuntimeException{
    InvalidUserException(){
        System.out.println("Invalid User. Please Log in");
    }
}
class Data{
    String message="No changes made to file";
    public void getFileInfo(String user){
        if(user=="Admin" || user =="Guest")
            System.out.println(message);
        else{
            try {
                throw new  InvalidUserException();
            }catch (InvalidUserException e){

            }}

    }
    public void setFileInfo(String user,String message){
        if(user=="Admin"){
            this.message=message;
        }
        else if(user=="Guest"){
            try {
                throw new  InsufficientPrivilegeException();
            }catch (InsufficientPrivilegeException e){
                e.customMessage("Please log in as Admin if you are admin");
            }}
    }
}
public class ExceptionExamples {
    public static void main(String[] args) {
        Data user=new Data();
        user.getFileInfo("Guest");
        user.getFileInfo("Admin");
        user.setFileInfo("Guest","Added new data");
        user.setFileInfo("Admin","Added new Data");
        user.getFileInfo("Admin");
    }
}
