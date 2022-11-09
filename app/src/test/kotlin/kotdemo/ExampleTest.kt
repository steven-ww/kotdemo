package kotdemo

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.mockk.every
import io.mockk.mockk

/**
 * Okay so on this one, we are extending a class and passing it a function..
 * So the body of the ExampleTest class actually doesn't exist? It's an empty class?
 * Feels like this is just abusing the concepts
 */
class ExampleTest: StringSpec({

    // What is this? It's a string with no val/var...
    // What's the {} code block and how it is associated with the string?
    "when getAvailableStock is called successfully, a StockResponse is returned with stocks field populated" {
        val someObject: SomeObject = mockk<SomeObject>(relaxed = true)

        // every is a function defined in the mock framework and we pass a function to it?
        // but if I'm passing a function to it, how does it have a return statement? What's returning ...?
        every { someObject.someMessage } returns "Mock Message"

        val example: Example = Example(someObject)
        val result = example.getTheObjectMessage()

        // Should be looks like another function that's being used (without context)
        // But how do we have a function that doesn't take any parameters/functions but somehow understands the string
        // value being referenced (Mock Message)
        // Also, what is result in this context? How is its value applied to the shouldBe function?
        //
        // Is this a DSL? If so, how do I work out the language syntax?
        result shouldBe "Mock Message"
    }
})