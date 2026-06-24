public class LibrarySystem{
    class Book{
        String title;
        int publicationYear;

        public Book(String title, int publicationYear){
            this.title = title;
            this.publicationYear = publicationYear;
        }
    }
    class Author extends Book{
        String name;
        String bio;

        public Author(String title, int publicationYear, String name, String bio){
            super(title, publicationYear);
            this.name = name;
            this.bio = bio;
        }

        public void displayInfo(){
            System.out.println("Book Title is: "+ title);
            System.out.println("Book Author is: "+ name);
            System.out.println("Book Publication Year is: "+ publicationYear);
            System.out.println("Author Bio is: "+ bio);
        }
    }
    public void main(String[] args) {
        Author a1 = new Author("Alchemist", 2023, "Sukhrat Dev", "hihihiihihihiihiihiihiihihiihiihhi");
        a1.displayInfo();
    }
}