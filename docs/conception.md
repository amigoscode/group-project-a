# Group A - Budget Tracker App Conception

Table of contents
===================
- [Table of contents](#-table-of-contents)
  - [Overview](#overview-a-nameoverview-a)
  - [Database-Design](#database-design-a-namedatabase-design-a)
  - [Flow-Design](#flow-design-a-nameflow-design-a)
  - [Usecases](#use-cases-a-nameuse-cases-a)
  - [Architecture](#architecture-a-namearchitecture-a)
    - [Application](#application-a-nameapplication-a)
    - [Infrastructure](#infrastructure-a-nameinfrastructure-a)
  - [API-Design](#api-design--a-name--api-design--a-)
  - [Conclusion](#conclusion-a-nameconclusion-a)

## Overview <a name="overview"></a>
The Budget Tracker is a simple application that assists users in monitoring their finances.
Each user has their own wallet that keeps track of their transactions.
The application permits users to make deposits and withdrawals. 
Each action performed in the application is backed by an email notification and access to the application is protected 
with Google Auth and MFA (using One Time Password).

## Database-Design <a name="database-design"></a>

The Budget Tracker application uses a database to store user, wallet, and transaction information. The ConnectionManager class provides a connection to the database.

## Database:
![database-design-v-1.1.png](..%2Fdesign%2Fdatabase%2Fdatabase-design-v-1.1.png)

## Flow-Design <a name="flow-design"></a>

The brief overall flow of how the Budget Tracker application can be expressed as follows:

`User Registration:` A new user creates an account by providing their personal information, including their name, email, and password. 
The authentication information is stored in the Authentication table, and the user information is stored in the User table.

Login: A user logs into the application using their email and password. 
The system checks the authentication information stored in the Session table and grants access to the user if the login credentials are correct.

`Multifactor Authentication (MFA):` After a user logs in, they can choose to enable multifactor authentication for additional security. 
The system generates a secret key and stores it in the Authentication table. 
The user can use this key to configure a third-party authenticator app and complete the setup process.

`Google Authentication:` Alternatively, a user can also choose to enable Google authentication, which uses the user's Google account for authentication. 
The system generates a unique identifier for the user's Google account and stores it in the Authentication table.

`Wallet Creation:` After logging in, a user creates a new wallet to keep track of their finances. 
The system creates a new record in the Wallet table and associates it with the user's user_id.

`Transaction Logging:` The user logs their transactions by creating new records in the Transaction table. 
Each transaction is associated with the user's wallet and can include details such as the amount, description, and category.

`Budget Creation:` The user can create a new budget to set spending goals for specific categories. 
The system creates a new record in the Budget table and associates it with the user's user_id.

`Budget Category Association:` The user can associate each budget with one or more categories by creating records in the Budget_Category table. 
Each record specifies the budget_id and the category_id.

`Notification Generation:` The system generates notifications for each transaction and budget-related event by creating records in the Notification table. 
Each notification is associated with the user's user_id and includes details such as the transaction amount and the budget status.

## Use-Cases <a name="use-cases"></a> 

## Architecture <a name="architecture"></a>

### Application <a name="application"></a>

#### Layers in the Project:

The Budget Tracker project has four primary logical layers: 
- Controller Layer : Handles incoming client requests
- DTO Layer : Handles the sanitization of data before being sent to the client
- The Service layer : The Service layer which provide the business logic of the Budget Tracker App
- The Repository layer : Handles the connection of the underlying business logic with the Database

#### Layout 
Each layer is responsible for its own tasks and communicates with the other layers according to a predetermined set of rules.

## Exception-Handling <a name="exception-handling"></a>
The Exception package contain classes which handle exceptions and send proper messages to the client.

### Infrastructure <a name="infrastructure"></a>

## API-Design <a name="api-design"></a>

## Conclusion <a name="conclusion"></a>




