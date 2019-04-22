/*
// queue is initially empty
var Queue = {front: null, back: null, size: 0};

// we will use a node to keep track of the elements
// in the queue which is represented by a linked list
function Node(data, next) {
  this.data = data;
  this.next = next;
} 

// add elements to queue in O(1) time
function enqueue(element) {
  var N = new Node(element, null);
  if (Queue.back === null) {
    Queue.front = N;
    Queue.back = N; 
    Queue.size++;
  } else { 
    Queue.back.next = N; 
    Queue.back = Queue.back.next;
    Queue.size++;
  }
  
}

// remove first element from queue in O(1) time
function dequeue() {
  if (Queue.front !== null) { 
    var first = Queue.front;
    Queue.front = Queue.front.next; 
    Queue.size--;
    return first.data;
  } else {
    if (Queue.back !== null) { Queue.back = null; }
    return 'Cannot dequeue because queue is empty';
  }
}
*/

class Node {
    constructor(val) {
        this.value = val;
        this.next = null;
    }
}

class Queue {
    constructor() { 
        this.first = null;
        this.size = 0;
    }
    
    enqueue(value) {
        const newNode = new Node(value);
        if(this.first === null) {
            newNode.next = this.first;
            this.first = newNode;
            this.size++;
        } else {
            let pointer = this.first;
            newNode.next = pointer.next;
            pointer.next = newNode;
            this.size++;
        }
    }
    
    dequeue() {
        if(this.first === null) {
            return "Queue is already empty!";
        } else {
            const first = this.first;
            this.first = this.first.next;
            this.size--;
            return first;
        }
        
    }
    
    getSize() {
        return this.size;
    }
}


