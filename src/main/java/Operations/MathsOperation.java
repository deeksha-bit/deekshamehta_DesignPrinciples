package Operations;


public class MathsOperation {
    ArithmeticOperation arr=new ArithmeticOperation();
    float ans=0;
    public float calculate(int a, int b, char operation)  {
        switch (operation)
        {
            case '+':
            {
              ans=arr.add(a,b);
              break;
            }
            case '-':
            {
                ans=arr.subtract(a,b);
                break;
            }
            case '*':
            {
               ans=arr.multiply(a,b);
                break;
            }
            case '/':
            {
                return a/b;
            }
            default:
                System.out.println("wrong operator");
                break;
        }
      return ans;
    }}
