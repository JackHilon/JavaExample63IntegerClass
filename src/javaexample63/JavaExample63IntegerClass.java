
package javaexample63;


public class JavaExample63IntegerClass {

    
    public static void main(String[] args) {
        
        int a=5, b=7;
        System.out.println("Sum ("+a+" , "+b+") is: "+ Sum(a, b));
        
        int[] numbers=new int[] {1,2,3,4,5};
        System.out.println("Array is....");
        
        
        // PrintIntegerArray(numbers);     // <---- illigal
        // int[] type can not be converted to Integer[] type
        
        System.out.println();
        System.out.println();
        
        Integer[] arrA= new Integer[5];
        arrA[0]=new Integer(111);
        arrA[1]=new Integer(10);
        arrA[2]=new Integer(20);
        arrA[3]=new Integer(30);
        arrA[4]=new Integer(40);
        
        System.out.println("Your array: ");
        PrintIntegerArray(arrA);
        
        System.out.println("-----");
        System.out.println("Sum over array is: "+Sum(arrA));
        
        System.out.println("-----");
        System.out.println("Array after change (1)....");
        Integer e1 =new Integer(22);
        ChangeIntegerArrayElement(arrA, e1, 2);
        PrintIntegerArray(arrA);
        
        System.out.println("-----");
        System.out.println("Array after change (2)....");
        Integer e2 =null;
        ChangeIntegerArrayElement(arrA, e2, 3);
        PrintIntegerArray(arrA);
        
        System.out.println("-----");
        System.out.println("Array after change (3)....");
        Integer m = new Integer("1234");
        Integer e3 =m;
        ChangeIntegerArrayElement(arrA, e3, 3);
        PrintIntegerArray(arrA);
        System.out.println("m number is: "+m.intValue());
        
        System.out.println("-----");
        System.out.println("Array after change (4)....");
        m = new Integer("0"); // Remark that arrA[3] is not changed!!!!!
        PrintIntegerArray(arrA);
        System.out.println("m number is: "+m.intValue());
        
        System.out.println("-----");
        System.out.println("Array after change (5)....");
        ChangeIntegerArrayElement(arrA, new Integer(12121212), 3);
        PrintIntegerArray(arrA);
        System.out.println("m number is: "+m.intValue());
        
        System.out.println("===============");
        System.out.println("New array is created......");
        Integer[] arrB=new Integer[] {new Integer(12), new Integer(13),
            new Integer(14), new Integer(15)};
        
        PrintIntegerArray(arrB);
    }
    
    private static Integer Sum(Integer num1, Integer num2)
    {
        return num1+num2;
    }
    
    private static int Sum(Integer[] array)
    {
        int res=0;
        
        for (int i = 0; i < array.length; i++) {
            res=res+array[i].intValue();
        }
        
        return res;
    }
    
    private static void ChangeIntegerArrayElement(Integer[] array, Integer element, int index)
    {
        if(array==null || index<0 || index >= array.length)
            return;
        array[index]=element;
    }
    
    private static void PrintIntegerArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
