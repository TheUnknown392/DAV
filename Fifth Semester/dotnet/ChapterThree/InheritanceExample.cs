namespace ChapterThree{
    public class Animal{
        public int legCount(){
            return 4;
        }
        public string does(){
            return "breathing";
        }
    }
    public class Dog : Animal{
        public string says(){
            return "Woof!";
        }
    }
    public class InheritanceExample{
        static void Main(){
            Dog dog = new Dog();
            Console.WriteLine($"a dog: says {dog.says()} and has {dog.legCount()} legs. It does {dog.does()}");
        }
    }
}
        
