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
- [Sorting Algorithms](#sorting-algorithms)
  - [Bubble Sort](#bubble-sort)
  - [Insertion Sort](#insertion-sort)
  - [Selection Sort](#selection-sort)
  - [Merge Two Sorted Array](#merge-two-sorted-array)
  - [Merge Sort](#merge-sort)
  - [Dutch National Flag Sorting](#dutch-national-flag-sorting)
  - [Quick Sort](#quick-sort)
- [Graph](#graph)
  - [Undirected Graph](#undirected-graph)
    - [Adjacency Matrix Representation](#adjacency-matrix-representation)
    - [Adjacency List Representation](#adjacency-list-representatio)
  - [Breath First Search](#breath-first-search)
  - [Depth First Search](#depth-first-search)
  - [Connected Components](#connected-components)
- [Hashing](#hashing)
  - [HashTable](#hashtable)
  - [HashNode](#hashnode)
- [Interval](#interval)
  - [Overlapping Intervals](#overlapping-intervals)
- [Trie](#trie)
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

## Sorting Algorithms

### Bubble Sort

Another name for it is Sinking Sort. Large elements have a tendency to sink near the end of an array when this sorting technique is applied to an unsorted array. It compares nearby element pairs frequently, switching them around if one of them is out of order.

<img src="https://miro.medium.com/v2/resize:fit:776/1*7QsZkfrRGhAu5yxxeDdzsA.png" alt="Resource from Karuna Sehga - Medium Page - Bubble Sorting Algorithm Image"/>

<a href="https://medium.com/karuna-sehgal/an-introduction-to-bubble-sort-d85273acfcd8">Resource from Karuna Sehga - Medium Page - Bubble Sorting Algorithm Image</a>

### Insertion Sort

A straightforward sorting method called "insertion sort" operates similarly to how we sort cards when playing with our hands. The supplied array is split into the sorted part and the unsorted component during the insertion sort process. We take the first member from the unsorted section and insert it into the sorted array at the appropriate location. All items that are larger than the initial element are shifted by one position to achieve this. Until the unsorted array is not empty, it is repeatedly done.

<img src="https://miro.medium.com/v2/resize:fit:765/0*1zi2XtjiLXa3LYZh.PNG" alt="Resource from Austin Stanley - Medium Page - Insertion Sort Algorithm Image"/>

<a href="https://medium.com/austins-software-engineering-journey/insertion-sort-ea0645cc5a23">Resource from Austin Stanley - Medium Page - Insertion Sort Algorithm Image</a>

### Selection Sort

In Selection Sort, we divide the given array into two parts - the sorted section and the unsorted section. The algorithm sorts an array by repeatedly finding the minimum in the unsorted section and making it a part of the sorted section. From the unsorted part, we pick the minimum element and swap it with the leftmost element of the unsorted part. After the swap, that element now becomes a part of the sorted array. This process is repeated until the unsorted array is empty.

<img src="https://he-s3.s3.amazonaws.com/media/uploads/2888f5b.png" alt="Resource from HackerRank Web Page - Selection Sort Algorithm Image"/>

<a href="https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/tutorial/">Resource from HackerRank Web Page - Selection Sort Algorithm Image</a>

### Merge Two Sorted Array

The algorithm is a fundamental technique used to merge two arrays that are already sorted into a single sorted array.

<p><b>Here's a basic description of the algorithm:</b></p>

<ol type="1">
  <li>Start with two sorted arrays.</li>
  <li>Initialize an empty array to hold the merged result.</li>
  <li>Iterate through both arrays simultaneously, comparing elements from both arrays.</li>
  <li>At each step, select the smaller of the two elements and append it to the merged array.</li>
  <li>Continue this process until all elements from both arrays have been merged into the result array.</li>
  <li>Return the merged array.</li>
</ol>

<img src="https://4.bp.blogspot.com/-TfpqUSEDSiI/WAJHCTZyZRI/AAAAAAAABVw/4Sznk1dXHcQiC5OXk9DKexXMvb3PDJ2oQCLcB/s1600/merge-two-sorted-array-algorithm.png" alt="Resource from javabypatel.blogspot Web Page - Merge two sorted arrays Java"/>

<a href="https://javabypatel.blogspot.com/2016/10/merge-two-sorted-arrays-in-java.html">Resource from javabypatel.blogspot Web Page - Merge two sorted arrays Java</a>

### Merge Sort

Merge Sort is an algorithm that divides and conquers.<br>
* Divide: The array is split into two sections in this phase of the process through the use of the array's middle point. Until there are no more half arrays to divide, the process runs recursively for half arrays.
* Conquer: In this section, we sort the divided arrays by working from the bottom up, combine them, and then obtain the array that is sorted.

<img src="https://www.programiz.com/sites/tutorial2program/files/merge-sort-example_0.png" alt="Resource from programiz Web Page - Merge Sort Algorithm"/>

<a href="https://www.programiz.com/dsa/merge-sort">Resource from programiz Web Page - Merge Sort Algorithm</a>

### Dutch National Flag Sorting

One of the most fundamental and significant array algorithms is the Dutch National Flag Algorithm (DFA). It is employed to separate an array with three integers in it in a linear amount of time. DFA has the worst time complexity of O(n), whereas the algorithm has the space-time complexity of O(1). You are given an array with 0s, 1s, and 2s in it. The task is to build a function that separates each number. Any order is possible. (<a href="https://medium.com/quick-code/dutch-flag-algorithm 3669af2b14fd#:~:text=Dutch%20Flag%20Algorithm%20(DFA)%20is,algorithm%20is%20O(1).">Resource</a>)

<img src="https://i.imgur.com/8EpiwGe.jpg" alt="Resource from coderbyte.com - Dutch national flag sorting problem"/>

<a href="https://coderbyte.com/algorithm/dutch-national-flag-sorting-problem">Resource from coderbyte.com - Dutch national flag sorting problem</a>

### Quick Sort

The divide-and-conquer method is used in Quick Sort. There are three steps to it.

* <b>Pivot Selection:</b> We designate a pivot point by selecting an element. The initial element, the last element, or any other arbitrary element could be the pivot element.

* <b>Partitioning:</b> We rearrange the array so that all elements larger than the pivot are placed after it, and all elements smaller than the pivot are placed before it. Elements equal to the pivot may be positioned on either side. Once this partitioning is done, the pivot occupies its correct sorted position.

* <b>Recursive:</b> Repeatedly execute the described actions on the subset formed to the left and on the subset formed to the right of the pivot, utilizing recursion.

![quick_sort](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/f8015154-de91-4ded-9a97-81dd107f4b82)

<a href="https://www.enjoyalgorithms.com/blog/quick-sort-algorithm">Resource from enjoyalgorithms.com - Quick Sort Algorithm</a>

## Graph

* It's a data arrangement that isn't sequential, designed for data storage.
* It comprises vertices and edges connecting pairs of vertices.
* In the following instances, 1, 2, 3, 4, and 5 represent vertices in the graph, with each line linking them termed as an edge.

![graph](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/fa14817c-2fde-472f-be92-0d391bbc0195)

<p><b>Application - Socail Network</b></p>

<ul style="list-style-type:circle;">
  <li>Graphs aid in the creation of social networking platforms like Anakin, Micheal, etc., and can be referred to as social networking graphs.</li>
  <li>Individuals' names serve as vertices in the graph.</li>
  <li>The connection of friendship between two individuals can be depicted as an edge in the graph.</li>
</ul>

![socail_network](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/1e74411a-c661-4c07-a557-3a2f2f7b5ad3)

<p><b>Application - Web Content Over The Internet</b></p>

<ul style="list-style-type:circle;">
  <li>Graphs assist in structuring web content across the internet.</li>
  <li>Web pages like google.com, youtube.com, etc., serve as vertices in the graph.</li>
  <li>The connection between two web pages can be depicted as an edge in the graph.</li>
</ul>

![web_content](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/f44fd251-a704-47ab-9647-72d68c1aa125)

### Undirected Graph

An undirected graph is a type of graph in data structure where edges have no direction. In other words, the relationship between vertices is symmetric. If vertex A is connected to vertex B, then vertex B is also connected to vertex A.

Undirected graphs are often represented visually with lines connecting nodes or vertices. They are used to model relationships where the connection between two entities is mutual or bidirectional, such as friendships in a social network or connections between webpages on the internet.

<p><b>In programming, undirected graphs can be implemented using various data structures such as adjacency lists or adjacency matrices.</b></p>

#### Adjacency Matrix Representation

n the adjacency matrix representation, we utilize a square matrix of size n*n, where 'n' signifies the number of nodes within the graph. This matrix illustrates the relationships between different vertices and edges. Each row and column in the matrix corresponds to a vertex, with the values indicating the existence or absence of edges.

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-DS-Graph-normal-image09.jpg" alt="Resource from techvidvan.com - Adjacency matrix representation undirected graph"/>

<a href="https://techvidvan.com/tutorials/graph-in-data-structure/">Resource from techvidvan.com - Adjacency matrix representation undirected graph</a>

#### Adjacency List Representation

The adjacency list comprises an array of linked lists, where the array corresponds to all vertices, and each linked list represents the vertices connected to a specific node.

In a linked list, the pivotal element is the 'Head' pointer, which singularly oversees the entire linked list. When representing a linked list, the total number of pointers required equals the number of nodes in the graph.

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-DS-Graph-normal-image11.jpg" alt="Resource from techvidvan.com - Adjacency list representation undirected graph"/>

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-DS-Graph-normal-image11.jpg" alt="Resource from techvidvan.com - Adjacency list representation undirected graph"/>

<a href="https://techvidvan.com/tutorials/graph-in-data-structure/">Resource from techvidvan.com - Adjacency list representation undirected graph</a>

### Breath First Search

Graph breadth-first search (BFS) is a fundamental algorithm used in graph traversal. It explores all the vertices of a graph at the current depth before moving to the vertices at the next depth level. BFS starts at a selected vertex (often referred to as the "root" or "source" vertex) and systematically explores its adjacent vertices. Then, it moves to explore the vertices adjacent to those already visited, and so on, until all vertices have been visited.

<p>Here's a high-level overview of how BFS works:</p>

<ol type="1">
  <li>Begin by selecting a starting vertex and mark it as visited.</li>
  <li>Add this vertex to a queue data structure.</li>
  <li>While the queue is not empty:</li>
  <ul style="list-style-type:circle;">
    <li>Remove a vertex from the front of the queue.</li>
    <li>Visit all unvisited adjacent vertices of the removed vertex.</li>
    <li>Mark each visited adjacent vertex as visited and add it to the queue.</li>
  </ul>
  <li> Repeat step 3 until the queue is empty.</li>
</ol>
    
BFS is typically used to find the shortest path between two vertices in an unweighted graph, as it guarantees that the shortest path is found when traversing level by level. Additionally, BFS can be used to determine whether a path exists between two vertices and to find all connected components in a graph. It's an essential algorithm in various applications, including network routing, social network analysis, and maze solving.

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-BFS-normal-image01.jpg" alt="Resource from techvidvan.com - Breadth First Search"/>

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-BFS-normal-image03.jpg" alt="Resource from techvidvan.com - Breadth First Search"/>

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-BFS-normal-image07.jpg" alt="Resource from techvidvan.com - Breadth First Search"/>

<a href="https://techvidvan.com/tutorials/breadth-first-search/">Resource from techvidvan.com - Breadth First Search</a>

### Depth First Search

Graph Depth-First Search (DFS) is another fundamental algorithm used in graph traversal. Unlike Breadth-First Search (BFS), which explores vertices level by level, DFS explores as far as possible along each branch before backtracking. This means it goes as deep as possible before exploring other branches.

<p>Here's a high-level overview of how DFS works:</p>

<ol>
  <li>Start at a selected vertex (often called the "root" or "source" vertex) and mark it as visited.</li>
  <li>Visit an adjacent unvisited vertex.</li>
  <li>Repeat step 2 recursively, starting from the newly visited vertex.</li>
  <li>If there are no unvisited adjacent vertices, backtrack to the previous vertex.</li>
  <li>Repeat steps 2-4 until all vertices are visited.</li>
</ol>

DFS can be implemented using recursion or by using a stack data structure to keep track of vertices to visit. When implemented recursively, the function call stack implicitly acts as the stack to keep track of vertices.

<p>DFS has various applications, including:</p>

<ul>
  <li>Finding connected components in a graph.</li>
  <li>Detecting cycles in a graph.</li>
  <li>Topological sorting.</li>
  <li>Solving puzzles and mazes.</li>
  <li>Generating spanning trees, such as depth-first spanning trees.</li>
</ul>

DFS doesn't guarantee the shortest path, unlike BFS, but it's often more memory-efficient and simpler to implement.

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-Depth-First-Search-normal-image01.jpg" alt="Resource from techvidvan.com - Depth First Search"/>

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-Depth-First-Search-normal-image02.jpg" alt="Resource from techvidvan.com - Depth First Search"/>

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/07/TV-Depth-First-Search-normal-image03.jpg" alt="Resource from techvidvan.com - Depth First Search"/>

<a href="https://techvidvan.com/tutorials/depth-first-search-dfs/">Resource from techvidvan.com - Depth First Search</a>

### Connected Components

In data structure and graph theory, connected components refer to subsets of vertices within a graph where each vertex in the subset is connected to every other vertex in the same subset by paths, either direct or indirect. In simpler terms, a connected component is a maximal subgraph in which there is a path between every pair of vertices.

For example, in an undirected graph, if there are three vertices A, B, and C, where there are connections between A and B, and between B and C, but no connection between A and C, then there are two connected components: one containing A and B, and the other containing C.

<p>Connected components are essential in various graph algorithms and applications. Some common uses include:</p>

<ol type="1">
  <li>Network analysis: Identifying connected components helps in understanding the structure and connectivity of networks, such as social networks, transportation networks, or computer networks.</li>
  <li>Graph algorithms: Algorithms like connected component labeling, which assigns labels to connected components in an image, are used in image processing and computer vision.</li>
  <li>Cluster analysis: Connected components can represent clusters or groups of data points in clustering algorithms.</li>
  <li>Pathfinding: In some cases, identifying connected components can simplify pathfinding algorithms by breaking down the graph into smaller, more manageable pieces.</li>
</ol>

Overall, connected components provide valuable insights into the structure and behavior of graphs, making them a fundamental concept in graph theory and data structure analysis.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200421194558/Count-of-Connected-Components.png" alt="Resource from geeksforgeeks.org - connected components"/>

<a href="https://www.geeksforgeeks.org/count-of-unique-lengths-of-connected-components-for-an-undirected-graph-using-stl/">Resource from geeksforgeeks.org - connected components</a>

## Hashing

Before continuing the Hashing part, as long as we sum up our problem or aim is reaching O(1) time complexity. To do it, we checked linear search, binary search, and arrays. Shortly, you can find their relative image below.

![pic1](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/87394c32-09f5-4f45-b663-d205688a527a)

![pic2](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/305bf702-9f45-430d-aa06-ede401a8c633)

* Hashing is a method used to quickly store, retrieve, and remove information. 
* It involves converting a key of arbitrary size into a fixed-size value using a special function known as a Hash function. 
* Operations like sorting, retrieving, and removing data supported by hashing have an average runtime complexity of O(1).

![hash](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/57a81957-5ac1-4e85-a095-64acd56e69e6)

### Modular Hash Function

![modular_hash_function](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/3ed3596c-4b90-4732-bdba-2fc9184d49ed)

### HashTable

* It's a generalized form of an array.
* It stores data in the form of key-value pairs.
* It utilizes a hash function to convert a key into an index.
* Using the index, we store the key-value pair in an array.
* The primary operations supported by the HashTable are:
  - put(key, value) - adds a key-value pair with a unique key.
  - get(key) - retrieves the value for the provided key.
  - remove(key) - deletes the key-value pair from the HashTable.
* The average runtime is O(1).
* The Java Collections Framework includes the HashMap class for dealing with "key-value" pairs and the HashSet class for dealing solely with "keys".

### HashNode

In a HashTable, a HashNode class comprises three components:

<ol type="1">
  <li>The 'key', denoted by K, serves as a distinct identifier aiding data storage.</li>
  <li>The 'value', represented by V, constitutes the actual data stored, determined by the key's location.</li>
  <li>The 'next' HashNode indicates the subsequent node within the chain of hash nodes.</li>
</ol>

![hashNode](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/257b02dd-aff6-4a7c-b35e-8121fa3e12aa)

![terminology](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/8132d05d-3178-44a9-b709-0ce953abbcd8)

![separate](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/c48ca508-2cd4-40d5-b832-3e5600e5c1c0)

> **_NOTE:_** In Java, both HashSet and Set are related to collections, which are like containers for storing multiple items. Here's an explanation:
> * Set: Think of a set as a group of unique items. In Java, a Set is an interface that defines a collection that does not allow duplicate elements.
So, if you have a set of numbers, it won't allow the same number to be in there twice.
> * HashSet: Now, a HashSet is a specific type of set. It's implemented using a hash table. This means it's really good at quickly checking whether
it contains a particular item. It's fast because it uses something called hashing to organize the elements.
>
>  So, the main difference is that Set is just an interface defining a collection of unique items, while HashSet is a specific implementation of that interface
that uses hashing for fast operations like adding, removing, and checking if an item exists.

## Interval

* An interval, such as (5, 8), denotes a range delineated by two numbers. 
* These numbers are referred to as the start and end points.
* For instance, intervals are commonly used to denote time spans in tasks or jobs.

![interval](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/e512e614-8834-4065-91ad-0de593fbd41f)

### Overlapping Intervals

* Relationship between two intervals a and b
1. <p> a and b do not overlap</p>

![Screen Shot 2024-04-15 at 20 32 46 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/7b8439ab-2c8a-4ff3-8a11-5a3145b80d00)

2. <p> a and b overlap, b ends after a</p>

![Screen Shot 2024-04-15 at 20 33 04 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/5916a15b-7258-4040-908b-8e9c1f5cc700)

3. <p> a completely overlaps b</p>

![Screen Shot 2024-04-15 at 20 33 25 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/fe1a4f79-6ed6-4eb4-8d93-b62effc59d88)

4. <p> a and b overlap, a ends after b</p>

![Screen Shot 2024-04-15 at 20 33 55 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/9df7e4bf-8386-4760-9e46-009267ce1ca6)

5. <p> b completely overlaps a</p>

![Screen Shot 2024-04-15 at 20 35 35 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/de17e61a-21c7-4007-b368-08ad78ccbd96)

6. <p> b and a do not overlap</p>

![Screen Shot 2024-04-15 at 20 35 55 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/3202ce28-6d86-49e5-b3e9-6e22f1626ee2)

### Overlapping Interval Calculation

<ol type="1">
  <li>Sort the intervals based on the start time. (a.start <= b.start)</li>
  <li>c.start = a.start</li>
  <li>c.end = Math.max(a.end, b.end)</li>
  <li>Repeat for all overlapping intervals</li>
</ol>

![Screen Shot 2024-04-15 at 21 08 19 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/3fdc10cc-5f07-4b13-90f9-6fde6d4fcfcc)

## Trie

* The concept of tries is essentially derived from the term 'retrieval.
* The fundamental aim of this data structure is to swiftly retrieve stored information.

<p>A trie with 4 words :</p>
<ol type="1">
  <li>dog</li>
  <li>dust</li>
  <li>hat</li>
  <li>home</li>
</ol>

![Screen Shot 2024-04-15 at 22 24 19 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/4294451c-71f0-4ca0-80cb-c090339d2933)

<p><b>Applications - Auto Complete Words</b></p>

- Autocomplete feature is implemented by Tries.
- Many websites have used autocomplete feature, which suggest user rest of the word, while user is typing

![Screen Shot 2024-04-15 at 22 27 37 PM](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/f568e0b9-1772-4d3e-af2a-0e0f786ac714)

<p><b>Applications - Search Contacts In Phone</b></p>

- Searching a person contact number in contact list is efficently implemented by Trie. As soon as user enters letters the application auto suggest the name of the person.

<img src="https://docs.8x8.com/8x8WebHelp/8x8-work-for-desktop/Content/Resources/Images/VOD_5-0/Contacts_CallQ.png" alt="Resource from docs.8x8.com - Search contacts"/>

<a href="https://docs.8x8.com/8x8WebHelp/8x8-work-for-desktop/Content/workd/search-contacts.htm">Resource from docs.8x8.com - Search contacts</a>

## Usage & Contributing

You can clone the repository and download your local to work on it. If you want to provide more examples or if you detected any mistake on the example, please, review and correct then notify me with a commit request.

## License 

MIT 

## Resources

* Books: Data Structures and Algorithms in Java Sixth Edition by Michael T. Goodrich and Roberto Tamassia 
* YouTube: Data Structures and Algorithms with Visualizations – Full Course (Java) (<a href="https://www.youtube.com/watch?v=2ZLl8GAk1X4&list=RDCMUC8butISFwT-Wl7EV0hUK0BQ&start_radio=1">link</a>)
