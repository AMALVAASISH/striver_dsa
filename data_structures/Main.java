package data_structures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

// import java.util.HashMap;

// // hashmap
// // it is a data structure that stores key value pairs
// // allows to quickly access based on a specific key



// public class Main {
//     public static void main(String[] args){
//         HashMap<String, Integer> map = new HashMap<>();

//         map.put("apple", 12);
//         map.put("mango",10);

//         System.out.println(map.get("apple"));
//         System.out.println(map.containsKey("fe"));

//         // remove a key
//         // map.remove("mango");

//         for(String key: map.keySet()){
//             System.out.println(key + " <- left key, right value -> " + map.get(key));
//         }


//         // no mutiple null key values are allowed
//     }
// }


// sets
// collection of unique elements , there are no duplicates
// only one null depending on type

// public class Main{
//     public static void main(String[] args) {
//         Set<String> fruits = new HashSet<>();

//         fruits.add("amal");

//         fruits.add("aswin");
//         fruits.add("aswin");
        
//         for( String fruit : fruits){
//             System.out.println(fruit);
//         }

//         System.out.println(fruits.contains("jimmy"));

//         fruits.remove("kevin");
//     }
// }

// set can be created with linkedhashset and treeset
// Set is an interface and these linkedHashset, hashset and treeset are classes

// Strings

// public class Main{
//     public static void main(String[] args) {
//         String a = "amal";
//         String b = "amal";
//         System.out.println(a.equals(b)); // equals check the actual content inside the variable 
//         // == compares the addresses in memory


//     }
// }



// stacks

//last in first out
// linear structure

// public class Main{
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();

//         stack.push(1);
//         stack.push(2);

//         stack.peek();// to view the top element without removing it
//         stack.pop();// remove the last element

//         stack.size();// check the size

//         System.out.println(stack.isEmpty());// checks if empty
//     }
// }


// queue is a linear data struccture that follows first in first out
// like in a real queue

// import java.util.Queue;

// public class Main{
//     public static void main(String[] args){
//         Queue<Integer> qu = new LinkedList<>();

//         qu.add(1);
//         qu.add(2);
//         qu.add(1);

//         System.out.println(qu.peek());

//         qu.remove();

//         qu.size();// gives the size

//         qu.isEmpty();

//     }
// }

