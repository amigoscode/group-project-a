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




