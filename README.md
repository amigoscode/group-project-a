# Introduction: 
The Budget Tracker is a simple application that assists users in monitoring their finances.
Each user has their own wallet that keeps track of their transactions.
The application permits users to make deposits and withdrawals. 

## Layers in the Project:
The Budget Tracker project has three primary logical layers: the Servlet layer, the Service layer, and the DAO layer.
Each layer is responsible for its own tasks and communicates with the other layers according to a predetermined set of rules. 

## Servlet Layer:
The Servlet layer handles incoming client requests and includes the following classes: 
* **UsersServlet:** Handles requests related to users.
* **WalletServlet:** Handles requests related to wallets.
* **TransactionsServlet:** Handles requests related to transactions.

## Service Layer:
The Service layer includes the following classes, which provide the business logic for modifying data in memory: 
* **UsersService:** Handles user manipulation.
* **WalletService:** Handles wallet manipulation.
* **TransactionsService:** Handles transaction manipulation.

## DAO Layer:
The DAO layer consists of the following classes and contains the database communication logic: 
* **UsersDAO:** Communicates with the database for user manipulation.
* **WalletsDAO:** Communicates with the database for wallet manipulation.
* **TransactionsDAO:** Communicates with the database for transaction manipulation.

## Entities:
In addition to the above layers, the project also includes the following entity classes:

* **User:** Represents a single user.
* **Wallet:** Represents a single wallet.
* **Transaction:** Represents a single transaction.

## Utilities:
The Budget Tracker project also includes the following utility classes:
* **ConnectionManager:** Provides a connection to the database.
* **ExceptionMessage:** Handles exceptions and sends proper messages to the client.
* **ResponseMessage:** Sends proper response messages to the client.
* **ServletUtil:** Provides widely-used methods for the servlet layer.

## Class Relationships:
The classes in the **Servlet layer** communicate with the outside world **(the client)** and the **Service layer**. The **Servlet layer** classes do not communicate directly with the **DAO layer**. The **Service layer** communicates with both the **Servlet layer** and the **DAO layer**. The **DAO layer** communicates with the database and the **Service layer**. The entity classes do not communicate with any other classes.

## Database:
The Budget Tracker application uses a database to store user, wallet, and transaction information. The ConnectionManager class provides a connection to the database.

## Exception Handling:
The ExceptionMessage class handles exceptions and sends proper messages to the client.

## Conclusion:
The Budget Tracker project is a simple application that helps users keep track of their finances. The project includes three main logical layers, entity classes, and utility classes. The project uses a database for data storage and the ConnectionManager class provides a connection to the database. The ExceptionMessage class handles exceptions and sends proper messages to the client.
