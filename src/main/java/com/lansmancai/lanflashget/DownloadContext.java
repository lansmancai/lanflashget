package com.lansmancai.lanflashget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lansmancai.lanflashget.navigation.DownloadNode;
import com.lansmancai.lanflashget.navigation.DownloadingNode;
import com.lansmancai.lanflashget.navigation.FailNode;
import com.lansmancai.lanflashget.navigation.FinishNode;
import com.lansmancai.lanflashget.object.Resource;
import com.lansmancai.lanflashget.state.Connecting;
import com.lansmancai.lanflashget.state.Downloading;
import com.lansmancai.lanflashget.state.Failed;
import com.lansmancai.lanflashget.state.Finished;
import com.lansmancai.lanflashget.state.Pause;
import com.lansmancai.lanflashget.state.TaskState;

public class DownloadContext implements Serializable {

	//����߳���
	public static final int MAX_THREAD_COUNT = 5;
	
	//��������״̬�ĸ���ʵ����
	public static Connecting CONNECTION = new Connecting();
	public static Downloading DOWNLOADING = new Downloading();
	public static Failed FAILED = new Failed();
	public static Finished FINISHED = new Finished();
	public static Pause PAUSE = new Pause();
	
	//��ǰ���س��������е�����
	public List<Resource> resources = new ArrayList<Resource>();
	
	public List<Resource> getFaileds() {
		return getResources(FAILED);
	}
	
	public List<Resource> getDownloadings() {
		return getResources(DOWNLOADING);
	}
	
	public List<Resource> getFinisheds() {
		return getResources(FINISHED);
	}
	
	private List<Resource> getResources(TaskState state) {
		List<Resource> result = new ArrayList<Resource>();
		for (Resource r : resources) {
			if (state.getState().equals(r.getState().getState())) {
				result.add(r);
			}
		}
		return result;
	}
	
	/**
	 * ����IDȥ��ǰ����Դ�����в�����Ӧ����Դ
	 * @param id
	 * @return
	 */
	public Resource getResource(String id) {
		for (Resource r : this.resources) {
			if (r.getId().equals(id)) return r;
		}
		return null;
	}
	
	public List<Resource> getResources(DownloadNode currentNode) {
		if (currentNode instanceof FinishNode) {
			return getFinisheds();
		} else if (currentNode instanceof FailNode) {
			return getFaileds();
		} else if (currentNode instanceof DownloadingNode) {
			return getDownloadings();
		} else {
			return resources;
		}
	}
}