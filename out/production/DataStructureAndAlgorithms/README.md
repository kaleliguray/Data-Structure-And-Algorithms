# 📚 Data Structures & Algorithms 📚

This project is trying to show examples of the lecture on data structure and algorithms during the master's education at Munich Technical University.

## Table of Contents 
- [Getting Started](#getting-started)
  - [Prerequisites](##prerequisites)
  - [Installation](#installation)
- [Analysis of Algorithms](#analysis-of-algorithms)
  - [Time Complexity](#time-complexity)
  - [Space (Memory) Complexity](#space-memory-complexity)
- [Asymptotic Analysis of An Algorithm](#asymptotic-analysis-of-an-algorithm)
  - [Asymptotic Notations](#asymptotic-notations)
    - [Omega Notation](##omega-notation)
    - [Big O Notation](##big-o-notation)
    - [Theta Notation](##theta-notation)
- [Rules To Calculate Big O Notation](#rules-to-calculate-big-o-notation)
- [Floyd Cycle Detection Algorithm](#floyd-cycle-detection-algorithm)
- [Linked List Node](#linked-list-node)
  - [Singly LinkedList](#singly-linkedlist)
  - [Doubled LinkedList](#doubled-linkedlist)
  - [Circular LinkedList](#circular-linkedlist)
- [Stack](#stack)
- [Queue](#queue)
- [Tree](#tree)
  - [Binary Tree](#binary-tree)
  - [Binary Search Tree](#binary-search-tree)
  - [Priority Queue](#priority-queue)
  - [Binary Heap](#binary-heap)
  - [Complete Binary Tree](#complete-binary-tree)
  - [Reheapify Bottom To Up](#reheapify-bottom-to-up)
- [Bubble Sort](#bubble-sort)
- [Insertion Sort](#insertion-sort)
- [Usage & Contributing](#usage--contributing)
- [License](#license)
- [Resources](#resources)

## Getting Started 

You should know basic coding in Java language.

### Prerequisites 

- For IDEA: Intellij IDEA or Eclipse
- Language: Java

### Installation 

<ol type="1">
  <li>Clone the repository: git clone https://github.com/kaleliguray/Data-Structure-And-Algorithms.git</li>
  <li>Navigate to the project folder: cd your-repo</li>
  <li>Install dependencies: npm install or pip install -r requirements.txt</li>
</ol>

<ol type="i">
  <li>Java Installation please follow <a href="https://www.oracle.com/java/technologies/downloads">download link</a></li>
  <li>Intellij IDEA installation path: <a href="https://lp.jetbrains.com/intellij-idea-features-promo/?source=google&medium=cpc&campaign=EMEA_en_DE_IDEA_Branded&term=intellij%20idea&content=602143185097&gad_source=1&gclid=CjwKCAiArfauBhApEiwAeoB7qObFfBSYfg9mP7FWB6qV3DvhfGKjEOGvQ_BzciHKk450Tw4XM0g35RoCRaQQAvD_BwE">download link</a></li>
  <li>Eclips IDEA installation path: <a href="https://www.eclipse.org/downloads/">download link</a></li>
</ol>

## Analysis of Algorithms
* By understanding time and space complexity, we can assess how efficiently an algorithm performs in terms of both time and memory usage.

### Time Complexity
* Time complexity refers to the amount of time an algorithm takes to execute.
* This is influenced by the input processed by the algorithm.

### Space (Memory) Complexity
* Space complexity is the amount of memory or space required for an algorithm to run. 
* It is determined by the memory needed to process the input by the algorithm.

## Asymptotic Analysis of An Algorithm
- Asymptotic analysis is a method used to evaluate the performance of an algorithm concerning the input size and its increase.
- Unlike measuring the actual running time, asymptotic analysis focuses on understanding how the time and space taken by an algorithm grow as the input size increases.
- This allows us to assess the algorithm's efficiency in a more generalized manner, providing insights into its scalability without getting into specific timing details.

### Asymptotic Notations
- Asymptotic notations are mathematical tools employed to describe the running time of an algorithm in relation to the input size. These notations provide a concise and abstract way to express how the algorithm's efficiency scales as the input size grows, allowing for a more generalized analysis of its performance.

<ol type="1">
  <li>Best Case - Omega Notation (Ω) </li>
  <li>Average Case - Theta Notation (θ) </li>
  <li>Worst Case - Big O Notation (O) </li>
</ol>
  
#### Omega Notation (Ω)
* Omega notation (Ω) is a formal method to represent the lower bound of an algorithm's running time.
* In this context, lower bound refers to the minimum amount of time an algorithm can take to complete for any given input.
* Ω provides insight into the best-case scenario, helping to understand the inherent efficiency of an algorithm.

#### Big O Notation (O)
* Big O notation (O) is used to denote the upper bound of an algorithm's running time.
* It provides an estimation of the longest amount of time an algorithm can take to complete for any given input.
* This notation is particularly useful for understanding the worst-case scenario in terms of efficiency.

#### Theta Notation (θ)
* Theta notation (θ) serves the purpose of expressing both the upper and lower bounds of an algorithm's running time.
* It provides a more balanced view by determining the average amount of time an algorithm may take to complete.
* This notation is helpful for a more comprehensive analysis of an algorithm's efficiency.

## Rules To Calculate Big O Notation
- Single Processor: The analysis assumes a single processor for computation.
- Sequential Execution: The algorithm performs sequential execution of statements.
- Assignment Operation: Each assignment operation takes 1 unit of time.

    Example: int x = 5; takes 1 unit of time.
  
- Return Statement: Each return statement takes 1 unit of time.

    Example: return x; takes 1 unit of time.

- Arithmetical Operation: Each arithmetical operation takes 1 unit of time.

    Example: x = x + y; takes 1 unit of time.

- Logical Operation: Each logical operation takes 1 unit of time.

    Example: x && y; takes 1 unit of time.
    
- Other Small/Single Operation: Any other small or single operation also takes 1 unit of time.

- Drop Lower Order Terms: In the Big O notation, lower-order terms are dropped.

    Example: If T=n2+3n+1T=n2+3n+1, then it is represented as O(n2)O(n2).

- Drop Constant Multipliers: Constant multipliers are dropped in the Big O notation.
    Example: If T=3n2+6n+1T=3n2+6n+1, then it is represented as O(n2)O(n2).

These rules help simplify the expression and provide a clearer understanding of the algorithm's time complexity in terms of its growth concerning the input size.

## Floyd Cycle Detection Algorithm

You can find the details and the coding version of Floyd's Cycle Detection Algorithm under the src/linked_list_with_node package.

![Page1](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/ae8e1b39-bb59-4448-8c82-115526000b6c)
![Page2](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/1fa6bd94-6c50-4b1a-83a2-8ea86c458f60)

## Linked List Node

### Singly LinkedList
A singly linked list is a group of nodes, or aggregates of data, where each node is divided into two separate parts for keeping data and addresses at different places. The address of the subsequent node in a list is marked by the next pointer. In contrast to the array data structure, the linked list members' sizes are variable.

### Doubled LinkedList
We define it as a two-way linked list. In contrast with a single-linked list, we can move through the list by going forward or backward from any particular node. In a single-linked list, removing a node necessitates having a pointer to the node before it. Nevertheless, with a double-linked list, we continue to be allowed to delete a node even in the lack of a pointer to its previous one.

### Circular LinkedList
The only distinction between it and a singly linked list is that in a circular linked list, the last node points to the first node instead of to null. We observe a last node in the Circular Singly Linked List rather than a head.

![linkedlistnode](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/b17371cc-0f42-4ecc-989e-fea9e6dbee74)

## Stack

A linear data structure called a stack is used to store an ordered, linear sequence of elements. This form of data is abstract. The Last In First Out (LIFO) technique describes how a stack works; the element that was added last will be taken out first.

![stack](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/528af40a-9c98-4820-a363-268ead275375)

## Queue

Data is stored in this linear data structure. The list is arranged in an orderly fashion, with deletions occurring at the front and insertions occurring at the rear. The element that is erased is the one that is first added. It is known as the First In First Out (FIFO) list for this reason. When multithreading, queues are usually used to manage threads and implement priority queuing systems.

![queue](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/858ec472-5c06-408e-bb15-d32de5e1f83e)

## Tree

It is a type of non-linear data structure for information storage. It consists of edges and nodes without a cycle. A tree's nodes can all point to n or more other nodes. With a parent node known as the root and several tiers of child or leaf nodes, it is a means of depicting a hierarchical structure. reflects a data set's structural relationships. gives faster results than an array or linked list for insertion, deletion, and searching. gives data a versatile means to be stored and moved.

### Binary Tree

A tree is called as Binary Tree, if each node has zero, one, or two children

![tree](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/eefb1169-bc0d-487c-a3e3-9e6e3582db5a)

### Binary Search Tree

This particular kind of binary tree has data arranged in an orderly fashion to facilitate quicker data insertion and search. 

<ol>
  <p>It satisfies the criteria mentioned below:</p>
  <li>A node's left subtree only includes nodes whose values are lower than the node's value.</li>
  <li>The right subtree of a node contains only nodes with values greater than the node's value.</li>
  <li>It is also necessary for the left and right subtrees to be binary search trees. </li>
</ol>

![binarytree](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/e2423428-aa7a-4a3e-814b-c44de363aa39)

### Priority Queue

A data structure called a priority queue enables us to quickly determine the minimum and maximum elements in a set of components. 

<ol>
  <p>It supports the following operations:</p>
  <li>insert(key) - Insert a key into the priority queue</li>
  <li>deleteMax() / deleteMin() - return and remove largest / smallest key</li>
  <li>getMax() / getMin() - return largest / smallest key</li>
</ol>

### Binary Heap

The binary heap is a data structure that helps us in implementing Priority Queue operation efficiently. A binary heap is a complete binary tree in which each node value is " >= " or " <= " than the values of its children.

![binary_heap](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/322280db-9960-4082-809b-11f4cd24f0ed)

Typically, arrays are used to implement binary heaps.

The array's initial entry is regarded as empty.

Since Binary Heaps is a whole binary tree, the values are kept in an array by going from left to right through each level of the tree.

![heap](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/a5caca96-e8fd-4a7c-b582-c5f8a98b1405)

<p><b>Parent - Child Calculation</b></p><br>

<div>
  <p>Children of 1st index = 2,3   &nbsp&nbsp&nbsp   Parent of 7th index = 3 ---> 7/2 = 3.5 ~ 3</p>
  <p>Children of 2nd index = 4,5   &nbsp&nbsp&nbsp   Parent of 6th index = 3 ---> 6/2 = 3</p>
  <p>Children of 3rd index = 6,7   &nbsp&nbsp&nbsp   Parent of 5th index = 2 ---> 5/2 = 2.5 ~ 2</p>  
</div>
<br>
<p><b>Children of k index =</b> 2*k, 2*k+1</p> <p><b>Parent of k index =</b> k/2</p>


### Complete Binary Tree

A complete binary tree is a binary tree where all levels are filled except the last level and the last level has nodes so that the left side is never empty.

![complete_binary_tree](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/b9c8ad6e-24f8-475b-8b5a-bb8f6cffa7ff)

### Reheapify Bottom To Up

A Max heap or A Min heap is complete binary tree in which node value is " >= " or " <= "than the value of its children. After inserting a new element into the heap, it will not susitable above heap property or structure depends on Max or Min. Thus, We should perform " bottom-up reheapify " technique, in which we have to adjust the location of the new element to satisfy heap property.

## Bubble Sort

Another name for it is Sinking Sort. Large elements have a tendency to sink near the end of an array when this sorting technique is applied to an unsorted array. It compares nearby element pairs frequently, switching them around if one of them is out of order.

<img src="https://miro.medium.com/v2/resize:fit:776/1*7QsZkfrRGhAu5yxxeDdzsA.png" alt="Resource from Karuna Sehga - Medium Page - Bubble Sorting Algorithm Image"/>

<a href="https://medium.com/karuna-sehgal/an-introduction-to-bubble-sort-d85273acfcd8">Resource from Karuna Sehga - Medium Page - Bubble Sorting Algorithm Image</a>

## Insertion Sort

A straightforward sorting method called "insertion sort" operates similarly to how we sort cards when playing with our hands. The supplied array is split into the sorted part and the unsorted component during the insertion sort process. We take the first member from the unsorted section and insert it into the sorted array at the appropriate location. All items that are larger than the initial element are shifted by one position to achieve this. Until the unsorted array is not empty, it is repeatedly done.

<img src="https://miro.medium.com/v2/resize:fit:765/0*1zi2XtjiLXa3LYZh.PNG" alt="Resource from Austin Stanley - Medium Page - Insertion Sort Algorithm Image"/>

<a href="https://medium.com/austins-software-engineering-journey/insertion-sort-ea0645cc5a23">Resource from Austin Stanley - Medium Page - Insertion Sort Algorithm Image</a>


## Usage & Contributing

You can clone the repository and download your local to work on it. If you want to provide more examples or if you detected any mistake on the example, please, review and correct then notify me with a commit request.

## License 

MIT 

## Resources

* Books: Data Structures and Algorithms in Java Sixth Edition by Michael T. Goodrich and Roberto Tamassia 
* YouTube: Data Structures and Algorithms with Visualizations – Full Course (Java) (<a href="https://www.youtube.com/watch?v=2ZLl8GAk1X4&list=RDCMUC8butISFwT-Wl7EV0hUK0BQ&start_radio=1">link</a>)
