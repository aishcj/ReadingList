## Spring Data Jpa Book Database - Read/Wish List

## Project Description 
This is a simple Spring Boot application implementing Rest API and Spring Data JPA for CRUD operations using Postman.

The purpose of this application is to maintain a reading list of books and categorising them to:
1. Read Books - books that the user has finished reading.
2. Wish Books - books that the user wants to read.

Tables includes authors, genres, publishers, books, readList and wish list.

## How to use 
This project was generated using Spring Boot.

1. Download project into your local system. Run it on IntelliJ IDE.

2. Sign in to Postman on Google Chrome. Make sure the desktop agent is installed into your local system.

3. In Postman, open workspace. Navigate to `http://localhost:8080`
   

4. CRUD operations
   For POST operations, place the JSON values under Body - select raw, then select JSON.
  
   a. Author  
      
      
       POST Method - `http://localhost:8080/authors`
        {
         "authorId": "1",
         "firstName": "James",
         "lastName": "Clear"
       }
      
        Update the values as below to create one more author record:
        {
         "authorId": "2",
         "firstName": "Viktor",
         "lastName": "Frankl"
        }
      
       GET Method -
        i. get all authors - `http://localhost:8080/authors`
       ii. get author by id - `http://localhost:8080/authors/1`
       
       PUT Method - `http://localhost:8080/authors/1`
        Use id value after "authors/" to update record by id.
       
       DELETE Method - `http://localhost:8080/authors/1`
        Use id value after "authors/" to delete record by id.
        
       For GET, PUT and DELETE methods for the rest of the tables:
           Replace table name after 'http://localhost:8080/'
    
   b. Genre  
    
       POST Method - `http://localhost:8080/genres`
        {
          "genreId": "1",
          "genreName": "Self-Help"
         }
        
        Update the values as below to create one more genre record:
        {
          "genreId": "2",
          "genreName": "Autobiography"
         }
        
       GET Method 
         i. get all genres - `http://localhost:8080/genres`
        ii. get genre by id - `http://localhost:8080/genres/1`
        
   c. Publisher
    
      POST Method - `http://localhost:8080/publishers`
        {
          "publisherId": 1,
          "publisherName": "Penguin Random House"
        }
        
       Update the values as below to create one more publisher record:
       {
          "publisherId": "2",
          "publisherName": "Simon and Schuster"
        }
        
   d. Book 
   
      POST Method - `http://localhost:8080/books`
       {
        "bookId": "1",
        "bookTitle": "Atomic Habits",
        "price": "12",
        "author": {
            "authorId": "1"
           },
        "genre": {
            "genreId": "2"
           },
        "publisher": {
            "publisherId": "1"
          }
        }
        
        Update the values as below to create one more book record:
        {
        "bookId": "2",
        "bookTitle": "Man's search for meaning",
        "price": "10",
        "author": {
            "authorId": "2"
           },
        "genre": {
            "genreId": "2"
           },
        "publisher": {
            "publisherId": "2"
          }
        }
        

   e. Read Books
       
      POST Method - `http://localhost:8080/readBooks`
      {
        "book" : {
             "bookId" : "1"
             },
        "readListId" : "1"
      }
      
      
   f. Wish Books
       
      POST Method - `http://localhost:8080/wishBooks`
       
      {
        "book" : {
             "bookId" : "2"
             },
        "wishId" : "1"
      }
      
    

## Credits

1. Spring Initializer for providing the template  - "https://start.spring.io"
2. Postman platform for using APIs - https://www.postman.com

