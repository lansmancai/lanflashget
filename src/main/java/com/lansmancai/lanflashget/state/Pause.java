package com.lansmancai.lanflashget.state;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.ContextHolder;
import com.lansmancai.lanflashget.object.Resource;
import com.lansmancai.lanflashget.util.ImageUtil;

public class Pause extends AbstractState {
	
	@Override
	public ImageIcon getIcon() {
		return ImageUtil.PAUSE_IMAGE;
	}

	@Override
	public String getState() {
		return "pause";
	}

	@Override
	public void init(Resource resource) {
		//��Դ��ͣ��ȡ������
		ContextHolder.dh.stopTimer(resource);
	}

}
