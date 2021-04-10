/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testReadJS() throws FileNotFoundException {
        String emptyFile = "lib/src/test/resources/empty.js";
        String fewErrors = "lib/src/test/resources/fewErrors.js";
        String manyErrors = "lib/src/test/resources/manyErrors.js";
        String noErrors = "lib/src/test/resources/noErrors.js";
        String oneError = "lib/src/test/resources/oneError.js";
        String actualEmptyFile = Library.readJS(emptyFile);
        assertTrue(actualEmptyFile.isEmpty());
    }
}
