# Vehicle Management System

An OOP template for building Vehicle Management Systems in Java.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction
VehicleManagementSystem is a Java-based template designed to help developers create vehicle management systems using Object-Oriented Programming principles.

## Features
- Abstract base class `Vehicle` with methods for rental cost calculation and availability checks.
- Concrete vehicle classes (`Car`, `Motorcycle`, `Truck`) inheriting from `Vehicle`.
- Encapsulation of vehicle data with private fields and public getter/setter methods.
- Implementation of polymorphism through interfaces and method overriding.
- Composition with supporting classes like `Customer`, `RentalAgency`, and `RentalTransaction`.

## Installation
To set up the template, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/Cyril-Nii/VehicleManagementSystem.git
   ```
2. Navigate to the project directory:
   ```
   cd VehicleManagementSystem
   ```
3. Compile the project:
   ```
   javac -d bin src/main/java/com/vehiclemanagement/*.java
   ```

## Usage
Provide examples of how to extend the template to create specific vehicle management systems. Include code snippets for adding new vehicle types, managing rentals, and handling transactions.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the [MIT License](LICENSE).
