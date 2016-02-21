# Homework 3

## Objectives

* Implement an index algorithm
* Implement a ranking algorithm

## Data Source

Your team will need to use this as the data source: [Document Collections](http://www.search-engines-book.com/collections).  We are only interested in the internal links ("same server") of the documents.

Note that this data is **large** and it is unlikely that your team can consume and perform complex ranking/analysis without some sort of optimizations.  The specific method for optimization is up to your team to decide.

## Writing your index program

To do the indexing, your software will need to "crawl" the web server, pull the data, perform and extract terms.  While doing the indexing, you can in fact, perform additional "scoring" on the terms and documents themselves.  For example, TFIDF.  A reminder again on the definition of TFIDF:

> Short for term frequency–inverse document frequency, is a numerical statistic that is intended to reflect how important a word is to a document in a collection or corpus. It is often used as a weighting factor in information retrieval and text mining.

Source: wikipedia.

The goal of the indexer is that when presented with a term, the software can give back a list of documents containing the term of interest.  The _order_ of the results is defined by the score (see below).

## Writing your ranking program

Note that there are two aspects to ranking that you must contend:

* **Intrinsic ranking**: most of these can be done at the time of indexing

* **Relational ranking**: these can only be done when your system has finished crawling and indexing

Here we focus on the second aspect of ranking.  With a separate program, your task is to perform link analysis on the document collection that you have gathered.  The purpose of link analysis is to score the "value" of a document bases on its relationship to other documents.  For the purpose of the assignment you can restrict documents to only that are within the same server.

The goal of the ranking program is to comb through the documents that you have crawled and build a score on each of these documents based on the [page rank algorithm](week6.pdf).

## Grading Rubric

* Demonstration of the index design and implementation
  * What is your indexing strategy?
  * What is your frequency/statistical analysis?
* Discussion of your ranking algorithm
  * Intrinsic ranking
  * Link analysis algorithm

### Collaboration Grade

Your team **must** use github to coordinate the code sharing and collaboration.  The grading rubric for collaboration is effort is discussed in [grading.md](grading.mg).

### Bonus assignment

We will give bonus grade to the team that implement a MR algorithm for this homework assignment.  You are free to use your own high performance computer or utilize the AWS.  Before you do the bonus assignment please coordinate with the instructors.
