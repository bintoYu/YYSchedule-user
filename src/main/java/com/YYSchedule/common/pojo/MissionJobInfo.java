package com.YYSchedule.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class MissionJobInfo {
	
	public static class JobInfo{
		
		private Long jobId;
		
		//检测任务类型
		private String taskPhase;
		//检测任务数量
		private Integer taskNum;
		//检测完成数量
		private Integer finishedNum;

		public Long getJobId() {
			return jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public String getTaskPhase() {
			return taskPhase;
		}

		public void setTaskPhase(String taskPhase) {
			this.taskPhase = taskPhase;
		}

		public Integer getTaskNum() {
			return taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public Integer getFinishedNum() {
			return finishedNum;
		}

		public void setFinishedNum(Integer finishedNum) {
			this.finishedNum = finishedNum;
		}

		@Override
		public String toString() {
			return "JobInfo [jobId=" + jobId + ", taskPhase=" + taskPhase + ", taskNum=" + taskNum + ", finishedNum="
					+ finishedNum + "]";
		}
		
	}
	
	private Long missionId;

	// mission下发提交时间
    private Long missionStartTime;
    
    // mission名称
    private String missionName;

    // mission下job数量
    private Integer jobCount;
    
    // job信息列表
    private List<JobInfo> jobInfoList;
    
	public Long getMissionId() {
		return missionId;
	}

	public void setMissionId(Long missionId) {
		this.missionId = missionId;
	}

	public Long getMissionStartTime() {
		return missionStartTime;
	}

	public void setMissionStartTime(Long missionStartTime) {
		this.missionStartTime = missionStartTime;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public Integer getJobCount() {
		return jobCount;
	}

	public void setJobCount(Integer jobCount) {
		this.jobCount = jobCount;
	}

	public List<JobInfo> getJobInfoList() {
		return jobInfoList;
	}

	public void setJobInfoList(List<JobInfo> jobInfoList) {
		this.jobInfoList = jobInfoList;
	}
	


	@Override
	public String toString() {
		return "MissionJobInfo [missionId=" + missionId + ", missionStartTime=" + missionStartTime + ", jobCount="
				+ jobCount + ", jobInfoList=" + jobInfoList + "]";
	}

    
    
    

}
