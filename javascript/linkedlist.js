//Linked List
class Node {
  constructor(val) {
    this.val = val;
    this.prev = null;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  add(val) { //Adds node to end of LinkedList (equivalent to push)
    var newNode = new Node(val);
    if(!this.head) { //Null head
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode; //Sets the tail's next to the new node
      this.tail.next.prev = this.tail; //Sets the new node's previous to the current tail
      this.tail = newNode; //Reset tail
    }
    this.length += 1;
    return this;
  }

  pop(val) { //Removes and returns last node of LinkedList
    if(!this.head) {
      return undefined;
    }
    var temp = this.tail;
    this.tail = this.tail.prev; //Point tail to the previous value
    this.tail.next = null; //Set new tail's next node to null
    this.length -= 1;
    if(this.length === 0) { //Reset head and tail to null after one element list popped
        this.head = null;
        this.tail = null;
    }
    return temp;
  }

  shift() { //Return head of LinkedList
    if(!this.head) {
      return undefined;
    }
    var temp = this.head;
    this.head = this.head.next;
    this.head.prev = null;
    this.length -= 1;
    if(this.length === 0) {
      this.tail = null; //Set tail to null if head is last element of list when shifted
    }
    return temp;
  }

  unshift(val) { //Push new node to head
    var newNode = new Node(val);
    if(!this.head) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.head.prev = newNode;
      newNode.next = this.head;
      this.head = newNode;
    }
    this.length += 1;
    return this;
  }

  get(index) { //Gets node at index
    if(index >= this.length || index < 0) {
      return null;
    }
    var node = this.head;
    var i = 0;
    while(i !== index) {
      node = node.next;
      i++;
    }
    return node;
  }

  set(index, val) { //Sets value of node based on index and returns boolean
    var node = this.get(index);
    if(node) {
      node.val = val;
      return true;
    }
    return false;
  }

  insert(index, val) {
    if(index === 0) {
      unshift(val);
    } else {
      var node = this.get(index - 1);
      if(node) {
        var newNode = new Node(val);
        newNode.next = node.next;
        newNode.prev = node;
        node.next.prev = newNode;
        node.next = newNode;
      }
    }
    return this;
  }

  traverse() { //Prints all list nodes, can be used to access new tail after pop in SinglyLinkedList
    var current = this.head;
    while(current) {
      console.log(current);
      current = current.next;
    }
  }
}
