using System;

namespace Seven {

    class Animal {
        public void Speak() {
            Console.WriteLine("making noise");
        }

        public void Speak(string sound) {
            Console.WriteLine("Animal says: " + sound);
        }

        public virtual void Move() {
            Console.WriteLine("moving");
        }
    }

    class Dog : Animal {
        public override void Move() {
            Console.WriteLine("running with 4 legs");
        }
    }

    class OverloadingOverriding {
        static void Main() {

            Dog dog = new Dog();

            dog.Speak();
            dog.Speak("Bark");

            dog.Move();
        }
    }
}
