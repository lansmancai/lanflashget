package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * 全部下载资源(任务)节点
 * 
 */
public class TaskNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.TASK_NODE_IMAGE;
	}

	public String getText() {
		return "任务";
	}

}
