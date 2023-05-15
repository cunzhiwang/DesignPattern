package script

import java.sql.DriverManager

/**
 * 批量更改表格类型小数
 *
 * @author cunzhiwang
 * @Date 2023/5/10 16:16
 */



fun main() {
    val url = ""
    val username = ""
    val password = ""
    Class.forName("com.mysql.cj.jdbc.Driver")
    val connection = DriverManager.getConnection(url, username, password)

    val statement = connection.createStatement()
    val tablesQuery = "SHOW TABLES"
    val tablesResult = statement.executeQuery(tablesQuery)

    while (tablesResult.next()) {
        val tableName = tablesResult.getString(1)
        println("==>table name:$tableName")
        // 获取列列表
        val columnsStatement = connection.createStatement()
        val columnsQuery = "SHOW COLUMNS FROM $tableName"
        val columnsResult = columnsStatement.executeQuery(columnsQuery)

        val columnNames = mutableListOf<String>()
        val columnTypes = mutableListOf<String>()
        while (columnsResult.next()) {

            val columnName = columnsResult.getString(1)
            val columnType = columnsResult.getString(2)
            if (columnType.startsWith("decimal")) {
                columnNames.add(columnName)
                columnTypes.add(columnType)
            }
        }

        if (columnNames.isNotEmpty()) {
            val alterTableQuery = "ALTER TABLE $tableName ${
                columnNames.joinToString(separator = ", ") {
                    "MODIFY COLUMN $it ${
                        changeDecimalColumnType(columnTypes[columnNames.indexOf(it)])
                    }"
                }
            }"
            println("columnNames length is:${columnNames.size}")
            println (alterTableQuery)
//            statement.execute(alterTableQuery)
        }

        println("====>table field loop end <====")
        // 关闭列列表的 ResultSet 和 Statement
        columnsResult.close()
        columnsStatement.close()
    }
    tablesResult.close()
    statement.close()
    connection.close()
}

fun changeDecimalColumnType(columnType: String): String {
    val regex = "decimal\\((\\d+),(\\d+)\\)".toRegex()
    val matchResult = regex.find(columnType)
    if (matchResult != null) {
        val scale = 0
        return "DECIMAL(${matchResult.groupValues[1]}, $scale)"
    }
    return columnType
}