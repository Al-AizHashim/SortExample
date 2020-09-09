fun main() {

var obj=Sort()
    obj.decOrder()
    obj.aceOrder()

}
class Sort {
    var list= listOf(8,4,7,1,2,3,0,5,6)
    fun decOrder() {
        for ((index, value) in list.sortedDescending().withIndex())
            println("the index is $index the value is $value")

    }

    fun aceOrder() {
        for ((index, value) in list.sorted().withIndex())
            println("the index is $index the value is $value")
    }
}