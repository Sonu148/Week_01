package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class FileProcessorTest {
    private static final String TEST_FILENAME = "test_output.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Ensure file is clean before each test
        File file = new File(TEST_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "JUnit File Handling Test";

        // Write to file
        FileProcessor.writeToFile(TEST_FILENAME, content);

        // Read from file
        String readContent = FileProcessor.readFromFile(TEST_FILENAME);

        // Check if content matches
        assertEquals(content, readContent);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor.writeToFile(TEST_FILENAME, "Sample Content");

        // Check if file exists
        File file = new File(TEST_FILENAME);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        // Ensure exception is thrown when reading a non-existent file
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("non_existent_file.txt"));
    }

    @AfterEach
    void tearDown() {
        // Clean up test file
        File file = new File(TEST_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }
}
