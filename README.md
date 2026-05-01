The Order Management System is a simple application developed to demonstrate the application of SOLID principles in object-oriented programming using Java. The system simulates the basic process of handling a customer order, including calculating the total cost, placing the order, generating an invoice, and sending a notification.

The project is designed with a modular structure where each functionality is separated into independent components. Interfaces such as OrderCalculator, OrderPlacer, InvoiceGenerator, and NotificationService define specific responsibilities, while their corresponding classes provide concrete implementations. This approach ensures that each class has a single responsibility and promotes cleaner, more maintainable code.

A central class, OrderService, manages the overall workflow by coordinating these components through dependency injection, allowing the system to remain flexible and easily extendable. New features, such as different payment methods or notification types, can be added without modifying existing code.

Overall, the project highlights how applying SOLID principles improves code organization, scalability, and maintainability, making it suitable for real-world software development practices.

## UML DIAGRAM 
![Image]()

