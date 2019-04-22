//Queue class
class Queue {
    
    //Array is used to implement the Queue
    constructor() {
        this.items = [];
    }
    
    //enqueue function
    enqueue(element) {
        //adding element to the queue
        this.items.push(element);
    }
    
    //dequeue function
    dequeue() {
        //removing elemnt from the queue
        //return underflow when called on empty queue
        if(this.isEmpty()) {
            return "Underflow";
        }
        return this.items.shift();
    }
    
    front() {
        //return the Front element of the queue without removing it
        if(this.isEmpty()) {
            return "No elements in Queue";
        }
        return this.items[0];
    }
    
    size() {
        return this.items.length;
    }
    
    isEmpty() {
        //return true if the queue is empty
        return this.items.length === 0;
    }
    
    printQueue() {
        var str = "";
        for(var i = 0; i < this.items.length; i++) {
            str += this.items[i] + " ";
        }
        return str;
    }
}