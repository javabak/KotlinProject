package animals

import interfaces.Animals

class Cat( val id: Int = 0,
           val name: String? = null,
           val age: Int = 0,
           val price: Int = 0): Animals {


    override fun sounding() {
        println("This is a cat")
    }

    override fun info() {
        println("animal with id: $id, name: $name, age: $age and price: $price")
    }
}