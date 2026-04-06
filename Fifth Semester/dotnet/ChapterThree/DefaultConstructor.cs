namespace ChapterThree{
    class Book{
        public string name;

        public Book(){
            this.name = "Three body problem";
            Console.WriteLine($"Book: {this.name}");
        }
    }

    class DefaultConstructor{
        static void Main(){
            Book book = new Book(); // Constructor gets called automatically

            Console.WriteLine($"From Main: {book.name}");
        }
    }
}
                              
