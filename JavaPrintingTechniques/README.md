👉👉👉 # Printing Techniques in Java
 ## In this README.md ,I show some examples for printing two or more variables by using Only one Print Statement and more.

## 1st Example- 
### Using System.out.printf
```java
int t1Num = 12;
int t2Num = 14;
System.out.printf("%d %d%n", t2Num, t1Num);
```
### Output:
```
14 12
```
## Second Example-
### Using print.format
```java
 Long telephoneNo=8989888888L;
int StdCode=01;
System.out.format("%d %d%n",StdCode, telephoneNo);
```
### Output:
```
01 8989888888
```
## third Example-
###  Using System.out.print with Multiple Statements
```java
int t1Num = 12;
int t2Num = 14;
System.out.print(t2Num + " ");
System.out.print(t1Num);
```
### Output:
```
14 12
```
## Fourth Example-
###  Using Arrays
```java
int num1 = 12;
int num2 = 14;
System.out.println(Arrays.toString(new int[]{num1,num2}));
```
### Output:
```
[12,14]
```
## Fifth Example-
### Using String.join with Conversion to Strings
```java
int t1Num = 12;
int t2Num = 14;
System.out.println(String.join(" ", String.valueOf(t2Num), String.valueOf(t1Num)));
```
### Output:
```
14 12
```
## Sixth Example-
### Using a List and toString()
```java
int t1Num = 12;
int t2Num = 14;
System.out.println(java.util.List.of(t1Num,t2Num));
```
### Output:
```
[12,14]
```



