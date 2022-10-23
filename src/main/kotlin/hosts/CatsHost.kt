package hosts

import animals.Cat
import interfaces.AnimalHosts

class CatsHost(private val id: Int,
               private val name: String,
               private val cat: Cat): AnimalHosts {

    override fun hostInfo() {
        println("Человек с id: $id, с именем: $name является хозяином: $cat")
    }
}