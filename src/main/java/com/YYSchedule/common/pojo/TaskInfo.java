package com.YYSchedule.common.pojo;


public class TaskInfo {
	
	private Long taskId;

    private String taskPhase;

    private String taskStatus;

    private String filePath;
    
    private boolean hasResult;

    private Long startedTime;

    private Long finishedTime;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskPhase() {
		return taskPhase;
	}

	public void setTaskPhase(String taskPhase) {
		this.taskPhase = taskPhase;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public boolean isHasResult() {
		return hasResult;
	}

	public void setHasResult(boolean hasResult) {
		this.hasResult = hasResult;
	}

	public Long getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(Long startedTime) {
		this.startedTime = startedTime;
	}

	public Long getFinishedTime() {
		return finishedTime;
	}

	public void setFinishedTime(Long finishedTime) {
		this.finishedTime = finishedTime;
	}

	@Override
	public String toString() {
		return "TaskInfo [taskId=" + taskId + ", taskPhase=" + taskPhase + ", taskStatus=" + taskStatus + ", filePath="
				+ filePath + ", hasResult=" + hasResult + ", startedTime=" + startedTime + ", finishedTime="
				+ finishedTime + "]";
	}
    
	
}