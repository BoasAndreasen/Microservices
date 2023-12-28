# micronaut-solutions

Model solutions for the Micronaut labs: book microservice.

## Bounded context

This microservice manages a small book database, where `Book`s are written by `Author`s and read by `User`s.

```mermaid
%%{init:{'flowchart':{'nodeSpacing': 120, 'rankSpacing': 60}}}%%
classDiagram
  direction RL

  class Book {
    id: long
    title: String
    year: int
  }

  class User {
    id: long
    username: String
  }

  User "*" -- "*" Book: reads
```
