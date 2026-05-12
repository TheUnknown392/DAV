namespace ChapterThree {
    public static class Utility{
        public static void Print<T>(T value){
            Console.WriteLine(value);
        }
    }
    public class GenericExampleOne{
        //public static void Main(){
        //    Utility.Print("Hello");
        //    Utility.Print(12);
        //    Utility.Print(9.7);
        //}
    }
    public static class UtilityTwo{
        public static void Calculate<T>(ref T a, ref T b){
            T temp = a;
            a = b;
            b = temp;
        }
            
    public class GenericExampleTwo{
        public static void Main(){
            int a = 10;
            int b = 20;
            Console.WriteLine($"a: {a}\nb:{b}");
            
            UtilityTwo.Calculate(ref a,ref b);

            Console.WriteLine($"a: {a}\nb:{b}");

            string a1 = "sad";
            string b1 = "happy" ;
            
            Console.WriteLine($"a1: {a1}\nb1:{b1}");
            
            UtilityTwo.Calculate(ref a1,ref b1);

            Console.WriteLine($"a1: {a1}\nb1:{b1}");
        }
    }
 }
}
