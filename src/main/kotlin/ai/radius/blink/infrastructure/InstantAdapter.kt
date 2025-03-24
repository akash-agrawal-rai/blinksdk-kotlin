package ai.radius.blink.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import kotlinx.datetime.Instant

public class InstantAdapter {
    @ToJson
    public fun toJson(value: Instant): String {
        return value.toString()
    }

    @FromJson
    public fun fromJson(value: String): Instant {
        return Instant.parse(value)
    }

}
