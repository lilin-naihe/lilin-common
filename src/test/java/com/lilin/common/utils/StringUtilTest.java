package com.lilin.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="";
		boolean b=StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="";
		boolean b=StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c=StringUtil.randomChineseString(10);
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name=StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
