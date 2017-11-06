package com.somoplay.artonexpress.config;

import io.github.jhipster.config.JHipsterProperties;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;
import org.ehcache.jsr107.Eh107Configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
@AutoConfigureAfter(value = { MetricsConfiguration.class })
@AutoConfigureBefore(value = { WebConfigurer.class, DatabaseConfiguration.class })
public class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        JHipsterProperties.Cache.Ehcache ehcache =
            jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration = Eh107Configuration.fromEhcacheCacheConfiguration(
            CacheConfigurationBuilder.newCacheConfigurationBuilder(Object.class, Object.class,
                ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                .withExpiry(Expirations.timeToLiveExpiration(Duration.of(ehcache.getTimeToLiveSeconds(), TimeUnit.SECONDS)))
                .build());
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            cm.createCache(com.somoplay.artonexpress.domain.User.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Authority.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.User.class.getName() + ".authorities", jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.SocialUserConnection.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Address.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Service.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Receipt.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Promotion.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Promotion.class.getName() + ".users", jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Label.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Order.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.Item.class.getName(), jcacheConfiguration);
            cm.createCache(com.somoplay.artonexpress.domain.ExpressAccount.class.getName(), jcacheConfiguration);
            // jhipster-needle-ehcache-add-entry
        };
    }
}
