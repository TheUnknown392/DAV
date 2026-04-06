namespace ChapterThree{
    public static class StaticClassExample{
        // you can only create static member and methods within static class
        // we can't create an object with static class
        public static int Square(int number = 10){
            return number * number;
        }
    }

    class StaticClass{
        public static void Main(){
            int result = StaticClassExample.Square();
            Console.WriteLine(result);
        }
    }
}
