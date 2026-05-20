namespace Four{
    public class AddNumber{
        int a=0, b=0, c=0;

        public AddNumber(int x, int y, int z){
            a = x;
            b = y;
            c = z;
        }
        
        public int add(){
            return a + b + c;
        }
        public int add(int x){
            return x + b + c;
        }
        public int add(int x , int y){
            return x + y + c;
        }
        public int add(int x, int y, int z){
            return x + y + z;
        }  
    }
    public class Polymorphism{
        public static void Main(){
            int a = 1;
            int b = 2;
            int c = 3;

            int x = 30;
            int y = 20;
            int z = 10;
            
            AddNumber addNumber = new AddNumber(1,2,3);
            
            Console.WriteLine($"Sum of {a} {b} {c} is: {addNumber.add()}");
            Console.WriteLine($"Sum of {x} {b} {c} is: {addNumber.add(x)}");
            Console.WriteLine($"Sum of {x} {y} {c} is: {addNumber.add(x,y)}");
            Console.WriteLine($"Sum of {x} {y} {z} is: {addNumber.add(x,y,z)}");
        }
    }
}

