package design.create.singleton

/**
 * 单例模式
 *
 * @author cunzhiwang
 * @Date 2023/6/25 11:54
 */
class Singleton private constructor() {
    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            return instance ?: synchronized(this) {
                instance ?: Singleton().also { instance = it }
            }
        }
    }
}

fun main() {
Singleton.getInstance()
}