namespace ChapterThree{
    class StaticExample{
        public static string name = "Nihal Shrestha";

        public static int Count = 0;
        public StaticExample(){
            Count++;
        }
    }
    
    class Static{
        public static void Main(){
            Console.WriteLine($"name: {StaticExample.name}");
            StaticExample obj1 = new StaticExample();
            StaticExample obj2 = new StaticExample();
            StaticExample obj3 = new StaticExample();
            StaticExample obj4 = new StaticExample();
            StaticExample obj5 = new StaticExample();

            Console.WriteLine(StaticExample.Count);
            
        }
    }
}
