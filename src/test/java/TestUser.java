import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.YYSchedule.common.pojo.MissionJobInfo;
import com.YYSchedule.common.pojo.SearchResultPage;
import com.YYSchedule.common.pojo.TaskInfo;
import com.YYSchedule.common.rpc.domain.user.User;
import com.YYSchedule.common.rpc.exception.InvalidRequestException;
import com.YYSchedule.common.rpc.exception.NotFoundException;
import com.YYSchedule.common.rpc.exception.TimeoutException;
import com.YYSchedule.common.rpc.exception.UnavailableException;
import com.YYSchedule.common.rpc.service.task.UserCallTaskService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import net.sf.jsqlparser.expression.JsonExpression;

public class TestUser {
	public static final String address = "192.168.100.29";
	
	private static UserCallTaskService.Client client;
	
	public TestUser(){
		TTransport transport = new TSocket(address, 6000);
		try {
			transport.open();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
		// 设置传输协议为TBinaryProtocol
		TProtocol protocol = new TBinaryProtocol(transport);
		client = new UserCallTaskService.Client(protocol);
	}
	
	public static void Test1() {
		try {
			String result = client.obtainMissionList(1, true, 1, 10);
			SearchResultPage<MissionJobInfo> searchResultPage = JSONObject.parseObject(result,new TypeReference<SearchResultPage<MissionJobInfo>>() {});
			Long missionId = searchResultPage.getResultList().get(0).getMissionId();
			System.out.println(searchResultPage);
			String result2 = client.obtainTaskList(missionId);
			SearchResultPage<TaskInfo> searchResultPage2 = JSONObject.parseObject(result2,new TypeReference<SearchResultPage<TaskInfo>>() {});
			for (TaskInfo taskInfo : searchResultPage2.getResultList()) {
				System.out.println(taskInfo.toString());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Test2() throws InvalidRequestException, UnavailableException, TimeoutException, TException {
		User user = new User();
		user.setUsername("meow");
		user.setPassword("test");
		int userId = client.addUser(user);
		System.out.println(userId);
	}
	
	public static void Test3() throws InvalidRequestException, UnavailableException, NotFoundException, TimeoutException, TException {
		int userId = client.login("meow", "test");
		System.out.println(userId);
	}
	
	public static void Test4() throws InvalidRequestException, UnavailableException, TimeoutException, TException{
		Long missionId = (long) 1000119;
		int userId = client.login("user", "password");
		String json = client.obtainMissionList(userId, false, 0, 100);
		System.out.println(json);
		String json2 = client.obtainTaskList(missionId);
		System.out.println(json2);
		
	}
	
	public static void main(String[] args) {
		TestUser testUser = new TestUser();
		try {
			Test4();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
