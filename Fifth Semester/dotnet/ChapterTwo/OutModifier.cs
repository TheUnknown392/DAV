namespace Chapter2{
    class OutModifier{
        static void MultipleReturnMethod(out int number, out string message){
            number = 10;
            message = "Hello from Method with out";
        }
        static void Main(){
            int num;
            string message;
            
            MultipleReturnMethod(out num, out message);
            
            Console.WriteLine($"Number: {num}");
            Console.WriteLine($"Message: {message}");
        }
    }
}
