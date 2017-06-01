package com.example.android.bookworm;

/**
 * BookWorm Created by Muir on 01/06/2017.
 */

/**
 * An {@link Book} object contains information related to a single book
 */
public class Book {

    // Title of the book
    private String Title;

    //Subtitle of the book
    private String Subtitle;

    // Author of the book
    private String Author;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title    is the name of the book.
     * @param subtitle is the subtitle of the book.
     * @param author   is the person who wrote the book.
     */

    public Book(String title, String subtitle, String author) {

        Title = title;
        Subtitle = subtitle;
        Author = author;

    }

    // Getter methods to return the image, title, subtitle, author, and link of the book.

    /*public String getImage(){
        return Image;
    }*/

    public String getTitle() {
        return Title;
    }

    public String getSubtitle() {
        return Subtitle;
    }

    public String getAuthor() {
        return Author;
    }

}
