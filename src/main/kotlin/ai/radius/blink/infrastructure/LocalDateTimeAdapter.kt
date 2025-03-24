package ai.radius.blink.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import kotlinx.datetime.LocalDateTime

public class LocalDateTimeAdapter {
    @ToJson
    public fun toJson(value: LocalDateTime): String {
        return value.toString()
    }

    @FromJson
    public fun fromJson(value: String): LocalDateTime {
        return LocalDateTime.parse(value)
    }

}
