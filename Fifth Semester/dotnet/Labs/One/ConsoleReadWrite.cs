namespace LabOne{
    class ConsoleReadWrite{
        static void Main(){
            // The read 
            Console.Write("What ASCII value do you want to know? "); 
            int character = Console.Read(); // This reads a single character and returns its ASCII value in int.
            string str = Console.ReadLine() ?? "";// This reads the input buffer until new line is encountered.
            Console.WriteLine($"The ASCII value of {(char) character} is {character}. And the rest of the input was `{str}`");            
        }
    }
}
