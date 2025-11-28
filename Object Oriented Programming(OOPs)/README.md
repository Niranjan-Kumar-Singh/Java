# Object Oriented Programming (OOPs) in Java

This section contains a complete, structured, and well-documented set of Java programs covering all major OOPs topics.  
Each topic has its own folder, examples, and a dedicated `Main` demo file.

The folder is designed to be:
- Easy to study  
- Easy to navigate
- Beginner-friendly  
- Clean and professional for GitHub  

---

## 📁 Folder Structure

```
Object Oriented Programming(OOPs)/
│
├── 01_Basics/
│     ├── Pen.java
│     ├── Student.java
│     ├── ClassAndObjectDemo.java
│     └── AccessModifiersDemo.java
│
├── 02_GettersSetters_Encapsulation/
│     ├── Pencil.java
│     ├── BankAccount.java
│     ├── GettersAndSettersDemo.java
│     └── EncapsulationDemo.java
│
├── 03_Constructors/
│     ├── Student.java
│     ├── ConstructorsDemo.java
│     ├── TypesOfConstructors.java
│     ├── ShallowCopyStudent.java
│     ├── DeepCopyStudent.java
│     └── CopyConstructorDemo.java
│
├── 04_Inheritance/
│     ├── Animal.java
│     ├── Dog.java
│     ├── Cat.java
│     ├── SingleInheritanceDemo.java
│     ├── MultiLevelInheritanceDemo.java
│     └── HierarchicalInheritanceDemo.java
│
├── 05_Polymorphism/
│     ├── Calculator.java
│     ├── MethodOverloadingDemo.java
│     ├── Animal.java
│     ├── Deer.java
│     ├── Dog.java
│     ├── MethodOverridingDemo.java
│     ├── RuntimePolymorphismDemo.java
│     └── PolymorphismNotes.txt
│
├── 06_Abstraction/
│     ├── Animal.java
│     ├── Dog.java
│     ├── Cat.java
│     ├── AbstractClassDemo.java
│     └── AbstractionNotes.txt
│
├── 07_Interface/
│     ├── A.java
│     ├── B.java
│     ├── Car.java
│     ├── ElectricCar.java
│     ├── DieselCar.java
│     ├── MultipleInheritanceDemo.java
│     ├── InterfaceDemo.java
│     └── InterfaceNotes.txt
│
├── 08_StaticKeyword/
│     ├── StaticVariablesDemo.java
│     ├── StaticMethodsDemo.java
│     ├── StaticBlockDemo.java
│     ├── NestedStaticClassDemo.java
│     ├── StaticCounter.java
│     └── StaticNotes.txt
│
├── 09_SuperKeyword/
│     ├── Parent.java
│     ├── Child.java
│     ├── ConstructorChainingParent.java
│     ├── ConstructorChainingChild.java
│     ├── SuperKeywordDemo.java
│     └── SuperNotes.txt
│
├── 10_Packages/
│     ├── src/com/example/pkg1/.java
│     ├── src/com/example/pkg2/.java
│     ├── src/com/example/app/PackageDemo.java
│     ├── PackageNotes.txt
│     └── out/ (compiled classes)
│
├── 11_FinalKeyword/
│     ├── models/
│     │     ├── FinalPerson.java
│     │     ├── FinalBox.java
│     │     ├── FinalParent.java
│     │     └── FinalChild.java
│     ├── FinalVariableDemo.java
│     ├── FinalReferenceDemo.java
│     ├── FinalMethodDemo.java
│     ├── FinalClassDemo.java
│     └── FinalNotes.txt
│
├── 12_ObjectClassMethods/
│     ├── models/
│     │     ├── Product.java
│     │     ├── Customer.java
│     │     └── Employee.java
│     ├── EqualsDemo.java
│     ├── HashCodeDemo.java
│     ├── ObjectMethodsDemo.java
│     ├── ToStringDemo.java
│     └── ObjectClassNotes.txt
│
└── Oops.java (Master theory file)
```

---

## 📚 Topics Covered

### ✔ 01 — Basics  
- Classes & Objects  
- Fields and Methods  
- Memory explanation (Heap & Stack)  
- Access Modifiers (public, private, protected, default)

### ✔ 02 — Getters, Setters & Encapsulation  
- Why we hide data (`private`)  
- Controlled access with getters/setters  
- Real-life example: BankAccount  
- Data validation inside setters  

### ✔ 03 — Constructors  
- Default Constructor  
- Parameterized Constructor  
- Constructor Overloading  
- Copy Constructor  
- Shallow Copy vs Deep Copy  
- How memory behaves with arrays/references  
- Java Garbage Collector (simple explanation)

### ✔ 04 — Inheritance  
- Single Level  
- Multi Level  
- Hierarchical  
- Method Overriding basics  
- Code reuse and polymorphism foundations  

### ✔ 05 — Polymorphism  
- Compile-Time Polymorphism (Method Overloading)  
- Runtime Polymorphism (Method Overriding)  
- Dynamic Method Dispatch  
- Polymorphic references  
- Practical and interview-based examples  
- Detailed theory notes  

### ✔ 06 — Abstraction  
- Abstract classes  
- Abstract methods  
- Partial abstraction  
- Constructor behavior in abstract classes  
- When to use abstraction  
- Detailed theory notes  

### ✔ 07 — Interfaces  
- Total abstraction  
- Multiple inheritance  
- Default & static methods in interfaces  
- Real project-like examples  
- Notes included  

### ✔ 08 — Static Keyword  
- Static variables/methods  
- Static block  
- Static nested classes  
- Counters & utilities  
- Notes included  

### ✔ 09 — Super Keyword  
- Access parent variables  
- Access parent methods  
- Constructor chaining  
- Notes included  

### ✔ 10 — Packages  
- Realistic package structure  
- Access modifiers across packages  
- Compilation with `-d`  
- Running via classpath  
- Notes included  

### ✔ 11 — Final Keyword  
- Final variable  
- Final reference  
- Final method  
- Final class  
- Blank final  
- Notes included 

### ✔ 12 — Object Class Methods  
- toString()  
- equals()  
- hashCode()  
- getClass() 
- Logical equality vs reference equality  
- HashSet behavior
- Real-world models 
- Notes included 

---

## 🧠 Oops.java — The Master Theory File

The root-level file `Oops.java` contains:

- All definitions  
- Explanations  
- Concepts  
- Short examples  
- Interview notes  
- Comparison tables  
- Tips and tricks  

It is written entirely in comments so it compiles and stays inside the project as documentation.

---

## ▶️ How to Compile & Run

### Run only a specific folder demo:

```bash
cd "01_Basics"
javac *.java
java ClassAndObjectDemo
```

```bash
cd "02_GettersSetters_Encapsulation"
javac *.java
java EncapsulationDemo
```

```bash
cd "03_Constructors"
javac *.java
java CopyConstructorDemo
```

```bash
cd "04_Inheritance"
javac *.java
java SingleInheritanceDemo
```

```bash
cd "05_Polymorphism"
javac *.java
java MethodOverloadingDemo
```

```bash
cd "06_Abstraction"
javac *.java
java AbstractClassDemo
```

```bash
cd "07_Interface"
javac *.java
java InterfaceDemo
```

```bash
cd "08_StaticKeyword"
javac *.java
java StaticVariablesDemo
```

```bash
cd "09_SuperKeyword"
javac *.java
java SuperKeywordDemo
```

```bash
cd "10_Packages"
javac -d out src/com/example/app/PackageDemo.java
java -cp out com.example.app.PackageDemo
```

```bash
cd "11_FinalKeyword"
javac models/*.java *.java
java FinalVariableDemo
```

```bash
cd "12_ObjectClassMethods"
javac models/*.java *.java
java ToStringDemo
```

Each folder includes one main demo file based on the topic group.

---

## ❤️ Author  
**Niranjan Kumar Singh**  
Java DSA & OOPs Practice Repository