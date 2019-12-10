package demo;


public class program1 {
	static int count;

	public String constring(String provided) {

		String str = provided;
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = new StringBuffer();

		for (int i = 0; i <= sb.length(); i++) {
			for (int j = i + 1; j <= sb.length() -1; j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					count++;
				}

				sb1 = sb1.append(sb.charAt(i));
				break;
			}

		}
		return sb1.toString();
	}

	public static void main(String[] args) {
		String sb1 = new program1().constring("abbababababab");
		System.out.println(sb1 + " Number of elements deleted " + new program1().count);

	}
}
