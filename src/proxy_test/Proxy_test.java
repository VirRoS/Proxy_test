package proxy_test;

import java.lang.reflect.Proxy;

public class Proxy_test {


    public static void main(String[] args) {

        User user = new User();
        
        IUser userProxy = (IUser) Proxy.newProxyInstance(
                User.class.getClassLoader(),
                User.class.getInterfaces(),
                new SomeInvocationHandler(user));
        userProxy.forech();
        
        userProxy.myName("Tom");
    }
}
