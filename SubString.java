package unit1.strings;

public class SubString {
	public int strStr(final String haystack, final String needle) {
		char[] strChars = haystack.toCharArray();
		char[] subStrChars = needle.toCharArray();
		int index = -1;
		for (int i = 0; i < strChars.length; i++) {
			if (strChars[i] == subStrChars[0]) {
				if (needle.length() == 1) {
					index = 0;
				} else {
					if (haystack.length() - i >= needle.length()) {
						for (int j = 0; j < needle.length() -1 ; j++) {
							if (strChars[i + 1 + j] != subStrChars[j + 1]) {
								index = -1;
								break;
							}

							if (j+1 == needle.length() - 1) {
								if (strChars[i + 1+j] == subStrChars[j + 1]) {
									return i;
								}
							}

						}

					} else {
						index = -1;
					}
				}

			}
		}
		return index;

	}

	public static void main(String[] args) {
		SubString subStr = new SubString();
		int match = subStr.strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa");
		if (match == -1) {
			System.out.println("No Match");
		} else {
			System.out.println("Match at index: " + match);
		}
	}

}
