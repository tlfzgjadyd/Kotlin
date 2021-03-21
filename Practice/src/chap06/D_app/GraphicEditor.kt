package chap06.D_app

import chap06.D_base.Shape
import chap06.D_derived.Circle
fun main() {
    val shape :Shape= Circle()
    shape.draw()
}