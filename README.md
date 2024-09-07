# ATM Simulation

## Overview

This project simulates a basic ATM system using Java. It allows users to perform the following operations:
- Check Account Balance
- Withdraw Money
- Deposit Money

The ATM system uses a simple PIN-based authentication to access the menu options.

## Features

- **PIN Authentication**: Users must enter a correct PIN to access the menu.
- **Check Balance**: Displays the current balance of the account.
- **Withdraw Money**: Allows users to withdraw a specified amount from their account.
- **Deposit Money**: Allows users to deposit a specified amount into their account.

## Project Structure

- **`ATM.java`**: Contains the logic for ATM operations, including PIN authentication, balance checking, money withdrawal, and deposit.
- **`ATMMachine.java`**: Entry point for the application, which initializes the ATM object and starts the PIN verification process.

## Classes and Methods

### `ATM`

- **Fields:**
  - `float balance`: Holds the current balance of the account.
  - `int PIN`: Default PIN for authentication (set to 4455).

- **Methods:**
  - `void checkPin()`: Prompts the user to enter their PIN and verifies it.
  - `void menu()`: Displays the main menu and processes user choices.
  - `void checkBalance()`: Displays the current balance.
  - `void withdrawMoney()`: Allows the user to withdraw a specified amount.
  - `void depositMoney()`: Allows the user to deposit a specified amount.

### `ATMMachine`

- **`public static void main(String[] args)`**: Main method that creates an `ATM` object and starts the PIN check process.

## Usage

1. **Compile and Run the Project**: 
   - To compile the code, use:
     ```bash
     javac ATM.java ATMMachine.java
     ```
   - To run the application, use:
     ```bash
     java ATMMachine
     ```

2. **Interact with the ATM**:
   - Enter the default PIN `4455` to access the menu.
   - Choose from the menu options to check your balance, withdraw money, or deposit money.
   - Follow the prompts to enter the amounts for withdrawal or deposit.

## Example Interaction

Enter your pin: 4455 Enter your choice :

1. Check A/C Balance :
2. Withdraw Money :
3. Deposit Money :
4. Exit :


## Important Notes

- The balance starts at `0.0` and needs to be deposited before withdrawal.
- The `Scanner` objects used in the methods should ideally be closed properly to avoid resource leaks. In this simple implementation, closing the `Scanner` inside methods can cause `NoSuchElementException` when called multiple times. For a real application, proper resource management should be implemented.

## Contributing

Feel free to fork this repository and submit pull requests. If you have suggestions for improvements or find any issues, please open an issue or contact me.


## Contact

For any queries, you can reach me at yuvrajwalia2023@gmail.com.


