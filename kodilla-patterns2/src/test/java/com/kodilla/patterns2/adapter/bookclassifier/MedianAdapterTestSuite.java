package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {

        // Given
        Book book1 = new Book ("xyz", "Title1", 1985, "book");
        Book book2 = new Book ("abc", "Title2", 1986, "crime");
        Book book3 = new Book ("cdf", "Title3", 1987, "komiks");
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(book1);
        booksLibraryA.add(book2);
        booksLibraryA.add(book3);

        MedianAdapter libraryAdapter = new MedianAdapter();

        // When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksLibraryA);

        // Then
        assertEquals(1986, publicationYearMedian);
    }
}
