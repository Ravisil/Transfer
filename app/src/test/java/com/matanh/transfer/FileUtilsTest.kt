package com.matanh.transfer

import com.matanh.transfer.util.FileUtils
import org.junit.Test
import org.junit.Assert.*

class FileUtilsTest {
    @Test
    fun formatFileSize_isCorrect() {
        assertEquals("0 B", FileUtils.formatFileSize(0))
        assertEquals("1.0 KB", FileUtils.formatFileSize(1024))
        assertEquals("1.0 MB", FileUtils.formatFileSize(1024 * 1024))
        assertEquals("1.5 MB", FileUtils.formatFileSize((1.5 * 1024 * 1024).toLong()))
    }
}
