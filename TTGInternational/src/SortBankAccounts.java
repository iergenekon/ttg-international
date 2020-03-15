import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class SortBankAccounts {

	private static final Pattern PARAGRAPH = Pattern.compile("\\s*^\\s*$\\s*", Pattern.MULTILINE);
	private static final String FILE_NAME = "bank_accounts.txt";

	public static void main(String[] args) throws IOException {

		String txtContent = readFromTextFile(FILE_NAME);
		String[] result = txtContent.split("\n", 2);
		String[] groupsToBeTested = PARAGRAPH.split(result[1]);

		for (String group : groupsToBeTested) {
			// split by second line
			String[] accountGroup = group.split("\n", 2);
			// split by new line
			String[] accountArray = accountGroup[1].split("\\r?\\n");

			List<String> accounts = Arrays.asList(accountArray);
			Set<String> sortedAccounts = sortBankAccounts(accounts);

			for (String sa : sortedAccounts) {
				System.out.println(sa);
			}

			System.out.println();
		}
	}

	public static String readFromTextFile(String txtFile) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(txtFile));
		String wholeText = "";

		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			wholeText = sb.toString();
		} finally {
			br.close();
		}

		return wholeText;
	}

	public static Set<String> sortBankAccounts(List<String> accounts) {

		Collections.sort(accounts);
		Set<String> hashSet = new LinkedHashSet<String>();

		for (String a : accounts) {
			hashSet.add(a + " " + Collections.frequency(accounts, a));
		}

		return hashSet;
	}

}
