Bekarys Kambarov se2514
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/e0dc0209-8c5e-4eaf-965f-e87a221aef80" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/0500b8e0-60d2-484f-a05e-25cd179e4948" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/b94910fa-ba97-411b-8d83-eecbbe1bbafa" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/4ddd43a0-932c-487b-a64c-d9e688a857e2" />
<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/b4ebc5d3-8775-4505-b179-e829cb63ddf7" />
Task 1: Bank Account Storage
I created a BankAccount class to hold account details. I used a LinkedList to store these accounts because it is dynamic and allows us to easily add or search for users by their username.
Task 2: Deposit & Withdraw
I added logic to update the balance of an account directly inside the LinkedList. This allows the bank to handle money transactions for specific users.
Task 3: Transaction History (Undo)
I used a Stack to store the history of actions. Since a Stack works on LIFO (Last-In-First-Out) logic, it is the perfect structure for an "Undo" feature, letting us remove the very last action performed.
Task 4: Bill Payment Queue
For bill payments, I implemented a Queue. This follows FIFO (First-In-First-Out) logic, ensuring that bills are processed in the exact order they were received.
Task 5: Account Opening Queue
I simulated a real banking workflow by creating another Queue for new account requests. The Admin processes these requests one by one before they are officially added to the main system.
Task 6: Physical Data Structure
I used a standard Array to store three predefined accounts. This shows the difference between a physical structure (fixed size) and logical structures like LinkedLists.
