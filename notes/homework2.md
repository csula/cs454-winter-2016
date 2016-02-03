# Homework 2

## Objectives 

* Integrate extractor into the crawler program
* Consider the issues and tradeoffs with the various extractor designs

## Writing your Extractor

Leverage the work that you have done for your crawler and add the ability to extract files they are being downloaded.   Your extractor should (after a file has been downloaded) extract metadata and relevant data.  This data should be stored into a storage mechanism of your choosing.

You are free (and encouraged) to use external libraries such as `soup` and `tikka` to support your code.

## Running your Extractor

Similar to your crawler, your extractor program must be executed from the command line. It should take arguments and executed as followed:

```
java -jar crawler.jar -d <depth> -u <url> -e
```

The `-e` option enables extraction mode.  Without it, the crawler will _only_ crawl.

In addition to the extraction mode, your team must also implements a data dump program.  This data dump program will read from your local storage and display the entire data inventory to the screen.  The datadump should be executed as followed:

```
java -jar data_dump.jar
```

Its output will be a welcome-formed and structured `json` data file that lists all the urls.  For each URL, show the corresponding metadata table **and** path to the raw data file on disk.

## Grading Rubric

* Correct extraction
* Correct dump function


