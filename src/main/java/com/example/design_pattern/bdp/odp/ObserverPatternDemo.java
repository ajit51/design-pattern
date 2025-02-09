package com.example.design_pattern.bdp.odp;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create the Subject
        NotificationSystem notificationSystem = new NotificationSystem();

        // Create Observers
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");
        Observer admin = new Admin("Charlie");

        // Register Observers
        notificationSystem.addObserver(user1);
        notificationSystem.addObserver(user2);
        notificationSystem.addObserver(admin);

        // Notify Observers
        notificationSystem.notifyObservers("New Product Launch!");

        // Output:
        // Alice received message: New Product Launch!
        // Bob received message: New Product Launch!
        // Admin Charlie got notification: New Product Launch!

        // Remove an Observer
        notificationSystem.removeObserver(user1);

        // Notify again
        notificationSystem.notifyObservers("Big Discount on Electronics!");

        // Output:
        // Bob received message: Big Discount on Electronics!
        // Admin Charlie got notification: Big Discount on Electronics!
    }
}
