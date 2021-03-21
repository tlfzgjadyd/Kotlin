package chap06.D_derived

import chap06.D_base.Shape //아 import 할때 /로 구분하는게 아니라 .으로 구분하는구나

class Circle() : Shape() {
    override fun draw(){println("Circle")}
}