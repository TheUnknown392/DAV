namespace ChapterThree{
    class Animal{
        public string name;

        public Animal(){
            this.name = "Hippotangus";
        }
        
        public void CallAnimal(){
            Console.WriteLine($"Calling animal: {name}");
        }
    }
    
    class ConstructoreExample{
        static void Main(){
            Animal animal = new Animal();
            animal.CallAnimal();
        }
    }
}
