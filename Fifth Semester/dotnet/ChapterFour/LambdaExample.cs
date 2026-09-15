namespace ChapterFour{
    /*
      ## Lambda Expression
      - Lambda in C# are used like anonymous functions, with the difference that in Lambda, you don't need to specify the type of the value that you input thus making it more flexible to use.
      - The "=>" is the lambda operator which is used in all lambda expression
      ### Two Types:
      - Expression Lambda:
          input => expression
      - Statement Lambda:
          input => { Statements };
    */
    public class LambdaExamples{
        // total
        
        public static void Main(){
            // Even number checker
            var isEven = (int num) => num%2==0;
            Console.WriteLine($"is even: {isEven(10)}");

            // Name Formatter
            var nameFormatter = (bool male, string first, string second) => {
                string gender = male ? "Mr." : "Ms.";
                return $"{gender} {first} {second}";
            };
            Console.WriteLine($"name: {nameFormatter(true, "Prajwal", "Maharjan")}");
            
            // Expression lambda
            var square = (int num) => num * num;
            Console.WriteLine($"Square number: {square(5)}");

            // Statement Lambda
            var resultingSum = (int a, int b) => {
                return a + b;
            };
            
            Console.WriteLine($"summed number: {resultingSum(10,10)}");

            int[]  numbers = {2, 13, 1, 3, 25, 13};
            int totalCount = numbers.Count((c) => c == 1);
            Console.WriteLine($"total count: {totalCount}");
        }
    }
}
