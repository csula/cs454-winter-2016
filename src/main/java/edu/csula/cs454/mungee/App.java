package edu.csula.cs454.mungee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;

class HashTable {
	Vector<String> table = new Vector<String>();

	HashTable(File file) throws FileNotFoundException {
		Scanner inFile1 = new Scanner(file);
		while(inFile1.hasNext()) {
			table.add(inFile1.next());
		}
		inFile1.close();
	}

	String randomURL() {
		int idx = (int) (Math.random() * table.size());
		return table.get(idx);
	}
}

public class App {
    private static String charSetName = "UTF-8";

    public static void main(String[] args) throws IOException {
        Validate.isTrue(args.length == 3, "usage: <filename> <hash-table> <base-url>");
        File file = new File(args[0]);
        String hashTable = args[1];
        String baseURL = args[2];

        HashTable ht = new HashTable(new File(hashTable));

        Document doc = Jsoup.parse(file, charSetName, baseURL);
        Elements links = doc.select("a[href]");

        for (Element link : links) {
            link.attr("href", ht.randomURL() + ".html");
        }

        String htmlString = doc.toString();
        System.out.println( htmlString );
  	}
}
