package brajesh.practice.kotlin

fun main() {


    val a = 1..20

    var transform: (List<Int>) -> List<String> = { returnSomething(it) }
    val map = a.chunked(3).map(transform).flatten()
    print(map)
}

fun returnSomething(num:List<Int>):List<String>{
   return when(num[0]){
       7->listOf()
       in 1..4 ->listOf()
       in 10..15 ->listOf("baba","kaba")
       else -> listOf()
   }

}
