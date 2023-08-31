# power-system-project

#Build project

mvn clean install

#JWT Auth Endpoints

Post API - /api/auth/signup (Add user)

{

"username":"tanz",
"email":"tan@gmail.com",
"password":"1234",
"role":["admin","mod","user"]

}

Post API - /api/auth/signin (Sign in user)

{

"username":"tanz",
"password":"1234",

}



Sign in Response with token:

{
    "accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0YW56IiwiaWF0IjoxNjkzNTAxODM2LCJleHAiOjE2OTM1ODgyMzZ9.K4N-TxspvPW1v5TAwR46Q7o6dmEmURYU3pZPOws7TEk",
    "tokenType": "Bearer",
    "roles": [
        "ROLE_MODERATOR",
        "ROLE_USER",
        "ROLE_ADMIN"
    ]
}




#API Endpoints


add Header (Authorization - Bearer token)

Get API - /api/v1/below-capacity?threshold=500 (Get battery less than threshold capacity )



Post API - /api/v1/batteries (Add Battery)

[
    {
        "name": "battery-3",
        "postcode": "123456",
        "wattCapacity": 522.00
    },
    {
        "name": "battery-2",
        "postcode": "12345",
        "wattCapacity": 500.00
    }
]

GET API - /api/v1/battery-info?startPostcode=1&endPostcode=5&minWattCapacity&maxWattCapacity


#API Docs

/api-docs

#Actuator 

/autuator/**


#Configuration

application.properties