namespace LearningGenerics{
    public class GenericTwo{
        public void Print<T>(T a, T b){
            List<T> ls = new List<T> {a, b};

            
            foreach (T item in ls){
                Console.WriteLine(item);
            }
            
        }
    }
    public class Program{
        public static void Main(){
            GenericTwo g = new GenericTwo();

            g.Print(10, 12);
        }
    }
}
