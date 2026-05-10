Bekarys Kabarov 2514 assignment4
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/10a49da0-44e4-404a-ba4c-295a8e678f38" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/c5b08683-d011-4b26-b6a3-a3822c8a0e4f" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/80ce3c95-d6a1-4c22-b29b-814bac9c1770" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/a5b919a4-81c3-443a-bf11-17eeaea7815b" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/f3d55744-1460-43dc-a4ae-54ef197af68e" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/f8d96f10-8dd3-496e-a0fd-5343e9ce15bb" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/002fafe8-091a-49ff-9157-d9c15801989f" />
This project implements a graph data structure using an Adjacency List representation. The system is designed to demonstrate the fundamental concepts of graph theory, specifically focusing on how different traversal algorithms behave as the graph scale increases.

Observations:
Complexity: The results align with the expected 
 time complexity. As the number of vertices increased from 10 to 100, the execution time increased proportionally.
BFS vs DFS: In my tests, [DFS/BFS] appeared slightly faster, likely due to the lower overhead of recursion compared to managing a Queue object in the heap.
Structure Impact: The traversal order changes significantly based on how edges are added, but the time complexity remains stable as long as the edge-to-vertex ratio remains relatively consistent.

During this assignment, I learned how the choice of data structure (Adjacency List vs. Adjacency Matrix) impacts memory usage. Implementing the traversal algorithms helped me understand the practical difference between level-order exploration (BFS) and deep-branch exploration (DFS). The biggest challenge was ensuring the Edge class correctly referenced the Vertex objects to maintain proper OOP principles.
