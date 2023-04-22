package design.stract.adapter

fun main() {
println(request(Adapter()))
}

fun request(request: ITarget): Int = request.request()