package stract.composite

/**
 * 抽象节点
 */
abstract class Component constructor(name: String) {
    var name: String

    init {
        this.name = name
    }

    abstract fun operation(): String

    open fun addChild(component: Component): Boolean {
        throw Exception("树枝节点，不能添加")
    }

    open fun removeChild(component: Component): Boolean {
        throw Exception("树枝节点，不能删除")
    }

    open fun getChild(index:Int): Component {
        throw Exception("树枝节点，不能获取")
    }
}