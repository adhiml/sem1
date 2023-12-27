/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;


//public class V3Q2 {
//    
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;

class Library {
    private List<Book> books;
   
    public Library(){
        books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void findBooksByAuthor(String a){
        System.out.println("Books by author '" + a + "':");
        for (Book book : books) {
            if (book.getAuthor().equals(a)) {
                System.out.println(book);
            }
        }
    }
    
    public void findBooksByTitle(String t){
        System.out.println("Books by title '" + t + "':");
        for (Book book : books) {
            if (book.getTitle().equals(t)) {
                System.out.println(book);
            }
        }
    }
    
    public boolean borrowBook(String i) {
        int number = Integer.parseInt(i);
        number = number % 100;
        if (number <= 1) {
            return true;
        }
        
        for (int j = 2;  j<= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return true;
            }
        }
        return false;
    }
    
    public void removeBook(String i){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(i)) {
                iterator.remove();
                break;
            }
        }
    }
    public void displayLibrary(){
        System.out.println("Books in the library, sorted by title:");
        
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }
    
    public void sortBooks() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        displayLibrary();
    }
    
    
}

class Book {
    private String title; 
    private String author;
    private String isbn;
    
    public Book(String t, String a, String i){
        title = t;
        author = a;
        isbn = i;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        return "- Title: " + title + "\n  Author: " + author + "\n  ISBN: " + isbn;
    }
}


