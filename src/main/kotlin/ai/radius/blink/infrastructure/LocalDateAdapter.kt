package ai.radius.blink.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import kotlinx.datetime.LocalDate

public class LocalDateAdapter {
    @ToJson
    public fun toJson(value: LocalDate): String {
        return value.toString()
    }

    @FromJson
    public fun fromJson(value: String): LocalDate {
        return LocalDate.parse(value)
    }

}
