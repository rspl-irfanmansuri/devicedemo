# devicedemo
For demo purposes, we have used below technology and database.

Spring Boot
Spring Data
MySql Database
Spring Boot Rest API
map struct lib for converting Entity to Dto and vice versa.
Postman for Testing

Create Device Warranty Record Postman collection
Methos: POST
URL: http://localhost:8081/createOrUpdate
Body:
    {
    "manufacturer": "MI",
    "modelName": "S10",
    "modelCode": "S10",
    "deviceType": "PHONE",
    "macID": "",
    "imei1": "1234567898765432",
    "imei2": "1234567898765432",
    "warranty":[
        {
            "warrnatyType":"SCREEN_WARRANTY"
        },
        {
            "warrnatyType":"INTERNAL_WARRANTY"
        },
        {
            "warrnatyType":"EXTENDED_WARRANTY"
        }
    ]
}

Response Status - 200
ResponseBody:
{
    "id": 1,
    "manufacturer": "MI",
    "modelName": "S10",
    "modelCode": "S10",
    "deviceType": "PHONE",
    "macID": "",
    "imei1": "1234567898765432",
    "imei2": "1234567898765432",
    "warranty": [
        {
            "warntyId": null,
            "warrnatyType": "SCREEN_WARRANTY",
            "device": null
        },
        {
            "warntyId": null,
            "warrnatyType": "EXTENDED_WARRANTY",
            "device": null
        },
        {
            "warntyId": null,
            "warrnatyType": "INTERNAL_WARRANTY",
            "device": null
        }
    ]
}




Fetch Postman
URL:http://localhost:8081/fetch
Method: POST
Response status: 200
Response Body:
[
    {
        "id": 1,
        "manufacturer": "MI",
        "modelName": "S10",
        "modelCode": "S10",
        "deviceType": "PHONE",
        "macID": "",
        "imei1": "1234567898765432",
        "imei2": "1234567898765432",
        "warranty": [
            {
                "warntyId": null,
                "warrnatyType": "EXTENDED_WARRANTY",
                "device": null
            },
            {
                "warntyId": null,
                "warrnatyType": "SCREEN_WARRANTY",
                "device": null
            },
            {
                "warntyId": null,
                "warrnatyType": "INTERNAL_WARRANTY",
                "device": null
            }
        ]
    }
]

