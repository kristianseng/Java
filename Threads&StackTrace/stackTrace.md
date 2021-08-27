"The Java Machine keeps track of all function calls. For that, it has a special collection – the stack. 
When one function calls another, the Java Machine puts a new StackTraceElement object onto the stack. When a function finishes, that element is removed from the stack. 
This means that the stack always stores up-to-date information about the current state of the 'stack of function calls'."

"Each StackTraceElement object contains information about the called method. In particular, you can get the method name using the getMethodName method."
