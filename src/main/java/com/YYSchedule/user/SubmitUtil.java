/**
 * 
 */
package com.YYSchedule.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.net.ftp.FTPClient;

import com.YYSchedule.common.rpc.domain.job.Job;
import com.YYSchedule.common.rpc.domain.job.JobPriority;
import com.YYSchedule.common.rpc.domain.parameter.ContextParameter;
import com.YYSchedule.common.rpc.domain.parameter.JobParameter;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.store.exception.FtpException;
import com.YYSchedule.store.ftp.FtpConnFactory;
import com.YYSchedule.store.ftp.FtpUtils;

/**
 * @author ybt
 *
 * @date 2018年9月10日  
 * @version 1.0  
 */
public class SubmitUtil
{
	
	/**
	 * 将目录path下的所有文件（不包括子文件夹）封装到list中
	 * @param path
	 * @return
	 */
	public static List<String> getFileList(String path)
	{
		ArrayList<String> files = new ArrayList<String>();
		
	    File file = new File(path);
	    File[] tempList = file.listFiles();

	    for (int i = 0; i < tempList.length; i++) {
	        if (tempList[i].isFile()) {
//	              System.out.println("文     件：" + tempList[i]);
	            files.add(tempList[i].toString());
	        }
	    }
	    return files;
	}
	
	/**
	 * 
	 * @param  runCommand
	 * 			  :执行脚本的语句，例如java -jar 或  python 或 sh
	 * @param  optionalParameter           
	 *            ：执行脚本额外需要的参数，并封装到LinkedHashMap中
	 *             比方说命令行java -jar xxx.jar -storeName "优衣库"
	 * 			        则key为参数标识 "-storeName"，value为参数具体的值"优衣库"	
	 * @return
	 */
	public static Job getJob(TaskPhase taskPhase, JobPriority jobPriority,String runCommand,List<String> fileList, LinkedHashMap<String, String> optionalParameter,int timeOut, int userId)
	{
		Job job = new Job();
		job.setJobPriority(jobPriority);
		job.setTaskPhase(taskPhase);
		job.setTimeout(timeOut);
		JobParameter jobParameter = new JobParameter();
		jobParameter.setTaskPhase(taskPhase);
		
		// 将文件上传到ftp上
		List<String> pathList = SubmitUtil.upload2Ftp(userId, fileList,job);
		job.setFileList(pathList);
		
		// 通过LinkedHashMap获得
		List<ContextParameter> contextParameterlist = SubmitUtil.getContextParameterlist(runCommand, optionalParameter);
		
		jobParameter.setContextParameterList(contextParameterlist);
		job.setJobParameter(jobParameter);
		return job;
	}

	
	/**
	 * java -jar xxx.jar -storeName "优衣库"
	 * 
	 * 将参数封装到LinkedHashMap中
	 * key为参数标识 例如"-storeName"
	 * value为参数具体的值 例如"优衣库"
	 * 
	 * @param programParameter
	 * @param map
	 * @return
	 */
	public static List<ContextParameter> getContextParameterlist(String programParameter,LinkedHashMap<String, String> map)
	{
		List<ContextParameter> contextParameterlist = new ArrayList<>();
		ContextParameter contextParameter0 = new ContextParameter();
		contextParameter0.setSequenceNum(0);
		contextParameter0.setContent(programParameter);
		contextParameterlist.add(contextParameter0);
		
		int num = 1;
		for(Map.Entry<String, String> entry : map.entrySet()) 
		{
			ContextParameter contextParameter = new ContextParameter();
			contextParameter.setSequenceNum(num);
			contextParameter.setOpt(entry.getKey());
			contextParameter.setContent(entry.getValue());
			contextParameterlist.add(contextParameter);
			num++;
		}
		
		return contextParameterlist;
	}
	
	
	public static List<String> upload2Ftp(int userId,List<String> fileList,Job job)
	{
		FtpConnFactory connFactory = new FtpConnFactory();
		List<String> list = new ArrayList<>();
		try {
			FTPClient ftpClient = connFactory.connect();

			String path = "newplatform/" + userId + "/" + job.getTaskPhase().toString();
			for(String file : fileList)
			{
				FtpUtils.upload(ftpClient, file, path, true);
				
				File localFile = new File(file);
				String fileName = localFile.getName();
				list.add(path + "/" + fileName);
			}
			ftpClient.disconnect();
		} catch (FtpException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

	
	public static void main(String[] args)
	{
		getFileList("E:\\tmp");
	}
	
}
