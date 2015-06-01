package proxy_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SomeInvocationHandler implements InvocationHandler {
    private Object obj;

    public SomeInvocationHandler(Object f1){
        obj = f1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
        try{
            int i = 0;

            for(Object a : args){
                if(a.getClass() == String.class){
                    args[i] = "¯\\_(ツ)_/¯";
                }
                i++;
            }
        }
        catch(Exception e){
            
        }
        
        long a = System.nanoTime();
        Object o = method.invoke(obj, args);
        long b = System.nanoTime();
        
        System.out.println("Time Method : " + (b-a));
        return o;
    }
}
