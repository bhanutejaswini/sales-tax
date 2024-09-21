# Sales Tax Calculator

This Java application calculates the sales tax on purchased items, providing a receipt that lists each item, its total price including tax, and the total sales tax paid. The application supports basic sales tax rules and additional import duties.

## Features

- Calculates sales tax at a rate of 10% for all goods, except for books, food, and medical products which are exempt.
- Applies an additional 5% import duty on all imported goods, with no exemptions.
- Rounds the calculated sales tax up to the nearest 0.05.

## Steps to Run the Project

### Using Terminal

1. **Compile the Project**:
   - Ensure you have the Java Development Kit (JDK) installed.
   - Navigate to the project directory and to the `src/main/java` folder in the terminal:
     ```bash
     cd src/main/java
     ```
   - Compile the Java files:
     ```bash
     javac org/salestax/*.java
     ```

2. **Run the Application**:
   - Run the main class:
     ```bash
     java org.salestax.Main
     ```

3. **Enter Input**:
   - Use the following format for input:
     ```
     [quantity] [item name] at [price]
     ```

4. **Finish Input**:
   - Type `done` when you are finished entering items.

5. **Output**:
   - The application will print a receipt with each item's total price (including tax), the total sales taxes, and the overall total.

### Using IntelliJ IDEA

1. **Clone the Repository**:
   - Open IntelliJ IDEA.
   - Go to `File` > `New` > `Project from Version Control`.
   - Enter the repository URL and choose a directory to clone into. Click `Clone`.

2. **Open the Project**:
   - Once cloned, IntelliJ should automatically open the project. If not, go to `File` > `Open` and select the project directory.

3. **Import Maven Dependencies**:
   - IntelliJ should automatically detect the `pom.xml` file and prompt you to import the Maven project. If it doesn't, you can do it manually by right-clicking on the `pom.xml` file and selecting `Add as Maven Project`.

4. **Run the Application**:
   - Open `Main.java` in the `src/main/java/org/salestax` directory.
   - Right-click anywhere in the file and select `Run 'Main.main()'`. This will start the application.

5. **Enter Input**:
   - Use the following format for input:
     ```
     [quantity] [item name] at [price]
     ```

6. **Finish Input**:
   - Type `done` when you are finished entering items.

7. **Output**:
   - The application will print a receipt with each item's total price (including tax), the total sales taxes, and the overall total.

8. **Run Tests**:
   - To run tests, navigate to the test directory in IntelliJ:
     - Right-click on the test class or method you wish to run and select `Run 'TestClassName'` or `Run 'methodName'`.
     - To run all tests in a package, right-click on the package and select `Run 'All Tests'`.
