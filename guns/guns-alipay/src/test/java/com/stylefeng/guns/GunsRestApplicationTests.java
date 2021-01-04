package com.stylefeng.guns;

import com.stylefeng.guns.rest.AlipayApplication;
import com.stylefeng.guns.rest.common.util.FTPUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlipayApplication.class)
public class GunsRestApplicationTests {

	@Autowired
	private FTPUtil ftpUtil;

	@Test
	public void contextLoads() {
		String fileStrByAddress = ftpUtil.getFileStrByAddress("seats/cgs.json");

		File file = new File("C:\\Users\\Lenovo\\Desktop\\qrcode\\qr-07bfdd2320014864bd142ebbc1a3064e.png");
		boolean b = ftpUtil.uploadFile("qr-07bfdd2320014864bd142ebbc1a3064e.png", file);
		System.out.println("upload Success? " + b);

		System.out.println(fileStrByAddress);
	}

}
