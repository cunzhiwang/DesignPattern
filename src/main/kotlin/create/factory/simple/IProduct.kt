package create.factory.simple

/**
 * 抽象产品（IProduct）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口
 */
interface IProduct {
    fun doSomeThing()
}