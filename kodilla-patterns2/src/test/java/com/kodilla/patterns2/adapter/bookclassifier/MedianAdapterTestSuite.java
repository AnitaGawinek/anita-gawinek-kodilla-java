package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        // Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2000, "12345"));
        bookSet.add(new Book("Author 2", "Title 2", 2010, "12345"));
        bookSet.add(new Book("Author 3", "Title 3", 1990, "12345"));
        bookSet.add(new Book("Author 4", "Title 4", 1995, "12345"));
        bookSet.add(new Book("Author 5", "Title 5", 2001, "12345"));

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int result = medianAdapter.publicationYearMedian(bookSet);

        // Then
        assertEquals(2000, result);
    }
}
