import java.util.LinkedList;

public class BrowserHistory {

	public static void main(String[] args) {
		LinkedList<String> history = new LinkedList<String>();

		history.add("google.com");
		history.add("youtube.com");
		history.add("github.com");
		System.out.println(history.toString());

		history.removeLast();
		System.out.println(history.toString());

		history.add("shopee.com");
		history.add("wikipedia.org");
		history.add("claude.ai");
		System.out.println(history.toString());

		history.remove(1);
		System.out.println(history.toString());

		System.out.println("current page = " + history.getLast());

		System.out.println("Visited youtube.com = " + (history.contains("youtube.com") ? "true" : "false"));

		System.out.println("Go back to previous page = " + history.get(2));

		System.out.println("Go back to previous page again = " + history.get(1));

		history.clear();
		System.out.println(history.toString());
	}

}
