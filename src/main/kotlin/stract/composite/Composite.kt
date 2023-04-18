package stract.composite

/**
 * 树枝节点
 */
class Composite(name: String) : Component(name) {
    private val components: MutableList<Component> = mutableListOf()
    override fun operation(): String {
        val description = StringBuilder(name)
        val iterator = components.iterator()
        while (iterator.hasNext()) {
            description.append('\n')
            description.append(iterator.next().operation())
        }
        return description.toString()
    }

    override fun addChild(component: Component): Boolean {
        return components.add(component)
    }

    override fun removeChild(component: Component): Boolean {
        return components.remove(component)
    }

    override fun getChild(index: Int): Component {
        return components.get(index)
    }
}