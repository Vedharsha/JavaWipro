public class Book extends Author{
    String name;
    double price;
    int qtyInStock;
    Author author;
    Book(String n,Author a,double p,int q){
        name=n;
        price=p;
        qtyInStock=q; 
        author=a; 
    }
    void display(){
            System.out.println("Book details");
            System.out.println("Book name "+name+"\nAuthor "+author.getName()+"\nPrice "+price+"\nQuantity In Stock "+qtyInStock);
   }
    public static void main(String[] args) {
        Author a=new Author("Deva","deva@gmail.com",'M');
        Book b=new Book("Java",a,5000.00,5);
        b.display();
        a.display();
    }
}