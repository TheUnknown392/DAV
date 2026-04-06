namespace ChapterThree{
    class Movie{
        public string name;
        public string genre;

        public Movie(string name, string genre){
            this.name = name;
            this.genre = genre;
        }
        
        public void PrintMovie(){
            Console.WriteLine($"Movie: {this.name}.\nGenre: {this.genre}");
        }
    }
        
    class ParameterizedConstructor{
        static void Main(){
            Movie movie = new Movie("Harry Potter And The Philosopher's Stone", "Fiction");
            movie.PrintMovie();
        }
    }
}
