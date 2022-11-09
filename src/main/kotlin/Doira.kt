import kotlin.math.PI

class Doira constructor(
    var R:Int,
    var Pi:Double=3.14
) {
    fun uzunli(){
        println("Doiraning uzunligi ${2*Pi*R}")
    }
    fun Yuzasi(){
        println("Doiraning Yuzasi ${Pi*R*R}")
    }

}