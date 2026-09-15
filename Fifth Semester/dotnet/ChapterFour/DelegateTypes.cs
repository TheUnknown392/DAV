namespace ChapterFour{
    
    class MethodCollection{
        public static void PrintText(){
            Console.WriteLine("Action Delegate: PrintMessage");
        }

        public static int Addition(int a, int b){
            return a+b;
        }

    }

    class DelegateTypes{
        static void Main(){
            Action printText = new Action(MethodCollection.PrintText);
                                            // a   b   ret
            Action<int, int, int> add = new Action<int,int,int>(
                MethodCollection.Addition
            );

            printText();
            int result = add(5, 10);

            Console.WriteLine($"Additin: ${result}");
        }
    }
}
