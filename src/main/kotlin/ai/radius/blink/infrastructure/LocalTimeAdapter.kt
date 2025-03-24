package ai.radius.blink.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import kotlinx.datetime.LocalTime

public class LocalTimeAdapter {
    @ToJson
    public fun toJson(value: LocalTime): String {
        return value.toString()
    }

    @FromJson
    public fun fromJson(value: String): LocalTime {
        return LocalTime.parse(value)
    }

}
