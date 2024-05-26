package FileExercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLS = new ArrayList<>();
        listOfPendingURLs.add("https://www.youtube.com/watch?v=c1M0iATLZRU&list=PLAJu9FfAPy-Wg-6nvwMh57qZKQ1P0hK3C&index=71");
        listOfPendingURLs.add("https://www.webfx.com/tools/links-counter/");
        listOfPendingURLs.add("https://en.wikipedia.org/wiki/Programming_language");
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLS.size() <= 100) {
            String urlName = listOfPendingURLs.removeFirst();
            if (!listOfTraversedURLS.contains(urlName)) {
                listOfTraversedURLS.add(urlName);
                System.out.println(urlName);
                URL url = new URL(urlName);
                Scanner input = new Scanner(url.openStream());

                while (input.hasNext()) {
                    String token = input.next();
                    int current = token.indexOf("http://");
                    while (current > 0) {
                        int endIndex = token.indexOf("\"", current);
                        if (endIndex > 0) {
                            String newUrl = token.substring(current, endIndex);
                            if (!listOfTraversedURLS.contains(newUrl)) {
                                listOfPendingURLs.add(newUrl);
                            }
                            current = token.indexOf("http://", endIndex);
                        } else current = -1;
                    }
//                    if (token.startsWith("https://")) {
//                        if (!listOfTraversedURLS.contains(token)) {
//                            listOfPendingURLs.add(token);
//                        }
//                    }
                }
            }
        }

    }
}
