# HashWolf2_BackEnd
(Note:Just a preliminary README file, by 9/29/2019)

## Run 
Note: running this program requires the installation of mysql,
which can be found here: `https://dev.mysql.com/doc/refman/8.0/en/installing.html`

### Basic functionalities:
1. /all:

  -display all the data entries currently in your database
  
  - e.g. `http://localhost:8080/hashwolf2/all`
  
  
2. /add:

  -add a `User` instance to the `user` TABLE
  
  -note that this must be used along with Postman (as far as I know).
  
  -Postman can be found here: `https://www.getpostman.com/`
  
  - e.g. `http://localhost:8080/hashwolf2/add` 
  
  (Note: the params after "add" doesn't matter, so you can add add?user_name = ??? etc but those params don't take into account)


3. /insert:

  -insert a  `User` instance to the `user` TABLE, with the params specified in your url
  
  -note that it must follow the format: `insert?user_userID={user_id}&user_name={name}&user_email={email}` though the params can be null.
  
  - e.g. `http://localhost:8080/hashwolf2/insert?user_userID=250&user_name=oski&user_email=oski@ucb.com`
  
