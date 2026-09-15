namespace ChapterFour{
    /*
      ## Anonymous Method
      - A method which doesn't contain any name which is interoduced in C# 20
      - Usefull when user wants to create an inline method & also pass parameters in the anonymous method like other methods.
      - An anonymous method is defined using the delegate keyword & the user can assign this method to a variable of the delegate type
    */

    public delegate void PrintDel(int value);
    public class AnonymousMethod{
        // public static void ExampleMethod(int val){
        //     Console.WriteLine($"Inside Anonymous Method. Value = {val}");
        // }
        static void  Main(){
            // PrintDel print = ExampleMethod;
            PrintDel print = delegate (int val){
                Console.WriteLine($"Inside Anonymous Method, Value = {val} ");
            };
            print(1000);
        }
    }
}
