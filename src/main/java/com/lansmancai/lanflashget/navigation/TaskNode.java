package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * ȫ��������Դ(����)�ڵ�
 * 
 */
public class TaskNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.TASK_NODE_IMAGE;
	}

	public String getText() {
		return "����";
	}

}
