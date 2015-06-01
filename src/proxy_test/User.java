package proxy_test;

public class User implements IUser{
        
    @Override
    public void forech(){
        for(int i = 0 ; i < 10000000 ; i++){
           
        }
        System.out.println("Good!");
    }
    
    @Override
    public void myName(String name){
        System.out.println("My name is "+name);
    }
}