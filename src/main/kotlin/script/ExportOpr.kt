package script

import com.alibaba.excel.EasyExcel
import com.alibaba.excel.context.AnalysisContext
import com.alibaba.excel.event.AnalysisEventListener

/**
 * TODO
 *
 * @author cunzhiwang
 * @Date 2024/1/12 18:33
 */

fun main() {
    val excelFile = ""

    // 创建监听器用于处理读取的 Excel 数据

    val listener = object : AnalysisEventListener<ExcelData>() {
        override fun invoke(data: ExcelData?, context: AnalysisContext?) {
            // 处理每一行读取的数据
            data?.let {

                println("oprId: ${it.oprId}, pic: ${it.pic}, leader: ${it.leader}")
            }
        }

        override fun doAfterAllAnalysed(context: AnalysisContext?) {
            // 读取完成后的回调方法
            println("Excel reading finished.")
        }
    }

    // 读取 Excel 文件
    EasyExcel.read(excelFile, ExcelData::class.java, listener).build().use { excelReader ->
        // 构建一个sheet 这里可以指定名字或者no
        val readSheet = EasyExcel.readSheet("").build()
        // 读取一个sheet
        excelReader.read(readSheet)
    }
}