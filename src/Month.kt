fun main(args:Array<String>){
    val num:Int = readLine()!!.toInt()
    val monthes:List<String> = listOf(monthes.January.toString()
    ,monthes.February.toString()
    ,monthes.March.toString()
    ,monthes.April.toString()
    ,monthes.May.toString()
    ,monthes.June.toString()
    ,monthes.July.toString()
    ,monthes.August.toString()
    ,monthes.September.toString()
    ,monthes.October.toString()
    ,monthes.November.toString()
    ,monthes.December.toString())
    println(monthes.get(num-1))
}
enum class monthes{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December,
}