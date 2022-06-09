# Lab Exercise 1

---

##### Organize your answers in separate files and push them to a git repository. Submit the github repository link via Google Classroom.

> Example: Exercise1.java, Exercise2.java, etc...

---

## Exercise 1 — Find the Area of a Circle

Write a program that calculates the area of a circle from its radius. The radius should be read as an integer from the keyboard.
Sample of user dialog:

> Input the radius:
> 3

Expected Output :

> The radius is: 3
> The area is: 28.274333882308138

Note: You can use the constant PI from Math.PI.

#### 🎉🎉🎉 Solution 🎉🎉🎉

```bash
import java.util.Scanner;

public class Exercise1 {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Input the radius:");
  int radius = scan.nextInt();
  System.out.println("The radius is: " + radius);
  System.out.println("The area is: " + (Math.PI * radius * radius));
  scan.close();

 }

}
```

---

## Exercise 2 — Convert Cents to Dollars

Write a program that takes in an input number of cents. The program will write out the number of dollars and cents, like this:

> Input the cents:
> 324

Expected Output :

> The value is 3 dollars and 24 cents.

Note: Use integer arithmetic and avoid floating point arithmetic.

#### 🎉🎉🎉 Solution 🎉🎉🎉

```bash
import java.util.Scanner;

public class Exercise2 {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Input the cents:");
  int cents = scan.nextInt();
  System.out.printf("The value is %d dollars and %d cents", (cents/100), (cents%100));
  scan.close();

 }

}
```

---

## Exercise 3 - Multiplication Table

Write a program that takes a number as input and prints its multiplication table up to 10.
Sample Output:

> Input a number: 9

Expected Output :

```bash
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
...
9 x 10 = 90
```

#### 🎉🎉🎉 Solution 🎉🎉🎉

```bash
import java.util.Scanner;

public class Exercise3 {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Input a number:");
  int num = scan.nextInt();
  for (int i = 1; i <= 10; i++) {
   System.out.printf("%d * %d = %d%n", num, i, (num * i));
  }
  scan.close();

 }

}
```

---

## Exercise 4 - Print the Pattern

Write a program to display the following pattern.

```bash
   J    a   v     v  a
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a
```

Note: Use Print Formatting

#### 🎉🎉🎉 Solution 🎉🎉🎉

```bash
public class Exercise4 {

 public static void main(String[] args) {
    char J = 'J';
    char a = 'a';
    char v = 'v';
    
    System.out.printf("%4c%5c%4c%6c%4c%n",J,a,v,v,a);
    System.out.printf("%4c%4c%2c%4c%4c%4c%2c%n",J,a,a,v,v,a,a);
    System.out.printf("%c%3c%3c%c%c%c%c%4C%2C%4c%c%c%c%c%n",J,J,a,a,a,a,a,v,v,a,a,a,a,a);
    System.out.printf("%2c%c%3c%6c%4C%4c%6c%n",J,J,a,a,v,a,a);

 }

}
```
