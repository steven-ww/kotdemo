# Demo Code for Kotlin

## Example of some of the challenges I'm having with Kotlin and or it's usage in a project

* The DIExample class shows some of the struggles I had interpreting Kotlin Syntax.
* The ExampleTest Class demonstrates a test that I don't understand the syntax of at all.
* The SomeSystemQuery.txt file tries to show the use of lambda's where they are passed to the constructor of a class and then used deep in the call stack ...
  * Good kotlin code?

## Some other questions

* Coroutines
  * I've watched video's, read blog posts and don't understand how they work. :-(
  * What does adding suspend to a function actually do other than pass an additional parameter to the method?
    * It doesn't seem to make the function suspendable (cause Intellij tells me not to bother with using suspend unless I call another suspend or start a new thread.)
      * So the function isn't suspendable unless I make it suspendable?
  * launch or async doesn't start a new thread ...? Just allows for functions to be suspended (if they are suspendable) and moves other work onto the thread?
  * We've had code wrapped in async that was actually running in sequence and the team didn't even realise

* Syntax
  * I miss type declarations. e.g. myString: String. 
    * The compiler can infer the type, but how is the reader of the code expected to?
  * I'm still struggling to be able to read the code because of the various ways something can be stated. 
    * That is, the syntax for doing something has multiple options and it still takes me a while to "parse" that. :-)
  