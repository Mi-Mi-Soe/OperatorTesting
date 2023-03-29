package Testing;
abstract class Car{
    public abstract void speed();
}
class SportCar extends Car{
    
    public void speed() {
        System.out.println("Fastest");
    }
}


public class TestOperator {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Testing arithmetic operator
        int num1=10;
        int num2=20;
        int sum=num1+num2;
        int sub=num2-num1;
        System.out.println(num1+"+"+num2+"="+sum);
        System.out.println(num2+"-"+num1+"="+sub);
        
        //Testing unary operator
        int num3=++num1;
        System.out.println(num3);
        
        //Testing relational and logical operator
        if((num2>num1)&&(num2>num3)) 
            System.out.println(num2+" is greatest.");
        
        //Testing Ternary operator
        String msg=(num1>num2)? "num1 is greater than num2":"num2 is greater than num1";
        System.out.println(msg);
        
        //Testing bitwise operator
        int x=5;
        //x=0101
        int y=8;
        //y=1000
        System.out.println("(x & y) = "+(x&y));
        
        //Testing instance of operator
        TestOperator op=new TestOperator();
        System.out.println(op instanceof TestOperator);
        
        //Testing abstract keyword
        SportCar spcar=new SportCar();
        spcar.speed();
        
     
    }

}
