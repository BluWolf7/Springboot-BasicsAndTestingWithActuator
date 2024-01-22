Hi this is a basic springBoot app covering all the basic concepts like :

1.Annotations
2.How Spring reads java files 
3.REST APIs - a Department system with create, read, update, delete features added ; Connected to a mySQL (Which i ran on local via docker) database with a JPA Repository. (Note: application.properties contains config to connect to in memory H2 as well) 
4.Exception-Handling added 
5.Mockito JUNIT5 Test cases added for Controller,Service,Repository (Simplified, easy to understand approach)
6.added application.yml file to replace application.properties (contains mySQL connection config alone ; h2 not present); Created config for all 3 envs : dev,qa,prod
7.Actuator endpoints are all exposed via application.yml
8.Cusotm Actuator created to display what are the features enabled in the running application.

Thanks to DailyCodeBuffer https://www.youtube.com/watch?v=zvR-Oif_nxg&t=1s For References.

Arjun P
