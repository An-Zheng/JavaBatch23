package day3;
class NonIntResultException extends Exception
{
    public NonIntResultException(int a, int b)
    {
        System.out.println( a+" divided by  "+b+" is not an integer");
    }
}

public class Main {
    public static void main(String[] args) {
        byte by = 1;
        short srt = 2;
        int a = 3;
        long b = 4;
        float c = 6;
        double d = 7;
        char e = '9';
        boolean f = true;



        int[] arr1 = {4,8,15};
        int[] arr2 = {2,0,4};
        IntDivison(arr1,arr2);
    }
    public static void IntDivison(int[] arr1, int[] arr2)
    {
        int len = arr1.length;
        int i = 0;
        while(i < len)
        {

            try
            {
                int remainder = arr1[i] % arr2[i];
                if(remainder != 0)
                {
                    throw new NonIntResultException(arr1[i],arr2[i]);
                }

                System.out.println(arr1[i] +"/"+arr2[i] +" is " + (arr1[i]/arr2[i]));
            }
            catch (ArithmeticException e)
            {
                System.out.println ("Division by zero is undefined");
                e.printStackTrace();
                continue;
            }
            catch (NonIntResultException e)
            {
                e.printStackTrace();
            }
            finally {
                i++;
            }

        }
    }
}



