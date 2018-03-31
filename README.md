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


## DB SCHEMA

Database: `EmailSignUp`
- Collection: `emails`
- Manually Created: Yes
- Blockchain: No


Database: `UP`
- Collection: `MarketFeasibility`
- Manually Created: Yes
- Blockchain: Yes
- Initial Block:

```
blockIndex:1
previousHash:"def456"
blockTimestamp:"today"
blockHash:"ad8fc3330f4e363ec878975fe3d711db6537f82e763dc4853b22ab3bc70b2b00"
blockData:"hello world"
previousIndex:0
```


Database: `MarketFeasibility`
- Collection: programmatically generated collection with name equal to SHA256 output of previous record
- Blockchain: Yes
- Initial Block: N/A

