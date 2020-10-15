
    fun main(args: Array<String>) {



        val jacob = Outer.Nested().full() // calling nested class method
        print(jacob)
    }
    class Outer {
        class Nested {
            fun full() = "CALL ME MFON CELEBRITY"
        }









}