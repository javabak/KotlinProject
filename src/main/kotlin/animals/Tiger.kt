package animals

import interfaces.Animals

class Tiger(private val id: Int = 0,
            private val name: String? = null,
            private val age: Int = 0): Animals {
    override fun sounding() {
        println("This is a tiger")
    }

    override fun info() {
        println("animal with id: $id, name: $name, age: $age")
    }

     fun setPrice(price: Int) {
        if (price <= 0) {
            println("Животное не может столько стоить")
        } else {
            println("Стоимость животного равна: $price")
        }
    }
}