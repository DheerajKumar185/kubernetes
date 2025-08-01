# kubernetes
Spring Boot CRUD Docker Kubernetes
1. curl --location 'http://localhost:8080/employees'
2. curl --location 'http://localhost:8080/employees' \
--header 'Content-Type: application/json' \
--data '{
    "name":"Dheeraj",
    "salary":123,
    "department":"IT"
}'
3. curl --location 'http://localhost:8080/employees/4'
4. curl --location --request PUT 'http://localhost:8080/employees/4' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Praveen",
    "salary": 120,
    "department": "Farming"
}'
5. curl --location --request DELETE 'http://localhost:8080/employees/4'
