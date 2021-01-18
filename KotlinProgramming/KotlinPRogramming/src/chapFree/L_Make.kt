package chapFree

class L_Make {

}
fun main() {
    val mw = MicroWave()
    val blackTb=BlackTea()
    val cornBreadTb= CornBeardTeaBag()
    val milk=  Milk()
    val water= Water()
    val sugar= Sugar()
    val syrup= Syrup()

    var myCup1 = HeatResistanceGlassCup()
    myCup1.putInCup(water, 150)
    mw.heatUp(myCup1,120)
    myCup1.putInCup(cornBreadTb,1)
    System.out.println("옥수수 수염차 완성")

    var myCup2 = HeatResistanceGlassCup()
    myCup2.putInCup(milk, 50)
    myCup2.putInCup(water, 100)
    mw.heatUp(myCup2, 120)
    myCup2.putInCup(blackTb,1)
    myCup2.putInCup(sugar,20)
    myCup2.putInCup(syrup,1)
    System.out.println("밀크티 완성")


}