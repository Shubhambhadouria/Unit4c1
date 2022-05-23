//
//Question 1:
//
//Why String is immutable in java and what is the difference between String and String Builder? And Write some
//of the methods of String class at least 5 with example.
//
//Ans.
//
//As, we know that Java uses the concept of string 
//literal.Let us suppose there are 3 reference variable
//that points to a single Object "Shubham". If the value
//of one reference variable is changed then, it will 
//affect the other reference variable as well. To avoid
//these type of situations String objects are immutable.
//
//The major difference between String and String Builder
//is that String Objects are immutable while String 
//builder classes are mutable. String Builder belongs to
//java.lang package.  
//
//There are various methods of String class. Five of 
//them are listed below :-
//
//1.int length(): it returns the number of characters in the string
//2.String substring(int i):it returns the substring from the ith 
//   index character.
//3.String concat(String str):concatenates to the end 
//   of string.
//4.int indexOf(String s):it returns the index of the string 
//   occurred first.
//5.Char charAt(int i):returns the charcater at ith index.