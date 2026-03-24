namespace LabTwo{
    class Calculator{
        static void Main(){
            float a,b;
            int operation;
            do{
                Console.Write("Enter First Number: ");
                try{
                    a = Int32.Parse(Console.ReadLine());
                }catch(Exception e){
                    a = 0;
                }
                
                Console.Write("Enter Second Number: ");
                try{
                    b = Int32.Parse(Console.ReadLine());
                }catch(Exception e){
                    b = 0;
                }

                Console.WriteLine("The options are given below: ");
                Console.WriteLine("    1. Add");
                Console.WriteLine("    2. Subtract");
                Console.WriteLine("    3. Multiply");
                Console.WriteLine("    4. Divide");
                Console.WriteLine("    5. Exit");

                Console.Write("Please insert your choice: ");
                try{
                    operation = Int32.Parse(Console.ReadLine());
                }catch(Exception e){
                    operation = 0;
                }
                
                if(operation == 5) return;
                
                float answer;
                switch(operation){
                case 1:
                    answer = Add(a,b);
                    break;
                case 2:
                    answer = Subtract(a,b);
                    break;
                case 3:
                    answer = Multiply(a,b);
                    break;
                case 4:
                    answer = Divide(a,b);
                    break;
                case 5:
                    return;
                default:
                    Console.WriteLine("Please input number within the given option");
                    continue;
                }
                
                Console.WriteLine($"The answer is: {answer}");
                
                Console.Write("Do you want to continue? y/n: ");
                if(Console.ReadLine() == "n"){
                    operation = 5;
                    Console.WriteLine("Running very complex AI Queries to shutdown the Program...!");
                }
                Console.WriteLine();
            }while(operation != 5);
        }
        
        static float Add(float a, float b){
            return a + b;
        }
        
        static float Subtract(float a, float b){
            return a - b;
        }
        
        static float Multiply(float a, float b){
            return a*b;
        }
        
        static float Divide(float a, float b){
            if(b != 0){
                return a/b;
            }
            return 0;
        }
    }
}
