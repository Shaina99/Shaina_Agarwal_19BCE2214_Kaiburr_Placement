# Shaina_Agarwal_19BCE2214_Kaiburr_Placement
Kaiburr Placement Task1 and Task4

Task 1. Java REST API example. 


Implement an application in java which provides a REST API with endpoints for searching, 
creating and deleting “server” objects: 

1)POST: It helps to add servers or records with the help of JSON


Adding first record using POST:
![image](https://user-images.githubusercontent.com/111378981/228599676-09b2403b-8678-4e67-93b1-c1c0d25cb415.png)
![image](https://user-images.githubusercontent.com/111378981/228600056-499a375a-f53f-4171-bf7f-8962b7fba46e.png)

Adding second record using POST:
![image](https://user-images.githubusercontent.com/111378981/228601015-f7bd1605-799d-4cce-bb43-34046d984bce.png)
![image](https://user-images.githubusercontent.com/111378981/228601058-79e64b3a-db56-46c8-a806-07946d86e77d.png)

Adding third record using POST:
![image](https://user-images.githubusercontent.com/111378981/228601238-32803095-adfc-408b-bb9c-4a4da259c24b.png)
![image](https://user-images.githubusercontent.com/111378981/228601286-a4ea8a5d-4e6b-418a-8a5a-35d9f26d5c64.png)

Adding fourth record using POST:
![image](https://user-images.githubusercontent.com/111378981/228601681-a84d2bc8-edf0-417a-96f4-61f33409d776.png)
![image](https://user-images.githubusercontent.com/111378981/228601738-a455e470-e4f0-42cc-a48f-8ccc1ce757de.png)




2)GET:It should return all the servers if no parameters are passed. When server id 
is passed as a parameter it returns a single server or 404 if there’s no such a server


GET Request without parameter:
![image](https://user-images.githubusercontent.com/111378981/228602836-a6ad5ace-762e-4167-90e9-072bb99b746b.png)

GET Request using Id of the Car as a parameter:
![image](https://user-images.githubusercontent.com/111378981/228603036-43a763c6-ed9f-4f60-ba6d-77d70424d60d.png)




3)PUT:The server object is passed as a json-encoded message body .

In this image car Price is updated using this method.

Before Using PUT:
![image](https://user-images.githubusercontent.com/111378981/228604193-fe964e7d-221e-4e0a-be59-85234048d9d5.png)

After Using PUT:
![image](https://user-images.githubusercontent.com/111378981/228604279-973d4263-76a6-4e29-842d-bf96d7b7bfda.png)
![image](https://user-images.githubusercontent.com/111378981/228604346-146dc0cd-9609-452f-9d3a-127d9c3411d9.png)



4)DELETE: It deletes a server. The parameter is a server ID. 

Car Id 3 gets deleted

![image](https://user-images.githubusercontent.com/111378981/228605271-042cda94-f160-4e10-925d-bd607b0d4504.png)
![image](https://user-images.githubusercontent.com/111378981/228605438-2e9641d0-a145-4e81-bda9-93f38b143e0b.png)

5)GET BY NAME: It finds servers by name. The parameter is a string. It checks if a server name 
contains this string and return one or more servers found. It returns 404 if nothing is found. 


![image](https://user-images.githubusercontent.com/111378981/228605759-21788daa-dd00-41b5-a976-582784ade5e2.png)




Task4:WEB UI Forms. 

Create a basic WEB UI frontend for an application that you created for #1 or #2 using any UI 
framework of your choice. You should be able to create, show and delete records from your UI.



1)CREATE CAR RECORDS:

![image](https://user-images.githubusercontent.com/111378981/228606702-f19fa898-e402-491e-b15c-6ae605fa8e2f.png)


2)SHOW CAR RECORDS:

![image](https://user-images.githubusercontent.com/111378981/228606993-306447be-4db5-46b8-ba71-8cc2ba27e66d.png)


3)DELETE CAR RECORDS:

After deletion gets Redirected to Main Page:

![image](https://user-images.githubusercontent.com/111378981/228609812-42a9872f-0164-4d3e-9e23-098606a7b543.png)






























