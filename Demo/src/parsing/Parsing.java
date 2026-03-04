package parsing;



public class Parsing {

	public static void main(String[] args) {           

		String[] words = { "-1", "+1", "1", "-0", "+0", "0", "1+", "1-", "++", "--", "a", "a0", "a9", "!", "",
				"qwer9ty8", "dfs44df", "a-9" };

		for (int i = 0; i < words.length; i++) {
			try {
				byte value = Byte.parseByte(words[i]);
				System.out.println(words[i] + " -> Parsed value: " + value);
			} catch (Exception e) {
				System.out.println(words[i] + " - Exception: " + e.getMessage());
				int flag = 0;
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < words[i].length(); j++) {
					if (words[i].charAt(j) >= '0' && words[i].charAt(j) <= '9') {
						if (flag == 2) {

							// System.out.println("Cannot Parse");
							break;
						}

						sb.append(words[i].charAt(j));
						flag = 1;

					} else {

						if (flag == 1)
							flag = 2;
					}

				}
				if (sb.length() != 0) {
					byte value = Byte.parseByte(sb.toString());
					System.out.println(words[i] + " -> Parsed value: " + value);

				} else {
					System.out.println("Cannot parse");
				}

			}
		}
	}
}
