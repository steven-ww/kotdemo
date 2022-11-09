package kotdemo

/**
 * Simple version without the DI framework to illustrate the test framework
 * See the ExampleTest class
 */
class Example(val someObject: SomeObject) {

    fun printTheObjectMessage() {
        println(someObject.someMessage)
    }

    fun getTheObjectMessage(): String {
        return someObject.someMessage
    }

}