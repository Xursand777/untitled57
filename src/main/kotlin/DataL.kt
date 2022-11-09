class DataL constructor(
    var name:String="Xursand"

) {

    var Malumot:String="Oliy"
    var age:Int=21

    constructor(oylik:Int):this("Oliy",21)
    constructor(Malumot:String,age:Int):this(age,Malumot){
        this.Malumot=Malumot
        this.age=age
    }
    var howmuny:Int=0
    var kurshaqida:String=""
    constructor(howmuny:Int,kurshaqida:String):this(){
        this.howmuny=howmuny
        this.kurshaqida=kurshaqida
    }

    fun data(){
        println("$name")
    }
    fun data2(){
        println("$Malumot")
    }
    fun data3(){
        println("$age")
    }
    fun data4(){
        println("$howmuny,$kurshaqida")
    }



}