package com.lansmancai.lanflashget.state;

import java.util.Timer;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.ContextHolder;
import com.lansmancai.lanflashget.object.Resource;
import com.lansmancai.lanflashget.util.FileUtil;
import com.lansmancai.lanflashget.util.ImageUtil;

public class Finished extends AbstractState {

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.FINISHED_IMAGE;
	}

	public String getState() {
		return "finished";
	}

	public void init(Resource resource) {
		//ɾ����ʱ�ļ�
		FileUtil.deletePartFiles(resource);
		//��Դ������ɺ�ȡ������
		ContextHolder.dh.stopTimer(resource);
	}
	
	
}
