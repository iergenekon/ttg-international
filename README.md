# ttg-international

Source code for TTG International interview questions.

1- FindMissingElementsBetweenTwoArrays.java : 

findMissing method takes two arrays and returns the missing elements from the second array.
To see the  expected result first array specified as { 4, 12, 9, 5, 6, 11 } and second array specified as { 4, 9, 12, 6 }.
Arrays are converted to ArrayLists to use removeAll() method of Java ArrayList class.
The removeAll() method of Java ArrayList class removes all the elements from a list that are contained in the specified collection.
The expected result is { 5, 1 }.

2- RotateArrayByGivenNumber.java :

rotate method takes an array A and a number B and returns the left rotated array A by B positions.
To see the expected result, array specified as { 1, 2, 3, 4, 5, 6 } and rotate number specified as 2.
to assign elements to new indexes, the condition of subtracting the rotate number from the size of the array is used.
Subtracting the rotate number from the size of the array is used as a condition to assign elements to new indexes.
The expected result is { 3, 4, 5, 6, 1, 2 }.

3- SortBankAccounts.java :

readFromTextFile method takes text file name specified as "bank_accounts.txt", reads file and returns the whole text file as String value.
Text content is splitted by empty lines into bank accounts groups. Each bank account group is sorted by sortBankAccounts method.
sort method of Java Collections class sortes all the elements of ArrayList.
LinkedHashSet collection is used not to allow repetition in set.
frequency method of Java Collections class finds the repetition of the elements in the list.


