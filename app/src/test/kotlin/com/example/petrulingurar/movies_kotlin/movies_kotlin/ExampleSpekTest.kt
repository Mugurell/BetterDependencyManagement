import com.example.petrulingurar.movies_kotlin.movies_kotlin.Utils
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

// Simple Spek test
internal class ExampleSpekTest : Spek(
        {
            val x = 2
            val y = 3

            given("x = $x and y = $y") {
                val sum = x + y

                it("should be that x + y = 5") {
                    (x + y) shouldEqual sum
                }

                it("should be that x - y = -1") {
                    val substract = x - y
                    (x - y) shouldEqual substract
                }
            }

            given("Utils() to test") {
                it("should show up in coverage") {
                    42 shouldEqual Utils().return42()
                }
            }
        }
)