package com.neusoft.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTable {
	public static void main(String[] args){
		//����configuration����
		Configuration cfg = new Configuration();
		//��ȡ�����ļ�
		cfg.configure();
		//ͨ��configuration��������schemaExport����
		SchemaExport se = new SchemaExport(cfg);
		se.create(true,true);
	}
}
