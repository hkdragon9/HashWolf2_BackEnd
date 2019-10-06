# HashWolf2_BackEnd

## Setup
If you do not have MySQL Server downloaded, find it here: `https://dev.mysql.com/doc/refman/8.0/en/installing.html`

Once downloaded, create a MySQL server. To run the code locally, make MySQL available at port 3306 with password=root. Alternatively you could set database connection in `.hashwolf2/src/main/resources/application.properties`

Create a new schema in your MySQL server named `hashwolf2`, then import data from `DatabaseDump.sql` to the schema. These could be done in MySQL Workbench.

## Run
Under `hashwolf2` folder, run:
```
mvn clean spring-boot:run
```
Once the application starts, you should expect to see a few JSON objects printed at `http://localhost:8080/hashwolf2/all`. They should match the rows in MySQL Table `user`.

## API Documentation:
1. **/all**:

  - display all the data entries currently in your database

  - e.g. `http://localhost:8080/hashwolf2/all`


2. **/add**:

  - add a `User` instance to the `user` TABLE

  - note that this must be used along with Postman (as far as I know).

  - Postman can be found here: `https://www.getpostman.com/`

  - e.g. `http://localhost:8080/hashwolf2/add`

  (Note: the params after "add" doesn't matter, so you can add add?user_name = ??? etc but those params don't take into account)


3. **/insert**:

  - insert a  `User` instance to the `user` TABLE, with the params specified in your url

  - note that it must follow the format: `insert?user_userID={user_id}&user_name={name}&user_email={email}` though the params can be null.

  - e.g. `http://localhost:8080/hashwolf2/insert?user_userID=250&user_name=oski&user_email=oski@ucb.com`
