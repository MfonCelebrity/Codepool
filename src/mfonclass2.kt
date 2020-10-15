import javax.print.attribute.standard.MediaSizeName.A

fun main (){
    val a = Abas()
    a.computer("glory", 5)
    a.readMe()
}

class Abas{
    fun computer(name : String, num: Int){
        println("I am a computer $name and the number is $num")
    }
    fun readMe(){
        print("hello read me")
    }
}