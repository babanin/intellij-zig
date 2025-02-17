package org.ziglang

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.ziglang.project.versionOf
import org.ziglang.project.zigPath

class UtilsTest {
	@Test(timeout = 1000L)
	fun executeCommand() {
		if (!System.getenv("CI").isNullOrBlank()) return
		org.ziglang.util.executeCommand(arrayOf(zigPath, "version"), timeLimit = 5000L)
				.also(::println)
				.also(::assertNotNull)
		// .also { (stdout, _) -> assertTrue(stdout.isNotEmpty()) }
	}

	@Test
	fun versionOf() {
		if (!System.getenv("CI").isNullOrBlank()) return
		versionOf(zigPath).let(::println)
	}
}
