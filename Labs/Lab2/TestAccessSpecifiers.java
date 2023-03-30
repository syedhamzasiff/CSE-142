public class TestAccessSpecifiers {
    public static void main(String[] args) {
        AccessSpecifiers obj1 = new AccessSpecifiers();

        //System.out.println(obj1.privateVar);
        //obj1.privateMethod;

        System.out.println(obj1.protectedVar);
        obj1.protectedMethod();

        System.out.println(obj1.defaultVar);
        obj1.defaultMethod();

        System.out.println(obj1.publicVar);
        obj1.publicMethod();


    }
}
