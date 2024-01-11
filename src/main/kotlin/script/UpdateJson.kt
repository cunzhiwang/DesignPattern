package script


import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

/**
 * TODO
 *
 * @author cunzhiwang
 * @Date 2024/1/11 9:38
 */

@Serializable
data class Person(
    var Id: String,
    val Title: String,
    val Project: String,
    val SysKey: String,
    val Appliant: String,
    val ApplicantName: String,
    val AppliantUnit: String,
    val CreateTime: String,
    val CommentCount: Int,
    val SupportQuickApproval: Boolean,
    val SupportBatchApproval: Boolean,
    val SupportMobileApproval: Boolean,
    val IsRead: Boolean,
    val FormURL: String,
    val MobileFormURL: String,
    val BusinessKey: String,
    val FlowName: String,
    val KeyFields: List<String>,
    val Actions: List<String>,
    val PostName: String,
    val Category: String,
    val Activity: String,
    val DisableNotify: Boolean,
    val DisableComment: Boolean,
    val SubmitActionName: String,
    val SubmitTime: String,
    val Approvers: List<String>?,
    val ApplicantUnitDisplayName: String,
    val Setting: Setting
)

@Serializable
data class Setting(
    val HistoryToThird: String
)

fun main() {
    // 读取 JSON 文件
    val jsonString = File("").readText()

    // 将 JSON 字符串解析为对象
    var person = Json.decodeFromString<List<Person>>(jsonString)

    // 将 JSON 数组字符串解析为对象列表
    val personList = Json.decodeFromString<List<Person>>(jsonString)
    val ids: MutableList<String> = mutableListOf()
    val newPerson = mutableListOf<Person>();
    // 修改字段
    for (person in personList) {
        val id = person.BusinessKey.split(":")[2]
        if (!ids.contains(id)) {
            ids.add(id)
            person.Id = id
            newPerson.add(person)
        }
    }

    // 将修改后的对象列表转换为 JSON 数组字符串
    val modifiedJsonArrayString = Json.encodeToString(newPerson)

    println(newPerson.size)
//    // 将修改后的 JSON 字符串写入文件
    File("").writeText(modifiedJsonArrayString)
}