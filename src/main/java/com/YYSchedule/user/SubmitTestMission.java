/**
 * 
 */
package com.YYSchedule.user;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.YYSchedule.common.rpc.domain.job.Job;
import com.YYSchedule.common.rpc.domain.job.JobPriority;
import com.YYSchedule.common.rpc.domain.mission.Mission;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.common.rpc.service.task.UserCallTaskService;

public class SubmitTestMission
{
	public static final String address = "192.168.3.239";
	
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
		String missionName = "test";
		
		List<String> fileList = new ArrayList<String>();
		fileList.add("/Users/meow/Downloads/a0c0070fad5eba55f66c50270cb93ff9.pdf");
//		fileList.add("E:\\tmp\\test\\num\\num1.txt");
//		fileList.add("E:\\tmp\\test\\num\\num2.txt");
//		fileList.add("E:\\tmp\\test\\num\\num3.txt");
//		fileList.add("E:\\tmp\\test\\num\\num4.txt");
//		fileList.add("E:\\tmp\\test\\num\\num5.txt");
//		fileList.add("E:\\tmp\\test\\num\\num6.txt");
		
		List<Job> jobList = new ArrayList<Job>();
		
		// 生成common任务
		int timeout = 10*60*1000;
		String runCommand = "java -jar";
		LinkedHashMap<String, String> optionalParameter = new LinkedHashMap<>();
		Job cuckooJob = SubmitUtil.getJob(TaskPhase.COMMON, JobPriority.MEDIUM, runCommand, fileList,optionalParameter, timeout,userId);
		
		jobList.add(cuckooJob);
//		jobList.add(virustotalJob);
		
		SubmitTestMission mission = new SubmitTestMission();
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
	public SubmitTestMission()
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
