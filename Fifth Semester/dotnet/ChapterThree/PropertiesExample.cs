namespace ChapterThree{
    class PropertiesExample{
        private string name;

        public string Name{
            get{
                return name;
            }
            set{
                name = value;
            }
        }
        // Auto Implemented propertied
        public int Age {get; set;}
    }
    class Add{
        public int A{get; set;}
        public int B{get; set;}
        
        public int Sum(){
            return this.A + this.B;
        }
    }

    class Properties{
        static void Main(){
            PropertiesExample prop = new PropertiesExample();
            prop.Name = "Nihal";
            prop.Age = 27;
            Console.WriteLine($"{prop.Name}: {prop.Age}");
            
            Add add = new Add();
            add.A = 10;
            add.B = 11;
            
            Console.WriteLine($"Addition: {add.Sum()}");
            
            
            
        }
    }
}
