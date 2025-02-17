package org.ziglang

import com.intellij.testFramework.ParsingTestCase
import org.ziglang.parsing.v1.ZigParserDefinition
import kotlin.test.Test

class ZigParserTests : ParsingTestCase("", ZIG_EXTENSION, ZigParserDefinition()) {
	override fun getTestDataPath() = "src/test/resources/parsing"
	override fun skipSpaces() = true

	@Test
	fun testComments() {
		println(name)
		doTest(true)
	}

	@Test
	fun testParsing0() {
		println(name)
		doTest(true)
	}

	@Test
	fun testComptimeCodes() {
		println(name)
		doTest(true)
	}

	@Test
	fun testStrings() {
		println(name)
		doTest(true)
	}

	@Test
	fun testNumbers() {
		println(name)
		doTest(true)
	}

	@Test
	fun testFunctionCall() {
		println(name)
		doTest(true)
	}

	@Test
	fun testParameters() {
		println(name)
		doTest(true)
	}

	@Test
	fun testFloatMode() {
		println(name)
		doTest(true)
	}

	@Test
	fun testFoo() {
		println(name)
		doTest(true)
	}

	@Test
	fun testArrays() {
		println(name)
		doTest(true)
	}

	@Test
	fun testValues() {
		println(name)
		doTest(true)
	}

	@Test
	fun testIf() {
		println(name)
		doTest(true)
	}

	@Test
	fun testHelloWorld() {
		println(name)
		doTest(true)
	}

	@Test
	fun testTemp() {
		println(name)
		doTest(true)
	}
}

