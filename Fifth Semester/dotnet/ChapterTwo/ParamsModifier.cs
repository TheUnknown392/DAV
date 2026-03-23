namespace Chapter2{
    class ParamsModifier{
        // parms allows for a variable number of arguments
        // parms = variable argument
        static int Sum (params int[] numbers){
            int total = 0;
            foreach(int num in numbers){
                total += num;
            }
            return total;
        }
        static void Main(){
            Console.WriteLine(Sum(1,2,3));
            Console.WriteLine(Sum(10,20,30,40));
            Console.WriteLine(Sum());
        }
    }
}
