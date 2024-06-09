package DesignPattern.BehavioralPattern.ChainOfResponsibility;

// The Chain of Responsibility Pattern is a behavioral design pattern that allows an object
// to pass a request along a chain of potential handlers until the request is handled.
// Each handler in the chain either processes the request or passes it to the next handler in the chain.
// This pattern decouples the sender of the request from the receiver,
// allowing multiple objects to handle the request without the sender needing to know which object will handle it.

// Example of the Chain of Responsibility Pattern in a Java Spring Application
// Let's consider an example where we have a logging system with multiple levels of logging (e.g., DEBUG, INFO, ERROR).
// Each level of logging is handled by a different handler in the chain.