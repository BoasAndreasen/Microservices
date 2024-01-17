workspace "Name" "Description" {
    model {
      u = person "User"
      admin = person "Administrator"
      s = softwareSystem "Social Media System" {
          cli = container "Video CLI Client"
          cli2 = container "Trending Hashtag CLI Client"
          cli3 = container "Subscription CLI Client"
          cli4 = container "Hashtag Recommendation CLI Client"

          micronaut = container "Video Microservice" {
            domain = component "Domain objects and DTOs"
            services = component "Services"
            repos = component "Repositories"
            events = component "Kafka consumers and praoducers"
            resources = component "Resources"
          }
          
          micronaut2 = container "Trending Hashtag Microservice" {
            domain2 = component "Domain objects and DTOs"
            services2 = component "Services"
            repos2 = component "Repositories"
            events2 = component "Kafka consumers and praoducers"
            resources2 = component "Resources"
          }
          
          micronaut3 = container "Subscription Microservice" {
            domain3 = component "Domain objects and DTOs"
            services3 = component "Services"
            repos3 = component "Repositories"
            events3 = component "Kafka consumers and praoducers"
            resources3 = component "Resources"
          }
          
          micronaut4 = container "Hashtag Recommendation Microservice" {
            domain4 = component "Domain objects and DTOs"
            services4 = component "Services"
            repos4 = component "Repositories"
            events4 = component "Kafka consumers and praoducers"
            resources4 = component "Resources"
          }

          database = container "Video Database" "" "MariaDB" "database"
          database2 = container "Trending Hashtag Database" "" "MariaDB" "database"
          database3 = container "Subscription Database" "" "MariaDB" "database"
          database4 = container "Hashtag Recommendation Database" "" "MariaDB" "database"

          kafka = container "Kafka Cluster"
          kafkaui = container "Kafka-UI Webapp" "" "" webapp
    } 
    
      u -> cli "Uses"
      u -> cli2 "Uses"
      u -> cli3 "Uses"
      u -> cli4 "Uses"
      admin -> kafkaui "Manages"

      cli -> micronaut "Interacts with HTTP API"
      cli2 -> micronaut2 "Interacts with HTTP API"
      cli3 -> micronaut3 "Interacts with HTTP API"
      cli4 -> micronaut4 "Interacts with HTTP API"

      micronaut -> database "Reads from and writes to"
      micronaut -> kafka "Consumes and produces events"
      micronaut2 -> database2 "Reads from and writes to"
      micronaut2 -> kafka "Consumes and produces events"
      micronaut3 -> database3 "Reads from and writes to"
      micronaut3 -> kafka "Consumes and produces events"
      micronaut4 -> database4 "Reads from and writes to"
      micronaut4 -> kafka "Consumes and produces events"

      kafkaui -> kafka "Manages"

      repos -> domain "Creates and updates"
      repos -> database "Queries and writes to"
      services -> domain "Runs business workflows on"
      services -> repos "Uses"
      resources -> repos "Uses"
      resources -> events "Uses"
      resources -> services "Uses"
      resources -> domain "Reads and updates"
      cli -> resources "Invokes"
      events -> kafka "Consumes and produces events in"
    }

    views {
        theme default
        systemContext s {
            include *
        }
        container s {
            include *
        }
        component micronaut {
            include *
        }
        styles {
            element "database" {
              shape Cylinder
            }
            element "webapp" {
              shape WebBrowser
            }
            element external {
              background gray
            }
        }
    }

    configuration {
        scope softwaresystem
    }

}
