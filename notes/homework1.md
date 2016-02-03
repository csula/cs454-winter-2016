# Homework 1

## Objectives 

* Develop a crawler application
* Consider the issues and tradeoffs with the various crawler designs

## Writing your Crawler

Write a crawler program that crawls the web with a starting URL.  Your crawler would:

1. Start with a URL
2. Download the document located at the URL
3. Find all the links in the document
4. For each link repeat step 1

In the above process, you will quickly discover that there are a number of issues and these include (but not limited to):

* Circular reference
* Downloading too much data (exessive crawling)
* How to organize your crawled data 
* Performance issues

## Running your Crawler

Your crawler program must be executed from the command line. For example, if your crawler is a java program then it should take arguments and executed as followed:

```
java -jar crawler.jar -d <depth> -u <url>
```

The `-d` option specifies the `depth` of your crawl.  For example, if you want to only crawl two levels (link to a link to a link), then you would specify `-d 2`.  The `-u` option specifies the starting url.

## Grading Rubric

* Correct crawling
* Handling of exceptions (circular and depth)
* Proper local storage

## Bonus Part

Implement a multithreaded crawler.  

