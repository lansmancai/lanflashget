package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * �������صĵ����ڵ�
 */
public class DownloadingNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.DOWNLOADING_NODE_IMAGE;
	}

	public String getText() {
		return "��������";
	}

}
