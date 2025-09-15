/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbooktracker;
import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjBookTracker {

    public static void main(String[] args) {
       String[][] books = {{"B101", "The Giver", "4"},
                           {"B102", "1984", "6"},
                           {"B103", "Pride & Prejudice", "3"},
                           {"B104", "To Kill a Mockingbird", "5"}};
       
       boolean bChoice = false;

        String choice = JOptionPane.showInputDialog("Enter 1 to view all books\nEnter 2 to search for a book\n Enter 3 to add a new book\n Enter 4 to quit");
        
        while (!choice.equals("4"))
        {
             if (choice.equals("1"))
        {  
            displayAllBooks(books);
        }
        else if (choice.equals("2"))
        {
            searchBook(books);
        }
        else if (choice.equals("3")){
           books = addBook(books);
           
        }
        else if (choice.equals("4")){
            System.exit(0);
        }
        else
        {
            bChoice = true;
        }
            choice = JOptionPane.showInputDialog("Enter 1 to view all books\nEnter 2 to search for a book\n Enter 3 to add a new book\n Enter 4 to quit");
        }
        
        if (bChoice)
        {
            JOptionPane.showMessageDialog(null, "Invalid Selection");
        }

       

}

private static void displayAllBooks(String[][] books)
{
    String output = "Library Book List:\n\n";
    int total = 0;

    for (int i = 0; i < books.length; i++) 
    {
        output += "ID: " + books[i][0] + ", Title: " + books[i][1] + ", Copies: " + books[i][2] + "\n";
        total +=Integer.parseInt(books[i][2]);
    }

    JOptionPane.showMessageDialog(null, output + "\nTotal copies in library: " + total);
}

private static void searchBook(String[][] books)
{
    String id = JOptionPane.showInputDialog("Enter the Book ID to search:");
    boolean bFound = false;

    for (int i = 0; i < books.length; i++)
    {
        if (id.equalsIgnoreCase(books[i][0]))
        {
            JOptionPane.showMessageDialog(null,"Book Found!\nTitle: " + books[i][1] + "\nCopies: " + books[i][2]);
            bFound = true;
            break;
        }
       
    }
    if (!bFound)
        {
            JOptionPane.showMessageDialog(null, "No book found with that ID");
        }
}

    private static String[][] addBook(String[][] books) {
        String id = JOptionPane.showInputDialog("Enter new book ID:");
        String name = JOptionPane.showInputDialog("Enter the book name:");
        int copies = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of copies:"));
        
        String[][] newBooks = new String[books.length + 1][3];
        
        for (int i = 0; i < books.length ; i++)
        {
             for (int j = 0; j < 3 ; j++)
             {
                 newBooks[i][j] = books[i][j];
             }
             
        }
             newBooks[books.length][0] = id;
             newBooks[books.length][1] = name;
             newBooks[books.length][2] = String.valueOf(copies);
        return newBooks;
    }
}

