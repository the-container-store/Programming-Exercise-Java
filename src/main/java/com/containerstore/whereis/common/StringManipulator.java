package com.containerstore.whereis.common;

public class StringManipulator {
	private StringManipulator() {
	}

	/**
	 * Only for internal use to capitalize the first letter of each word in the
	 * string
	 * 
	 * @param str
	 * @return string with capitalized words
	 */
	public static String capitalizeWords(String str) {
		String[] words = str.split("\\s");
		StringBuilder sb = new StringBuilder();

		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			sb.append(first.toUpperCase() + afterfirst + " ");
		}
		return sb.toString().trim();
	}
}
