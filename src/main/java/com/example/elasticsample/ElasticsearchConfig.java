package com.example.elasticsample;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.elasticsample")
public class ElasticsearchConfig {

    @Value("${elasticsearch.host}")
    private String EsHost;

    @Value("${elasticsearch.port}")
    private int EsPort;

    @Value("${elasticsearch.clustername}")
    private String EsClusterName;

    @Bean
    public RestClient client() throws Exception {
        Settings esSettings = Settings.settingsBuilder()
                .put("cluster.name", EsClusterName)
                .put("client.transport.sniff", false)
                .build();

        return RestClient.builder(new HttpHost(EsHost, EsPort, "http")).build();

    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception{
        return new ElasticsearchTemplate((Client)client());
    }

}
