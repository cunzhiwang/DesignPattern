package stract.composite

class Leaf(name: String) : Component(name) {
    override fun operation(): String {
        return name
    }
}