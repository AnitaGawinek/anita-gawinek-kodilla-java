package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        // Given
        Library library = new Library("First library");
        // Creating list of books
        Book book1 = new Book("Title1", "Author1", LocalDate.of(1990,02,10));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(1989,12,15));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2001,05,02));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(1995,03,06));
        Book book5 = new Book("Title5", "Author5", LocalDate.of(2015,07,25));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        // Making a shallow copy of object Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // Making a deep copy of object Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library.getBooks().remove(book2);
        library.getBooks().remove(book3);

        // Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());

    }
}
