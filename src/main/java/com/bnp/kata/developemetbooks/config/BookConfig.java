package com.bnp.kata.developemetbooks.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "")
@Data
@Component
public class BookConfig {

	private Map<Integer, Map<String, String>> books;

}
