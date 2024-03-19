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

![Note 19 Mar 2024](https://github.com/kaleliguray/Data-Structure-And-Algorithms/assets/55591718/b9e06ee1-55fb-4616-b6ad-a5829bba44ec)

## Usage & Contributing

You can clone the repository and download your local to work on it. If you want to provide more examples or if you detected any mistake on the example, please, review and correct then notify me with a commit request.

## License 

MIT 

## Resources

* Books: Data Structures and Algorithms in Java Sixth Edition by Michael T. Goodrich and Roberto Tamassia 
* YouTube: Data Structures and Algorithms with Visualizations – Full Course (Java) (<a href="https://www.youtube.com/watch?v=2ZLl8GAk1X4&list=RDCMUC8butISFwT-Wl7EV0hUK0BQ&start_radio=1">link</a>)
