package com.louis.mango.backup.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 数据源
 * @author Louis
 * @date Jan 15, 2019
 */
@Component  
@ConfigurationProperties(prefix = "mango.backup.datasource")
@Data
public class BackupDataSourceProperties {
	
	private String host;
	private String userName;
	private String password;
	private String database;
}  