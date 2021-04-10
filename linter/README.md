# JavaScript Linter

Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.</br>

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.</br>

Don’t show an error if the line is empty.</br>
Don’t show an error if the line ends with an opening curly brace {</br>
Don’t show an error if the line ends with an closing curly brace }</br>
Don’t show an error if the line contains if or else</br>
Call that method in your main method on the file ```gates.js```, and print out the resulting error message.</br>