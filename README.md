<img width="100%" bottom=50px src ="https://capsule-render.vercel.app/api?type=waving&height=100&color=FF78CB&section=header&reversal=false&descAlign=22&descAlignY=42"/>


<div align = "center">
<a href="https://github.com/albiecr"><img src="https://readme-typing-svg.herokuapp.com?font=Sour+Gummy&size=40&pause=100&color=EF82F7&width=500&height=60&lines=Book+Registration+System" alt="Typing SVG" /></a></div>
<img align = "right" height = "300" src = "https://github.com/user-attachments/assets/55f5271e-0680-4337-bcb3-0cb8b42347e7" />
<h2>📜 Description </h2>
Simple project developed with the aim of studying the use of classes in Java.
<h2>✨ Features</h2>
• Book Management System with CRUD operations (Create, Read) <br>
• Author Management with personal details storage <br>
• Publisher Management with company information <br>
• Input Validation for ISBN (13 digits) and publication year (≤ 2013) <br>
• Console-based Menu System for easy navigation <br>
• Data Relationships between books, authors and publishers <br>
• Persistent ID Generation with auto-increment counters <br>

<h2>📋 Requirements</h2>
• Java Runtime Environment (JRE) 8 or higher <br>
• Basic understanding of Java programming <br>
• Command line interface to run the application <br>

<h2>⚙️ Installation</h2>
• No special installation required beyond Java <br><br>
• Clone the repository (if applicable): <br><br>
<pre><code class="language-bash">git clone https://github.com/albiecr/book-registration-system.git
cd book-registration-system</code></pre>
<h2>🚀 Usage</h2>
• Compile all Java files: <br><br>
  <pre><code class="language-bash">javac management/*.java</code></pre>
• Run the main class: <br><br>
  <pre><code class="language-bash">java management.main</code></pre>
• Run the program using the command above <br>
&nbsp&nbsp&nbsp Use the menu to: <br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Option 1: Register new books with author and publisher details <br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Option 2: View all registered books <br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Option 3: View all registered authors <br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Option 4: View all registered publishers <br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Option 5: Exit the program <br>

<h2>🏗️ Code Structure</h2>
<pre><code class="language-java">
Home/
├── main.java                     // Entry point with menu system
├── author.java                   // Author entity with personal details
├── publisher.java                // Publisher entity with company info
└── book.java                     // Book entity with validation logic </code></pre>

<h4>Key Components:</h4>
• Object composition (Book contains Author and Publisher) <br>
• Static counters for ID generation <br>
• ArrayLists for in-memory data storage <br>
• Scanner for console input <br>

<h2>📄 License </h2>
This project is licensed under the MIT License - see the LICENSE file for details.

<h2>✉️ Contact </h2>
Albertina Rodrigues - albertinacrodrigues@gmail.com <br>
Project Link: https://github.com/albiecr/book-registration-system

<h2>🔮 Future Improvements </h2>
<h4>1.Data Persistence: </h4>
• Add file storage (JSON/CSV) or database connection <br>
• Implement serialization for object storage <br>

<h4>2.Enhanced Validation:</h4>
• Proper ISBN validation algorithm <br>
• Date format validation for birth dates <br>
• CPF/CNPJ validation logic <br>

<h4>3. Additional Features: </h4>
• Update and Delete functionality <br>
• Search/filter capabilities <br>
• Genre/category system for books <br>
• Multiple authors per book support <br>

<h4>4. Improved UI: </h4>
• Graphical user interface (JavaFX/Swing) <br>
• Better error handling and user feedback <br>
• Color-coded console output <br>

<h4>5. Code Quality: </h4>
• Unit testing (JUnit) <br>
• Documentation (JavaDoc) <br>
• Logging system <br>
• Configuration management <br>

<h4>6. Extensibility: </h4>
• REST API interface <br>
• Plugin system for additional features <br>
• Internationalization support <br>

<h2>🤝 Contributing </h2>
<img align = "right" height = "300" src = "https://github.com/user-attachments/assets/3b30fe86-71ff-400d-92eb-1f66f1d9ca4d"/>
Contributions are welcome! Please open an issue or submit a pull request. <br><br>

1. Fork the project <br><br>
2. Create your feature branch <pre><code class="language-bash">git checkout -b feature/AmazingFeature</code></pre>
3. Commit your changes <pre><code class="language-bash">git commit -m 'Add some AmazingFeature'</code></pre>
4. Push to the branch <pre><code class="language-bash">git push origin feature/AmazingFeature</code></pre>
5. Open a pull request

<img width="100%" bottom=50px src ="https://capsule-render.vercel.app/api?type=waving&height=100&color=FF78CB&section=footer&reversal=false&descAlign=22&descAlignY=42"/>
