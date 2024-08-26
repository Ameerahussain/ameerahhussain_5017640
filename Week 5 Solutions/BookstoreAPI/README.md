# BookStoreAPI



#****For Review Purpose only****

# Curl to generate token :

 curl --location --request POST 'http://localhost:8080/auth/token' \
--header 'Content-Type: application/json' \
--data-raw '{
  "email": "admin@test.com",
  "password": "test"
}'

# Valid Roles to generate token :

ADMIN_ROLE : admin@test.com

USER_ROLE : test@test.com

