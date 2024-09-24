# Rathna_Accuknox_Assignment

To run the automated test, ensure that you have the following installed

1. **Java Development kit (JDK)** - version 8 or later
2. **Maven** - For managing dependencies and running tests
3. **Chrome Web Browser** - For running the frontend UI test using selenium
4. **Backend and FrontEnd services** - Make sure both the services are running locally or having the correct URL

###Installing the Dependencies
To install the required dependencies , clone the repository and run the following command in the root directory:

**Git Bash**
git clone https://github.com/RathnaSridhar/Rathna_Accuknox_Assignment.git
cd Rathna_Accuknox_Assignment
mvn clean install

**To tun the Automated Test**
use the command **mvn test**

Backend test is written in the backEndTest Package

The backend URL is configured in the variable **URI** in the BackEnd class
The expected message is stored in the variable expMessage

Frontend test is written in the frontEndTest Package

The backend URL is configured in the variable **frontEndURL** in the FrontEnd class
The expected message is stored in the variable expMessage

