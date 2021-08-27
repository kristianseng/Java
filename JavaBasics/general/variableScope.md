1. A variable declared in a method exists (is visible) from the start of its declaration to the end of the method.

2. A variable declared in a code block exists until the end of the code block.

3. A method's parameters exist everywhere within the method.

4. Variables in an object exist during the entire lifespan of the object that contains them. Their visibility is also defined by special access modifiers: public and private.

5. Static (class) variables exist the whole time the program is running. Their visibility is also defined by access modifiers.


An instance variable is a variable which is declared in a class but outside of constructors, methods, or blocks.

"If a variable is an instance variable (Example 4), it is linked to a certain object and exists as long as the object exists. 
If no object exists, then there are no instances of the variable. 
You can access the variable (i.e. the variable is visible) from all methods of the class, regardless of whether they were declared before or after it.
A new variable is created for each object. 
It is independent of other objects. You can't access an instance variable from static methods."
