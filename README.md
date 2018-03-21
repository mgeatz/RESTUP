# RESTUP

Start Up:

If you are performing CRUD operations, make sure you have started the mongod server.

open terminal
`sudo mongod`

open Mongo Explorer or MongoDB Compass and make a connection to the mongo server.

### Add Block
POST http://localhost:8080/marketFeasibility
Content-Type: application/json

{"blockData":"whatever data you want to save"}


###


Service Sequence

POST at /marketFeasibility with application/json formatted as {"blockData":"whatever data you want to save"}. 
The blockData property will include a value that represents the UP AIRWAY market feasibility test results. Data
points to be included in the blockData are, as follows:

{
    IP: <>,
    origin: <>,
    destination: <>,
    departureDate: <>,
    returnDate: <>,
    departureTime: <>,
    returnTime: <>,
    numberOfTravelers: <>,
    seatChoices: <>
}  












