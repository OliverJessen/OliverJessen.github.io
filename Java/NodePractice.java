
public class NodePractice{
  public static void main(String[] args){

    LinkedList list = new LinkedList(0);

//Laver forskellige tal til listen.
    list.add(1);
    list.add(3);
    list.add(7);
    list.add(12);

//Har lavet et enhanced for loop, hvor jeg kan skrive forskellige tal og
//tilføjer dem til enden af min liste.
  for(String s : args)
   list.add(Integer.parseInt(s));

//Lavet et tal i starten af indexet.
    list.addFirst(10);

//laver et tal i et sted i indexet.
//Det først tal er placeringen i index, det andet er tallet.
    list.add(4, 120);

//Printer ud alle noderne, samt det største og mindste tal.
    System.out.println("\n" + "Array:");
    list.printAll();
    System.out.println("\n" + "Det største tal er: " + list.highCurrent()  + "\n");
    System.out.println("Det mindste tal er: " + list.lowCurrent() + "\n");
  }
}

class LinkedList {

  Node first = null;

  LinkedList(int startValue) { //Laver en konstruktør, hvori jeg har en node kaldet "first".
    first = new Node(startValue, null);

  }

  Node getNode(int index) {
    //Vi siger at variablen er den første node, og henter derefter hver tal i indexet.
    Node currentNode = first;
    for(int i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  int get(int index) { //Returnerer hver node i indexet med deres værdi.
    return getNode(index).value;
  }

  void printAll() {
    //Laver en string/pladsholder for en fremtidig node, og imens den checker igennem
    //listen, printer den noderne ud indtil den når det sidste tal.
    String allNodes = "";
    Node current = first;
    while(current.next != null) {
    //Laver en skabelon for hvert value, med firkantede paranteser for hvert.
      allNodes += "[" + current.value + "] ";
      current = current.next;
    }

    //For at tilføje den sidste node i arrayen.
    allNodes += "[" + current.value + "] ";
    //Printer ud alle noder.
    System.out.println(allNodes);
  }

    //Henter
  Node getLast() {
    Node lastNode = first;
    while(lastNode.next != null) {
      lastNode = lastNode.next;
    }
    return lastNode;
  }

    //Med denne metode kan vi lave forskellige objekter der indeholder en værdi.
  void add(int value) {
    getLast().next = new Node(value, null);
  }

  void add(int index, int value) {
    Node current = first;
    for(int i = 0; i < index; i++)
      current = current.next;
    Node oldCurrent = current.next;
    current.next = new Node(value, oldCurrent);
  }

  void addFirst(int value) {
    Node oldFirst = first;
    first = new Node(value, oldFirst);
  }

  int lowCurrent() {
    int lowest = first.value;
    Node node = first;
    while(node.next != null) {
      node = node.next;
      if(node.value < lowest) {
        lowest = node.value;
      }
    }
    return lowest;
  }
  int highCurrent() {
    int highest = first.value;
    Node node = first;
    while(node.next != null) {
      node = node.next;
      if(node.value > highest) {
        highest = node.value;
      }
    }
    return highest;
  }
}

    //Laver en klasse for selve objekter/noden.
class Node {
  Node next;
  int value;

    //Laver en konstruktør, hvori jeg giver hver node sin egen værdi,
    //og gør den næste node til den næste objekt.
  Node(int value, Node node) {
    this.value = value;
    next = node;
  }
}
