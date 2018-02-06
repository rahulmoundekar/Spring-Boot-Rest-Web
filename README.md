# Spring-Boot-Rest-Web
Spring-Boot-Rest-Web -JPA-Hibernate-Configuration
Why REST? REST In Practice proffers, to borrow Martin Fowler’s phrasing, "the notion that the web is an existence proof of a massively scalable distributed system that works really well, and we can take ideas from that to build integrated systems more easily." I think that’s a pretty good reason: REST embraces the precepts of the web itself, and embraces its architecture, benefits and all.

What benefits? Principally all those that come for free with HTTP as a platform itself. Application security (encryption and authentication) are known quantities today for which there are known solutions. Caching is built into the protocol. Service routing, through DNS, is a resilient and well-known system already ubiquitously support.

REST, however ubiquitous, is not a standard, per se, but an approach, a style, a constraint on the HTTP protocol. Its implementation may vary in style, approach. As an API consumer this can be a frustrating experience. The quality of REST services varies wildly.

#Using appropriate Request Methods

Always use HTTP Methods. Best practices with respect to each HTTP method is described below:

GET : Should not update anything. Should be idempotent (same result in multiple calls). Possible Return Codes 200 (OK) + 404 (NOT FOUND) +400 (BAD REQUEST)
POST : Should create new resource. Ideally return JSON with link to newly created resource. Same return codes as get possible. In addition : Return code 201 (CREATED) is possible.
PUT : Update a known resource. ex: update client details. Possible Return Codes : 200(OK)
DELETE : Used to delete a resource.

REST stands for REpresentational State Transfer. REST specifies a set of architectural constraints. Any service which satisfies these constraints is called RESTful Service.

#The five important constraints for RESTful Web Service are

Client - Server : There should be a service producer and a service consumer.
The interface (URL) is uniform and exposing resources.
The service is stateless.
The service results should be Cacheable. HTTP cache, for example.
Service should assume a Layered architecture. Client should not assume direct connection to server - it might be getting info from a middle layer - cache.
