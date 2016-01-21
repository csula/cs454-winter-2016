# Homework: ungraded

Objectives: 

* Get your development environment up and running
* Write a rudimentary search engine
* Understand the nuances of crawl, index and search (without doing the details)

## Write your crawler

Write a program that recursively crawls your computer starting at a top-level directory.  While crawling, your crawler should grab files and extract information and store them into a storage area.

As you begin to develop this application, your team will notice that there are a number factors that you must consider.  These include:

* how crawl recursively
* depth and breadth consideration
* how to detect file filetype and extract (meta)data
* how to store metadata

The list goes on.  So the exercise should germinate some serious design consideration. 

## Write your search

Write a program that given a `search term` dig through the stored metadata from above and returns the path to the file which contains the `search term`.

Again, as you design application your team will also notice that there are a number design decisions.  Some questions to ponder:

* Do you have to re-crawl if a `search term` is not found despite the fact that you are certain that it exists in one of your search file
* What is the search strategy on the storage layer?


