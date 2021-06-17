 
Step 1: Download Spring Tool Suite from https://spring.io/tools3/sts/all. Click on the platform which you are using.  
Step 2: Extract the zip file and install the STS.

https://download.springsource.com/release/STS/3.9.15.RELEASE/dist/e4.18/spring-tool-suite-3.9.15.RELEASE-e4.18.0-win32-x86_64.zip

https://dist.springsource.com/release/STS/index.html

Spring intialiser 
https://start.spring.io/

mysql installer for 64 bit 

dev.mysql.com/downloads
watch below video 

https://www.youtube.com/watch?v=WuBcTJnIuzo

create database testdb;

below is the query to create table 


CREATE TABLE testdb.`course_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `number` int(11) NOT NULL,
  `num_credits` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

How to generate RSA key 

https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent


ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
