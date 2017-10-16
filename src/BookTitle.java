import java.util.Scanner;
public class BookTitle
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int size = 20 ;
        String quit = "";
        String title[] = new String[size];
        String author[] = new String[size];
        String description[] = new String[size];

        while (!quit.equalsIgnoreCase("q")) {

            //prompt user to enter a book title,title,author and description
            System.out.println("enter a book title:");
            title[counter] = keyboard.nextLine();
            quit = title[counter];
            System.out.print("enter a book author:");
            author[counter] = keyboard.nextLine();
           // quit = author[counter];
            System.out.println("enter a book description");
            description[counter] = keyboard.nextLine();
            quit = description[counter];
            counter++;
        }
        for (int i = 0; i < counter - 1; i++) {
            System.out.print(i);
            System.out.print("");
            System.out.print((author)[i]);
            System.out.print("");
            System.out.print((description)[i]);
            System.out.print("");



    //System.out.print("enter book title:"+(""),"enter book author:"+(""),"enter book descrition:"+("");

    //Scanner keybook = new Scanner(System.in);
    //System.out.print("enter book title:"+(""),"enter book author:"+(""),"enter book descrition:"+("");


            }
    }
}