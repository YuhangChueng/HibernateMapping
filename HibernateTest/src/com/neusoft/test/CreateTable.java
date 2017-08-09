package com.neusoft.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTable {
	public static void main(String[] args){
		//生成configuration对象
		Configuration cfg = new Configuration();
		//读取配置文件
		cfg.configure();
		//通过configuration对象生成schemaExport对象
		SchemaExport se = new SchemaExport(cfg);
		se.create(true,true);
	}
}
