namespace ChapterThree{
    class IndexerClass{
        private string[] data = new string[10];
        // Indexer
        public string this[int index]{
            get { return data[index];}
            set { data[index] = value;}
        }
     }

    class Indexer{
        public static void Main(){
            IndexerClass collection = new IndexerClass();
            collection[0] = "Hello";
            collection[1] = "World";
            collection[2] = "Nihal";
            collection[3] = "Shrestha";
            for(int i = 0; i < 4; i++){
                Console.WriteLine($"Indexer fvalue at index {i} is {collection[i]}");
            }
        }
    }
}
