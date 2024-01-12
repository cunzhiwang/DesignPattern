package script

import com.alibaba.excel.annotation.ExcelProperty
import kotlinx.serialization.Serializable

/**
 *
 *
 * @author cunzhiwang
 * @Date 2024/1/12 18:43
 */
@Serializable
data class ExcelData(
    @ExcelProperty("Column1.operation_id")
    var oprId: String="",
    @ExcelProperty("Column1.pic")
    var pic: String="",
    @ExcelProperty("Column1.leader")
    var leader: String=""
)