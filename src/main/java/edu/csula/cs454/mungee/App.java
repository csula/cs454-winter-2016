package edu.csula.cs454.mungee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public run(inDir, outDir) {
		System.out.println("inDir: " + inDir);
		System.out.println("outDir: " + outDir);
	}

  public static void main(String[] args) {
		try {
			String inDir = args[0];
			String outDir = args[1];
			run(inDir, outDir);
		} catch (Exeption ex) {
			ex.printStackTrace();
		}
}
