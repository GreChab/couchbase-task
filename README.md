# Couchbase-task

Implementation part of all task you can find in this repository. This is basic implementation as per task requirement and such area as exception handling, checking any posibilities before user creating were not taken into consideration. 

Task 1: Connect Spring Boot with Couchbase and create first document 

**No documents in collection**
![empty_collection](https://github.com/user-attachments/assets/89b17639-543e-47f3-965d-7303e239600f)
**Create a new user via API method call**
![create_user_postman](https://github.com/user-attachments/assets/d189a5e5-bc4d-4e3f-9a82-2a48d02936a6)
**New doc in collection**
![doc_collection](https://github.com/user-attachments/assets/9eea433a-1642-4abb-be55-5fed82fd5c07)

Task 2: Create index for searching by field

**No indexes**
![no_index](https://github.com/user-attachments/assets/ef791061-7d7b-4a81-bc20-1cfdc026cc16)
**Execute a query to create an index for email field**
![index_email_created](https://github.com/user-attachments/assets/cfa7d18f-f5eb-442f-b6cf-8e94a9c168d7)
**Email index on list**
![email_index](https://github.com/user-attachments/assets/303880dc-7ca0-4992-b9fc-caa65a416ad7)
**Verify that the user is available by email via API method call**
![find_user_by_email](https://github.com/user-attachments/assets/20dfcb7d-1a3f-4fc8-a969-5f1134a11d6d)

Task 3: Embedded objects 

**Verify that the Couchbase document is updated after the API method call**
![add_sport](https://github.com/user-attachments/assets/5a3abdf3-2fe1-4aeb-834b-70c6cba0ad94)
![doc_couchbase](https://github.com/user-attachments/assets/20d9f56c-d091-4e36-9a8e-dd4f6b21cb7c)

Task 4: Search by embedded object fields

**Create an index in Couchbase for sportName**
![sportName_idx](https://github.com/user-attachments/assets/75521815-6062-417c-88c4-b8a0d58e5776)
![list_indexes](https://github.com/user-attachments/assets/7ebdb883-1019-4fe0-85a9-33de13053db3)
**Verify that some users are returned after the method call**
![find_by_sportName](https://github.com/user-attachments/assets/90c96f56-5d84-4025-b61b-c6f207f96c43)

Task 5: Perform full-text search

**Create a search index via Couchbase Web Console**
![search_idx](https://github.com/user-attachments/assets/fd4a69e4-3e0b-4ff2-a4b4-11bb13c88ac9)
**Perform a search request via Couchbase Web Console and make sure that you are able to see some results**
![search_query](https://github.com/user-attachments/assets/4a8be7d2-49a7-4cf4-b8a4-f3b5b70725ba)
**Verify that some users are returned after the method call**
![search_by_query](https://github.com/user-attachments/assets/dcf6a9e3-f835-4d83-beb9-cec3d6deaf84)


