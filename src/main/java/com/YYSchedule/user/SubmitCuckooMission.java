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
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.YYSchedule.common.rpc.domain.job.Job;
import com.YYSchedule.common.rpc.domain.job.JobPriority;
import com.YYSchedule.common.rpc.domain.mission.Mission;
import com.YYSchedule.common.rpc.domain.parameter.ContextParameter;
import com.YYSchedule.common.rpc.domain.parameter.JobParameter;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.common.rpc.service.task.UserCallTaskService;
import com.YYSchedule.store.exception.FtpException;
import com.YYSchedule.store.ftp.FtpConnFactory;
import com.YYSchedule.store.ftp.FtpUtils;

/**
 * @author ybt
 *
 * @date 2018年7月3日  
 * @version 1.0  
 */
public class SubmitCuckooMission
{
	public static final String address = "192.168.101.29";
	
	private static UserCallTaskService.Client client;
	
	/**
	 * 需要填写以下参数：
	 * mission相关（只有一个）：
	 * @param userId
	 *            :用户id
	 * @param missionName
	 *            :任务名称
	 * @param fileList
	 *            :文件组成的list
	 *            可以自己拼接fileList，也可以调用SubmitUtil.getFileList(path)，获取文件夹中的所有文件组成的fileList
	 * 
	 * job相关（几个任务就对应有几个）
	 * @param taskPhase
	 *            :任务类型 目前任务类型拥有：CUCKOO以及COMMON及VIRUSTOTAL
	 * @param jobPriority
	 *            :任务优先级 目前任务优先级拥有：HIGHER HIGH MEDIUM LOW LOWER
	 * @param  runCommand
	 * 			  :执行脚本的语句，例如java -jar 或  python 或 sh
	 * @param  optionalParameter           
	 *            ：执行脚本额外需要的参数，并封装到LinkedHashMap中
	 *             比方说命令行java -jar xxx.jar -storeName "优衣库"
	 * 			        则key为参数标识 "-storeName"，value为参数具体的值"优衣库"			
	 * 
	 * @param timeOut
	 *            :超时时间 单位毫秒
	 *            
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		int userId = 1;
		String missionName = "cuckoo";
		
		List<String> fileList = new ArrayList<String>();
//		fileList.add("C:\\Users\\Administrator\\Downloads\\9f581811ca0f65e53ed687ef7fd6bc67.exe");
		fileList.add("C:\\Users\\Administrator\\Downloads\\0f18f9e66ab8ada1951743d041b6e671.exe");
		fileList.add("C:\\Users\\Administrator\\Downloads\\1a101ed73a058ce77e52e427e8c7858c.exe");
//		fileList.add("C:\\Users\\Administrator\\Downloads\\431162a68b5d9516e912460650436ca9.exe");
//		fileList.add("C:\\Users\\Administrator\\Downloads\\43281a602b8eb048473771b0b0ff295f.exe");
		
		List<Job> jobList = new ArrayList<Job>();
		
		// 生成cuckoo任务
		int timeoutForCuckoo = 1200000;
		LinkedHashMap<String, String> optionalParameterForCuckoo = new LinkedHashMap<>();
		Job cuckooJob = SubmitUtil.getJob(TaskPhase.CUCKOO, JobPriority.MEDIUM, "sh", fileList,optionalParameterForCuckoo, timeoutForCuckoo,userId);
		
//		// 生成Virustotal任务
//		int timeoutForVirustotal = 600000;
//		LinkedHashMap<String, String> optionalParameterForVirustotal = new LinkedHashMap<>();
//		Job virustotalJob = SubmitUtil.getJob(TaskPhase.VIRUSTOTAL, JobPriority.MEDIUM, "python", optionalParameterForVirustotal, timeoutForVirustotal);
		
		jobList.add(cuckooJob);
//		jobList.add(virustotalJob);
		
		SubmitCuckooMission mission = new SubmitCuckooMission();
		mission.submitMission(userId, missionName, fileList,jobList);
	}
	

	public void submitMission(int userId, String missionName, List<String> fileList,List<Job> jobList)
	{
		Mission mission = new Mission();
		mission.setUserId(userId);
		mission.setMissionName(missionName);
		
		// 将文件上传到ftp上
		
		mission.setJobList(jobList);
		
		try
		{
			client.submitMission(mission);
		} catch (TException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 
	 */
	public SubmitCuckooMission()
	{
		TTransport transport = new TSocket(address, 6000);
		try
		{
			transport.open();
		} catch (TTransportException e)
		{
			e.printStackTrace();
		}
		// 设置传输协议为TBinaryProtocol
		TProtocol protocol = new TBinaryProtocol(transport);
		client = new UserCallTaskService.Client(protocol);
	}
	
}
