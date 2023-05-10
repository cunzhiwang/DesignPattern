package script

import java.io.File
fun main(args: Array<String>) {
    // 指定文件夹路径
    val folderPath = ""

// 指定要删除的字符
    val charToRemove = "ODSERPDATA."

// 遍历文件夹下的所有文件
    File(folderPath).walkTopDown().forEach { file ->
        if (file.isFile && file.extension == "xml") {
            // 读取文件内容
            val content = file.readText()

            if(content.contains("to_char")){
                println(file.name)
            }
            // 删除指定字符
            val newContent = content.replace(charToRemove, "",true)
            // 将修改后的内容写回文件
            file.writeText(newContent)
        }
    }
}




