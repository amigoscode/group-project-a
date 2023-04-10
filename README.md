Table of contents
=================
- [Table of contents](#table-of-contents)
  - [Overview](#overview-a-nameoverview-a)
  - [Installation](#installation-a-nameinstallation-a)
    - [Requirements](#requirements-a-namerequirements-a)
    - [Usage](#usage-a-nameusage-a)
  - [Repo-Content](#repo-content-a-namerepo-content-a)
    - [.github](#--github-a-namegithub-a)
    - [design](#--design-a-namedesign-a)
      - [database](#--database)
      - [infrastructure](#--infrastructure)
    - [docs](#--docs-a-namedocs-a)
    - [scripts](#--scripts-a-namescripts-a)
    - [src](#--src-a-namesrc-a)
      - [src/main](#--srcmain-a-namesrcmain-a)
      - [src/main](#--srctest-a-namesrctest-a)
  - [Contribution](#contribution-a-namerepo-content-a)
    - [Branching-Strategy](#--branching-strategy-a-namebranching-strategy-a)
    - [Peer-Contribution](#peer-contribution)
  - [Credit](#--credit-a-namecredit-a)



## Overview <a name="overview"></a>

Repository /amigoscode/group-project-a Contains directories and files which are need in the Budget Tracker App for:

1. Configuration of the deployment server and CI/CD workflows
2. Front-end part of the application
3. Backend API files of the application

## Installation <a name="Installation"></a>
### Requirements <a name="requirements"></a>
1. Java 17
2. Maven
3. Springboot V3
4. PostgreSQL
5. Angular
6. Node.js

### Usage <a name="usage"></a>
#### Local <a name="local"></a>.
1. Clone the repository in to your local computer

#### Online <a name="online"></a>
1. Head over to your browser and follow the link : 

## Repo-Content <a name="repo-content"></a>
### - .github <a name=".github"></a>

### - design <a name="design"></a>
#### - database
#### - infrastructure

### - docs <a name="docs"></a>

### - scripts <a name="scripts"></a>

### - src <a name="src"></a>
#### - src/main <a name="src/main"></a>
##### - config <a name="config"></a>
##### - controllers <a name="controllers"></a>
##### - db <a name="db"></a>
##### - dto <a name="dto"></a>
##### - email <a name="email"></a>
##### - exceptions <a name="exceptions"></a>
##### - models <a name="models"></a>
##### - repository <a name="repository"></a>
##### - services <a name="services"></a>
##### - shared <a name="shared"></a>
##### - utils <a name="utils"></a>
##### - BudgetTracker <a name="budget-tracker-class"></a>

#### - src/test <a name="src/test"></a>

### - LICENCE <a name="licence"></a>

### - pom.xml <a name="pom-xml"></a>

### - README.md <a name="readme-md"></a>

## - Contribution <a name="repo-content"></a>
### - Branching-Strategy <a name="branching-strategy"></a>

The project is composed of Three main branches:
- `main` : The production branch
- `release` : Branch for every release of the products
- `develop` : Development branch for contribution and consolidation before release

There a re side branches used for adding features and linked to issues in the backlog (feature/GPA-01).
The naming convention of the branches is based on the project name Goup A and the issue number. 
For example feature/GPA-01 branch, we refer to:
* GPA: Group A
* 01: Issue number

### - Peer-Contribution <a name="peer-contribution"></a>
For any external contribution and collaboration on the project, you need to proceed as follows:
 - Clone/fork the repository
 - Create a branch after your changes (`feature/GPA-05-support`)
 - Pull latest changes from the `develop` branch on master repo
 - Commit your changes and open a pull request on the `develop` branch

## - Credit <a name="credit"></a>
- Ahmed BURALE catabilar@gmail.com
- Andreas MOUZONG andreasmouzong@gmail.com

