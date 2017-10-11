package com.tabeldata.soal.spring.LoadSpring;

import com.tabeldata.soal.spring.LoadSpring.Umur.UmurSaya;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoadSpringApplication {

	public static void main(String[] args) {
		ApplicationContext APC = SpringApplication.run(LoadSpringApplication.class, args);
                UmurSaya umur = APC.getBean(UmurSaya.class);
                umur.UmurSaya();
	}
}
