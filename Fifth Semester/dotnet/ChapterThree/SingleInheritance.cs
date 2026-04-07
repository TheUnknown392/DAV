namespace ChapterThree{
    class Vehicle{
        public int Speed{get; set;}

        public void Start(){
            Console.WriteLine("Vehicle started");
        }
            
    }
    class Car : Vehicle{
         public string? Model {get; set;}
         
         public void Drive(){
             Console.WriteLine($"Driving the {Model} at {Speed} km/h");
         }
    }

    class SingleInheritance{
        
        static void Main(){
            Car car = new Car();
            car.Model = "Toyota";
            car.Speed = 60;

            car.Start();
            car.Drive();
        }
    }
}

     
       
