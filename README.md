#PhotoAlbum

##About
This is an example RESTful API written in Java and Spring Framework. This project is intended to be a demonstration of how a REST API can be structured and designed using Spring Boot/Actuator and Spring Data.

##Installation
To run this application you will first need to install a couple packages: jdk 1.7 and maven (you can also install these packages with yum, brew, etc.)

```
sudo apt-get install openjdk-7-jre
sudo apt-get install maven
```

This project is built using Spring Boot/Spring Actuator, which makes it very easy to get running. You can either run the application directly from maven: `mvn spring-boot:run`, or you can build the application package with `mvn clean package` and then run the jar directly: `java -jar target/PhotoAlbum-1.0-SNAPSHOT.jar`.

##Usage
The default username/password for this application is `user:user`. To access any of the endpoints you will be prompted for authorization.

The relevant endpoints for this application are `/api/photos` and `/api/albums`. Both endpoints have the basic CRUD actions. For example, to view all photos, you can navigate to:

```
http://localhost:8080/api/photos
```

Which should return the following JSON:

```
[
  {
    "id": "1",
    "title": "just me",
    "createdDate": "2015-08-31T09:14:05.097-0500",
    "filePath": "me.png",
    "albumId": "1"
  },
  {
    "id": "2",
    "title": "another pic",
    "createdDate": "2015-08-31T09:14:05.097-0500",
    "filePath": "another.png",
    "albumId": "1"
  },
  {
    "id": "3",
    "title": "profile photo",
    "createdDate": "2015-08-31T09:14:05.098-0500",
    "filePath": "profile.png",
    "albumId": "1"
  },
  {
    "id": "4",
    "title": "at the beach",
    "createdDate": "2015-08-31T09:14:05.098-0500",
    "filePath": "beach.png",
    "albumId": "2"
  },
  {
    "id": "5",
    "title": "at the park",
    "createdDate": "2015-08-31T09:14:05.098-0500",
    "filePath": "park.png",
    "albumId": "2"
  }
]
```

For testing all of the CRUD actions, I recommend using [Postman](www.getpostman.com).
