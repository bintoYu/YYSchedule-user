import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;

import com.YYSchedule.store.exception.FtpException;
import com.YYSchedule.store.ftp.FtpConnFactory;
import com.YYSchedule.store.ftp.FtpUtils;

/**
 * 
 */

/**
 * @author Administrator
 *
 * @date 2018年10月30日  
 * @version 1.0  
 */
public class FtpTest
{
	public static void main(String[] args)
	{
		FtpConnFactory connFactory = new FtpConnFactory();
		try {
			FTPClient ftpClient = connFactory.connect();
		

			String dirPath = "yubingtao/1/";
//			List<String> listFtpDirectory = FtpUtils.listFtpDirectory(ftpClient, path);
//			
//			for (String string : listFtpDirectory)
//			{
//				System.out.println(string);
//			}
			
			FtpUtils.validateFtpDirectory(ftpClient, dirPath);
			
			String filePath = "E:\\tmp\\test\\1.txt";
			
			boolean flag = FtpUtils.upload(ftpClient, filePath, dirPath,true);
			
			System.out.println(flag);
			
			ftpClient.disconnect();
		} catch (FtpException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
