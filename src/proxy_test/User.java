package proxy_test;

public class User implements IUser{
        
    @Override
    public void forech(){
        for(int i = 0 ; i < 10000000 ; i++){
            new String("sdf");
        }
        System.out.println("Good!");
    }
}