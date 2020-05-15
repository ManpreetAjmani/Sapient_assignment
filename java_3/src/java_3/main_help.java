package java_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class main_help {

	public static void help(ExecutorService service, question q) {
		Future<String> future = service.submit(q);

		try {
			String result = future.get(10, TimeUnit.SECONDS);
			System.out.println(result);
		} catch (TimeoutException ex) {
			System.out.println("TIMEOUT");
			future.cancel(true);
		} catch (InterruptedException e) {
			// handle the interrupts
		} catch (ExecutionException e) {
			// handle other exceptions
		} finally {
			// may or may not desire this
		}
	}

	public static void main(String args[]) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		question questions[] = new question[10];
		for (int i = 0; i < 7; i++) {
			questions[i] = new question();
		}
		questions[0].set("Who is president of india", "Donald Trump", "Ramnath Kovind", "Narendra Modi", "None", "b");
		questions[1].set("Who is prime minister of india", "Donald Trump", "Ramnath Kovind", "Narendra Modi", "None",
				"c");
		questions[2].set("Who is president of USA", "Donald Trump", "Ramnath Kovind", "Narendra Modi", "None", "a");
		questions[3].set("How many rings are on the Olympic flag?", "6", "4", "5", "None", "c");
		questions[4].set(" In darts, what's the most points you can score with a single throw?", "100", "80", "40",
				"60", "d");
		questions[5].set("How many holes are on a standard bowling ball?", "2", "3", "1", "4", "b");
		questions[6].set(" What are the main colors on the flag of Spain?", "Black and Blue", "Red and Yellow",
				"Yellow and Black", "None", "b");
		questions[7].set(" What is the longest that an elephant has ever lived? (That we know of)", "86", "62", "77",
				"48", "a");

		for (int i = 0; i < 7; i++) {
			help(executor, questions[i]);
		}

		executor.shutdown();

	}

}
