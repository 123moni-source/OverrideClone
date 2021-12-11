
//override the clone() method
class TestClone implements Cloneable{
    int a;
    double b;
    //Clone() is now overridden and is public.
    public Object clone()
    {
        try{
            //call cone in Object.
            return super.clone();
        }catch(CloneNotSupportedException obj)
        {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
class OverrideCone {
    public static void main(String[] args) {
        TestClone x1=new TestClone();
        TestClone x2;
        x1.a=10;
        x2.b=20.98;
        //here,clone is called directly.
        x2=(TestClone)x1.clone();
        System.out.println("x1: "+x1.a+" "+x1.b);
        System.out.println("x2: "+x2.a+" "+x2.b);
    }
}
