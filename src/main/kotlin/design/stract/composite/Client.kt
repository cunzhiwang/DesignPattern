package design.stract.composite

fun main() {
    val root = Composite("根节点")
    val leaf1 = Leaf("叶子1")
    val composite = Composite("根节点")
    val leaf2 = Leaf("叶子2")
    composite.addChild(leaf2)
    root.addChild(leaf1)
    root.addChild(composite)
    println(root.operation())
}