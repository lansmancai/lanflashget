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
		//删除临时文件
		FileUtil.deletePartFiles(resource);
		//资源下载完成后取消任务
		ContextHolder.dh.stopTimer(resource);
	}
	
	
}
