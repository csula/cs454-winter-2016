# Week 9: Elastic Search

## Objectives

1. Introduction of Elastic Search
2. Set up Elastic Search on local dev env
3. Learn Elastic Search
4. Set up Elastic Search Java Client
5. **Programming Quiz**

## Metrics/Desired Outcomes

1. Parse data & feed into Elastic Search
2. Query in Elastic Search

---

### Introduction

* Open source search engine
* Built on top of Apache Lucene
* JSON based
* Scheme free
* Distributed
* Multi-tenancy
* API Centric & REST

> You **cannot** use Elastic Search in your homework 4.  
> However, this is very useful knowledge for you to have!

### What can it do?

* Unstructured & structured search
* Analytics
* Combine

### Get started

* Download [Elastic Search distribution](https://www.elastic.co/downloads/elasticsearch)

```sh
.
├── LICENSE.txt
├── NOTICE.txt
├── README.textile
├── bin                    # executable scripts
│   ├── elasticsearch
│   ├── plugin
│   └── ...
├── config                 # node configuration
│   ├── elasticsearch.yml
│   └── logging.yml
├── lib
│   ├── elasticsearch-2.2.0.jar
│   └── ...
└── ...
```

* Run `elasticsearch` executable

```sh
# eric at Erics-MacBook-Pro.local in ~/Downloads/elasticsearch-2.2.0 [22:37:14]
$ ./bin/elasticsearch
[2016-03-02 22:37:22,354][INFO ][node                     ] [NFL Superpro] version[2.2.0], pid[66651], build[8ff36d1/2016-01-27T13:32:39Z]
[2016-03-02 22:37:22,354][INFO ][node                     ] [NFL Superpro] initializing ...
[2016-03-02 22:37:22,937][INFO ][plugins                  ] [NFL Superpro] modules [lang-expression, lang-groovy], plugins [], sites []
[2016-03-02 22:37:22,967][INFO ][env                      ] [NFL Superpro] using [1] data paths, mounts [[/ (/dev/disk1)]], net usable_space [166gb], net total_space [464.7gb], spins? [unknown], types [hfs]
[2016-03-02 22:37:22,967][INFO ][env                      ] [NFL Superpro] heap size [989.8mb], compressed ordinary object pointers [true]
[2016-03-02 22:37:24,923][INFO ][node                     ] [NFL Superpro] initialized
[2016-03-02 22:37:24,923][INFO ][node                     ] [NFL Superpro] starting ...
[2016-03-02 22:37:25,020][INFO ][transport                ] [NFL Superpro] publish_address {127.0.0.1:9300}, bound_addresses {[fe80::1]:9300}, {[::1]:9300}, {127.0.0.1:9300}
[2016-03-02 22:37:25,028][INFO ][discovery                ] [NFL Superpro] elasticsearch/RMR814SUQ-SVatuaP1i31A
[2016-03-02 22:37:28,057][INFO ][cluster.service          ] [NFL Superpro] new_master {NFL Superpro}{RMR814SUQ-SVatuaP1i31A}{127.0.0.1}{127.0.0.1:9300}, reason: zen-disco-join(elected_as_master, [0] joins received)
[2016-03-02 22:37:28,075][INFO ][http                     ] [NFL Superpro] publish_address {127.0.0.1:9200}, bound_addresses {[fe80::1]:9200}, {[::1]:9200}, {127.0.0.1:9200}
[2016-03-02 22:37:28,075][INFO ][node                     ] [NFL Superpro] started
[2016-03-02 22:37:28,099][INFO ][gateway                  ] [NFL Superpro] recovered [0] indices into cluster_state
```

* confirm working by opening in browser under http://localhost:9200

```sh
# eric at Erics-MacBook-Pro.local in ~/Downloads/elasticsearch-2.2.0 [22:38:19]
$ curl http://localhost:9200/\?pretty
{
  "name" : "NFL Superpro",
  "cluster_name" : "elasticsearch",
  "version" : {
    "number" : "2.2.0",
    "build_hash" : "8ff36d139e16f8720f2947ef62c8167a888992fe",
    "build_timestamp" : "2016-01-27T13:32:39Z",
    "build_snapshot" : false,
    "lucene_version" : "5.4.1"
  },
  "tagline" : "You Know, for Search"
}
```

### Debugging in Sense

For people who doesn't have `curl` installed locally. *Ahem* windows users, I suggested you to install sense so that you can execute curl like command without worry about curl command.

* Install [Kibana](https://www.elastic.co/downloads/kibana)
* Run `./bin/kibana plugin --install elastic/sense` under kibana folder to install sense
* Confirm Sense working by http://localhost:5601/app/sense?load_from=http://www.elastic.co/guide/en/elasticsearch/guide/current/snippets/010_Intro/10_Info.json

### Communicate with ES

* [Java Client](https://www.elastic.co/guide/en/elasticsearch/client/java-api/current/index.html)
* REST

> We will focus on the REST to explain Elastic Search briefly first and then implement in Java Client later

### Quick Review on RESTful

* CRUD

```
* POST   => Create
* GET    => Read
* PUT    => Update
* DELETE => DELETE
```

### ES Terminologies from RDBS point of view

```
Relational DB  ⇒ Databases ⇒ Tables ⇒ Rows      ⇒ Columns
Elasticsearch  ⇒ Indices   ⇒ Types  ⇒ Documents ⇒ Fields
```

### Learn by examples using Sense

#### Example of write

http://localhost:5601/app/sense?load_from=http://www.elastic.co/guide/en/elasticsearch/guide/current/snippets/010_Intro/25_Index.json

#### Example of read

http://localhost:5601/app/sense?load_from=http://www.elastic.co/guide/en/elasticsearch/guide/current/snippets/010_Intro/30_Get.json

#### Example of search lite

http://localhost:5601/app/sense?load_from=http://www.elastic.co/guide/en/elasticsearch/guide/current/snippets/010_Intro/30_Simple_search.json

#### More complex search

http://localhost:5601/app/sense?load_from=http://www.elastic.co/guide/en/elasticsearch/guide/current/snippets/010_Intro/30_Query_DSL.json

### Searching

While many searches will just work out of the box, to use Elasticsearch to its full potential, you need to understand three subjects:

* Mapping

    How the data in each field is interpreted

* Analysis

    How full text is processed to make it searchable

* Query DSL

    The flexible, powerful query language used by Elasticsearch

### Inverted index

https://www.elastic.co/guide/en/elasticsearch/guide/current/inverted-index.html

### Programming Quiz

#### Instructions

1. Clone this repository
2. Run `gradle homedepotSearch parse product_descriptions.csv attributes.csv` to parse data
3. Run `gradle homedepotSearch search "The Rubbermaid 1-Step"`

#### Metrics

1. Able to pass parse data unit test by `gradle test` - 3pt
2. Able to do full-text search in quick real time - 7pt

## Further Reading

* [Elastic Search Distributed Explained](https://www.elastic.co/guide/en/elasticsearch/guide/current/distributed-cluster.html)
* [Elastic Search Doc](https://www.elastic.co/guide/en/elasticsearch/reference/current/getting-started.html)
