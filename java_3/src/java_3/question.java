package java_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

public class question implements Callable<String> {

	private String question;
	private String opt1, opt2, opt3, opt4;
	private String ans;

	public void set(String q, String o1, String o2, String o3, String o4, String c) {
		question = q;
		opt1 = o1;
		opt2 = o2;
		opt3 = o3;
		opt4 = o4;
		ans = c;
	}

	public void print() {
		System.out.println(question + "\n a." + opt1 + "\n b." + opt2 + "\n c." + opt3 + "\n d." + opt4);
	}

	@Override
	public String call() throws Exception {
		print();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		do {
			try {
				// wait until we have data to complete a readLine()
				while (!br.ready()) {
					Thread.sleep(200);
				}
				str=br.readLine();
			} catch (InterruptedException e) {
				return null;
			}
		} while ("".equals(str));
		if (str.contentEquals(ans))
			return "CORRECT";
		else
			return "INCORRECT";
	}

}
