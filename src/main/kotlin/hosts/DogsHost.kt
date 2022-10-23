package hosts

import animals.Dog
import interfaces.AnimalHosts


class DogsHost(private val id: Int,
              private val name: String,
              private val dog: Dog): AnimalHosts {

    override fun hostInfo() {
        println("Человек с id: $id, с именем: $name является хозяином: $dog")
    }
}