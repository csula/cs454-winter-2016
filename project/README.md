# Project

## Objectives

* Present a complete search system
* Present a novel feature (your team's unique contribution)

## Part 1

* Crawling: Your crawler must crawl and download documents given a depth and URL.  We will provide you with a seed URL.
* Extraction: You will have to extract the data has been crawled (downloaded).
* Indexing: You will need to index your results

## Part 2

* Ranking with TF-IDF: Your application must integrate this score into the ranking algorithm
* Ranking with Link Analysis: Your application must integrate this score into ranking algorithm
* Your application must clearly show three scores: TF-IDF, link analysis, and combined scores
* Your application should provide a way to weight between the two ranking algorithms.

## Part 3 

* You should demonstrate a web interface that allows users to search for a term in the documents that you've downloaded. Your frontpage for the websearch engine must show the following:

* Top 5 pages and links to each of the 5 pages

You are welcome to display additional statistic information about your indexed and collected data.

## Part 4

* You should show a novel contribution that is not one of the tasks listed above.


## Preparing for the dataset

You should download [slurpee.jar](slurpee.jar) and run it as followed:

```
java -jar slurpee.jar en out http://localhost/
```

Where `en` is the wiki-small data directory, `out` is the output directory and `http://localhost` is the relative base URL.  This will help your web interface to click through to get the correct documents.  For example during the search if you have your base-url configured correctly, we can click and the document viewing should be correct.

Note that your crawler should start crawling at `out/index.html`.  This page has link to all the documents.


## Grading Rubric

1. Part 1 5 points
2. Part 2 5 points
3. Part 3 5 points
4. Part 4 5 points

Total 20 points
