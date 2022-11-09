package kotdemo

import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.instance

/**
 * What are we doing here? Extending the DIAware Object and passing it a function?
 * or is the code block the actual definition of the class? How to work this out?
 *
 * Having taken a deeper look at the DIAware class (interface) it looks like I am defining the DIExample class and not
 * a function, but given methods can be passed using that syntax, how do I know this while reading the code?
 * (Unless Kotlin has a different syntax for constructors that prevents you from passing a function like this?)
 */
class DIExample(override val di: DI) : DIAware {

    // It took me ages to understand this "by". Didn't realise it was standard Kotlin. Thought I was in DSL territory :-)
    // So the instance function is somehow going to create a SomeObject for me..
    private val someObject: SomeObject by instance()

    fun printTheObjectMessage() {
        println(someObject.someMessage)
    }

    fun getTheObjectMessage(): String {
        return someObject.someMessage
    }

}