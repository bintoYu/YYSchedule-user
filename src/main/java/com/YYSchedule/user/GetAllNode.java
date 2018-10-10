/**
 * 
 */
package com.YYSchedule.user;

import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.YYSchedule.common.rpc.domain.node.NodePayload;
import com.YYSchedule.common.rpc.exception.TimeoutException;
import com.YYSchedule.common.rpc.exception.UnavailableException;
import com.YYSchedule.common.rpc.service.task.UserCallTaskService;

/**
 * @author Administrator
 *
 * @date 2018年7月26日  
 * @version 1.0  
 */
public class GetAllNode
{
	public static final String address = "192.168.101.29";
	
	private static UserCallTaskService.Client client;
	
	public GetAllNode()
	{
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
	
	public static void main(String[] args)
	{
		GetAllNode getAllNode = new GetAllNode();
		
		try {
			List<NodePayload> nodePayloadList = client.obtainAllNode();
			
			for(NodePayload nodePayload : nodePayloadList)
			{
				System.out.println(nodePayload.toString());
			}
		} catch (TException e) {
			e.printStackTrace();
		}
	}
}
