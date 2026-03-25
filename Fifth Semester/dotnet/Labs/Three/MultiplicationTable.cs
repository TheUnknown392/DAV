namespace Three{
    class MultiplicationTable{
        static void Main(){
            Console.Write("How much multiplication table do you want? ");
            int tableSize;

            try {
                tableSize = Int32.Parse(Console.ReadLine() ?? "0");
            }catch(Exception){
                tableSize = 0;
                Console.WriteLine("0*0 = 0");
                return;
            }

            if(tableSize < 0){
                tableSize *= -1;
            }
            
            for(int i = 1; i<=tableSize; i++){
                Console.Write($"\t{i}");
            }
            
            Console.WriteLine();
            for(int i = 1; i<=tableSize; i++){
                Console.Write("---------");
            }
            Console.WriteLine();
            
            for(int i = 1; i<=tableSize; i++){
                Console.Write($"{i}|\t");
                for(int j = 1; j<=tableSize; j++){
                    int ans = i*j;
                    Console.Write($"{ans}\t");
                }
                Console.WriteLine();
            }
        }
    }
}
                
