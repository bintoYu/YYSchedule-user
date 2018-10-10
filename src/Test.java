import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;

import com.YYSchedule.store.exception.FtpException;
import com.YYSchedule.store.ftp.FtpConnFactory;
import com.YYSchedule.store.ftp.FtpUtils;
import com.YYSchedule.store.util.PathUtils;

/**
 * 
 */

/**
 * @author Administrator
 *
 * @date 2018年7月5日  
 * @version 1.0  
 */
public class Test
{
	public static void main(String[] args)
	{
			List<String> fileList = new ArrayList<String>();
			fileList.add("D:\\ybt\\新平台\\1.txt");
			fileList.add("D:\\ybt\\新平台\\2.txt");
			fileList.add("D:\\ybt\\新平台\\3.txt");
			
			List<String> list = upload2Ftp(1, fileList);
			
			for(String file : list)
			{
				System.out.println(file);
			}
			
	}
	
	public static List<String> upload2Ftp(int userId,List<String> fileList)
	{
		FtpConnFactory connFactory = new FtpConnFactory();
		List<String> list = new ArrayList<>();
		String path = "/yubingtao/" + userId;
		try {
			FTPClient ftpClient = connFactory.connect();
			
			for(String file : fileList)
			{
				FtpUtils.upload(ftpClient, file, path);
				
				File localFile = new File(file);
				String fileName = localFile.getName();
				list.add(path + "/" + fileName);
			}
		} catch (FtpException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
