class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String title){
        this.title=title;
        author="unknow";
    }
    void displayDetail(){
        System.out.println("Title: "+title+"Author: "+author);
    }
}
class task2{
    public static void main(String [] args){
        Book book1=new Book("The Hobbit ","harishan");
        book1.displayDetail();
        Book book2=new Book("the Book ");
        book2.displayDetail();
    }
}