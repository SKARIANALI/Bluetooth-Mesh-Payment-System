package com.demo.upimesh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "upi.mesh")
public class UpiMeshProperties {

    private long idempotencyTtlSeconds = 86400;
    private long packetMaxAgeSeconds = 86400;

    public long getIdempotencyTtlSeconds() {
        return idempotencyTtlSeconds;
    }

    public void setIdempotencyTtlSeconds(long idempotencyTtlSeconds) {
        this.idempotencyTtlSeconds = idempotencyTtlSeconds;
    }

    public long getPacketMaxAgeSeconds() {
        return packetMaxAgeSeconds;
    }

    public void setPacketMaxAgeSeconds(long packetMaxAgeSeconds) {
        this.packetMaxAgeSeconds = packetMaxAgeSeconds;
    }
}
