# Java-Week2-Hero Squad With DB
### Description
This project is a hero-squad app that allows a user to manage heroes with efficiency. It also has squad integration so that you can add a hero to a squad. 

### Live Link
<a href="https://.herokuapp.com/">https://todolistwithdb.herokuapp.com/</a>

### Technologies Used
This project was created using:
 1.Java
 2.Spark
 3.Handlebars
 4.Gradle
 5.Postgresql

### Setup/Installation
1.Install Postgres SQL to be able to create a local database on your machine.
2.Fork this repository.
3.Clone the repository to your machine.
4.Open the folder in your IDE of choice.
5.Run the command postgres in a terminal.
6. Create two `.sql` files named `create.sql` and `drop.sql`. The `create.sql` file should contain
 the following commands:
    `CREATE DATABASE herosquad;`
    
    `\c herosquad;`
    
    `CREATE TABLE heroes (id SERIAL PRIMARY KEY, name VARCHAR, age INTEGER, specialPower VARCHAR, weakness VARCHAR, squadId INTEGER);`
    
    `CREATE TABLE squads (id SERIAL PRIMARY KEY, squadName VARCHAR, causeDedicatedToFighting VARCHAR, squadMembersCounter INTEGER);`
    
    `CREATE DATABASE herosquad_test WITH TEMPLATE herosquad;`

The `drop.sql` file should have the following commands:
    `DROP DATABASE herosquad_test;`
    
    `DROP DATABASE herosquad;`
    
7.Run the command `psql < create.sql` in a separate terminal window.

8.Go to the IDE and navigate to the folder with the main file App.java, then compile and run the
program on the terminal. Alternatively, run the program in your IDE.

9.In the terminal, locate the url address showing the spark server port number. For example
, this can be http://localhost:4567/user

You can then change the routes to access different pages.

### Support  and Contacts
Einstein Eliam Murithi. <br/> If you run into any issues or would like to make a contribution to the
work kindly email me at <a href="einsteineliam@gmail.com">einsteineliam@gmail.com</a>

## License
This project is free to use under the **GNU General Public License**. See the full [LICENSE](https://choosealicense.com/licenses/gpl-3.0/) for details.