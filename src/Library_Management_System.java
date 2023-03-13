import java.util.Scanner;

class Books
    {
        String BookName;
        String AuthorName;
        String PubName;
        int ISBNNo;
        Books()
        {
            BookName="";
            AuthorName="";
            PubName="";
            ISBNNo=ISBNNo;
        }
    }
    class Library {
        Scanner sc = new Scanner(System.in);
        Books[] book = new Books[50];
        
      // ADD BOOK
        
        void AcceptBookDetails(int n)
        {
            for(int i=0;i<n;i++)
            {
                book[i] = new Books();
                System.out.println("\nEnter book "+(i+1)+" details");
                System.out.println("\nEnter the book name:");
                book[i].BookName=sc.nextLine();
                System.out.println("\nEnter the authors name:");
                book[i].AuthorName=sc.nextLine();
                System.out.println("\nEnter the ISBN number:");
                book[i].ISBNNo=sc.nextInt();
                System.out.println("\nEnter the publication name:");
                book[i].PubName=sc.nextLine();
                book[i].PubName=sc.nextLine();
            }
        }
        
        // DISPLAY BOOKS AVAILABLE IN THE LIBRARY
        
        void DisplayBookDetails(int n)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println("\nBook "+(i+1)+" details : \n");
                System.out.println("Book Name: "+book[i].BookName);
                System.out.println("Author name: "+book[i].AuthorName);
                System.out.println("ISBN: "+book[i].ISBNNo);
                System.out.println("Publication number: "+book[i].PubName);
            }
        }
        
        // SEARCHING A BOOK BY ISBN NUMBER USING LINEAR SEARCH

        void searchByISBN(int n) {
            System.out.println("\nEnter ISBN number : ");
            int isbn = sc.nextInt();
            for(int i =0;i<n;i++) {
                if(book[i].ISBNNo==isbn) {
                    System.out.println("\nThe book is found at index "+(i+1)+"\nBook name : "+
                            book[i].BookName+"\nAuthor's Name : "+book[i].AuthorName+"\nPublication Name : "
                            +book[i].PubName);
                    return;
                }
            }
            System.out.println("Book not found!\n");


        }

        // SEARCHING A BOOK BY AUTHOR NAME USING LINEAR SEARCH
        
        void searchByAuthor(int n) {
        	int x=0;
            System.out.println("\nEnter author's name : ");
            String an = sc.next();
            for(int i=0;i<n;i++) {

                if(book[i].AuthorName.contains(an)) {
                    x++;
                    if(x==1) {
                        System.out.println("\nBooks written by "+an+" are : ");
                    }
                    System.out.println(book[i].BookName);
                }
            }
            if(x==0) {
                System.out.println("No books found !\n");
            }
        }
        
        // SORTING BOOKS BY ISBN NUMBER

        void sortByISBN(int n) {
        	if(book[0]==null) {
				System.out.println("Library is empty");
				return;
			}

        	for(int i=0;i<n-1;i++){
				for(int j=0;j<=n-i-1;j++) {
                if(book[i].ISBNNo>book[i+1].ISBNNo) {
                	int temp=book[i].ISBNNo;
                	book[i].ISBNNo=book[i+1].ISBNNo;
                	book[i+1].ISBNNo=temp;
                    }
                }

            }
        
            for(int i=0;i<n;i++) {
                System.out.print(book[i].BookName+" : "+book[i].ISBNNo+" \n");
            }

        }
    }
    public class Library_Management_System
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int choice,k=1,n = 0;
            Library ob = new Library();
            while(k!=0) {
                System.out.println("Enter the number of operation you want to perform:");
                System.out.println("1. Accept the book details");
                System.out.println("2. Display the book details");
                System.out.println("3. Enter ISBN number to search a book");
                System.out.println("4. Search an author and find all his/her books");
                System.out.println("5. Sort books by ISBN number\n");
                choice=sc.nextInt();
                switch(choice) {

                    case 1:
                        System.out.println("\nEnter the number of books:");
                        n= sc.nextInt();
                        ob.AcceptBookDetails(n);
                        break;

                    case 2:
                        ob.DisplayBookDetails(n);
                        break;

                    case 3:
                        ob.searchByISBN(n);
                        break;
                    case 4:
                        ob.searchByAuthor(n);
                        break;
                    case 5:
                        ob.sortByISBN(n);
                }

                System.out.println("\nDo you wish to continue? \nPress 1 to continue and 0 to exit\n");
                k = sc.nextInt();
                if(k==0)
                {
                    System.out.println("\nTHANK YOU !\n");
                    System.out.println("**** END OF PROGRAM ****\n");
                }
            }
        }
    }
    
//    *** OUTPUT ***
//
//    Enter the number of operation you want to perform:
//    1.Accept the book details
//    2.Display the book details
//    3.Enter ISBN number to search a book
//    4.Search an author and find all his/her books
//    5.Sort books by ISBN number
//
//    1
//
//    Enter the number of books:
//    2
//
//    Enter book 1 details
//
//    Enter the book name:
//    Twisted
//
//    Enter the authors name:
//    Anna Huang
//
//    Enter the ISBN number:
//    55
//
//    Enter the publication name:
//    Pearson
//
//    Enter book 2 details
//
//    Enter the book name:
//    Verity
//
//    Enter the authors name:
//    Collen Hoover
//
//    Enter the ISBN number:
//    32
//
//    Enter the publication name:
//    Penguin
//
//    Do you wish to continue? 
//    Press 1 to continue and 0 to exit
//
//    1
//    Enter the number of operation you want to perform:
//    1.Accept the book details
//    2.Display the book details
//    3.Enter ISBN number to search a book
//    4.Search an author and find all his/her books
//    5.Sort books by ISBN number
//
//    2
//
//    Book 1 details : 
//
//    Book Name: Twisted
//    Author name: Anna Huang
//    ISBN: 55
//    Publication number: Pearson
//
//    Book 2 details : 
//
//    Book Name: Verity
//    Author name: Collen Hoover
//    ISBN: 32
//    Publication number: Penguin
//
//    Do you wish to continue? 
//    Press 1 to continue and 0 to exit
//
//    1
//    Enter the number of operation you want to perform:
//    1.Accept the book details
//    2.Display the book details
//    3.Enter ISBN number to search a book
//    4.Search an author and find all his/her books
//    5.Sort books by ISBN number
//
//    3
//
//    Enter ISBN number : 
//    55
//
//    The book is found at index 1
//    Book name : Twisted
//    Author's Name : Anna Huang
//    Publication Name : Pearson
//
//    Do you wish to continue? 
//    Press 1 to continue and 0 to exit
//
//    1
//    Enter the number of operation you want to perform:
//    1.Accept the book details
//    2.Display the book details
//    3.Enter ISBN number to search a book
//    4.Search an author and find all his/her books
//    5.Sort books by ISBN number
//
//    4
//
//    Enter author's name : 
//    Anna Huang
//
//    Books written by Anna are : 
//    Twisted
//
//    Do you wish to continue? 
//    Press 1 to continue and 0 to exit
//
//    1
//    Enter the number of operation you want to perform:
//    1.Accept the book details
//    2.Display the book details
//    3.Enter ISBN number to search a book
//    4.Search an author and find all his/her books
//    5.Sort books by ISBN number
//
//    5
//    Twisted : 32 
//    Verity : 55 
//
//    Do you wish to continue? 
//    Press 1 to continue and 0 to exit
