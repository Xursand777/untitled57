class Case constructor(
 var haftakun: Int
){
    fun  hf(){
        when(haftakun){
            1->println("Yomon")
            2-> println("Qoniqarsiz")
            3-> println("Qoniqarli")
            4-> println("Yaxshi")
            5-> println("A'lo")

            else-> println("xato")

        }
    }
}